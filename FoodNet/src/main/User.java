package main;

import main.Person;

import java.util.ArrayList;
import java.util.List;

public class User extends Person {

    private String user_name;
    private String password;


    private  List<Feedback> feedbackList = new ArrayList<>();
    private  List<Proposal> proposalsList = new ArrayList<>();


    public void addFeedback(Feedback newFeedback){
        if(!feedbackList.contains(newFeedback)){
            feedbackList.add(newFeedback);
        }
    }

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public User(String user_name) {
        this.user_name = user_name;
    }

    public User() {
    }

    public String getUser_name() {
        return user_name;
    }


    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getFirst_name() {
        return super.getFirst_name();
    }

    @Override
    public boolean logIn(String user_name, String password) {
        if(user_name.equals(this.user_name) && password.equals(this.password)){
            System.out.println("Succesfully logged in!");
            return  true;
        }else{
            System.out.println("You entered incorrect data");
        }
        return false;
    }

    public void giveFeedback(Feedback feedback){
        System.out.println("User left feedback: " );
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", feedbackList=" + feedbackList +         //how to next line objects
                '}' ;
    }
}
