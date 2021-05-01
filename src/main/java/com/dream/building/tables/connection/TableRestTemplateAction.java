package com.dream.building.tables.connection;

import com.dream.building.tables.postrest.TablePostSender;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TableRestTemplateAction<T> {

    private final TablePostSender<T> tablePostSender;

    public ResponseEntity<?> tableSavePost(T t, String url, String accessToken) {
        return tablePostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> tableShowAllPost(String url, String accessToken) {
        return tablePostSender.sendPostString(accessToken, url);
    }

    public ResponseEntity<?> tableSinglePost(T t, String url, String accessToken) {
        return tablePostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> tableUpdatePost(T t, String url, String accessToken) {
        return tablePostSender.sendPost(accessToken, t, url);
    }

    public ResponseEntity<?> tableDeletePost(T t, String url, String accessToken) {
        return tablePostSender.sendPost(accessToken, t, url);
    }

}
