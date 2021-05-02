package com.dream.building.building.floor.dao.response;

import com.dream.building.building.dao.response.BuildingResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FloorResponse {
    private Long id;
    private Date createdDate;
    private Date updatedDate;
    private List<BuildingResponse> buildingEntityResponse;
    private Integer floors;
}
