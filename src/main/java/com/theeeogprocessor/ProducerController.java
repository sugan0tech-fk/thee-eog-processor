package com.theeeogprocessor;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
@AllArgsConstructor
public class ProducerController {
    private GeoProducer geoProducer;

    @PostMapping("/add_geo_data")
    public void addGeoData(@RequestBody String data){
        geoProducer.sendGeoData(data);
    }
}
