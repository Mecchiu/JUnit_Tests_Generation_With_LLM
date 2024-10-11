// CheckDictCaseTest.java
package scenario1;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {
			// Test case 1: Test with empty dictionary
    @Test
    void testEmptyDict() {
        Map<String, Integer> dict = Map.of();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 2: Test with dictionary with all keys in lower case
    @Test
    void testAllLower() {
        Map<String, Integer> dict = Map.of("one", 1, "two", 2, "three", 3);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 3: Test with dictionary with all keys in upper case
    @Test
    void testAllUpper() {
        Map<String, Integer> dict = Map.of("ONE", 1, "TWO", 2, "THREE", 3);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 4: Test with dictionary with some keys in lower case and some keys in upper case
    @Test
    void testMixedCase() {
        Map<String, Integer> dict = Map.of("one", 1, "TWO", 2, "three", 3);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 5: Test with dictionary with all keys in lower case and one key with special character
    @Test
    void testSpecialChar() {
        Map<String, Integer> dict = Map.of("one", 1, "two", 2, "three", 3, "four$", 4);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 6: Test with dictionary with all keys in lower case and one key with number
    @Test
    void testNumber() {
        Map<String, Integer> dict = Map.of("one", 1, "two", 2, "three", 3, "four1", 4);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 7: Test with dictionary with all keys in lower case and one key with space
    @Test
    void testSpace() {
        Map<String, Integer> dict = Map.of("one", 1, "two", 2, "three", 3, "four ", 4);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 8: Test with dictionary with all keys in lower case and one key with empty string
    @Test
    void testEmptyString() {
        Map<String, Integer> dict = Map.of("one", 1, "two", 2, "three", 3, "", 4);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 9: Test with dictionary with all keys in lower case and one key with null value
    @Test
    void testNullValue() {
        Map<String, Integer> dict = Map.of("one", 1, "two", 2, "three", 3, null, 4);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 10: Test with dictionary with all keys in lower case and one key with null key
    @Test
    void testNullKey() {
        Map<String, Integer> dict = Map.of("one", 1, "two", 2, "three", 3, null, 4);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
}