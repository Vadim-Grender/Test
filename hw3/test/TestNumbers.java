import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestNumbers {

    private Numbers numbers;

    @BeforeEach
    public void createNumbersClass(){
        numbers = new Numbers();
    }

    @ParameterizedTest
    @ValueSource (ints = {2, 12, 44})
     void numberCheckTrue(int number) {
        assertTrue(numbers.evenOddNumberCheck(number));
    }

    @ParameterizedTest
    @ValueSource (ints = {1, 3, 55})
    void evenOddNumberCheckFalse(int number) {
        assertFalse(numbers.evenOddNumberCheck(number));
    }
}