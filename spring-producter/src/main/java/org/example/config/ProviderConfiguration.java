package org.example.config;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

/**
 * @author likesheng
 * @version 1.0
 * @Description 开启dubbo
 * @date 2022/3/28 17:59
 */
@Configuration
@EnableDubbo(scanBasePackages = "org.example.impl")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class ProviderConfiguration {

    @Value("${dubbo.config-center.address}")
    private String configCenterAddress;

    @PostConstruct
    public void init() throws Exception {
        System.out.println("Using address:" + this.configCenterAddress);
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient(this.configCenterAddress.replace("zookeeper://", ""), 5000, 3000, retryPolicy);
        client.start();
        System.out.println("Checking config");
        if (client.checkExists().forPath("/dubbo/config/dubbo/dubbo.properties") == null) {
            String configAsString = String.format("dubbo.registry.address=%s%sdubbo.metadata-report.address=%s", this.configCenterAddress, System.lineSeparator(), this.configCenterAddress);
            client.create().creatingParentContainersIfNeeded().forPath("/dubbo/config/dubbo/dubbo.properties", configAsString.getBytes());
            System.out.println("Creating config");
        } else {
            byte[] bytes = client.getData().forPath("/dubbo/config/dubbo/dubbo.properties");
            System.out.println("Reading config: " + new String(bytes));
        }
    }
}
