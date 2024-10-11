// Test class of SwingTools
package com.eteks.sweethome3d.swing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link SwingTools}.
 * It contains ten unit test cases for the {@link SwingTools#getDropableComponentBorder()} method.
 */
class SwingToolsTest {
    
    /**
     * Test case for a null component.
     */
    @Test
    void testGetDropableComponentBorderWithNullComponent() {
        assertNull(SwingTools.getDropableComponentBorder(null));
    }
    
    /**
     * Test case for a component with no border.
     */
    @Test
    void testGetDropableComponentBorderWithNoBorder() {
        Component component = new JPanel();
        assertNull(SwingTools.getDropableComponentBorder(component));
    }
    
    /**
     * Test case for a component with a line border.
     */
    @Test
    void testGetDropableComponentBorderWithLineBorder() {
        Component component = new JPanel();
        component.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        assertNotNull(SwingTools.getDropableComponentBorder(component));
    }
    
    /**
     * Test case for a component with an empty border.
     */
    @Test
    void testGetDropableComponentBorderWithEmptyBorder() {
        Component component = new JPanel();
        component.setBorder(BorderFactory.createEmptyBorder());
        assertNotNull(SwingTools.getDropableComponentBorder(component));
    }
    
    /**
     * Test case for a component with a titled border.
     */
    @Test
    void testGetDropableComponentBorderWithTitledBorder() {
        Component component = new JPanel();
        component.setBorder(BorderFactory.createTitledBorder("Title"));
        assertNotNull(SwingTools.getDropableComponentBorder(component));
    }
    
    /**
     * Test case for a component with a compound border.
     */
    @Test
    void testGetDropableComponentBorderWithCompoundBorder() {
        Component component = new JPanel();
        component.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK), 
                                                               BorderFactory.createEmptyBorder()));
        assertNotNull(SwingTools.getDropableComponentBorder(component));
    }
    
    /**
     * Test case for a component with a matte border.
     */
    @Test
    void testGetDropableComponentBorderWithMatteBorder() {
        Component component = new JPanel();
        component.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        assertNotNull(SwingTools.getDropableComponentBorder(component));
    }
    
    /**
     * Test case for a component with a etched border.
     */
    @Test
    void testGetDropableComponentBorderWithEtchedBorder() {
        Component component = new JPanel();
        component.setBorder(BorderFactory.createEtchedBorder());
        assertNotNull(SwingTools.getDropableComponentBorder(component));
    }
    
    /**
     * Test case for a component with a bevel border.
     */
    @Test
    void testGetDropableComponentBorderWithBevelBorder() {
        Component component = new JPanel();
        component.setBorder(BorderFactory.createBevelBorder(0));
        assertNotNull(SwingTools.getDropableComponentBorder(component));
    }
    
    /**
     * Test case for a component with a soft bevel border.
     */
    @Test
    void testGetDropableComponentBorderWithSoftBevelBorder() {
        Component component = new JPanel();
        component.setBorder(BorderFactory.createSoftBevelBorder(0));
        assertNotNull(SwingTools.getDropableComponentBorder(component));
    }
}