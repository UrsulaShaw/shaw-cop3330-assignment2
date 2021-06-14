package ex25;

import ex25.base.Application;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ValidatorTest {
    @Test
    @DisplayName("pass")
    public void returns_correct_strength_1() {
        Application app = new Application();
        int strength = app.passwordValidator("pass");

        assertEquals(0, strength);
    }

}
