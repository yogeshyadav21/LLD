package org.example.lld.elevator.externalButton;

import org.example.lld.elevator.ElevatorController;
import org.example.lld.elevator.Floor;
import org.example.lld.elevator.enums.Direction;

import java.util.List;
import java.util.UUID;

public abstract class ExternalButtonDispatcher {

    UUID externalButtonDispatcherId;
    List<ElevatorController> elevatorControllers;

    public ExternalButtonDispatcher(UUID externalButtonDispatcherId, List<ElevatorController> elevatorControllers) {
        this.externalButtonDispatcherId = externalButtonDispatcherId;
        this.elevatorControllers = elevatorControllers;
    }

    abstract protected ElevatorController findElevator();

    public void submitReq(int floorId, Direction direction){
        findElevator().submitRequest(floorId, direction);
    }
}
