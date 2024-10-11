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
		@Test
void testGetApplication() {
    HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
    assertNotNull(app);
}

@Test
void testGetApplicationSingleton() {
    HttpAnalyzerApp app1 = HttpAnalyzerApp.getApplication();
    HttpAnalyzerApp app2 = HttpAnalyzerApp.getApplication();
    assertSame(app1, app2);
}

@Test
void testGetApplicationNotNull() {
    assertNotNull(HttpAnalyzerApp.getApplication());
}

@Test
void testGetApplicationInstance() {
    Application app = Application.getInstance(HttpAnalyzerApp.class);
    assertNotNull(app);
    assertTrue(app instanceof HttpAnalyzerApp);
}

@Test
void testGetApplicationInstanceNotNull() {
    assertNotNull(Application.getInstance(HttpAnalyzerApp.class));
}

@Test
void testMain() {
    String[] args = new String[]{"arg1", "arg2"};
    HttpAnalyzerApp.main(args);
    // No assertion as this method launches the application
}

@Test
void testMainEmptyArgs() {
    String[] args = new String[]{};
    HttpAnalyzerApp.main(args);
    // No assertion as this method launches the application
}

@Test
void testMainNullArgs() {
    HttpAnalyzerApp.main(null);
    // No assertion as this method launches the application
}

@Test
void testStartup() {
    HttpAnalyzerApp app = new HttpAnalyzerApp();
    app.startup();
    // No assertion as this method shows the main frame
}

@Test
void testConfigureWindow() {
    HttpAnalyzerApp app = new HttpAnalyzerApp();
    app.configureWindow(null);
    // No assertion as this method does not require any validation
}
}