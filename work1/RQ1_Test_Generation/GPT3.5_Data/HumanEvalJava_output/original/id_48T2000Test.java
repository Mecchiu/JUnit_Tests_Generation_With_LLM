```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    void testEmptyString() {
        assertTrue(IsPalindrome.isPalindrome(""));
    }

    @Test
    void testPalindrome() {
        assertTrue(IsPalindrome.isPalindrome("aba"));
    }

    @Test
    void testSameCharacters() {
        assertTrue(IsPalindrome.isPalindrome("aaaaa"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(IsPalindrome.isPalindrome("zbcd"));
    }

    @Test
    void testOddLengthPalindrome() {
        assertTrue(IsPalindrome.isPalindrome("xywyx"));
    }

    @Test
    void testOddLengthNonPalindrome() {
        assertFalse(IsPalindrome.isPalindrome("xywyz"));
    }

    @Test
    void testEvenLengthNonPalindrome() {
        assertFalse(IsPalindrome.isPalindrome("xywzx"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(IsPalindrome.isPalindrome("x"));
    }

    @Test
    void testTwoCharactersPalindrome() {
        assertTrue(IsPalindrome.isPalindrome("aa"));
    }

    @Test
    void testTwoCharactersNonPalindrome() {
        assertFalse(IsPalindrome.isPalindrome("ab"));
    }
}
```
