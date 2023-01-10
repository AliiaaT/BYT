package main;

public abstract class Person {
    private String first_name;
    private String last_name;
    private String personalData;
    private String email_address;
    private int phone_number;
    private String gender;

    public Person(String first_name, String last_name, String personalData, String email_address, int phone_number, String gender) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.personalData = personalData;
        this.email_address = email_address;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    public Person() {
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    public abstract boolean logIn(String user_name, String password);
}
