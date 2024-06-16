package com.efrei.projectkafka.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {

    @GetMapping("/sendLocation")
    public String sendLocation(@RequestParam("location") String location) {
        return "Location received: " + location;
    }
}
