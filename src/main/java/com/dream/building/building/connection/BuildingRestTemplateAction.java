package com.dream.building.building.connection;

import com.dream.building.building.postrest.BuildingPostSender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BuildingRestTemplateAction<T> {

    private final BuildingPostSender<T> buildingPostSender;

    public ResponseEntity<?> savePost(T t, String url, String accessToken) {
        return buildingPostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> allPost(String url, String accessToken) {
        return buildingPostSender.sendPostString(accessToken, url);
    }

    public ResponseEntity<?> singlePost(T t, String url, String accessToken) {
        return buildingPostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> updatePost(T t, String url, String accessToken) {
        return buildingPostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> deletePost(T t, String url, String accessToken) {
        return buildingPostSender.sendPost(accessToken, t, url);
    }
}
