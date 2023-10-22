import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestRange {
    private Range range;

    @BeforeEach
    public void createClassRange(){
        range = new Range();
    }

    @ParameterizedTest
    @ValueSource(ints = {26, 55 , 70, 99})
    void numberInIntervalIsTrue(int number) {
        assertTrue(range.numberInInterval(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 100, 0, 24})
    void numberInIntervalIsFalse(int number) {
        assertFalse(range.numberInInterval(number));
    }
}