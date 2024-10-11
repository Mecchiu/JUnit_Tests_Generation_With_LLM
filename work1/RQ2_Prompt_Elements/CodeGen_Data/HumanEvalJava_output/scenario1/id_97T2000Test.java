// MultiplyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Multiply}.
* It contains one unit test case for the {@link Multiply#multiply(int, int)} method.
*/
class MultiplyTest {

    @Test
    public void multipliesNumbersIn1And10() {
        int a = 1;
        int result = multiply(a, 10);
        assertEquals(5, result);
    }

    @Test
    public void multipliesNumbersIn10And3() {
        int a = 10;
        int result = multiply(a, 3);
        assertEquals(5, result);
    }
        
    @Test
    public void returnsZeroForZeroArgument() {
        assertEquals(0, Multiply.multiply(0, 0));
    }
}

// UnaryOperationsTest.java
package scenario1;


public class UnaryOperationsTest {
	
    @Test
    public void unaryTests() {
        int result = (10 - 5) / 10;
        assertEquals(5, result);
    }

}