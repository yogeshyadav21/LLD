package org.example.lld.parkingLot;

import org.example.lld.parkingLot.Entity.Ticket;
import org.example.lld.parkingLot.Entity.Vehicle;
import org.example.lld.parkingLot.parkinglotManager.ParkingLotManager;
import org.example.lld.parkingLot.parkinglotManager.ParkingLotManagerFactory;

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
}
