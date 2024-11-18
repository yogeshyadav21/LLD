package org.example.lld.elevator;

import org.example.lld.elevator.enums.Direction;

import java.util.UUID;

public class Display{

    UUID displayId;
    int floorId;
    Direction direction;

    public Display(UUID displayId, int floorId, Direction direction) {
        this.displayId = displayId;
        this.floorId = floorId;
        this.direction = direction;
    }

    public UUID getDisplayId() {
        return displayId;
    }


    public int getFloor() {
        return floorId;
    }

    public void setFloor(int floorId) {
        this.floorId = floorId;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
