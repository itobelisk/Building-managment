package com.dream.building.tables.postrest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
@Component
public class TablePostSender<T> {
    @Async
    public ResponseEntity<?> sendPost(String accessToken, T t, String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", accessToken);
        HttpEntity<T> request = new HttpEntity<>(t, headers);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(url, request, Map.class);
    }
    @Async
    public ResponseEntity<?> sendPostString(String accessToken, String url){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", accessToken);
        HttpEntity<T> request = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(url, request, Map.class);
    }
}
