package com.theeeogprocessor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GeoConsumer {
    @KafkaListener(topics = "geo", groupId = "geo-consumer")
    public void consume(String message){
        log.info("received value is :" + message);
    }
}
