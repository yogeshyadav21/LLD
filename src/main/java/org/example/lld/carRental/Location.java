package org.example.lld.carRental;

import java.util.UUID;

public class Location {
    UUID locationId;
    String name;
    String city;
    String address;
    String pincode;

    public Location(UUID locationId, String name, String city, String address, String pincode) {
        this.locationId = locationId;
        this.name = name;
        this.city = city;
        this.address = address;
        this.pincode = pincode;
    }

    public UUID getLocationId() {
        return locationId;
    }

    public void setLocationId(UUID locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
