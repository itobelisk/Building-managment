package com.dream.building.building.floor.service.impl;

import com.dream.building.building.eurika.EurekaClientServerManager;
import com.dream.building.building.floor.connection.FloorRestTemplateAction;
import com.dream.building.building.floor.service.FloorService;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FloorServiceImpl implements FloorService {

    private final EurekaClientServerManager eurekaClientServerManager;
    private final EurekaClient eurekaClient;
    private final FloorRestTemplateAction permissionRestTemplateAction;


    @Override
    public ResponseEntity<?> all(String accessToken) {
        String server = eurekaClientServerManager.serverUrl(eurekaClient);
        return permissionRestTemplateAction.allPost(
                server,
                accessToken);
    }
}
