package ex25;

import ex25.base.Application;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    @DisplayName("password")
    public void prints_correct_output_1() {
        Application app = new Application();

        String output = app.displayOutput("password", app.passwordValidator("password"));

        assertEquals("pass is a very weak password.", output);
    }

    @Test
    @DisplayName("sk487$skn24$")
        public void prints_correct_output_2() {
        Application app = new Application();

        String output = app.displayOutput("sk487$skn24$", app.passwordValidator("sk487$skn24$"));
        assertEquals("sk487$skn24$ is a very strong password.", output);
        }

}
