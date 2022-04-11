package org.example.kafka.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likesheng
 * @version 1.0
 * @Description 生产者数据添加
 * @date 2022/4/8 11:24
 */
@RestController
@RequestMapping("/kafka")
public class DemoProducter {

    /**
     * topic
     */
    private final static String TOPIC_NAME = "zhTest";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @GetMapping("/send")
    @ResponseBody
    public void send() {
        //发送功能就一行代码~
        kafkaTemplate.send(TOPIC_NAME, "lks", "test message send~");
    }
}
