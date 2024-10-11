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
	 * Tests the getBorderInsets method.
	 */
	@Test
	void testGetBorderInsets() {

		//GIVEN - an empty border structure (and empty insets)
		Insets borders = new Insets(10, 20, 30, 40);

		//THEN - empty insets
		assertTrue(c -> c.getMargin() == null);
		assertTrue(c -> c.getBorderInsets() == null);

		//THEN - border sizes
		assertTrue(borders.left == new Insets(10, 5, 20, 20));
		assertTrue(borders.top == new Insets(10, 5, 30, 20));
		assertTrue(borders.right == new Insets(10, 15, 20, 20));
		assertTrue(borders.bottom == new Insets(10, 15, 30, 20));

		//THEN - insets that are different
		assertFalse(c -> c.getMargin().equals(borders.left.copyValue()));
		assertFalse(c -> c.getBorderInsets(null).equals(new Insets(5, 10, 5, 10)));
		assertFalse(c -> c.getBorderInsets(new Insets(5, 10, 5, 10)).equals(new Insets(5, 10, 5, 10)));

	}

}
