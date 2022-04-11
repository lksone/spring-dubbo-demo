package org.example.kafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * @author likesheng
 * @version 1.0
 * @Description 消费者
 * @date 2022/4/8 11:23
 */
@Slf4j
@Component
public class DemoConsumer {

    /**
     * kafka的监听器，topic为"zhTest"，消费者组为"zhTestGroup"
     *
     * @param record 輸入参数
     * @param ack    ack
     */
    @KafkaListener(topics = "zhTest", groupId = "zhTestGroup")
    public void listenZhugeGroup(ConsumerRecord<String, String> record, Acknowledgment ack) {
        String value = record.value();
        log.info("消费者消费信息1：{}", value);
        log.info("kafka的配置信息：{}", ack);
        //手动提交offset
        ack.acknowledge();
    }


    @KafkaListener(topics = "zhTest", groupId = "zhTestGroup")
    public void listenZhugeGroup2(ConsumerRecord<String, String> record, Acknowledgment ack) {
        String value = record.value();
        log.info("消费者消费信息2：{}", value);
        log.info("kafka的配置信息：{}", ack);
        //手动提交offset
        ack.acknowledge();
    }

}
