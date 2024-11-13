package org.example.lld.elevator.externalButton;

import org.example.lld.elevator.ElevatorController;

import java.util.List;
import java.util.UUID;

public class NearestFirst extends ExternalButtonDispatcher{

    public NearestFirst(UUID externalButtonDispatcherId, List<ElevatorController> elevatorControllers) {
        super(externalButtonDispatcherId, elevatorControllers);
    }

    @Override
    public ElevatorController findElevator() {
        return null;
    }

}
