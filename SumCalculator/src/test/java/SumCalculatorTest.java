import org.example.SumCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {
    SumCalculator sumCalc = new SumCalculator();

    @Test
    void testOne() {
        //when
        int result = sumCalc.sum(1);
        //then
        assertEquals(1, result);
    }

    @Test
    void testThree() {
        //when
        int result = sumCalc.sum(3);
        //then
        assertEquals(6, result);
    }

    @Test
    void testZeroIllegalArgumentsException() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("This argument is illegal");
        });
        assertEquals("This argument is illegal", exception.getMessage());
    }

}
