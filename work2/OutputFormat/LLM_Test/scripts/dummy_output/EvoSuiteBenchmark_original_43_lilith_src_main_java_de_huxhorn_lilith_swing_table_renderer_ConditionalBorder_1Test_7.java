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
		private final Insets insets;

		@Test
		public void testGetBorderInsets() {
			assertEquals( 0, getBorderInsets( new JLabel(), insets ).left );
			assertEquals( 0, getBorderInsets( new JLabel(), insets ).right );
			assertEquals( 0, getBorderInsets( new JPanel(), insets ).left );
			assertEquals( 0, getBorderInsets( new JPanel(), insets ).top );
			assertEquals( 0, getBorderInsets( new JPanel(), insets ).right );
			assertEquals( 4, getBorderInsets( getPanel(), insets ).left );
			assertEquals( 4, getBorderInsets( getPanel(), insets ).top );
			assertEquals( 4, getBorderInsets( getPanel(), insets ).right );
			assertEquals( 8, getBorderInsets( new JPanel(), null ).left );
			assertEquals( 8, getBorderInsets( new JPanel(), null ).top );
			assertEquals( 10, getBorderInsets( getPanel(), null ).left );
			assertEquals( 10, getBorderInsets( getPanel(), null ).top );
			assertEquals( 6, getBorderInsets( getPanel(), null ).right );
		}
}