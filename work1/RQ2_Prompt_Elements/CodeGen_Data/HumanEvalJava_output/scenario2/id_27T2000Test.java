// FlipCaseTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains one unit test case for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {

	@Test
	void flipCaseTest() {
        String input = "abc";
        String expected1 = "a__aB_c";
        String expected2 = "__aB_c";
        String result = FlipCase.flipCase(input);
        assertEquals(expected1, result);
        result = FlipCase.flipCase(expected2);
        assertEquals(result, expected2);
	}

}