```java
package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckDictCaseTest {

    @Test
    void testAllLowerCaseKeys_ReturnsTrue() {
        Map<String, String> dict = Map.of("a", "apple", "b", "banana");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testMixedCaseKeys_ReturnsFalse() {
        Map<String, String> dict = Map.of("a", "apple", "A", "banana", "B", "banana");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testNonStringKeys_ReturnsFalse() {
        Map<Object, String> dict = Map.of("p", "pineapple", 5, "banana", "a", "apple");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testNonEmptyDictWithMixedCaseKeys_ReturnsFalse() {
        Map<String, String> dict = Map.of("Name", "John", "Age", "36", "City", "Houston");
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testAllUpperCaseKeys_ReturnsTrue() {
        Map<String, String> dict = Map.of("STATE", "NC", "ZIP", "12345");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testAllLowerCaseKeysWithNonStringValues_ReturnsTrue() {
        Map<String, Object> dict = Map.of("fruit", "Orange", "taste", "Sweet");
        assertTrue(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testEmptyDict_ReturnsFalse() {
        Map<String, String> dict = Map.of();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testEmptyDict_ReturnsFalse() {
        Map<String, String> dict = Map.of();
        assertFalse(CheckDictCase.checkDictCase(dict));
    }

    @Test
    void testNonMapInput_ReturnsFalse() {
        assertFalse(CheckDictCase.checkDictCase("not a map"));
    }

    @Test
    void testNullInput_ReturnsFalse() {
        assertFalse(CheckDictCase.checkDictCase(null));
    }
}
```
```