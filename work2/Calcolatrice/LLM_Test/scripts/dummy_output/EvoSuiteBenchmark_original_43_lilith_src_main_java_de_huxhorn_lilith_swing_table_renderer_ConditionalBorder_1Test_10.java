// ConditionalBorder_1Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains one unit test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_1Test {
		//@Test
    public void test() {
		ConditionalBorder border = new ConditionalBorder(3);
		AbstractBorder borderBorder = border.getBorder();
		Border borderBorder_0 = border.getBorder(0);
		Border borderBorder_1 = border.getBorder(1);
		assertTrue((borderBorder_0 == borderBorder_1) || borderBorder_0 == borderBorder_1);
    }

    /**
	* A unit test to test constructor
	*/
    @Test
    public void testConstructor() {
		ConditionalBorder border = new ConditionalBorder(3);

		assertEquals(3, border.getInset()) ;
		
		assertNull(border.getBorder());
    }
}