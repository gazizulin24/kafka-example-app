package org.gazizulin.kafkaexample.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "gazizulin", groupId = "gazizulin-listener")
    void listener(String data) {
        System.out.println("Listener recieved: " + data + " 🎉");
    }
}
