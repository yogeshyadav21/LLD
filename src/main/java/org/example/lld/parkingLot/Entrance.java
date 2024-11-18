package org.example.lld.parkingLot;

import org.example.lld.parkingLot.Entity.Ticket;
import org.example.lld.parkingLot.Entity.Vehicle;
import org.example.lld.parkingLot.Entity.VehicleType;
import org.example.lld.parkingLot.parkinglotManager.ParkingLotManager;
import org.example.lld.parkingLot.parkinglotManager.ParkingLotManagerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Entrance {

    public Ticket getTicket(Vehicle vehicle){
        ParkingLotManager parkingLotManager = ParkingLotManagerFactory.getParkingLotManager(vehicle.getVehicleType());

        UUID parkingId = parkingLotManager.parkVehicle(vehicle);
        if(parkingId == null){
            System.out.println("Sorry we don't have enough space, please come back later");
        }
        return new Ticket(parkingId, vehicle);
    }


//      ParkingLot SampleCode
//    Entrance entrance = new Entrance();
//    Exit exit = new Exit();
//    List<Vehicle> vehicles = new ArrayList<>();
//        for(int i = 0; i < 5; i++)
//            vehicles.add(new Vehicle((int) (Math.random()*10000), VehicleType.TWO_WHEELER));
//
//        for(int i = 0; i < 6; i++)
//            vehicles.add(new Vehicle((int) (Math.random()*10000), VehicleType.FOUR_WHEELER));
//
//        vehicles.forEach(entrance::getTicket);
}
