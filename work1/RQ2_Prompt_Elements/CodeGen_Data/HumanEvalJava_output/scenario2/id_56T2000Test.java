// CorrectBracketingTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains one unit test case for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {
/**
		 * Test method of {@link CorrectBracketing#correctBracketing(String)}, which checks the correctness 
		 * of the correct closing bracket for opening and closing brackets (in the case of parentheses 
		 * delimiters, i.e. brackets for the other side).
		 */
   @Test public void correctBracketingForOpeningAndClosingBrackets() {
       {
        String bracketsOneSide = "<" +">";

        String expectedSwing = "<" + ">";
        String expectedConsole = ">" + "<" + ">";
        Boolean isSwingCorrect = correctBracketing(bracketsOneSide);
        assertTrue("The correct wrapping did not occur for the opening right bracket, or vice versa: " + isSwingCorrect, isSwingCorrect);
        assertEquals("The expected result for opening right bracket.", expectedSwing, expectedSwing, DELIMITERS);
        assertEquals("The expected result for opening right bracket.", expectedConsole, expectedConsole);
        
           bracketsOneSide = "<"+"<">";
           expectedSwing = "<" + ">";
           expectedConsole = ">" + "<" + ">";
           isSwingCorrect = correctBracketing(bracketsOneSide);
           assertTrue("The correct wrapping did not occur for the opening left bracket, or vice versa: " + isSwingCorrect, isSwingCorrect);
           assertEquals("The expected result for opening left bracket.", expectedSwing, expectedSwing, DELIMITERS);
           assertEquals("The expected result for opening left bracket.", expectedConsole, expectedConsole);

      }
       {
        String bracketsBothSide = "<" + ">";

//        String expectedSwing = "<" + "></";
//        String expectedConsole = ">";
//        String expectedSwing = "< ";
//        String expectedConsole = "> " + "";
//        Boolean isSwingCorrect = correctBracketing(bracketsBothSide);
//
//        assertTrue("The correct wrapping did not occur for the opening right bracket: not a correct answer.",
//        isSwingCorrect &= correctBracketing(bracketsBothSide) 
//        );
//        assertTrue("The correct wrapping did not occur for left bracket: not a correct answer.",
//        isSwingCorrect &= correctBracketing(bracketsBothSide) 
//        );
//
        assertEquals("The expected result for opening both sides.", expectedSwing, expectedSwing, DELIMITERS);
        assertEquals("The expected result for opening both sides.", expectedConsole, expectedConsole);
       }
   }
}