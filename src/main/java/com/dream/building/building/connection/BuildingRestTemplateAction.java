package com.dream.building.building.connection;

import com.dream.building.building.postrest.BuildingPostSender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BuildingRestTemplateAction<T> {
    private final BuildingPostSender<T> buildingPostSender;

    public ResponseEntity<?> buildingSavePost(T t, String url, String accessToken) {
        return buildingPostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> buildingShowAllPost(String url, String accessToken) {
        return buildingPostSender.sendPostString(accessToken, url);
    }

    public ResponseEntity<?> buildingSinglePost(T t, String url, String accessToken) {
        return buildingPostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> buildingUpdatePost(T t, String url, String accessToken) {
        return buildingPostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> buildingDeletePost(T t, String url, String accessToken) {
        return buildingPostSender.sendPost(accessToken, t, url);
    }
}
