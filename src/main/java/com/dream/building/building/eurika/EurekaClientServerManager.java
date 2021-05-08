package com.dream.building.building.eurika;


import com.dream.building.building.floor.endpoints.FloorRestEndPoints;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EurekaClientServerManager {
    private InstanceInfo instanceInfo;

    @Bean
    public String serverUrl(@Qualifier("eurekaClient") EurekaClient eurekaClient){
        instanceInfo =  eurekaClient.getNextServerFromEureka(FloorRestEndPoints.DATA_SERVER, false);
        return instanceInfo.getHomePageUrl();
    }

}
