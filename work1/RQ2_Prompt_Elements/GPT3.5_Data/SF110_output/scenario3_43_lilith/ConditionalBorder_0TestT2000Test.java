// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    private final int top;
    private final int left;
    private final int bottom;
    private final int right;

    /**
     * Constructs a new ConditionalBorder with the specified insets.
     *
     * @param top the top inset
     * @param left the left inset
     * @param bottom the bottom inset
     * @param right the right inset
     */
    public ConditionalBorder(int top, int left, int bottom, int right) {
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
    }

    /**
     * Returns the insets of the border.
     *
     * @param c the component for which this border insets value applies
     */
    public Insets getBorderInsets(Component c) {
        return new Insets(top, left, bottom, right);
    }
}

// ConditionalBorder_0Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorder_0Test {

    @Test
    void testGetBorderInsets() {
        ConditionalBorder border = new ConditionalBorder(1, 2, 3, 4);
        assertEquals(new Insets(1, 2, 3, 4), border.getBorderInsets(null));
    }

    @Test
    void testGetBorderInsetsWithComponent() {
        ConditionalBorder border = new ConditionalBorder(1, 2, 3, 4);
        Component component = new Component() {};
        assertEquals(new Insets(1, 2, 3, 4), border.getBorderInsets(component));
    }

    @Test
    void testGetBorderInsetsWithNegativeInsets() {
        ConditionalBorder border = new ConditionalBorder(-1, -2, -3, -4);
        assertEquals(new Insets(-1, -2, -3, -4), border.getBorderInsets(null));
    }

    @Test
    void testGetBorderInsetsWithZeroInsets() {
        ConditionalBorder border = new ConditionalBorder(0, 0, 0, 0);
        assertEquals(new Insets(0, 0, 0, 0), border.getBorderInsets(null));
    }

    @Test
    void testGetBorderInsetsWithTopOnly() {
        ConditionalBorder border = new ConditionalBorder(1, 0, 0, 0);
        assertEquals(new Insets(1, 0, 0, 0), border.getBorderInsets(null));
    }

    @Test
    void testGetBorderInsetsWithLeftOnly() {
        ConditionalBorder border = new ConditionalBorder(0, 1, 0, 0);
        assertEquals(new Insets(0, 1, 0, 0), border.getBorderInsets(null));
    }

    @Test
    void testGetBorderInsetsWithBottomOnly() {
        ConditionalBorder border = new ConditionalBorder(0, 0, 1, 0);
        assertEquals(new Insets(0, 0, 1, 0), border.getBorderInsets(null));
    }

    @Test
    void testGetBorderInsetsWithRightOnly() {
        ConditionalBorder border = new ConditionalBorder(0, 0, 0, 1);
        assertEquals(new Insets(0, 0, 0, 1), border.getBorderInsets(null));
    }

    @Test
    void testGetBorderInsetsWithTopAndBottomOnly() {
        ConditionalBorder border = new ConditionalBorder(1, 0, 2, 0);
        assertEquals(new Insets(1, 0, 2, 0), border.getBorderInsets(null));
    }

    @Test
    void testGetBorderInsetsWithLeftAndRightOnly() {
        ConditionalBorder border = new ConditionalBorder(0, 1, 0, 2);
        assertEquals(new Insets(0, 1, 0, 2), border.getBorderInsets(null));
    }
}