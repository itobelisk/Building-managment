package com.dream.building.building.buildingparts.dao.request;

import com.dream.building.building.dao.request.BuildingRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BuildingPartsRequest {
    private Long id;
    private Date createdDate;
    private Date updatedDate;
    private String buildingPartName;

}
