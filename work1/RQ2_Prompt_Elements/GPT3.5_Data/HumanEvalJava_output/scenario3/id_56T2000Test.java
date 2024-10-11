// Here's the complete source code for the CorrectBracketing and CorrectBracketingTest classes:

// CorrectBracketing.java
package scenario3;

class CorrectBracketing {

    /**
     * Brackets is a string of "<" and ">".
     * return true if every opening bracket has a corresponding closing bracket.
     *
     * > correctBracketing("<>")
     * true
     * > correctBracketing("<<><>>")
     * true
     * > correctBracketing("<><><<><>><>")
     * true
     * > correctBracketing("<><><<<><><>><>><<><><<>>>")
     * true
     * > correctBracketing("<<<><>>>>")
     * false
     * > correctBracketing("><<>")
     * false
     * > correctBracketing("<")
     * false
     * > correctBracketing("<<<<")
     * false
     * > correctBracketing(">")
     * false
     * > correctBracketing("<<>")
     * false
     * > correctBracketing("<><><<><>><>><<>")
     * false
     * > correctBracketing("<><><<><>><>>><>")
     * false
     */
    public static Boolean correctBracketing(String brackets) {
        int count = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '<') {
                count++;
            } else if (brackets.charAt(i) == '>') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
}

// CorrectBracketingTest.java
package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {

    @Test
    void testEmptyString() {
        assertTrue(CorrectBracketing.correctBracketing(""));
    }

    @Test
    void testSingleOpeningBracket() {
        assertFalse(CorrectBracketing.correctBracketing("<"));
    }

    @Test
    void testSingleClosingBracket() {
        assertFalse(CorrectBracketing.correctBracketing(">"));
    }

    @Test
    void testTwoOpeningBrackets() {
        assertFalse(CorrectBracketing.correctBracketing("<<"));
    }

    @Test
    void testTwoClosingBrackets() {
        assertFalse(CorrectBracketing.correctBracketing(">>"));
    }

    @Test
    void testOneOpeningAndOneClosingBracket() {
        assertTrue(CorrectBracketing.correctBracketing("<>"));
    }

    @Test
    void testNestedBrackets() {
        assertTrue(CorrectBracketing.correctBracketing("<<><>>"));
    }

    @Test
    void testMultiplePairsOfBrackets() {
        assertTrue(CorrectBracketing.correctBracketing("<><><<><>><>><<><><<>>>"));
    }

    @Test
    void testUnbalancedBrackets() {
        assertFalse(CorrectBracketing.correctBracketing("<<<><>>>>"));
    }

    @Test
    void testMixedUpBrackets() {
        assertFalse(CorrectBracketing.correctBracketing("<><><<><>><>>><>"));
    }
}