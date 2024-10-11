// GenerateIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains one unit test case for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {

    /**
     * Empty, null, or equal tests.
     */
    @Test
    public void testEmptyIsNullAndEqualToNull() {
        assertFalse("Should not accept null.", new GenerateIntegers().generateIntegers(null));
        assertTrue("Should not accept non-null", new GenerateIntegers().generateIntegers(0, null) == null);
        assertTrue("Should return true for non-null.", new GenerateIntegers().generateIntegers(-1, -1) == null);
    }
    
    /**
     * The evenDigitsBetweenAreGreaterThan, evenDigitsBetweenAreEqualToAndNull() tests.
     */
    @Test
    public void testGenerateIntegersEvenDigitsBetweenAreGreaterThanAndNull() {
        assertFalse("Should not accept null.", new GenerateIntegers().generateIntegers(-1, -1));
        assertTrue("Should return true for non-null", new GenerateIntegers().generateIntegers(-2, -4) == null);
        assertTrue("Should not accept null", new GenerateIntegers().generateIntegers(2, -4) == null);
        assertTrue("Should not accept null", new GenerateIntegers().generateIntegers(-3, -4) == null);
        assertTrue("Should return true for positive ints", new GenerateIntegers().generateIntegers(-1, 2).equals(new ArrayList<<Object>>(-1, 2, -1)));
        assertTrue("Should return true for negative ints", new GenerateIntegers().generateIntegers(1, -2).equals(new ArrayList<<Object>>(-1, 2, -1)));
        assertTrue("Should not return true for ints greater than", new GenerateIntegers().generateIntegers(Math.abs(4), Math.abs(10))).equals(new ArrayList<<Object>>(-1, 2, -1));
    }
    
    /**
     * The evenDigitsBetweenAreLessThanAndNull() tests.
     */
    @Test
    public void testGenerateIntegersEvenDigitsBetweenAreLessThanAndNull() {
        assertTrue("Should accept non-null", new GenerateIntegers().generateIntegers(1, -1).equals(new ArrayList<<Object>>(1, 0, -1)));
        assertTrue("Should return null", new GenerateIntegers().generateIntegers(1, -11).equals(null));
    }
}
