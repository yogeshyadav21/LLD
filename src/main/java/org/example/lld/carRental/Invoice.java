package org.example.lld.carRental;

import java.util.UUID;

public class Invoice {

    UUID invoiceId;
    Payment payment;

    public Invoice(UUID invoiceId, Payment payment) {
        this.invoiceId = invoiceId;
        this.payment = payment;
    }

    public UUID getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(UUID invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}
