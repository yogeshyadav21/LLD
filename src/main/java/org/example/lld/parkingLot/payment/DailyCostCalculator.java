package org.example.lld.parkingLot.payment;

import org.example.lld.parkingLot.Entity.Ticket;

import java.time.Duration;
import java.time.LocalDateTime;

public class DailyCostCalculator implements CostCalculator {

    int price;

    public DailyCostCalculator(int price) {
        this.price = price;
    }

    @Override
    public long getTotalAmount(Ticket ticket) {
        Duration duration = Duration.between(ticket.getLocalDateTime(), LocalDateTime.now());
        long days = duration.toDays();
        return price*days;
    }
}
