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
ConditionalBorder instance = new ConditionalBorder();
		
		/**
		* Test for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		*/
		@Test
		public void testGetBorderInsets() {
			assertNotNull("The value of the returned border-insets may be null", instance.getBorderInsets(null, null));
			assertEquals("The returned border-insets may not be the same as the specified insets",
				new Insets(0, 0, 0, 0), instance.getBorderInsets(null, new Insets(0, 0, 0, 0)));
			assertEquals("The returned border-insets may not be null",
				new Insets(0, 0, 0, 0), instance.getBorderInsets(null, null));
		}
}
// ConditionalBorder_1Test.java