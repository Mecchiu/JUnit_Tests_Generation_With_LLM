// ConditionalBorder_0Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains one unit test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorder_0Test {

    /**
    * Test-case for {@link ConditionalBorder#getBorderInsets(Component)}.
    */
    @Test
    void testGetBorderInsets_1Complex() {
        ConditionalBorder border = new ConditionalBorder();
        assertNotNull(border.getBorderInsets(new Cell(15, 30)));
        assertEquals(new Insets(20, 20, 20, 20), border.getBorderInsets(new Cell(15, 30)));
    }
	
    /**
    * Test-case for {@link ConditionalBorder#getBorderInsets(Component)}.
    */
    @Test
    void testGetBorderInsets_2Simple() {
        ConditionalBorder border = new ConditionalBorder();
        assertNotNull(border.getBorderInsets(new Cell(15, 30)));
        assertEquals(new Insets(10, 10, 10, 10), border.getBorderInsets(new Cell(15, 30)));
    }
	
    /**
    * Test-case for {@link ConditionalBorder#getBorderInsets(Component)}.
    */
    @Test
    void testGetBorderInsets_3Simple() {
        ConditionalBorder border = new ConditionalBorder();
        assertNotNull(border.getBorderInsets(new Cell(15, 30)));
        assertEquals(new Insets(10, 10, 10, 10), border.getBorderInsets(new Cell(15, 30)));
    }
	
    /**
    * Test-case for {@link ConditionalBorder#getBorderInsets(Component)}.
    */
    @Test
    void testGetBorderInsets_4Simple() {
        ConditionalBorder border = new ConditionalBorder();
        assertNotNull(border.getBorderInsets(new Cell(15, 30)));
        assertEquals(new Insets(10, 10, 10, 10), border.getBorderInsets(new Cell(15, 30)));
    }
	
}

