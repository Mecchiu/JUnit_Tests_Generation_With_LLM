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
/**
		 * Unit test-case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		*/
		@Test
		public void getBorderInsets_2Tests_ShouldReturnNull() {
				
				//arrange
				Border border = new EmptyBorder();
				Insets insets = new Insets(0, 0, 0, 0);
				assertNull(border.getBorderInsets(null, insets));
			
		}
}