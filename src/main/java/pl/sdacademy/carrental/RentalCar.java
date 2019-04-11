package pl.sdacademy.carrental;

import java.util.List;

public class RentalCar {

    private String RentalName;
    private String url;
    private String adress;
    private String owner;
    private List<String> locations;

    public RentalCar(String rentalName, String url, String adress, String owner, List<String> locations) {
        RentalName = rentalName;
        this.url = url;
        this.adress = adress;
        this.owner = owner;
        this.locations = locations;
    }

    public String getRentalName() {
        return RentalName;
    }

    public String getUrl() {
        return url;
    }

    public String getAdress() {
        return adress;
    }

    public String getOwner() {
        return owner;
    }

    public List<String> getLocations() {
        return locations;
    }
}
