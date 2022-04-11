package org.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 * @author kes5li
 */
@Slf4j
@SpringBootApplication
@EnableDubbo
public class ProduceApplication {
    public static void main(String[] args)  {
        SpringApplication.run(ProduceApplication.class);
        log.info("启动成功");
    }
}
