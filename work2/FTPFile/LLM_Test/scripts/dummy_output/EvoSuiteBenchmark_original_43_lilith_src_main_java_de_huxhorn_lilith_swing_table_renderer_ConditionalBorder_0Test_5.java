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
		 * Tests if Insets is included in the inset of the border.
		 * @throws Exception if the method test fails
		 */
		@Test
		void testInset() throws Exception {
		
			final Insets borderInsets = new Insets(0, 0, 1, 1);
			BorderInsets inset = ConditionalBorder_0Test.this.getBorderInsets(
			        new BorderList.ListBorder(new BorderDefinition<>(BorderDefinition.None, null, null), new BorderDefinition<>(BorderDefinition.None, null, null)))
				.setBorderInsets(borderInsets);
			assertEquals(borderInsets, inset);
		}
}