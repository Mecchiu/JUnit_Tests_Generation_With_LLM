// Here's the complete code for FlipCaseTest.java

package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FlipCase}.
 * It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
 */
class FlipCaseTest {

    @Test
    void testFlipCaseWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFlipCaseWithLowerCaseString() {
        String input = "hello world";
        String expectedOutput = "HELLO WORLD";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFlipCaseWithUpperCaseString() {
        String input = "HELLO WORLD";
        String expectedOutput = "hello world";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFlipCaseWithMixedCaseString() {
        String input = "HeLLo WoRLd";
        String expectedOutput = "hEllO wOrlD";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFlipCaseWithNumbersAndSpecialCharacters() {
        String input = "123!@#";
        String expectedOutput = "123!@#";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFlipCaseWithNullString() {
        String input = null;
        assertThrows(NullPointerException.class, () -> FlipCase.flipCase(input));
    }

    @Test
    void testFlipCaseWithOneCharacterString() {
        String input = "a";
        String expectedOutput = "A";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFlipCaseWithWhitespaceString() {
        String input = "   ";
        String expectedOutput = "   ";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFlipCaseWithLongString() {
        String input = "This is a long string with many characters and spaces and punctuation marks.";
        String expectedOutput = "tHIS IS A LONG STRING WITH MANY CHARACTERS AND SPACES AND PUNCTUATION MARKS.";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFlipCaseWithNonAsciiCharacters() {
        String input = "Héllo Wórld";
        String expectedOutput = "hÉLLO wÓRLD";
        String actualOutput = FlipCase.flipCase(input);
        assertEquals(expectedOutput, actualOutput);
    }
}