package main;

public class Location {
    private String coordinate;
    private String description;

    Restaurant restaurant = new Restaurant(); //1 to 1 connection

    public Location(String coordinate, String description) {
        this.coordinate = coordinate;
        this.description = description;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
