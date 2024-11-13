package org.example.lld.elevator;

import org.example.lld.elevator.enums.Direction;
import org.example.lld.elevator.externalButton.ExternalButton;

import java.util.UUID;

public class Floor {

    int floorId;
    ExternalButton externalButton;

    public Floor(int floorId, ExternalButton externalButton) {
        this.floorId = floorId;
        this.externalButton = externalButton;
    }

    public int getFloorId() {
        return floorId;
    }


    public ExternalButton getExternalButton() {
        return externalButton;
    }

    public void setExternalButton(ExternalButton externalButton) {
        this.externalButton = externalButton;
    }

    public void pressButton(Direction direction){
        externalButton.submitReq(floorId, direction);
    }
}
