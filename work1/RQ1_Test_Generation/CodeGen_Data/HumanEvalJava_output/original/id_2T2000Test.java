// TruncateNumberTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains one unit test case for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {

    /**
     * {@code TruncateNumberTest} is a container class for one unit test class.
     * It contains one unit test case for the {@link TruncateNumber#truncateNumber(Double)} method.
     * The {@code TruncateNumberTest} objects should be reused.
     */
	@Test
    public void test() {
        
    	// test truncateNumber(0)
        Double expectedResult = Double.valueOf(0);
        assertEquals(expectedResult, TruncateNumber.truncateNumber(0));
        
    	// test truncateNumber(inf)
        Double expectedResult = Double.valueOf(1);
        assertEquals(expectedResult, TruncateNumber.truncateNumber(Infinity));
    }

}
