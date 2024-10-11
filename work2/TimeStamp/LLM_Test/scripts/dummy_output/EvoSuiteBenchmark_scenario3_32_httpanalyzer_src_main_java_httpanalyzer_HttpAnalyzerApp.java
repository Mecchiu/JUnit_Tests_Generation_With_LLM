// HttpAnalyzerAppTest.java
package httpanalyzer;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpAnalyzerApp}.
* It contains ten unit test cases for the {@link HttpAnalyzerApp#getApplication()} method.
*/
class HttpAnalyzerAppTest {
		
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link HttpAnalyzerApp}.
	*/
	@Test
	public void testGetApplication() {
		Application app = HttpAnalyzerApp.getApplication();
		assertTrue(app instanceof HttpAnalyzerApp);
	}
}