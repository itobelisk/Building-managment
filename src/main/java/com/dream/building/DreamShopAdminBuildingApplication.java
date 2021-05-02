package com.dream.building;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DreamShopAdminBuildingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DreamShopAdminBuildingApplication.class, args);
    }

}
