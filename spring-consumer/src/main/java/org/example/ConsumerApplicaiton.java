package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 消费这
 *
 * @author kes5li
 */
@SpringBootApplication
@Slf4j
@ImportResource({"classpath:/spring/spring-consumer.xml"})
public class ConsumerApplicaiton {
    public static void main(String[] args) throws Exception {
        log.info("consumer启动成功");
        SpringApplication.run(ConsumerApplicaiton.class);
    }
}
