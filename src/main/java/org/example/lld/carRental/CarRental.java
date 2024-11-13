package org.example.lld.carRental;

import org.example.lld.carRental.enums.Status;

import java.util.List;
import java.util.UUID;

public class CarRental {

    List<Store> storeList;

    public CarRental(List<Store> storeList) {
        this.storeList = storeList;
    }

    public Store searchStore(String city){
        return storeList.stream().filter(store -> store.getLocation().city.equals(city)).findFirst().get();
    }

    public List<Vehicle> seeVehicles(Store storeId){
        Store store = storeList.stream().filter(store1 -> store1.getStoreId().equals(storeId)).findFirst().get();
        return store.vehicles();
    }

    public Invoice makeReservation(User user, Vehicle vehicle, Store store){
        Bill bill = new Bill(UUID.randomUUID(), store.doReservation(user, vehicle));
        System.out.println("Bill is generated is with id " + bill.getBillId());
        System.out.println("Now proceeding with Payment...................");
        Payment payment = new Payment(UUID.randomUUID(), bill);
        System.out.println("Payment is completed is with paymentId " + payment.getPaymentId());
        System.out.println("Now proceeding with Invoice.....................");
        Invoice invoice = new Invoice(UUID.randomUUID(), payment);
        System.out.println("Invoice is generated with id " + invoice.getInvoiceId());
        System.out.println("Thank you for visiting the Yogesh CarRental");
        vehicle.setStatus(Status.BOOKED);
        return invoice;
    }
}
