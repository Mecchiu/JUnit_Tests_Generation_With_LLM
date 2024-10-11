// CorrectBracketingTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {
			// Test case 1
    @Test
    void testCorrectBracketing1() {
        String brackets = "<>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 2
    @Test
    void testCorrectBracketing2() {
        String brackets = "<<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 3
    @Test
    void testCorrectBracketing3() {
        String brackets = "<><<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 4
    @Test
    void testCorrectBracketing4() {
        String brackets = "<><<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 5
    @Test
    void testCorrectBracketing5() {
        String brackets = "<><<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 6
    @Test
    void testCorrectBracketing6() {
        String brackets = "<><<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 7
    @Test
    void testCorrectBracketing7() {
        String brackets = "<><<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 8
    @Test
    void testCorrectBracketing8() {
        String brackets = "<><<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 9
    @Test
    void testCorrectBracketing9() {
        String brackets = "<><<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }

    // Test case 10
    @Test
    void testCorrectBracketing10() {
        String brackets = "<><<>>";
        assertTrue(CorrectBracketing.correctBracketing(brackets));
    }
}