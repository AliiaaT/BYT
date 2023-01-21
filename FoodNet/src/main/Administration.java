package main;

import java.util.ArrayList;
import java.util.List;

public class Administration extends RestaurantEmployee {
    private List<BankAccount> accountList = new ArrayList<>();
    private  List<Advertisement> adds = new ArrayList<>();

    public Administration(String first_name, String last_name, String personalData, String email_address, int phone_number, String gender, int sal, String user_name, String password, BankAccount account) {
        super(first_name, last_name, personalData, email_address, phone_number, gender, sal, user_name, password);
    }

    public Administration() {
    }


    public String buyAdvertisement(Advertisement advertisement){
        String answer = "Congratulations! You have bought the advertisement of " + advertisement.getType() +" type. It will be valid for "+advertisement.getDuration()+" days.";
        return answer;
    }
}
