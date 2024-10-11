// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains ten unit test cases for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {
		
	/**
	* Test case for {@link StartupOptions#useDemo()}.
	* It checks if the method returns true.
	*/
	@Test
	void testUseDemo() {
		StartupOptions startupOptions = new StartupOptions();
		assertTrue(startupOptions.useDemo());
	}
}