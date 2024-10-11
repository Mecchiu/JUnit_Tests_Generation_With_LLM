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
		@Test
		public void test() {
			ConConditionalBorder borders = new ConConditionalBorder();
			borders.setInsets(new Insets((int)Math.random()*2.5, 1, (int)Math.random()*2.5, 1));
			borders.setBorder(new Insets((int)Math.random()*2.5, 1, (int)Math.random()*2.5, 1), AbstractBorder.BorderFactory.createEmptyBorder());
			borders.setBorder(new Insets((int)Math.random()*2.5, 1, (int)Math.random()*2.5, 1), AbstractBorder.BorderFactory.createEmptyBorder(5));
			borders.setBorder(new Insets((int)Math.random()*2.5, 1, (int)Math.random()*2.5, 1));
			assertEquals(((borders.getInsets()).top, (borders.getInsets()).left, (borders.getInsets()).right), Integer.valueOf(5));
		}
	}