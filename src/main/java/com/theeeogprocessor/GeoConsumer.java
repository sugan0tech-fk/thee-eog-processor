package com.theeeogprocessor;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class GeoConsumer {
    @KafkaListener(topics = "geo", groupId = "geo-consumer")
    public void consume(String message){
        System.out.println(message);
    }
}
