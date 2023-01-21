package Test;

import main.Restaurant;
import main.RestaurantEmployee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {

    @Test
    void addEmployee() {
        Restaurant res1= new Restaurant("FrenchBakary");

        res1.addEmployee(new RestaurantEmployee("Max Robert"));
        res1.addEmployee(new RestaurantEmployee("Aliia Temirbekova"));
        System.out.println(res1);
    }
}