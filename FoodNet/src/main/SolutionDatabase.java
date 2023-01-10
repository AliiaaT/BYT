package main;

import java.util.ArrayList;
import java.util.List;

public class SolutionDatabase {
    private int id;
    private String type;
    private List<Solution> solution = new ArrayList<>();

    public SolutionDatabase(int id, String type, List<Solution> solution) {
        this.id = id;
        this.type = type;
        this.solution = solution;
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

    public List<Solution> getSolution() {
        return solution;
    }

    public void setSolution(List<Solution> solution) {
        this.solution = solution;
    }

    class Solution{

    }

}

