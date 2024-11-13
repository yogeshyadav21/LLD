package org.example.lld.parkingLot.payment;

import org.example.lld.parkingLot.Entity.Ticket;

public interface CostCalculator {

    long getTotalAmount(Ticket ticket);

}
