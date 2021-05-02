package com.dream.building.building.api;

import com.dream.building.building.dao.request.BuildingRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/building")
public interface BuildingApi {

    @PostMapping("/save")
    ResponseEntity<?> save(@RequestHeader(name = "Authorization") String accessToken,
                           @RequestBody BuildingRequest buildingRequest);


}
