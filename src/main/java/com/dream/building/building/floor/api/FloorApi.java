package com.dream.building.building.floor.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/floor")
public interface FloorApi {

    @GetMapping("/all")
    ResponseEntity<?> all(@RequestHeader(name = "Authorization") String accessToken);
}
