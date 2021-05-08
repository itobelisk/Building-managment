package com.dream.building.building.actions;

import com.dream.building.building.floor.endpoints.FloorRestEndPoints;
import org.springframework.stereotype.Component;

@Component
public class RestActionUrls {
    public String urlActionFloor(ActionEnums actionEnums){
        switch (actionEnums){
            case all: return FloorRestEndPoints.FLOOR_SHOW_ALL;
            case save: return FloorRestEndPoints.FLOOR_SAVE;
            case single:return FloorRestEndPoints.FLOOR_SINGLE;
            case update:return FloorRestEndPoints.FLOOR_UPDATE;
            case delete:return FloorRestEndPoints.FLOOR_DELETE;
            default:return "something is missing inside endpoint for Floor ";
        }
    }


}
