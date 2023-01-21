package Test;

import main.Feedback;
import main.Restaurant;
import main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {




    @Test
    void addFeedback() {
        Feedback feedback1 = new Feedback(new Restaurant("SeaFoodMonica", "Salmon, Tuna, Shrimp, etc","Wolska 11", 23232323),"The food was really tasty","recommend");
        Feedback feedback2 = new Feedback(new Restaurant("French bakary", "crausane, macarons, san-sebastian, etc","Jeroz 11", 454545545),"The food was really tasty","recommend");

        User alia = new User("Aliia");
        User alicia = new User("Alicia");
        alia.addFeedback(feedback1);
        System.out.println(alia);
        System.out.println();

        alicia.addFeedback(feedback1);
        alicia.addFeedback(feedback2);


        System.out.println(alicia + "\n");

    }

    @Test
    void addSolutionFromSupport() {
    }
    @Test
    void isLogInCorrect() {
        User user = new User("Andrii","121314");
        assertTrue(user.logIn("Andrii","121314"));

    }

}