package com.efrei.projectkafka.demo.controller;

import com.efrei.projectkafka.demo.service.GeocodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeocodingController {

    @Autowired
    private GeocodingService geocodingService;

    @GetMapping("/geocode")
    public String getGeocode(@RequestParam String address) {
        return geocodingService.getGeocode(address);
    }
}
