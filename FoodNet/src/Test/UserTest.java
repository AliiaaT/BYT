package Test;

import main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void isLogInCorrect() {
        User user = new User("Andrii","121314");
        assertTrue(user.logIn("Andrii","121314"));

    }
}