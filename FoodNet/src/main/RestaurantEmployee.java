package main;

public class RestaurantEmployee extends Person {
    private int sal;
    private String user_name;
    private String password;

    public RestaurantEmployee(String first_name, String last_name, String personalData, String email_address, int phone_number, String gender, int sal, String user_name, String password) {
        super(first_name, last_name, personalData, email_address, phone_number, gender);
        this.sal = sal;
        this.user_name = user_name;
        this.password = password;
    }

    public RestaurantEmployee() {
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
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
    public boolean logIn(String user_name, String password) {
        if(user_name.equals(this.user_name) && password.equals(this.password)){
            System.out.println("Succesfully logged in!");
            return true;
        }else{
            System.out.println("You entered incorrect data");
        }
        return false;
    }
}
