// HttpAnalyzerApp.java
package httpanalyzer;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class HttpAnalyzerApp extends SingleFrameApplication {

    /**
     * A convenient static getter for the application instance.
     *
     * @return the instance of HttpAnalyzerApp
     */
    public static HttpAnalyzerApp getApplication() {
        return Application.getInstance(HttpAnalyzerApp.class);
    }
}

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
        assertTrue(app instanceof SingleFrameApplication);
    }
    
    @Test
    void testGetApplicationTwice() {
        HttpAnalyzerApp app1 = HttpAnalyzerApp.getApplication();
        HttpAnalyzerApp app2 = HttpAnalyzerApp.getApplication();
        assertSame(app1, app2);
    }
    
    @Test
    void testGetMainFrame() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app.getMainFrame());
    }
    
    @Test
    void testGetContext() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app.getContext());
    }
    
    @Test
    void testGetResourceMap() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app.getContext().getResourceMap());
    }
    
    @Test
    void testGetApplicationTitle() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app.getApplicationTitle());
    }
    
    @Test
    void testStartup() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        app.startup();
        assertTrue(app.isStarted());
    }
    
    @Test
    void testShutdown() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        app.shutdown();
        assertTrue(app.isShutdown());
    }
    
    @Test
    void testExit() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        app.exit();
        assertTrue(app.isExited());
    }
    
    @Test
    void testInitialize() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        app.initialize();
        assertTrue(app.isInitialized());
    }
}