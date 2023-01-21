package main;

import java.util.ArrayList;
import java.util.List;

public class SolutionDatabase {
    private int id;
    private String type;


    public SolutionDatabase(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SolutionDatabase{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}

