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
		//
		// fields
		//
		private AbstractBorder border = null;

		//
		// constructor
		//
		public ConditionalBorder_1Test() {
		}

		/**
		 * Initializes the border parameter with this border's current insets.
		 */
		public void reinit(){
			border = new ConditionalBorder();
		}

		/**
		 * Tests the result of invoking setBorder method of the object.
		 */
		@Test
		public void testGetBorderInsets(){
			Border border2 = new ConditionalBorder();
			Border border_getBorder = border.getBorderInsets(new ConditionalBorder_1_test_component(), 
					new Insets(5,0,0,0));
			assertNotNull(border_getBorder);
			assertEquals(border2, border_getBorder);
			border.setBorder(null);
			border_getBorder = border.getBorderInsets(new ConditionalBorder_1_test_component(), 
					new Insets(5,0,0,0));
			assertNull(border_getBorder);
		}

		/**
		 * Tests the result of invoking getBorderInsets method of the object.
		 */
		@Test
		public void testGetBorderInsets(){
			Border border0 = new ConditionalBorder();
			Border border_getBorder = border.getBorderInsets(new ConditionalBorder_1_test_component(), 
					new Insets(5,0,0,0));
			assertNotNull(border_getBorder);
			assertEquals(border0, border_getBorder);
			border.setBorder(null);
			border_getBorder = border.getBorderInsets(new ConditionalBorder_1_test_component(), 
					new Insets(5,0,0,0));
			assertNull(border_getBorder);
		}
}