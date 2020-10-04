import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCheckerTest {

    private NumberChecker numberChecker;

    @BeforeEach
    void setUp() {
        numberChecker = new NumberChecker();
    }

    @Test
    public void should_return_positive_when_input_is_greater_than_zero() {
        int input = 12;

        String response = numberChecker.checkNumber(input);

        assertEquals("POSITIVE", response);
    }

    @Test
    public void should_return_negative_when_input_is_less_than_zero() {
        int input = -12;

        String response = numberChecker.checkNumber(input);

        assertEquals("NEGATIVE", response);
    }

    @Test
    public void should_return_zero_when_input_is__zero() {
        int input = 0;

        String response = numberChecker.checkNumber(input);

        assertEquals("ZERO", response);
    }
}