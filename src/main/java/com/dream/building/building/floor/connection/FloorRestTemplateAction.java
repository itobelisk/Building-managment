package com.dream.building.building.floor.connection;

import com.dream.building.building.actions.ActionEnums;
import com.dream.building.building.floor.postrest.FloorPostSender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FloorRestTemplateAction<T> {

    private final FloorPostSender<T> permissionPostSender;

    public ResponseEntity<?> SavePost(T t,
                                                String url,
                                                String accessToken) {
        return permissionPostSender.sendPost(accessToken, t, url, ActionEnums.save);
    }

    public ResponseEntity<?> allPost(String url, String accessToken) {
        return permissionPostSender.sendPostString(accessToken, url,ActionEnums.all);
    }

    public ResponseEntity<?> singlePost(T t, String url, String accessToken) {
        return permissionPostSender.sendPost(accessToken, t, url,ActionEnums.single);
    }

    public ResponseEntity<?> updatePost(T t, String url, String accessToken) {
        return permissionPostSender.sendPost(accessToken, t, url,ActionEnums.update);
    }

    public ResponseEntity<?> deletePost(T t, String url, String accessToken) {
        return permissionPostSender.sendPost(accessToken, t, url, ActionEnums.delete);
    }
}
