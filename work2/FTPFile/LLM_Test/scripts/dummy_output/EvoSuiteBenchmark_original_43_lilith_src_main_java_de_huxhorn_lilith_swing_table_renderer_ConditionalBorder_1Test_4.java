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
		@javax.annotation.ParametersAreNonnullByDefault
		final static Class[] CLASSES = new Class[]{
				ConditionalLineBorder.class};

		/**
		 * Testing {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		 */
		@javax.test.category.Unit
		@Test
		public void checkConstructors() {
				AbstractBorder border0 = new ConditionalLineBorder();
				AbstractBorder border1 = new ConditionalBorder();
				Border border = new Border();
				assertNotNull(border0);
				assertNotNull(border1);

				// Insets must be a nonnull one when set:
				assertNotNull(border0.getBorderInsets(new Component()));
				assertNotNull(border1.getBorderInsets());

				// Insets may be empty when insets are set to null:
				assertNotNull(Border.class.cast(border0.getBorder()));
				assertNotNull(border1.getBorder());

				// Insets can be null when both insets are present but neither set:
				assertNull(Border.class.cast(border1.getBorder()));
				assertNotNull(Border.class.cast(border0.getBorder()));
		}

		/**
		 * Testing {@link ConditionalBorder#getBackground()}.
		 */
		@Test
		public void testGetBackground() {
				AbstractBorder border0 = new ConditionalLineBorder();
				Color color0 = border0.getBackground();
				assertNotNull(color0);

				AbstractBorder border1 = new ConditionalBorder();
				Color color1 = border1.getBackground();
				assertNotNull(color1);
		}
}