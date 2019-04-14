package pl.sdacademy.carrental;

import org.springframework.data.jpa.repository.JpaRepository;

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

    public void setRentalName(String rentalName) {
        RentalName = rentalName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }
}
