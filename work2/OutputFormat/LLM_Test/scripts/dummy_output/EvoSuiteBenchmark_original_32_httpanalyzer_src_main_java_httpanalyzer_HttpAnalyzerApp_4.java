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
	 * Test method for {@link HttpAnalyzerApp#getApplication()}.
	 */
	@Test
	public void testGetApplication() {
		HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();

		assertNotNull("Null app can be returned from application factory",
				app);

		Application deffered = new DummyService();
		assertNotNull(deffered);
		assertEquals("Null app cannot be returned from service instantation",
				applicationName(), deffered);
	}
}