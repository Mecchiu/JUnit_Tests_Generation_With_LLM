// ClosestIntegerTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains one unit test case for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
/**
	 * Tests the {@link ClosestInteger#closestInteger(String)} method
	 */
    @Test
    public void unitTest() {
        // Test case 1
        String[] testCases = {"10", "14.5", "16.0", "0"};
        for (int i = 0; i < testCases.length; i++) {
            String value = "123456".concat(testCases[i]);
            Integer expected = Integer.valueOf(123456);
            assertEquals(expected, ClosestInteger.closestInteger(value));
            assertTrue("Test case "+i+" should pass.", expected.equals(ClosestInteger.closestInteger(value)));
        }
        //Test case 2
        testCases = {"15.3", "-15.3", "0", "NULL"};
        for (int i = 0; i < testCases.length; i++) {
            String value = "123456".concat(testCases[i]);
            Integer expected = Integer.valueOf(123456);
            assertFalse("Test case "+i+" should fail", expected.equals(ClosestInteger.closestInteger(value)));
        }
        //Test case 3
        testCases = {"0", "NULL", "15.3", "-15.3"};
        for (int i = 0; i < testCases.length; i++) {
            String value = "123456".concat(testCases[i]);
            assertFalse("Test case "+i+" should fail", ClosestInteger.closestInteger(value).equals(Integer.valueOf(123456)));
        }
	}
}
