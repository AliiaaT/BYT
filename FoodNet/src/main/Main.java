package main;

public class Main {
    public static void main(String[] args) {
        User aliia = new User("aliia","temirbek kyzy",
                "adsdfsdfsd", "gmail", 444,
                "male", "kaprisuly", "1213");

        aliia.logIn("kaprisuly", "1213");

        System.out.println(aliia.getFirst_name());


        Advertisement standart = new Advertisement("standart", 100, 5);
        BankAccount millenuimAccount = new BankAccount(121314, "Ola Nowak's account", 10000);

        Administration Ola = new Administration("Ola","Nowak kyzy",
                "adsdfsdfsd", "gmail", 444,
                "male", 5000, "ola", "3333", millenuimAccount);
        Ola.buyAdvertisement(standart);

        Restaurant r = new Restaurant("SeaFood", "Koshykowa 100");

        Feedback f = new Feedback(r, "afafafasf", "must visit");

        aliia.giveFeedback(f);
    }
}
