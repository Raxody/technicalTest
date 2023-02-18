package factorial;

import org.example.factorial.FactorialNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialNumberTest {

    private final FactorialNumber factorialNumber = new FactorialNumber();

    @Test
    @DisplayName("This test shows the factorial and its result of a positive number")
    void shouldShowTheFactorialOfAPositiveNumber() {
        // Arrange - Act - Assert
        assertEquals("8!=8*7*6*5*4*3*2*1=40320", factorialNumber.factorialNumber(8));
    }

    @Test
    @DisplayName("This test shows the factorial and its zero result")
    void shouldShowTheFactorialOfZero() {
        // Arrange - Act - Assert
        assertEquals("0!=1", factorialNumber.factorialNumber(0));
    }

    @Test
    @DisplayName("This test shows that a negative number doesn't have factorial")
    void shouldNotShowTheFactorialOfANegativeNumber() {
        // Arrange - Act - Assert
        assertEquals("The factorial of negative numbers can't be calculated.",
                factorialNumber.factorialNumber(-53));
    }
}
