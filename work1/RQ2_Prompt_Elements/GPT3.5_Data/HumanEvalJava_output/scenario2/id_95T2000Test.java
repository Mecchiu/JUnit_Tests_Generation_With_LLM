// CheckDictCaseTest.java
package scenario2;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

    @Test
    void testEmptyDict() {
        Map<String, Integer> dict = new HashMap<>();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testAllLowercaseKeys() {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("apple", 1);
        dict.put("banana", 2);
        dict.put("cherry", 3);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testAllUppercaseKeys() {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("APPLE", 1);
        dict.put("BANANA", 2);
        dict.put("CHERRY", 3);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testMixedCaseKeys() {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("apple", 1);
        dict.put("BANANA", 2);
        dict.put("Cherry", 3);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testNonStringKeys() {
        Map<Integer, String> dict = new HashMap<>();
        dict.put(1, "apple");
        dict.put(2, "banana");
        dict.put(3, "cherry");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testNullDict() {
        assertFalse(CheckDictCase.checkDictCase(null));
    }

    @Test
    void testSingleKey() {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("apple", 1);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testSingleUppercaseKey() {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("APPLE", 1);
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testSingleMixedCaseKey() {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("Apple", 1);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testMultipleMixedCaseKeys() {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("apple", 1);
        dict.put("BANANA", 2);
        dict.put("Cherry", 3);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testMultipleMixedCaseKeysWithNumbers() {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("apple", 1);
        dict.put("BANANA", 2);
        dict.put("Cherry", 3);
        dict.put("123", 4);
        assertFalse(CheckDictCase.checkDictCase(dict));
    }
}