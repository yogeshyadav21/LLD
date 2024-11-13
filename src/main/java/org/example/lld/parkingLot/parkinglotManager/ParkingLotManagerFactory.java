package org.example.lld.parkingLot.parkinglotManager;

import org.example.lld.parkingLot.Entity.VehicleType;
import org.example.lld.parkingLot.Entity.ParkingSpot;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ParkingLotManagerFactory {

    static TwoWheelerParkingLotManager twoWheelerParkingLotManager;
    static FourWheelerParkingLotManager fourWheelerParkingLotManager;

    static List<ParkingSpot> createParkingSpots(int count){
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        for(int i = 0; i < count; i++){
            parkingSpotList.add(new ParkingSpot(UUID.randomUUID(), null));
        }
        return parkingSpotList;
    }


    public static ParkingLotManager getParkingLotManager(VehicleType vehicleType){

        switch (vehicleType){
            case TWO_WHEELER -> {
                if(twoWheelerParkingLotManager == null)
                    twoWheelerParkingLotManager = new TwoWheelerParkingLotManager(createParkingSpots(10));
                return twoWheelerParkingLotManager;
            }
            case FOUR_WHEELER -> {
                if(fourWheelerParkingLotManager == null)
                    fourWheelerParkingLotManager = new FourWheelerParkingLotManager(createParkingSpots(10));
                return fourWheelerParkingLotManager;
            }
        }

        return null;
    }
}
