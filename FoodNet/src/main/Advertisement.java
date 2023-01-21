package main;

import java.util.ArrayList;
import java.util.List;

public class Advertisement {
    private String type;
    private int price;
    private int duration;

Administration administration = new Administration();
    public Advertisement(String type, int price, int duration) {
        this.type = type;
        this.price = price;
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
