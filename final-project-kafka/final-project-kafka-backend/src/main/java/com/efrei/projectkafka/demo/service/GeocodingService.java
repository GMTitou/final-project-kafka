package com.efrei.projectkafka.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeocodingService {

    @Value("${google.api.key}")
    private String apiKey;

    private static final String GEOCODING_API_URL = "https://maps.googleapis.com/maps/api/geocode/json";

    public String getGeocode(String address) {
        String url = String.format("%s?address=%s&key=%s", GEOCODING_API_URL, address, apiKey);
        RestTemplate restTemplate = new RestTemplate();
        try {
            String response = restTemplate.getForObject(url, String.class);
            System.out.println("Geocode API response: " + response);
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"status\":\"error\",\"message\":\"Error calling Geocoding API\"}";
        }
    }
}
