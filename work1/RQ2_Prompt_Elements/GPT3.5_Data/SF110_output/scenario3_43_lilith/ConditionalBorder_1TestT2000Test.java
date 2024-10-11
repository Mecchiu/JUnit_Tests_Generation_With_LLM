// Here's an implementation of the ConditionalBorder class with the getBorderInsets method.

// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.Component;
import java.awt.Insets;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    private final Color lineColor;
    private final int thickness;
    private final Insets insets;

    /**
     * Constructs a new ConditionalBorder with the specified line color and thickness.
     *
     * @param lineColor the color of the border line
     * @param thickness the thickness of the border line
     */
    public ConditionalBorder(Color lineColor, int thickness) {
        this.lineColor = lineColor;
        this.thickness = thickness;
        this.insets = new Insets(thickness, thickness, thickness, thickness);
    }

    /**
     * Reinitialize the insets parameter with this Border's current Insets.
     *
     * @param c the component for which this border insets value applies
     * @param insets the object to be reinitialized
     */
    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.top = this.insets.top;
        insets.left = this.insets.left;
        insets.bottom = this.insets.bottom;
        insets.right = this.insets.right;
        return insets;
    }

    /**
     * Returns the color of the border line.
     *
     * @return the color of the border line
     */
    public Color getLineColor() {
        return lineColor;
    }

    /**
     * Returns the thickness of the border line.
     *
     * @return the thickness of the border line
     */
    public int getThickness() {
        return thickness;
    }
}

// And here's a test class for the getBorderInsets method.

// ConditionalBorder_1Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.Component;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ConditionalBorder}.
 * It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
 */
class ConditionalBorder_1Test {

    @Test
    void testGetBorderInsets() {
        ConditionalBorder border = new ConditionalBorder(null, 5);
        JButton button = new JButton();
        Insets insets = new Insets(0, 0, 0, 0);

        // Test 1: Border with thickness 5 should have insets of 5 on all sides
        border.getBorderInsets(button, insets);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);

        // Test 2: Border with thickness 0 should have insets of 0 on all sides
        border = new ConditionalBorder(null, 0);
        border.getBorderInsets(button, insets);
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);

        // Test 3: Border with thickness 10 should have insets of 10 on all sides
        border = new ConditionalBorder(null, 10);
        border.getBorderInsets(button, insets);
        assertEquals(10, insets.top);
        assertEquals(10, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(10, insets.right);

        // Test 4: Border with thickness 5 and empty border should have insets of 5 on all sides
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border = new ConditionalBorder(null, 5);
        border.setBorder(new EmptyBorder(0, 0, 0, 0));
        border.getBorderInsets(button, insets);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);

        // Test 5: Border with thickness 5 and line color red should have insets of 5 on all sides
        border = new ConditionalBorder(Color.RED, 5);
        border.getBorderInsets(button, insets);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);

        // Test 6: Border with thickness 5 and line color blue should have insets of 5 on all sides
        border = new ConditionalBorder(Color.BLUE, 5);
        border.getBorderInsets(button, insets);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);

        // Test 7: Border with thickness 5 and line color green should have insets of 5 on all sides
        border = new ConditionalBorder(Color.GREEN, 5);
        border.getBorderInsets(button, insets);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);

        // Test 8: Border with thickness 5 and line color yellow should have insets of 5 on all sides
        border = new ConditionalBorder(Color.YELLOW, 5);
        border.getBorderInsets(button, insets);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);

        // Test 9: Border with thickness 5 and line color black should have insets of 5 on all sides
        border = new ConditionalBorder(Color.BLACK, 5);
        border.getBorderInsets(button, insets);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);

        // Test 10: Border with thickness 5 and line color white should have insets of 5 on all sides
        border = new ConditionalBorder(Color.WHITE, 5);
        border.getBorderInsets(button, insets);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);
    }
}