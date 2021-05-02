package com.dream.building.building.floor.dao.request;

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
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FloorRequest {
    private Long id;
    private Date createdDate;
    private Date updatedDate;
    private List<BuildingRequest> buildingEntityRequest;
    private Integer floors;

}
