package org.example;

import org.example.lld.parkingLot.Entity.Vehicle;
import org.example.lld.parkingLot.Entity.VehicleType;
import org.example.lld.parkingLot.Entrance;
import org.example.lld.parkingLot.Exit;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Entrance entrance = new Entrance();
        Exit exit = new Exit();
        List<Vehicle> vehicles = new ArrayList<>();
        for(int i = 0; i < 5; i++)
            vehicles.add(new Vehicle((int) (Math.random()*10000), VehicleType.TWO_WHEELER));

        for(int i = 0; i < 6; i++)
            vehicles.add(new Vehicle((int) (Math.random()*10000), VehicleType.FOUR_WHEELER));

        vehicles.forEach(entrance::getTicket);


    }
}