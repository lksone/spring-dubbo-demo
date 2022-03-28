package org.example;

import org.example.config.ProviderConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Hello world!
 *
 * @author kes5li
 */
public class ProduceApplication {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
        context.start();
        System.out.println("dubbo service started");
        new CountDownLatch(1).await();
    }
}
