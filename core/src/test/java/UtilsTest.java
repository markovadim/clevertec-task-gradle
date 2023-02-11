import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void isAllPositiveNumbers_shouldReturnTrue() {
        assertTrue(Utils.isAllPositiveNumbers("324", "465", "85"));
    }

    @Test
    void isAllPositiveNumbers_shouldReturnFalse() {
        assertFalse(Utils.isAllPositiveNumbers("-4", "623", "9899"));
    }

    @Test
    void isAllPositiveNumbers_shouldReturnException() {
        assertThrows(NumberFormatException.class, () -> Utils.isAllPositiveNumbers("4", "3", "9o9"));
    }
}