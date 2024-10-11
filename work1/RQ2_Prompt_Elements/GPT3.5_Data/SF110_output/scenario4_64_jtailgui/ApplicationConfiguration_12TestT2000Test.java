// ApplicationConfiguration_12Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ApplicationConfiguration}.
 * It contains ten unit test cases for the {@link ApplicationConfiguration#jTailMainFrame()} method.
 */
class ApplicationConfiguration_12Test {

    /**
     * Test case to verify that the JTailMainFrame bean is not null.
     */
    @Test
    void testJTailMainFrameNotNull() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertNotNull(mainFrame);
    }

    /**
     * Test case to verify that the JTailMainFrame bean is a singleton.
     */
    @Test
    void testJTailMainFrameSingleton() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame1 = configuration.jTailMainFrame();
        JTailMainFrame mainFrame2 = configuration.jTailMainFrame();
        assertSame(mainFrame1, mainFrame2);
    }

    /**
     * Test case to verify that the JTailMainFrame bean has the correct title.
     */
    @Test
    void testJTailMainFrameTitle() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertEquals("JTail", mainFrame.getTitle());
    }

    /**
     * Test case to verify that the JTailMainFrame bean is not resizable.
     */
    @Test
    void testJTailMainFrameNotResizable() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertFalse(mainFrame.isResizable());
    }

    /**
     * Test case to verify that the JTailMainFrame bean is visible.
     */
    @Test
    void testJTailMainFrameVisible() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertTrue(mainFrame.isVisible());
    }

    /**
     * Test case to verify that the JTailMainFrame bean is centered on the screen.
     */
    @Test
    void testJTailMainFrameCentered() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertTrue(mainFrame.isLocationByPlatform());
    }

    /**
     * Test case to verify that the JTailMainFrame bean has a default close operation.
     */
    @Test
    void testJTailMainFrameDefaultCloseOperation() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertEquals(JTailMainFrame.EXIT_ON_CLOSE, mainFrame.getDefaultCloseOperation());
    }

    /**
     * Test case to verify that the JTailMainFrame bean has a menu bar.
     */
    @Test
    void testJTailMainFrameHasMenuBar() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertNotNull(mainFrame.getJMenuBar());
    }

    /**
     * Test case to verify that the JTailMainFrame bean has a tool bar.
     */
    @Test
    void testJTailMainFrameHasToolBar() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertNotNull(mainFrame.getJToolBar());
    }

    /**
     * Test case to verify that the JTailMainFrame bean has a status bar.
     */
    @Test
    void testJTailMainFrameHasStatusBar() {
        ApplicationConfiguration configuration = new ApplicationConfiguration();
        JTailMainFrame mainFrame = configuration.jTailMainFrame();
        assertNotNull(mainFrame.getStatusBar());
    }
}