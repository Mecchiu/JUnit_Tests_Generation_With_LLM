// CheckDictCase.java
package scenario3;

import java.util.Map;

class CheckDictCase {

    /**
     * * Given a dictionary, return True if all keys are strings in lower
     * case or all keys are strings in upper case, else return False.
     * The function should return False is the given dictionary is empty.
     * Examples:
     * check_dict_case({"a":"apple", "b":"banana"}) should return True.
     * check_dict_case({"a":"apple", "A":"banana", "B":"banana"}) should return False.
     * check_dict_case({"a":"apple", 8:"banana", "a":"apple"}) should return False.
     * check_dict_case({"Name":"John", "Age":"36", "City":"Houston"}) should return False.
     * check_dict_case({"STATE":"NC", "ZIP":"12345" }) should return True.
     *
     * > checkDictCase({"p": "pineapple", "b": "banana"})
     * true
     * > checkDictCase({"p": "pineapple", "A": "banana", "B": "banana"})
     * false
     * > checkDictCase({"p": "pineapple", 5: "banana", "a": "apple"})
     * false
     * > checkDictCase({"Name": "John", "Age": "36", "City": "Houston"})
     * false
     * > checkDictCase({"STATE": "NC", "ZIP": "12345"})
     * true
     * > checkDictCase({"fruit": "Orange", "taste": "Sweet"})
     * true
     * > checkDictCase({})
     * false
     */
    public static boolean checkDictCase(Map<Object, Object> dict) {
        if (dict.isEmpty()) {
            return false;
        }
        boolean isLowerCase = true;
        boolean isUpperCase = true;
        for (Object key : dict.keySet()) {
            if (!(key instanceof String)) {
                return false;
            }
            String strKey = (String) key;
            if (!strKey.equals(strKey.toLowerCase())) {
                isLowerCase = false;
            }
            if (!strKey.equals(strKey.toUpperCase())) {
                isUpperCase = false;
            }
            if (!isLowerCase && !isUpperCase) {
                return false;
            }
        }
        return true;
    }
}

// CheckDictCaseTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Map)} method.
*/
class CheckDictCaseTest {

    @Test
    void testEmptyDict() {
        assertFalse(CheckDictCase.checkDictCase(Map.of()));
    }

    @Test
    void testAllLowerCase() {
        assertTrue(CheckDictCase.checkDictCase(Map.of("p", "pineapple", "b", "banana")));
    }

    @Test
    void testAllUpperCase() {
        assertTrue(CheckDictCase.checkDictCase(Map.of("STATE", "NC", "ZIP", "12345")));
    }

    @Test
    void testMixedCase() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("p", "pineapple", "A", "banana", "B", "banana")));
    }

    @Test
    void testNonStringKey() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("p", "pineapple", 5, "banana", "a", "apple")));
    }

    @Test
    void testDuplicateKeys() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("a", "apple", "A", "banana", "B", "banana")));
    }

    @Test
    void testAllKeysLowerCaseWithOneUpperCase() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("fruit", "Orange", "taste", "Sweet")));
    }

    @Test
    void testAllKeysUpperCaseWithOneLowerCase() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("Name", "John", "Age", "36", "City", "Houston")));
    }

    @Test
    void testAllKeysLowerCaseWithDuplicateUpperCase() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("fruit", "Orange", "taste", "Sweet", "TASTE", "SOUR")));
    }

    @Test
    void testAllKeysUpperCaseWithDuplicateLowerCase() {
        assertFalse(CheckDictCase.checkDictCase(Map.of("Name", "John", "Age", "36", "City", "Houston", "city", "Austin")));
    }
}