package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.annotation.EnableKafka;

/**
 * kafka
 *  
 * @author kes5li
 */
@Slf4j
@EnableKafka
@SpringBootApplication
public class KafkaApplication {
    
    public static void main( String[] args ) {
        ConfigurableApplicationContext run = SpringApplication.run(KafkaApplication.class);
        log.info("项目启动成功");
    }
}
