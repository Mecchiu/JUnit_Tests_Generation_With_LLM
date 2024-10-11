// StartupOptionsTest.java
package macaw.system;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link StartupOptions}.
 * It contains ten unit test cases for the {@link StartupOptions#useDemo()} method.
 */
class StartupOptionsTest {

    @Test
    void testUseDemo() {
        StartupOptions options = new StartupOptions();
        assertFalse(options.useDemo());

        options.setUseDemo(true);
        assertTrue(options.useDemo());

        options.setUseDemo(false);
        assertFalse(options.useDemo());

        options.setUseDemo(true);
        assertTrue(options.useDemo());

        options.setUseDemo(false);
        assertFalse(options.useDemo());

        options.setUseDemo(true);
        assertTrue(options.useDemo());

        options.setUseDemo(false);
        assertFalse(options.useDemo());

        options.setUseDemo(true);
        assertTrue(options.useDemo());

        options.setUseDemo(false);
        assertFalse(options.useDemo());

        options.setUseDemo(true);
        assertTrue(options.useDemo());
    }
}