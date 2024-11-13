package org.example.lld.parkingLot.Entity;

import java.time.LocalDateTime;
import java.util.UUID;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Ticket {
    UUID uuid;
    UUID parkingLotId;
    Vehicle vehicle;
    LocalDateTime localDateTime;

    public Ticket(UUID parkingLotId, Vehicle vehicle) {
        this.uuid = UUID.randomUUID();
        this.parkingLotId = parkingLotId;
        this.vehicle = vehicle;
        this.localDateTime = LocalDateTime.now().minusYears(5)
                .plusSeconds(new Random().nextLong() % ChronoUnit.SECONDS.between(LocalDateTime.now().minusYears(5), LocalDateTime.now()));
        System.out.println("Your ticket is successfully generated at time: " + localDateTime);
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getParkingLotId() {
        return parkingLotId;
    }

    public void setParkingLotId(UUID parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
