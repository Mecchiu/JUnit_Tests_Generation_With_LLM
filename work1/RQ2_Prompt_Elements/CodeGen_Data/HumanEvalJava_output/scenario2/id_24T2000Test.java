// LargestDivisorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains one unit test case for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {
 
    int test = 4;

    @Test
    public void test() {
        assertEquals("Largest divisor is 4.", 10, LargestDivisor.largestDivisor(test));
    }
    
}
