package org.example.lld.carRental;

import java.util.UUID;

public class Reservation {

    UUID registrationId;
    User user;
    Vehicle vehicle;
    UUID storeId;

    public Reservation(UUID registrationId, User user, Vehicle vehicle, UUID storeId) {
        this.registrationId = registrationId;
        this.user = user;
        this.vehicle = vehicle;
        this.storeId = storeId;
    }

    public UUID getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(UUID registrationId) {
        this.registrationId = registrationId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public UUID getStoreId() {
        return storeId;
    }

    public void setStoreId(UUID storeId) {
        this.storeId = storeId;
    }
}
