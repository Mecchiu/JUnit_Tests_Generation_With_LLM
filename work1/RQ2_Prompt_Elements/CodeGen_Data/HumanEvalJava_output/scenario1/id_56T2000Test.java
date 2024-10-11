// CorrectBracketingTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains one unit test case for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {

	@Test
	  public void testCorrectBracketing() {
	    assertEquals("No error", true, correctBracketing("</*>"));
	    assertEquals("Yes, this is a bracket",true, correctBracketing("</ >"));
	    assertEquals("Yes, this is an evenbracket",true, correctBracketing("</>2"));
	    assertEquals("Yes, this is a quote",true, correctBracketing("\"<\""));
	    assertEquals("Yes, this is a quote",false, correctBracketing("<\")"));
	    assertEquals("Yes, this is < 2",false,correctBracketing(">\<2"));
	  }
}