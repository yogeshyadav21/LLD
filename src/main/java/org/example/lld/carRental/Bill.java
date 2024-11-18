package org.example.lld.carRental;

import java.util.UUID;

public class Bill {

    UUID billId;
    Reservation reservation;

    public Bill(UUID billId, Reservation reservation) {
        this.billId = billId;
        this.reservation = reservation;
    }

    public UUID getBillId() {
        return billId;
    }

    public void setBillId(UUID billId) {
        this.billId = billId;
    }

    public Reservation getRegistration() {
        return reservation;
    }

    public void setRegistration(Reservation reservation) {
        this.reservation = reservation;
    }
}
