package com.dream.building.building.controller;

import com.dream.building.building.api.BuildingApi;
import com.dream.building.building.service.impl.BuildingServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BuildingController implements BuildingApi {
    private final BuildingServiceImpl buildingService;

}
