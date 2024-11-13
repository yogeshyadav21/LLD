package org.example.lld.parkingLot.parkinglotManager;

import org.example.lld.parkingLot.Entity.Vehicle;
import org.example.lld.parkingLot.Entity.ParkingSpot;

import java.util.List;
import java.util.UUID;

public abstract class ParkingLotManager {

    List<ParkingSpot> list;

    public ParkingLotManager(List<ParkingSpot> list) {
        this.list = list;
    }

    ParkingSpot findParkingSpot(){
        return list.stream().filter(parkingSpot -> parkingSpot.getVehicle() == null).findFirst().get();
    }

    public void addParkingSpot(ParkingSpot parkingSpot){
        list.add(parkingSpot);
    }

    public UUID parkVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot = findParkingSpot();
        if(parkingSpot == null){
            System.out.println("Sorry the parking lot is full!!");
            return null;
        }
        parkingSpot.addVehicle(vehicle);
        System.out.println(vehicle + " is parked");
        return parkingSpot.getId();
    }

    public void unParkVehicle(UUID uuid){
        ParkingSpot parkingSpot = list.stream().filter(spot -> spot.getId() == uuid).findFirst().get();
        parkingSpot.removeVehicle();
    }

}
