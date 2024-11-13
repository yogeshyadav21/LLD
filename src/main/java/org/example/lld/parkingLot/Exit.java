package org.example.lld.parkingLot;

import org.example.lld.parkingLot.Entity.Ticket;
import org.example.lld.parkingLot.parkinglotManager.ParkingLotManager;
import org.example.lld.parkingLot.parkinglotManager.ParkingLotManagerFactory;
import org.example.lld.parkingLot.payment.DailyCostCalculator;
import org.example.lld.parkingLot.payment.HourlyCostCalculator;
import org.example.lld.parkingLot.payment.MinuteCostCalculator;

public class Exit {

    public void unParkVehicle(Ticket ticket){
        ParkingLotManager parkingLotManager = ParkingLotManagerFactory.getParkingLotManager(ticket.getVehicle().getVehicleType());
        parkingLotManager.unParkVehicle(ticket.getParkingLotId());
        MinuteCostCalculator minuteCostCalculator = new MinuteCostCalculator(10);
        HourlyCostCalculator hourlyCostCalculator = new HourlyCostCalculator(50 );
        DailyCostCalculator dailyCostCalculator = new DailyCostCalculator( 100);
        System.out.println("Your minute cost is " + minuteCostCalculator.getTotalAmount(ticket));
        System.out.println("Your hourly cost is " + hourlyCostCalculator.getTotalAmount(ticket));
        System.out.println("Your daily cost is " + dailyCostCalculator.getTotalAmount(ticket));
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");

    }
}
