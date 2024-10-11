// HttpAnalyzerAppTest.java
package httpanalyzer;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpAnalyzerApp}.
* It contains one unit test case for the {@link HttpAnalyzerApp#getApplication()} method.
*/
class HttpAnalyzerAppTest {
		
	/**
	 * No instances.
	 */
	private HttpAnalyzerApp() {
	}

	/**
	 * Test of getSystemCode method, of class HttpAnalyzerApp.
	 */
	@Test
	public void testGetSystemCode() {
		System.out.println("getSystemCode");
		String result = HttpAnalyzerApp.getApplication().getSystemCode();
		assertEquals("System Code is wrong!", "", result);
	}
	
	/**
	 * Tests the call to {@link HttpAnalyzerApp#getApplication()} using
	 * the JUnit Jupiter framework.
	 */
	@Test
	public void testUsingJupiterFramework() {
		System.out.println("usingJupiterFramework");
		HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
		assertTrue("The class not loaded correctly!", app!= null);
		System.out.println("app state:");
		System.out.println(HttpAnalyzerApp.class.getName());
		System.out.println(app);
		System.out.println();
	}
}