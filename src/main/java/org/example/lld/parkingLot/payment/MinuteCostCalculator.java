package org.example.lld.parkingLot.payment;

import org.example.lld.parkingLot.Entity.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class MinuteCostCalculator implements CostCalculator {

    int price;

    public MinuteCostCalculator(int price) {
        this.price = price;
    }

    @Override
    public long getTotalAmount(Ticket ticket) {
        Duration duration = Duration.between(ticket.getLocalDateTime(), LocalDateTime.now());
        long minutes = duration.toMinutes();
        return price * minutes;
    }
}
