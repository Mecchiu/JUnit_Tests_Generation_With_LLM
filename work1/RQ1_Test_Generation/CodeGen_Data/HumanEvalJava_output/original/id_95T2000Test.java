// CheckDictCaseTest.java
package original;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains one unit test case for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

	// Test cases in the main class.
	/**
	 * Check case where the whole dictionary is empty.
	 */
	@Test
    public void checkDictNoDictionary() {
        // Empty dictionary.
        assertTrue(checkDictCase(new Object()));
    }
	
	// Check case where the entire dictionary is not empty.
	@Test
    public void checkDictDictionaryNotEmpty() {
        // New dictionary.
        checkDictCase(new Object());
    }

	/**
	 * Test case for {@link Map#size()} in a non empty dictionary.
	 */
	@Test
    public void checkCaseNonDictionaryWithNonEmptyMap() {
        // Non empty dictionary.
        assertEquals(new Integer(3), map().size());
    }

	/**
	 * Test case for {@link Map#size()} in a empty dictionary.
	 */
	@Test
    public void checkCaseEmptyDictionaryWithNonEmptyMap() {
        // Non empty dictionary.
        assertEquals(new Integer(0), map().size());
    }

	/**
	 * Test case for checking the count of keys which are not case sensitive or upper or lower.
	 */
	@Test
    public void check_dict_getAllCase() {
        // A dictionary.
        checkDictCase(new Object());
    }

	/**
	 * Test case for checking the count of keys which are case sensitive.
	 */
	@Test
    public void check_dict_getAllCase2() {
        // A dictionary without case.
        checkDictCase(new Object());
    }

	/**
	 * Test case for checking the count of keys which are case sensitive.
	 */
	@Test
    public void check_dict_getAllCase3() {
        // A dictionary without case.
        checkDictCase(new Object());
    }

	/**
	 * Test case for checking the count of keys which are non-case.
	 */
	@Test
    public void check_dict_getAllLowerCase() {
        // A dictionary with case only.
        checkDictCase(new Object());
    }

	/**
	 * Test case for checking the count of keys which are case sensitive.
	 */
	@Test
    public void check_dict_getAllUpperCase() {
        // A dictionary with case only.
        checkDictCase(new Object());
    }

	/**
	 * Test case for checking the number of times case of keys are case-sensitive.
	 * If the return value is true, skip the test case.
	 */
	@Test
    public void check_dict_getCaseCase() {
        // A dictionary with case only.
        checkDictCase(new Object());
    }
//	 * @Test
//    public void checkDictGetCaseLowerCaseOfNonCase() {
//        // A dictionary with case but not case-sensitive.
//        checkDictCase(new Object());
//    }

    private Map map() {
        return (Map) new Object();
    }
}