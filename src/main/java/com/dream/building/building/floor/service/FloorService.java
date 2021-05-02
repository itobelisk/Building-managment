package com.dream.building.building.floor.service;

import org.springframework.http.ResponseEntity;

public interface FloorService {
    ResponseEntity<?> all(String accessToken);
}
