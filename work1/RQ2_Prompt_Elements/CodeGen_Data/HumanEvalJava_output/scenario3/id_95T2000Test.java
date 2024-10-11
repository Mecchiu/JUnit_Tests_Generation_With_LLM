// CheckDictCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains one unit test case for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {
/**
     * Constructor of {@link CheckDictCaseTest}.
     */
    private CheckDictCaseTest() {
    }

	/**
	 * Test method for {@link CheckDictCase#checkDictCase(Object)}.
	 */
	@Test
    public void testCheckDictCase() {
        assertTrue( checkDictCase(null) );
        assertTrue(!checkDictCase(new Object()) );
        assertTrue( checkDictCase(obj) );
        assertTrue(!checkDictCase("apple") );
        assertFalse( checkDictCase(new String("Apple")) );

    }
}