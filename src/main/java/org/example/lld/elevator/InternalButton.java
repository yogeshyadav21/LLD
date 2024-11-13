package org.example.lld.elevator;

import org.example.lld.elevator.enums.Direction;

import java.util.UUID;

public class InternalButton {

    UUID internalButtonId;
    ElevatorController elevatorController;
    Elevator elevator;

    public InternalButton(UUID internalButtonId, ElevatorController elevatorController, Elevator elevator) {
        this.internalButtonId = internalButtonId;
        this.elevatorController = elevatorController;
        this.elevator = elevator;
    }

    public void submitReq(int floorId){
        switch (elevator.display.getDirection()){
            case UP -> {
                if(elevator.display.getFloor() <= floorId){
                    elevatorController.submitRequest(floorId, Direction.UP);
                }
                else{
                    elevatorController.submitRequest(floorId, Direction.DOWN);
                }
            }
            case DOWN -> {
                if(elevator.display.getFloor() >= floorId){
                    elevatorController.submitRequest(floorId, Direction.DOWN);
                }
                else{
                    elevatorController.submitRequest(floorId, Direction.UP);
                }
            }
        }
    }
}
