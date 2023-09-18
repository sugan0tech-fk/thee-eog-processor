package com.theeeogprocessor;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class GeoProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "geo";

    public GeoProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendGeoData(String message) {
        kafkaTemplate.send(TOPIC, message);
    }

}
