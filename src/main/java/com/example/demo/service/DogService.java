package com.example.demo.service;

import com.example.demo.model.DogResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DogService {

    public DogResponse getRandomDogImage() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://dog.ceo/api/breeds/image/random";
        return restTemplate.getForObject(url, DogResponse.class);
    }
}
