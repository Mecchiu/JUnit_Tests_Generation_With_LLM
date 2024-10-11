Here's the code for the test class:

```
// CheckIfLastCharIsALetterTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {

    @Test
    void testEmptyString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
    }

    @Test
    void testSingleLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a"));
    }

    @Test
    void testSingleNonLetter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1"));
    }

    @Test
    void testTwoLetters() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("ab"));
    }

    @Test
    void testTwoNonLetters() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("12"));
    }

    @Test
    void testLetterThenNonLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1"));
    }

    @Test
    void testNonLetterThenLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1a"));
    }

    @Test
    void testThreeLetters() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("abc"));
    }

    @Test
    void testThreeNonLetters() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("123"));
    }

    @Test
    void testLetterThenTwoNonLetters() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a12"));
    }
}
```