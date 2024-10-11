// CheckIfLastCharIsALetterTest.java
package scenario2;

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
    void testSingleLetterInWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("hello"));
    }

    @Test
    void testSingleNonLetterInWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("hello1"));
    }

    @Test
    void testMultipleLetters() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("abc def ghi jkl mno pqr stu vwx yz a"));
    }

    @Test
    void testMultipleNonLetters() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("abc def ghi jkl mno pqr stu vwx yz 1"));
    }

    @Test
    void testMultipleLettersInWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("abc def ghi jkl mno pqr stu vwx yz hello"));
    }

    @Test
    void testMultipleNonLettersInWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("abc def ghi jkl mno pqr stu vwx yz hello1"));
    }

    @Test
    void testMultipleWords() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("abc def ghi jkl mno pqr stu vwx yz a b c"));
    }
}