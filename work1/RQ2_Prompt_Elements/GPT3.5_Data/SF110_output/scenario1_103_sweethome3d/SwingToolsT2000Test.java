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

    @Test
    void testGetDropableComponentBorderReturnsNotNull() {
        Border border = SwingTools.getDropableComponentBorder();
        assertNotNull(border);
    }

    @Test
    void testGetDropableComponentBorderReturnsBorderType() {
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
    }

    @Test
    void testGetDropableComponentBorderReturnsLoweredBevelBorder() {
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
        assertEquals(BorderFactory.createLoweredBevelBorder().getClass(), border.getClass());
    }

    @Test
    void testGetDropableComponentBorderReturnsAquaVariantBorder() {
        System.setProperty("os.name", "Mac OS X");
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
        assertEquals(UIManager.getBorder("InsetBorder.aquaVariant").getClass(), border.getClass());
    }

    @Test
    void testGetDropableComponentBorderReturnsLoweredBevelBorderOnNonMacOS() {
        System.setProperty("os.name", "Windows");
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
        assertEquals(BorderFactory.createLoweredBevelBorder().getClass(), border.getClass());
    }

    @Test
    void testGetDropableComponentBorderReturnsLoweredBevelBorderOnUnknownOS() {
        System.setProperty("os.name", "Unknown");
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
        assertEquals(BorderFactory.createLoweredBevelBorder().getClass(), border.getClass());
    }

    @Test
    void testGetDropableComponentBorderReturnsLoweredBevelBorderOnNullOS() {
        System.setProperty("os.name", null);
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
        assertEquals(BorderFactory.createLoweredBevelBorder().getClass(), border.getClass());
    }

    @Test
    void testGetDropableComponentBorderReturnsLoweredBevelBorderOnEmptyOS() {
        System.setProperty("os.name", "");
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
        assertEquals(BorderFactory.createLoweredBevelBorder().getClass(), border.getClass());
    }

    @Test
    void testGetDropableComponentBorderReturnsLoweredBevelBorderOnWhiteSpaceOS() {
        System.setProperty("os.name", " ");
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
        assertEquals(BorderFactory.createLoweredBevelBorder().getClass(), border.getClass());
    }

    @Test
    void testGetDropableComponentBorderReturnsLoweredBevelBorderOnLowerCaseMacOS() {
        System.setProperty("os.name", "mac os x");
        Border border = SwingTools.getDropableComponentBorder();
        assertTrue(border instanceof Border);
        assertEquals(BorderFactory.createLoweredBevelBorder().getClass(), border.getClass());
    }
}