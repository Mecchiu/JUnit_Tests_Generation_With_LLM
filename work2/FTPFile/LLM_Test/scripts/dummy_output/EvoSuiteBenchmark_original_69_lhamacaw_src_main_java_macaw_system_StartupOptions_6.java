// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains one unit test case for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {
		/** 
		 * Unit test for {@link StartupOptions#useDemo()}.
		 */
	@Test
	void testUseDemo() {
		// The main test method of {@link StartupOptions class}.
		if (UseDemo()) {
			System.out.println("Test PASSED");
		} else {
			assertEquals("The value of \"Use demo\" method is set to \"false\"", 
				false, UseDemo());
		}
	}

}