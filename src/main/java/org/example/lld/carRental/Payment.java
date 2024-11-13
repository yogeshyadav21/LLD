package org.example.lld.carRental;

import java.util.UUID;

public class Payment {

    UUID paymentId;
    Bill bill;

    public Payment(UUID paymentId, Bill bill) {
        this.paymentId = paymentId;
        this.bill = bill;
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
