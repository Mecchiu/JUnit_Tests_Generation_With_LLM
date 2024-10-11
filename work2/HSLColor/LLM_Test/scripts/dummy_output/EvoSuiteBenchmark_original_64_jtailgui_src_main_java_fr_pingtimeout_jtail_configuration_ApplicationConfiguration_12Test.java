package fr.pingtimeout.jtail.configuration;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationConfiguration_12Test {

    @Test
    void testJTailMainFrameNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame());
    }

    @Test
    void testJTailMainFrameSingleton() {
        assertSame(new ApplicationConfiguration().jTailMainFrame(), new ApplicationConfiguration().jTailMainFrame());
    }

    @Test
    void testJTailMainFrameFileMenuActionNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame().getFileMenuAction());
    }

    @Test
    void testJTailMainFrameOpenActionNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame().getOpenAction());
    }

    @Test
    void testJTailMainFrameCloseActionNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame().getCloseAction());
    }

    @Test
    void testJTailMainFrameCloseAllActionNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame().getCloseAllAction());
    }

    @Test
    void testJTailMainFrameQuitActionNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame().getQuitAction());
    }

    @Test
    void testJTailMainFrameToolsMenuActionNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame().getToolsMenuAction());
    }

    @Test
    void testJTailMainFrameHighlightActionNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame().getHighlightAction());
    }

    @Test
    void testJTailMainFrameComponentsNotNull() {
        assertNotNull(new ApplicationConfiguration().jTailMainFrame().getComponents());
    }
}
