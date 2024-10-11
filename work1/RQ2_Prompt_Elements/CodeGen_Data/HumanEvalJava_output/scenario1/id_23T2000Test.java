// StrlenTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains one unit test case for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

	@Test
	void testStrlen()  {
		String s = "aBbCcDdEe";
		assertEquals("strlen(s) = 8", 8, Strlen.strlen(s));
		assertEquals("strlen(s) = 0", 0, Strlen.strlen(null));     
		assertEquals("strlen(null)", 0, Strlen.strlen(null));
	}

}
