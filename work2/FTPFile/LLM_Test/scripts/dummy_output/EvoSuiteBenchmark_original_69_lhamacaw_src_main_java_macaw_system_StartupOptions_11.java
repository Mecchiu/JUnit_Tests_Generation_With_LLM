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
		 * Test case for {@link StartupOptions#useDemo()}.
		 */ 
		@Test 
		public void testUseDemo(){
			// Check the value of {@link StartupOptions#useDemo()}
			String testResult = StartupOptions.useDemo();
			
			// Check the correctness of the test result
			assertTrue(testResult.equals("true"));
		}

        // ==========================================
        // Methods
        // ==========================================

        ;
}