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
		
	@Test
	public void TestGetApplication() {
		assertNotNull("The application could not be instantiated", getApplication());
	}
	
	@Test
	public void TestInitialisation() {
//		assertNotNull(getApplication());
//		assertNotNull(httpanalyzer.HttpAnalyzerApp.getApplication());
		assertTrue(httpanalyzer.HttpAnalyzerApp.getApplication() instanceof Application);
		HttpAnalyzerApp application =(HttpAnalyzerApp)getApplication();
//		assertNotNull(application);
	}
}

/**
 * Main method launching the application.
 */
public class HttpAnalyzerAppTestMain {
	@Application
	static public final HttpAnalyzerAppTest application = new HttpAnalyzerAppTest();
}