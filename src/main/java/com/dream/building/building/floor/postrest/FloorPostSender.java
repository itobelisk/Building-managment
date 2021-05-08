package com.dream.building.building.floor.postrest;

import com.dream.building.building.actions.ActionEnums;
import com.dream.building.building.actions.RestActionUrls;
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
@RequiredArgsConstructor
public class FloorPostSender<T> {
    private final RestActionUrls restActionUrls;
    private final RestTemplate restTemplate;
    @Async
    public ResponseEntity<?> sendPost(String accessToken, T t, String server, ActionEnums actionEnums) {
        HttpHeaders headers = new HttpHeaders();
        String url = server.concat(restActionUrls.urlActionFloor(actionEnums));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", accessToken);
        HttpEntity<T> request = new HttpEntity<>(t, headers);
        return restTemplate.postForEntity(url, request, Map.class);
    }
    @Async
    public ResponseEntity<?> sendPostString(String accessToken, String server,ActionEnums actionEnums){
        HttpHeaders headers = new HttpHeaders();
        String url = server.concat(restActionUrls.urlActionFloor(actionEnums));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add("Authorization", accessToken);
        HttpEntity<T> request = new HttpEntity<>(headers);
        return restTemplate.postForEntity(url, request, Map.class);
    }
}
