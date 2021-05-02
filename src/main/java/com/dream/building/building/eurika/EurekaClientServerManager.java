package com.dream.building.building.eurika;


import com.dream.building.building.floor.endpoints.FloorRestEndPoints;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EurekaClientServerManager {
    private InstanceInfo instanceInfo;

    public String serverUrl(EurekaClient eurekaClient){
        instanceInfo =  eurekaClient.getNextServerFromEureka(FloorRestEndPoints.DATA_SERVER, false);
        return instanceInfo.getHomePageUrl();
    }

}
