package org.example.lld.elevator.externalButton;

import org.example.lld.elevator.ElevatorController;

import java.util.List;
import java.util.UUID;

public class AnyLift extends ExternalButtonDispatcher{

    public AnyLift(UUID externalButtonDispatcherId, List<ElevatorController> elevatorControllers) {
        super(externalButtonDispatcherId, elevatorControllers);
    }

    @Override
    public ElevatorController findElevator() {
        return elevatorControllers.stream().findAny().get();
    }
}
