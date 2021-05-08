package com.dream.building.building.floor.controller;

import com.dream.building.building.floor.api.FloorApi;
import com.dream.building.building.floor.service.impl.FloorServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FloorController implements FloorApi {

    private final FloorServiceImpl floorServiceImpl;

    @Override
    public ResponseEntity<?> all(String accessToken) {
        ResponseEntity<?> response = floorServiceImpl.all(accessToken);
        log.info("PermissionController all {} status {} ", response.getBody(), response.getStatusCodeValue());
        return new ResponseEntity<>(response.getBody(), response.getHeaders(), response.getStatusCode());
    }
}
