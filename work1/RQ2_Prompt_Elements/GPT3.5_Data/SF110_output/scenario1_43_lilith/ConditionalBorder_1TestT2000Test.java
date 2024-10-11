// Source code for ConditionalBorder_1Test.java

package de.huxhorn.lilith.swing.table.renderer;

import java.awt.Component;
import java.awt.Insets;

import javax.swing.border.AbstractBorder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ConditionalBorder}.
 * It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
 */
class ConditionalBorder_1Test {

    @Test
    void testGetBorderInsets() {
        ConditionalBorder border = new ConditionalBorder();
        Component c = null;
        Insets insets = new Insets(0, 0, 0, 0);

        // Test case 1: thickness = 0, innerThickness = 0
        border.thickness = 0;
        border.innerThickness = 0;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(0, 0, 0, 0), insets);

        // Test case 2: thickness = 1, innerThickness = 0
        border.thickness = 1;
        border.innerThickness = 0;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(1, 1, 1, 1), insets);

        // Test case 3: thickness = 0, innerThickness = 1
        border.thickness = 0;
        border.innerThickness = 1;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(1, 1, 1, 1), insets);

        // Test case 4: thickness = 1, innerThickness = 1
        border.thickness = 1;
        border.innerThickness = 1;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(2, 2, 2, 2), insets);

        // Test case 5: thickness = -1, innerThickness = 0
        border.thickness = -1;
        border.innerThickness = 0;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(0, 0, 0, 0), insets);

        // Test case 6: thickness = 0, innerThickness = -1
        border.thickness = 0;
        border.innerThickness = -1;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(0, 0, 0, 0), insets);

        // Test case 7: thickness = -1, innerThickness = -1
        border.thickness = -1;
        border.innerThickness = -1;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(0, 0, 0, 0), insets);

        // Test case 8: thickness = Integer.MAX_VALUE, innerThickness = 0
        border.thickness = Integer.MAX_VALUE;
        border.innerThickness = 0;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), insets);

        // Test case 9: thickness = 0, innerThickness = Integer.MAX_VALUE
        border.thickness = 0;
        border.innerThickness = Integer.MAX_VALUE;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE), insets);

        // Test case 10: thickness = Integer.MAX_VALUE, innerThickness = Integer.MAX_VALUE
        border.thickness = Integer.MAX_VALUE;
        border.innerThickness = Integer.MAX_VALUE;
        insets = border.getBorderInsets(c, insets);
        assertEquals(new Insets(-1, -1, -1, -1), insets);
    }
}