// FlipCaseTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains one unit test case for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {

		@Test
		public void result() {
			assertEquals("", new FlipCase().flipCase(""));
		}
}
