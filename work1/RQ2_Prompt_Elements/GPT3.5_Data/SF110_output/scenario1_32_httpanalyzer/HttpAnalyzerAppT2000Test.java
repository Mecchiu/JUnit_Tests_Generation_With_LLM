import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpAnalyzerAppTest {

    @Test
    void testGetApplication() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app);
        assertTrue(app instanceof SingleFrameApplication);
        assertTrue(app instanceof Application);
        assertEquals(HttpAnalyzerApp.class, app.getClass());
    }

    @Test
    void testGetApplicationMultipleTimes() {
        HttpAnalyzerApp app1 = HttpAnalyzerApp.getApplication();
        HttpAnalyzerApp app2 = HttpAnalyzerApp.getApplication();
        assertSame(app1, app2);
    }

    @Test
    void testGetApplicationReturnsSameInstance() {
        HttpAnalyzerApp app1 = HttpAnalyzerApp.getApplication();
        HttpAnalyzerApp app2 = HttpAnalyzerApp.getApplication();
        assertSame(app1, app2);
    }

    @Test
    void testGetApplicationNotNull() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app);
    }

    @Test
    void testGetApplicationInstanceOfSingleFrameApplication() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertTrue(app instanceof SingleFrameApplication);
    }

    @Test
    void testGetApplicationInstanceOfApplication() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertTrue(app instanceof Application);
    }

    @Test
    void testGetApplicationClass() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertEquals(HttpAnalyzerApp.class, app.getClass());
    }

    @Test
    void testGetApplicationReturnsSameInstanceMultipleTimes() {
        HttpAnalyzerApp app1 = HttpAnalyzerApp.getApplication();
        HttpAnalyzerApp app2 = HttpAnalyzerApp.getApplication();
        assertSame(app1, app2);
    }

    @Test
    void testGetApplicationReturnsNotNull() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app);
    }

    @Test
    void testGetApplicationReturnsInstanceOfSingleFrameApplication() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertTrue(app instanceof SingleFrameApplication);
    }

    @Test
    void testGetApplicationReturnsInstanceOfApplication() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertTrue(app instanceof Application);
    }

    @Test
    void testGetApplicationReturnsCorrectClass() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertEquals(HttpAnalyzerApp.class, app.getClass());
    }
}