// CheckIfLastCharIsALetter.java
package scenario3;

class CheckIfLastCharIsALetter {

    /**
     * * Create a function that returns True if the last character
     * of a given string is an alphabetical character and is not
     * a part of a word, and False otherwise.
     * Note: "word" is a group of characters separated by space.
     *
     * Examples:
     * checkIfLastCharIsALetter("apple pie") ➞ False
     * checkIfLastCharIsALetter("apple pi e") ➞ True
     * checkIfLastCharIsALetter("apple pi e ") ➞ False
     * checkIfLastCharIsALetter("") ➞ False
     *
     * > checkIfLastCharIsALetter("apple")
     * false
     * > checkIfLastCharIsALetter("apple pi e")
     * true
     * > checkIfLastCharIsALetter("eeeee")
     * false
     * > checkIfLastCharIsALetter("A")
     * true
     * > checkIfLastCharIsALetter("Pumpkin pie ")
     * false
     * > checkIfLastCharIsALetter("Pumpkin pie 1")
     * false
     * > checkIfLastCharIsALetter("")
     * false
     * > checkIfLastCharIsALetter("eeeee e ")
     * false
     * > checkIfLastCharIsALetter("apple pie")
     * false
     * > checkIfLastCharIsALetter("apple pi e ")
     * false
     */
    public static Boolean checkIfLastCharIsALetter(String txt) {
        if (txt == null || txt.isEmpty()) {
            return false;
        }
        String[] words = txt.split(" ");
        String lastWord = words[words.length - 1];
        if (lastWord.length() == 1 && Character.isLetter(lastWord.charAt(0))) {
            return true;
        }
        return false;
    }
}

// CheckIfLastCharIsALetterTest.java
package scenario3;


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
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
    }

    @Test
    void testSingleLetterWithSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A "));
    }

    @Test
    void testSingleLetterWithMultipleSpaces() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A   "));
    }

    @Test
    void testSingleLetterWithWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple"));
    }

    @Test
    void testMultipleLettersWithWord() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
    }

    @Test
    void testMultipleLettersWithSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
    }

    @Test
    void testMultipleLettersWithSpaceAndExtraSpace() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
    }

    @Test
    void testMultipleWordsWithSpaceAndExtraSpace() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
    }

    @Test
    void testMultipleWordsWithSpaceAndNumber() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
    }
}