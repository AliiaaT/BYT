package main;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String menu;
    private String address;
    private int phoneNumber;
    private Location locationCoordinate;

    List<RestaurantEmployee> employees = new ArrayList<>();

    public void addEmployee(RestaurantEmployee newEmployee){
        if(!employees.contains(newEmployee)){
            employees.add(newEmployee);
        }
    }

    public Restaurant(String name, String menu, String address, int phoneNumber) {
        this.name = name;
        this.menu = menu;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Restaurant(String name) {
        this.name = name;
    }

    public Restaurant() {
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Location getLocationCoordinate() {
        return locationCoordinate;
    }

    public void setLocationCoordinate(Location locationCoordinate) {
        this.locationCoordinate = locationCoordinate;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
