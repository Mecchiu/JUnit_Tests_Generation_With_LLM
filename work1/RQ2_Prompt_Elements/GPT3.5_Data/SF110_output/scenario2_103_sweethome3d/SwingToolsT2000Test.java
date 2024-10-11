// Test class of SwingTools
package com.eteks.sweethome3d.swing;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SwingTools}.
 * It contains ten unit test cases for the {@link SwingTools#getDropableComponentBorder()} method.
 */
class SwingToolsTest {

    /**
     * Test case for the default border.
     */
    @Test
    void testGetDropableComponentBorderDefault() {
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.LoweredBevelBorder);
    }

    /**
     * Test case for the Aqua border on Mac OS X.
     */
    @Test
    void testGetDropableComponentBorderAqua() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.5");
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.AquaBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }

    /**
     * Test case for the Aqua border on Mac OS X with a newer version.
     */
    @Test
    void testGetDropableComponentBorderAquaNewerVersion() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.6");
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.AquaBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }

    /**
     * Test case for the Aqua border on Mac OS X with an older version.
     */
    @Test
    void testGetDropableComponentBorderAquaOlderVersion() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.4");
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.LoweredBevelBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }

    /**
     * Test case for the Aqua border on Mac OS X with a wrong version.
     */
    @Test
    void testGetDropableComponentBorderAquaWrongVersion() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.7");
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.LoweredBevelBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }

    /**
     * Test case for the Aqua border on Mac OS X with a null version.
     */
    @Test
    void testGetDropableComponentBorderAquaNullVersion() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", null);
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.LoweredBevelBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }

    /**
     * Test case for the Aqua border on Mac OS X with an empty version.
     */
    @Test
    void testGetDropableComponentBorderAquaEmptyVersion() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "");
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.LoweredBevelBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }

    /**
     * Test case for the Aqua border on Mac OS X with a blank version.
     */
    @Test
    void testGetDropableComponentBorderAquaBlankVersion() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", " ");
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.LoweredBevelBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }

    /**
     * Test case for the Aqua border on Mac OS X with a non-numeric version.
     */
    @Test
    void testGetDropableComponentBorderAquaNonNumericVersion() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "Tiger");
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.LoweredBevelBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }

    /**
     * Test case for the Aqua border on Mac OS X with a decimal version.
     */
    @Test
    void testGetDropableComponentBorderAquaDecimalVersion() {
        // Set the system property to simulate Mac OS X
        System.setProperty("os.name", "Mac OS X");
        System.setProperty("os.version", "10.5.8");
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
        assertTrue(border instanceof BorderFactory.AquaBorder);
        // Reset the system property
        System.setProperty("os.name", "");
        System.setProperty("os.version", "");
    }
}