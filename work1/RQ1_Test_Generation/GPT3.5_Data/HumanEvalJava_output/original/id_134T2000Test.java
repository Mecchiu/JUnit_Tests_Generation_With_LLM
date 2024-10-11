```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckIfLastCharIsALetterTest {

    @Test
    void testEmptyString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
    }

    @Test
    void testSingleLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
    }

    @Test
    void testSingleNonLetter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("1"));
    }

    @Test
    void testWordWithSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
    }

    @Test
    void testWordWithSpaceAndExtraLetter() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
    }

    @Test
    void testWordWithSpaceAndExtraSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
    }

    @Test
    void testWordWithMultipleLetters() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
    }

    @Test
    void testWordWithMultipleLettersAndSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
    }

    @Test
    void testWordWithSpaceAndNumber() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
    }

    @Test
    void testWordWithSpaceAndExtraSpaceAndLetter() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
    }
}
```
