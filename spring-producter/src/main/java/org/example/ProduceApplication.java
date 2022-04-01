package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 * @author kes5li
 */
@Slf4j
@SpringBootApplication
@ImportResource(value = {"classpath:/spring/spring-producer.xml"})
public class ProduceApplication {
    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ProduceApplication.class);
        log.info("启动成功");
    }
}
