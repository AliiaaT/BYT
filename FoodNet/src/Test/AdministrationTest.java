package Test;
import main.Administration;
import main.Advertisement;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(JUnit4.class)
public class AdministrationTest {
    @Test
    public void shouldBuyCorrectAdvertisement(){
        Administration a = new Administration();
        Advertisement premium = new Advertisement("premium", 1500, 14);
        assertEquals("Congratulations! You have bought the advertisement of premium type. It will be valid for 14 days.",a.buyAdvertisement(premium));
    }
}