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
		 * The unit test for {@link HttpAnalyzerApp#getApplication()}.
		*/
		@Test
		void getApplication() {
			assertNotNull(HttpAnalyzerApp.getApplication());
		}
}
