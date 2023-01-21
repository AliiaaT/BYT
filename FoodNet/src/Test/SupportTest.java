package Test;

import main.SolutionDatabase;
import main.Support;
import main.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupportTest {

    @Test
    void testSupportAssiciation() {
        Support konrad = new Support(1);
        konrad.addSolution(new SolutionDatabase(1,"searchErrorSolution"));

        System.out.println(konrad);
    }
}