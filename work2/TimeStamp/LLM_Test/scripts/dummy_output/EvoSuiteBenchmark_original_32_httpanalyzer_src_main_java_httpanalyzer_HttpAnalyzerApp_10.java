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
		 * A test case containing the methods to test the creation and retrieval of the specified application.
		 */
		@Test
		public void testGetApplication() {
			// Set up application.
			HttpAnalyzerApp testApp = new HttpAnalyzerApp();

			// It is not needed to call "startTasklet" method when the TaskletManager is not already disposed.
			assertTrue(testApp.isStartNeeded());

			// Create the HttpAnalyzerApp on the EDT.
			testApp.configureWindow(new java.awt.Frame());

			// Create and start TaskletManager in the main thread of the event processing loop.
			// This is guaranteed to be done in the main thread.
			testApp.newExecutor().start();

			// Wait until the TaskletManager is done with the HTTP Analyzer's initialization.
			while (!testApp.isStartNeeded()) {
				Thread.sleep(1000);
			}

			// Check if HTTP Analyzer was correctly initialized.
			assertNotNull(HttpAnalyzer.HTTP_ANALYZER);

			// Check if the default Application is successfully obtained.
			assertNotNull(HttpAnalyzer.HTTP_ANALYZER.getApplication());

			// Check if the Application is still valid.
			assertTrue(HttpAnalyzer.HTTP_ANALYZER.getApplication() instanceof Application);

			// Ensure that an Exception was thrown if the HTTP Analyzer was not initialized.
			assertNotNull(HttpAnalyzer.HTTP_ANALYZER.getException());

			// Check if the current Thread.start() was called with the correct arguments.
			assertTrue(testApp.getCurrentTasklet().contains("org.jdesktop.application.Tasklet.execute(HttpAnalyzer.HTTP_ANALYZER.HTTP_ANALYZER)"));
			
			// Check if the Application is the current Thread's Application.
			assertTrue(testApp.getCurrentTasklet().equals(HttpAnalyzer.HTTP_ANALYZER.getApplication().getClass().getCanonicalName()));

			// Check if the current Thread has the right TaskLumber.
			assertTrue(testApp.getCurrentTasklet() instanceof TaskLumber.JavaTaskLumber);

			// Verify if the Application is the current Thread's current task.
			assertTrue(testApp.getCurrentTasklet() == HttpAnalyzer.HTTP_ANALYZER.getApplication().getClass().getName());

			// Stop HttpAnalyzer app.
			testApp = null;
		}
			
}