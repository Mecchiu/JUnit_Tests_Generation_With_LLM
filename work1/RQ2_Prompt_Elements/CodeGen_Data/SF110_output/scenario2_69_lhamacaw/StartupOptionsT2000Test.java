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
	* Test method {@link StartupOptions#useDemo()} of class {@link StartupOptions}.
	*/
	@Test
	public final void testUseDemo() {
		// TODO: Find a way to ensure correct test execution
		if (useDemo()) {
			assertTrue(true);
		}else{
			assertFalse(true);
		}
	}
}