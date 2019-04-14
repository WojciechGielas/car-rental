package pl.sdacademy.carrental;

import javax.persistence.*;
import java.util.List;
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String adress;
    @OneToMany
    private List<Employee> employeesList;
    @OneToMany
    private List<Car> availableCars;

    public Location (){}

    public Location(Long id, String adress, List<Employee> employeesList, List<Car> availableCars) {
        this.id = id;
        this.adress = adress;
        this.employeesList = employeesList;
        this.availableCars = availableCars;
    }

    public Long getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public void setAvailableCars(List<Car> availableCars) {
        this.availableCars = availableCars;
    }
}

