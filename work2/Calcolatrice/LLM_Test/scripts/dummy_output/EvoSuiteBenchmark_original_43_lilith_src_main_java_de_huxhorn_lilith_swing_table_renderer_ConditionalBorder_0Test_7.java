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
	 * Test method for
	 * {@link ConditionalBorder#getBorderInsets(Component)} with a null component.
	 */
	@Test(expected=IllegalArgumentException.class)
	public void testGetBorderInsets02() {
		new ConditionalBorder((Color) null).getBorderInsets(null);
	}

	/**
	 * Test method for
	 * {@link ConditionalBorder#getBorderInsets(Component)} with a string.
	 */
	@Test
	public void testGetBorderInsets03() {
		Color c = Color.CYAN;
		assertSame("The parameter color is different.", c, ConditionalBorder.getBorderInsets(c));
	}

	/**
	 * Test method for {@link ConditionalBorder#getBorderInsets(Component)}.
	 */
	@Test
	public void testGetBorderInsets04() {
		Color c = Color.RED;
		assertSame("The parameter color is not equals to C", c, ConditionalBorder.getBorderInsets(c));
	}

}