package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.SpringVersion;

/**
 * Hello world!
 *
 * @author kes5li
 */
@Slf4j
@SpringBootApplication
@ImportResource(value = {"classpath:/spring/spring-producer.xml"})
public class ProduceApplication {
    public static void main(String[] args)  {

      /*  new SpringApplicationBuilder(ProduceApplication.class).main(SpringVersion.class)
                .bannerMode(Banner.Mode.CONSOLE).run(args);*/
        SpringApplication.run(ProduceApplication.class);
        log.info("启动成功");
    }
}
