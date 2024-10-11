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
	 * Some of the tests are only valid in JRE 1.5.x. They also work in 1.6.x but need work in JRE 1.7
	 * to check for correct JRE support.
	 */
	@Test
	public void testGetApplication() {
		assertEquals("HttpAnalyzerAppTest", Application.getInstance().getName());
	}

}