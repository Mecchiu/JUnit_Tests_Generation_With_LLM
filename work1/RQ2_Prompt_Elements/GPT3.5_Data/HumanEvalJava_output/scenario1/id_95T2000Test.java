// CheckDictCase.java
package scenario1;

import java.util.Map;

class CheckDictCase {

    public static Boolean checkDictCase(Object dict) {
        if (dict instanceof Map) {
            Map<?, ?> m = (Map<?, ?>) dict;
            if (m.size() == 0) {
                return false;
            }
            boolean allLower = true;
            boolean allUpper = true;
            for (Object k : m.keySet()) {
                if (k instanceof String) {
                    String s = (String) k;
                    if (!s.equals(s.toLowerCase())) {
                        allLower = false;
                    }
                    if (!s.equals(s.toUpperCase())) {
                        allUpper = false;
                    }
                } else {
                    return false;
                }
            }
            return allLower || allUpper;
        }
        return false;
    }
}

// CheckDictCaseTest.java
package scenario1;

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
    void testEmptyMap() {
        Map<String, Integer> map = new HashMap<>();
        assertFalse(CheckDictCase.checkDictCase(map));
    }
    
    @Test
    void testAllLowercaseKeys() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key2", 2);
        assertTrue(CheckDictCase.checkDictCase(map));
    }
    
    @Test
    void testAllUppercaseKeys() {
        Map<String, Integer> map = new HashMap<>();
        map.put("KEY1", 1);
        map.put("KEY2", 2);
        assertTrue(CheckDictCase.checkDictCase(map));
    }
    
    @Test
    void testMixedCaseKeys() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("KEY2", 2);
        assertFalse(CheckDictCase.checkDictCase(map));
    }
    
    @Test
    void testNonStringKeys() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "value1");
        map.put(2, "value2");
        assertFalse(CheckDictCase.checkDictCase(map));
    }
    
    @Test
    void testNullInput() {
        assertFalse(CheckDictCase.checkDictCase(null));
    }
    
    @Test
    void testSingleKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        assertTrue(CheckDictCase.checkDictCase(map));
    }
    
    @Test
    void testSingleUppercaseKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("KEY1", 1);
        assertTrue(CheckDictCase.checkDictCase(map));
    }
    
    @Test
    void testSingleLowercaseKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        assertTrue(CheckDictCase.checkDictCase(map));
    }
    
    @Test
    void testEmptyStringKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("", 1);
        assertTrue(CheckDictCase.checkDictCase(map));
    }
}