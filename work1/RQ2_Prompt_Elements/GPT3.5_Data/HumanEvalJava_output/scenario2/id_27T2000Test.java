// FlipCase.java
package scenario2;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     */
    public static String flipCase(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}

// FlipCaseTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
    
    @Test
    void testFlipCaseWithEmptyString() {
        String result = FlipCase.flipCase("");
        assertEquals("", result);
    }
    
    @Test
    void testFlipCaseWithAllUppercaseString() {
        String result = FlipCase.flipCase("HELLO WORLD");
        assertEquals("hello world", result);
    }
    
    @Test
    void testFlipCaseWithAllLowercaseString() {
        String result = FlipCase.flipCase("hello world");
        assertEquals("HELLO WORLD", result);
    }
    
    @Test
    void testFlipCaseWithMixedCaseString() {
        String result = FlipCase.flipCase("HeLLo WoRLd");
        assertEquals("hEllO wOrlD", result);
    }
    
    @Test
    void testFlipCaseWithNumbersAndSpecialCharacters() {
        String result = FlipCase.flipCase("123!@#");
        assertEquals("123!@#", result);
    }
    
    @Test
    void testFlipCaseWithNullString() {
        assertThrows(NullPointerException.class, () -> {
            FlipCase.flipCase(null);
        });
    }
    
    @Test
    void testFlipCaseWithOneCharacterString() {
        String result = FlipCase.flipCase("a");
        assertEquals("A", result);
    }
    
    @Test
    void testFlipCaseWithWhitespaceString() {
        String result = FlipCase.flipCase("   ");
        assertEquals("   ", result);
    }
    
    @Test
    void testFlipCaseWithLongString() {
        String result = FlipCase.flipCase("This is a long string with multiple words and characters.");
        assertEquals("tHIS IS A LONG STRING WITH MULTIPLE WORDS AND CHARACTERS.", result);
    }
    
    @Test
    void testFlipCaseWithUnicodeCharacters() {
        String result = FlipCase.flipCase("こんにちは");
        assertEquals("こんにちは", result);
    }
}