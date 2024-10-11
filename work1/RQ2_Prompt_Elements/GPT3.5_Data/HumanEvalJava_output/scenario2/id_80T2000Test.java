Here's the code for the `IsHappyTest` class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsHappyTest {

    @Test
    void testIsHappyWithEmptyString() {
        assertFalse(IsHappy.isHappy(""));
    }

    @Test
    void testIsHappyWithLengthLessThan3() {
        assertFalse(IsHappy.isHappy("a"));
        assertFalse(IsHappy.isHappy("ab"));
    }

    @Test
    void testIsHappyWithConsecutiveLetters() {
        assertFalse(IsHappy.isHappy("aaa"));
        assertFalse(IsHappy.isHappy("abcabc"));
        assertFalse(IsHappy.isHappy("ababab"));
    }

    @Test
    void testIsHappyWithDistinctLetters() {
        assertTrue(IsHappy.isHappy("abc"));
        assertTrue(IsHappy.isHappy("def"));
        assertTrue(IsHappy.isHappy("xyz"));
    }

    @Test
    void testIsHappyWithMixedLetters() {
        assertFalse(IsHappy.isHappy("abca"));
        assertFalse(IsHappy.isHappy("abcb"));
        assertFalse(IsHappy.isHappy("abcc"));
    }

    @Test
    void testIsHappyWithUpperCaseLetters() {
        assertTrue(IsHappy.isHappy("aBc"));
        assertTrue(IsHappy.isHappy("DeF"));
        assertTrue(IsHappy.isHappy("XyZ"));
    }

    @Test
    void testIsHappyWithNumbers() {
        assertFalse(IsHappy.isHappy("123"));
        assertFalse(IsHappy.isHappy("456"));
        assertFalse(IsHappy.isHappy("789"));
    }

    @Test
    void testIsHappyWithSpecialCharacters() {
        assertFalse(IsHappy.isHappy("!@#"));
        assertFalse(IsHappy.isHappy("$%^"));
        assertFalse(IsHappy.isHappy("&*()"));
    }

    @Test
    void testIsHappyWithMixedCharacters() {
        assertFalse(IsHappy.isHappy("a1b2c3"));
        assertFalse(IsHappy.isHappy("d4e5f6"));
        assertFalse(IsHappy.isHappy("g7h8i9"));
    }

    @Test
    void testIsHappyWithLongString() {
        assertTrue(IsHappy.isHappy("abcdefghijklmnopqrstuvwxyz"));
        assertFalse(IsHappy.isHappy("abcdefghijklmnopqrstuvwxyza"));
    }
}
```

This test class contains ten test cases that cover different scenarios for the `isHappy` method. The test cases include empty strings, strings with length less than 3, strings with consecutive letters, strings with distinct letters, strings with mixed letters, strings with uppercase letters, strings with numbers, strings with special characters, and a long string.