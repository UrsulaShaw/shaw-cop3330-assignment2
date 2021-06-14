package ex24.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    @DisplayName("fido, difo")
    public void prints_correct_result_set1() {
        Application app = new Application();

        String result = app.isAnagram("fido", "difo");

        assertEquals("fido and difo are anagrams.", result);
    }

    @Test
    @DisplayName("difo, God")
    public void prints_correct_result_set2() {
        Application app = new Application();

        String result = app.isAnagram("difo", "God");

        assertEquals("difo and God are not the same length. They are not anagrams.", result);
    }
    @Test
    @DisplayName("Funeral, Real fun")
    public void prints_correct_result_set3() {
        Application app = new Application();

        String result = app.isAnagram("Funeral", "Real fun");

        assertEquals("Funeral and Real fun are anagrams.", result);
    }
    @Test
    @DisplayName("Astronomer, Moon starer")
    public void prints_correct_result_set4() {
        Application app = new Application();

        String result = app.isAnagram("Astronomer", "Moon starer");

        assertEquals("Astronomer and Moon starer are anagrams.", result);
    }
}