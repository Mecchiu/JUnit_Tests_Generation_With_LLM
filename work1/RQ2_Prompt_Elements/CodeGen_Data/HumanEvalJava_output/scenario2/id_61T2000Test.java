// CorrectBracketing1Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains one unit test case for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {

    /**
     * Test of correctBracketing method, of class {@link CorrectBracketing1}.
     */
    @Test
    public void testCorrectBracketing() {
        System.out.println("correctBracketing");
		Boolean expected = true;
		String brackets = "()[]{}[]{}";
		Boolean actual = CorrectBracketing1.correctBracketing(brackets);
		System.out.println("CorrectBracketing1.correctBracketing result = " + expected);
		System.out.println("CorrectBracketing1.correctBracketing.true= " +
		 "String(expected=True) String from brackets = " +
		 brackets +
		 "String from actual = " + actual);
		assertEquals(expected, actual);
    }

}
