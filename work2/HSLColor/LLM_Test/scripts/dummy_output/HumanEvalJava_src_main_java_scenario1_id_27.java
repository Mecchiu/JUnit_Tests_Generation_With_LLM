// FlipCaseTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
			// Test case 1: Empty string
    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 2: String with only one character
    @Test
    void testOneCharacter() {
        String input = "a";
        String expected = "A";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 3: String with only uppercase characters
    @Test
    void testOnlyUppercase() {
        String input = "HELLO";
        String expected = "hello";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 4: String with only lowercase characters
    @Test
    void testOnlyLowercase() {
        String input = "hello";
        String expected = "HELLO";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 5: String with both uppercase and lowercase characters
    @Test
    void testBothUppercaseAndLowercase() {
        String input = "HeLlO";
        String expected = "hElLo";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 6: String with special characters
    @Test
    void testSpecialCharacters() {
        String input = "Hello, World!";
        String expected = "hELLO, wORLD!";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 7: String with numbers
    @Test
    void testNumbers() {
        String input = "12345";
        String expected = "12345";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 8: String with spaces
    @Test
    void testSpaces() {
        String input = "Hello World";
        String expected = "hELLO wORLD";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 9: String with special characters, numbers, and spaces
    @Test
    void testSpecialCharactersNumbersAndSpaces() {
        String input = "Hello, 12345 World!";
        String expected = "hELLO, 12345 wORLD!";
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }

    // Test case 10: String with null value
    @Test
    void testNull() {
        String input = null;
        String expected = null;
        String actual = FlipCase.flipCase(input);
        assertEquals(expected, actual);
    }
}