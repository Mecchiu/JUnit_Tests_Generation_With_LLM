Here's the code for the `SameCharsTest` class with ten unit test cases for the `sameChars` method:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SameCharsTest {

    @Test
    void testSameCharsWithEmptyStrings() {
        assertTrue(SameChars.sameChars("", ""));
    }

    @Test
    void testSameCharsWithSameStrings() {
        assertTrue(SameChars.sameChars("abc", "abc"));
    }

    @Test
    void testSameCharsWithDifferentLengthStrings() {
        assertFalse(SameChars.sameChars("abc", "abcd"));
    }

    @Test
    void testSameCharsWithSameLengthDifferentOrderStrings() {
        assertTrue(SameChars.sameChars("abc", "cba"));
    }

    @Test
    void testSameCharsWithSameLengthDifferentStrings() {
        assertFalse(SameChars.sameChars("abc", "def"));
    }

    @Test
    void testSameCharsWithUpperCaseStrings() {
        assertTrue(SameChars.sameChars("ABC", "cba"));
    }

    @Test
    void testSameCharsWithNumericStrings() {
        assertTrue(SameChars.sameChars("123", "321"));
    }

    @Test
    void testSameCharsWithSpecialCharacterStrings() {
        assertTrue(SameChars.sameChars("!@#", "#!@"));
    }

    @Test
    void testSameCharsWithNullStrings() {
        assertThrows(NullPointerException.class, () -> SameChars.sameChars(null, null));
    }

    @Test
    void testSameCharsWithOneNullString() {
        assertThrows(NullPointerException.class, () -> SameChars.sameChars("abc", null));
    }
}
```

This test class includes test cases for empty strings, same strings, different length strings, same length different order strings, same length different strings, uppercase strings, numeric strings, special character strings, null strings, and one null string.