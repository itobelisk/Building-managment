package com.dream.building.building.dao.request;

import com.dream.building.building.buildingparts.dao.request.BuildingPartsRequest;
import com.dream.building.building.floor.dao.request.FloorRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BuildingRequest {
    private Long id;
    private BuildingPartsRequest buildingPartsRequest;
    private FloorRequest floorRequest;
}
