Here's the completed code for the `FixSpaces` class and `FixSpacesTest` class:

```
// FixSpaces.java
package scenario3;

class FixSpaces {

    /**
     * Given a string text, replace all spaces in it with underscores,
     * and if a string has more than 2 consecutive spaces,
     * then replace all consecutive spaces with -
     *
     * fixSpaces("Example") == "Example"
     * fixSpaces("Example 1") == "Example_1"
     * fixSpaces(" Example 2") == "_Example_2"
     * fixSpaces(" Example   3") == "_Example-3"
     *
     * > fixSpaces("Example")
     * "Example"
     * > fixSpaces("Mudasir Hanif ")
     * "Mudasir_Hanif_"
     * > fixSpaces("Yellow Yellow  Dirty  Fellow")
     * "Yellow_Yellow__Dirty__Fellow"
     * > fixSpaces("Exa   mple")
     * "Exa-mple"
     * > fixSpaces("   Exa 1 2 2 mple")
     * "-Exa_1_2_2_mple"
     */
    public static String fixSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        int consecutiveSpaces = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                consecutiveSpaces++;
                if (consecutiveSpaces > 2) {
                    sb.append('-');
                } else {
                    sb.append('_');
                }
            } else {
                consecutiveSpaces = 0;
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

// FixSpacesTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link FixSpaces}.
 * It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
 */
class FixSpacesTest {

    @Test
    void testFixSpacesWithNoSpaces() {
        String input = "Example";
        String expectedOutput = "Example";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithOneSpace() {
        String input = "Example 1";
        String expectedOutput = "Example_1";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithLeadingSpace() {
        String input = " Example 2";
        String expectedOutput = "_Example_2";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithMultipleSpaces() {
        String input = " Example   3";
        String expectedOutput = "_Example-3";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithTrailingSpace() {
        String input = "Mudasir Hanif ";
        String expectedOutput = "Mudasir_Hanif_";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithConsecutiveSpaces() {
        String input = "Yellow Yellow  Dirty  Fellow";
        String expectedOutput = "Yellow_Yellow__Dirty__Fellow";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithConsecutiveSpacesAtStart() {
        String input = "   Exa 1 2 2 mple";
        String expectedOutput = "-Exa_1_2_2_mple";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithConsecutiveSpacesAtEnd() {
        String input = "Exa   mple   ";
        String expectedOutput = "Exa-mple_";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithOnlySpaces() {
        String input = "   ";
        String expectedOutput = "-";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testFixSpacesWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = FixSpaces.fixSpaces(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
```