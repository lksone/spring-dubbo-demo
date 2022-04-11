package org.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消费这
 *
 * @author kes5li
 */
@Slf4j
@EnableDubbo
@SpringBootApplication
public class ConsumerApplicaiton {
    public static void main(String[] args) {
        log.info("consumer启动成功");
        SpringApplication.run(ConsumerApplicaiton.class);
    }
}
