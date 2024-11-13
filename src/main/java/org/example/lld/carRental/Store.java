package org.example.lld.carRental;

import org.example.lld.carRental.enums.Status;
import org.example.lld.carRental.enums.StoreStatus;

import java.util.List;
import java.util.UUID;

public class Store {

    UUID storeId;
    VehicleInventory vehicleInventory;
    StoreStatus status;
    Location location;
    List<Reservation> reservations;

    public Store(UUID storeId, VehicleInventory vehicleInventory, StoreStatus status, Location location, List<Reservation> reservation) {
        this.storeId = storeId;
        this.vehicleInventory = vehicleInventory;
        this.status = status;
        this.location = location;
        this.reservations = reservation;
    }

    public UUID getStoreId() {
        return storeId;
    }

    public void setStoreId(UUID storeId) {
        this.storeId = storeId;
    }

    public VehicleInventory getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(VehicleInventory vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public StoreStatus getStatus() {
        return status;
    }

    public void setStatus(StoreStatus status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Vehicle> vehicles(){
        return vehicleInventory.vehicleList.stream().filter(vehicle -> vehicle.status == Status.AVAILABLE).toList();
    }

    public Reservation doReservation(User user, Vehicle vehicle){
        Reservation reservation = new Reservation(UUID.randomUUID(), user, vehicle, storeId);
        System.out.println("Reservation is completed with id " + reservation.getRegistrationId());
        System.out.println("Now proceeding with Bill generation...................");
        reservations.add(reservation);
        return reservation;
    }
}
