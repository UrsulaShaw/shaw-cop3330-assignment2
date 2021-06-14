package ex26.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ApplicationTest {
    @Test
    @DisplayName("5000, 12, 100")
    public void prints_correct_number_1() {
        Application app = new Application();

        String output = app.displayResult((int) app.calculateMonthsUntilPaidOff(5000, 12, 100));

        assertEquals("It will take you 70 months to pay off this card.", output);
    }
}
