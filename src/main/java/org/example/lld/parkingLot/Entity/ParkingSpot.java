package org.example.lld.parkingLot.Entity;

import java.util.UUID;

public class ParkingSpot {
    UUID id;
    Vehicle vehicle;

    public ParkingSpot(UUID id, Vehicle vehicle) {
        this.id = id;
        this.vehicle = vehicle;
    }

    public UUID getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        System.out.println("Car is PARKED with parkingId: " + id );
    }

    public void removeVehicle(){
        this.vehicle = null;
        System.out.println("Car is removed");
    }

}
