package org.example;

import org.example.lld.elevator.Display;
import org.example.lld.elevator.enums.Direction;
import org.example.lld.elevator.externalButton.AnyLift;
import org.example.lld.elevator.externalButton.ExternalButtonDispatcher;
import org.example.lld.parkingLot.Entity.Vehicle;
import org.example.lld.parkingLot.Entity.VehicleType;
import org.example.lld.parkingLot.Entrance;
import org.example.lld.parkingLot.Exit;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Display display = new Display(UUID.randomUUID(), 3, Direction.UP);
        ExternalButtonDispatcher  externalButtonDispatcher = new AnyLift(UUID.randomUUID(), )


    }
}