package main;

import main.Person;

public class User extends Person {

    private String user_name;
    private String password;

    public User(String first_name, String last_name, String personalData, String email_address, int phone_number, String gender, String user_name, String password) {
        super(first_name, last_name, personalData, email_address, phone_number, gender);
        this.user_name = user_name;
        this.password = password;
    }

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
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
}
