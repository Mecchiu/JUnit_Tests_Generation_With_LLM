// Here's an example implementation of the ConditionalBorder class and a test class for it.

// ConditionalBorder.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;

/**
 * This is basically a mutable, simplified LineBorder-EmptyBorder combination.
 */
public class ConditionalBorder extends AbstractBorder {

    private int thickness;
    private int innerThickness;

    public ConditionalBorder(int thickness, int innerThickness) {
        this.thickness = thickness;
        this.innerThickness = innerThickness;
    }

    public Insets getBorderInsets(Component c) {
        int actualThickness = thickness + innerThickness;
        return new Insets(actualThickness, actualThickness, actualThickness, actualThickness);
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
        ConditionalBorder border = new ConditionalBorder(1, 2);
        Insets insets = border.getBorderInsets(null);
        assertEquals(3, insets.top);
        assertEquals(3, insets.left);
        assertEquals(3, insets.bottom);
        assertEquals(3, insets.right);
    }

    @Test
    void testGetBorderInsetsWithZeroThickness() {
        ConditionalBorder border = new ConditionalBorder(0, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    @Test
    void testGetBorderInsetsWithNegativeThickness() {
        ConditionalBorder border = new ConditionalBorder(-1, -2);
        Insets insets = border.getBorderInsets(null);
        assertEquals(-3, insets.top);
        assertEquals(-3, insets.left);
        assertEquals(-3, insets.bottom);
        assertEquals(-3, insets.right);
    }

    @Test
    void testGetBorderInsetsWithDifferentThickness() {
        ConditionalBorder border = new ConditionalBorder(2, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(3, insets.top);
        assertEquals(3, insets.left);
        assertEquals(3, insets.bottom);
        assertEquals(3, insets.right);
    }

    @Test
    void testGetBorderInsetsWithNullComponent() {
        ConditionalBorder border = new ConditionalBorder(1, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(2, insets.top);
        assertEquals(2, insets.left);
        assertEquals(2, insets.bottom);
        assertEquals(2, insets.right);
    }

    @Test
    void testGetBorderInsetsWithNonJComponent() {
        ConditionalBorder border = new ConditionalBorder(1, 1);
        Insets insets = border.getBorderInsets(new Component() {});
        assertEquals(2, insets.top);
        assertEquals(2, insets.left);
        assertEquals(2, insets.bottom);
        assertEquals(2, insets.right);
    }

    @Test
    void testGetBorderInsetsWithJComponent() {
        ConditionalBorder border = new ConditionalBorder(1, 1);
        Insets insets = border.getBorderInsets(new javax.swing.JLabel());
        assertEquals(2, insets.top);
        assertEquals(2, insets.left);
        assertEquals(2, insets.bottom);
        assertEquals(2, insets.right);
    }

    @Test
    void testGetBorderInsetsWithJComponentAndDifferentThickness() {
        ConditionalBorder border = new ConditionalBorder(2, 1);
        Insets insets = border.getBorderInsets(new javax.swing.JLabel());
        assertEquals(3, insets.top);
        assertEquals(3, insets.left);
        assertEquals(3, insets.bottom);
        assertEquals(3, insets.right);
    }

    @Test
    void testGetBorderInsetsWithJComponentAndZeroThickness() {
        ConditionalBorder border = new ConditionalBorder(0, 0);
        Insets insets = border.getBorderInsets(new javax.swing.JLabel());
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    @Test
    void testGetBorderInsetsWithJComponentAndNegativeThickness() {
        ConditionalBorder border = new ConditionalBorder(-1, -2);
        Insets insets = border.getBorderInsets(new javax.swing.JLabel());
        assertEquals(-3, insets.top);
        assertEquals(-3, insets.left);
        assertEquals(-3, insets.bottom);
        assertEquals(-3, insets.right);
    }
}