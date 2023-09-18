package com.theeeogprocessor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ProducerController {
    private GeoProducer geoProducer;

    public ProducerController(GeoProducer geoProducer){
        this.geoProducer = geoProducer;
    }
    @PostMapping("/add_geo_data")
    public void addGeoData(@RequestBody String data){
        geoProducer.sendGeoData(data);
    }
}
