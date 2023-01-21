package main;

import java.util.ArrayList;
import java.util.List;

public class Support {
    private int support_id;
    private List<SolutionDatabase> solutions = new ArrayList<>();


    public void addSolution(SolutionDatabase newSolution){
        if(!solutions.contains(newSolution)){
            solutions.add(newSolution);
        }
    }
    public Support(int support_id) {
        this.support_id = support_id;
    }

    public int getSupport_id() {
        return support_id;
    }

    public void setSupport_id(int support_id) {
        this.support_id = support_id;
    }



}
