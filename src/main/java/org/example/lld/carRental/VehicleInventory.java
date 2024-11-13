package org.example.lld.carRental;

import java.util.List;

public class VehicleInventory {
    List<Vehicle> vehicleList;

    public VehicleInventory(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }
}
