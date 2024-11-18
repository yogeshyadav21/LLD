package org.example.lld.carRental;

import org.example.lld.carRental.enums.Status;
import org.example.lld.parkingLot.Entity.VehicleType;

import java.util.UUID;

public class Vehicle {

    VehicleType vehicleType;
    UUID vehicleId;
    String vehicleNumber;
    Status status;

    public Vehicle(VehicleType vehicleType, UUID vehicleId, String vehicleNumber, Status status) {
        this.vehicleType = vehicleType;
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.status = status;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public UUID getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(UUID vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
