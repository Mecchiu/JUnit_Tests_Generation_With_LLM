// CheckDictCaseTest.java
package scenario2;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {
			// Test case 1: Empty dictionary
    @Test
    void testEmptyDict() {
        Map<String, Integer> dict = Map.of();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 2: Dictionary with all keys in lower case
    @Test
    void testAllLower() {
        Map<String, Integer> dict = Map.of("apple", 1, "banana", 2, "orange", 3);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 3: Dictionary with all keys in upper case
    @Test
    void testAllUpper() {
        Map<String, Integer> dict = Map.of("APPLE", 1, "BANANA", 2, "ORANGE", 3);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 4: Dictionary with some keys in lower case and some keys in upper case
    @Test
    void testMixedCase() {
        Map<String, Integer> dict = Map.of("apple", 1, "BANANA", 2, "orange", 3);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    // Test case 5: Dictionary with all keys in lower case and one key with special characters
    @Test
    void testSpecialChar() {
        Map<String, Integer> dict = Map.of("apple", 1, "banana", 2, "orange", 3, "gr@pe", 4);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 6: Dictionary with all keys in lower case and one key with numbers
    @Test
    void testNumber() {
        Map<String, Integer> dict = Map.of("apple", 1, "banana", 2, "orange", 3, "grape123", 4);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 7: Dictionary with all keys in lower case and one key with space
    @Test
    void testSpace() {
        Map<String, Integer> dict = Map.of("apple", 1, "banana", 2, "orange", 3, "grape 123", 4);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 8: Dictionary with all keys in lower case and one key with empty string
    @Test
    void testEmptyString() {
        Map<String, Integer> dict = Map.of("apple", 1, "banana", 2, "orange", 3, "", 4);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 9: Dictionary with all keys in lower case and one key with null value
    @Test
    void testNullValue() {
        Map<String, Integer> dict = Map.of("apple", 1, "banana", 2, "orange", 3, null, 4);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    // Test case 10: Dictionary with all keys in lower case and one key with null key
    @Test
    void testNullKey() {
        Map<String, Integer> dict = Map.of("apple", 1, "banana", 2, "orange", 3, null, 4);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }
}