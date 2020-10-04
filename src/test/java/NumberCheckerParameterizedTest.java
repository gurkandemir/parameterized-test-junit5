import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberCheckerParameterizedTest {

    private NumberChecker numberChecker;

    @BeforeEach
    void setUp() {
        numberChecker = new NumberChecker();
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4})
    public void should_return_positive_when_input_is_greater_than_zero(int input) {
        String response = numberChecker.checkNumber(input);

        assertEquals("POSITIVE", response);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -2, -3, -4})
    public void should_return_negative_when_input_is_greater_than_zero(int input) {
        String response = numberChecker.checkNumber(input);

        assertEquals("NEGATIVE", response);
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    public void should_return_zero_when_input_is_zero(int input) {
        String response = numberChecker.checkNumber(input);

        assertEquals("ZERO", response);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, POSITIVE",
            "-1, NEGATIVE",
            "0, ZERO"
    })
    public void should_check_numbers_csv_source(int input, String expected) {
        String response = numberChecker.checkNumber(input);

        assertEquals(expected, response);
    }
}