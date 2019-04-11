package pl.sdacademy.carrental;

import java.util.List;

public class Location {
    private String adress;
    List<Employees> employeesList;
    List<Car> availableCars;

    public Location(String adress, List<Employees> employeesList, List<Car> availableCars) {
        this.adress = adress;
        this.employeesList = employeesList;
        this.availableCars = availableCars;
    }

    public String getAdress() {
        return adress;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }
}

