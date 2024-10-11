// CheckIfLastCharIsALetterTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {
	// Test case 1: Empty string
    @Test
    void testEmptyString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
    }

    // Test case 2: String with one character
    @Test
    void testOneCharacterString() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a"));
    }

    // Test case 3: String with two characters
    @Test
    void testTwoCharactersString() {
        assertTrue(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1"));
    }

    // Test case 4: String with three characters
    @Test
    void testThreeCharactersString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1b"));
    }

    // Test case 5: String with four characters
    @Test
    void testFourCharactersString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1b2"));
    }

    // Test case 6: String with five characters
    @Test
    void testFiveCharactersString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1b2c"));
    }

    // Test case 7: String with six characters
    @Test
    void testSixCharactersString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1b2c3"));
    }

    // Test case 8: String with seven characters
    @Test
    void testSevenCharactersString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1b2c3d"));
    }

    // Test case 9: String with eight characters
    @Test
    void testEightCharactersString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1b2c3d4"));
    }

    // Test case 10: String with nine characters
    @Test
    void testNineCharactersString() {
        assertFalse(CheckIfLastCharIsALetter.checkIfLastCharIsALetter("a1b2c3d4e"));
    }
}
