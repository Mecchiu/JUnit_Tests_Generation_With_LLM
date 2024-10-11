// FlipCase.java
package scenario3;

class FlipCase {

    /**
     * For a given string, flip lowercase characters to uppercase and uppercase to lowercase.
     *
     * > flipCase("Hello")
     * "hELLO"
     * > flipCase("")
     * ""
     * > flipCase("Hello!")
     * "hELLO!"
     * > flipCase("These violent delights have violent ends")
     * "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS"
     */
    public static String flipCase(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            }
        }
        return new String(chars);
    }
}

// FlipCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains ten unit test cases for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {
    
    @Test
    void testEmptyString() {
        assertEquals("", FlipCase.flipCase(""));
    }
    
    @Test
    void testAllUppercase() {
        assertEquals("hELLO", FlipCase.flipCase("Hello"));
    }
    
    @Test
    void testAllLowercase() {
        assertEquals("HELLO", FlipCase.flipCase("hello"));
    }
    
    @Test
    void testMixedCase() {
        assertEquals("hELLO!", FlipCase.flipCase("Hello!"));
    }
    
    @Test
    void testNonAlphabetic() {
        assertEquals("12345", FlipCase.flipCase("12345"));
    }
    
    @Test
    void testWhitespace() {
        assertEquals("hELLO\twORLD", FlipCase.flipCase("Hello\tWorld"));
    }
    
    @Test
    void testSpecialCharacters() {
        assertEquals("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~", FlipCase.flipCase("!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~"));
    }
    
    @Test
    void testUnicode() {
        assertEquals("ΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡΣΤΥΦΧΨΩ", FlipCase.flipCase("αβγδεζηθικλμνξοπρστυφχψω"));
    }
    
    @Test
    void testLongString() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.";
        String expectedOutput = "lOREM IPSUM DOLOR SIT AMET, CONSECTETUR ADIPISCING ELIT. sED NON RISUS. sUSPENDISSE LECTUS TORTOR, DIGNISSIM SIT AMET, ADIPISCING NEC, ULTRICIES SED, DOLOR.";
        assertEquals(expectedOutput, FlipCase.flipCase(input));
    }
}