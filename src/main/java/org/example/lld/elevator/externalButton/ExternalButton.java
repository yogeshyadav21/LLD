package org.example.lld.elevator.externalButton;

import org.example.lld.elevator.Floor;
import org.example.lld.elevator.enums.Direction;

import java.util.UUID;

public class ExternalButton {

    UUID externalButtonId;
    ExternalButtonDispatcher externalButtonDispatcher;

    public ExternalButton(UUID externalButtonId, ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButtonId = externalButtonId;
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public void submitReq(int floorId, Direction direction){
        externalButtonDispatcher.submitReq(floorId, direction);
    }
}
