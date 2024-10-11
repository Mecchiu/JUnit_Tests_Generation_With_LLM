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
		protected static final Insets INSETS_1 =
				new Insets(0, 0, 0, 0);
	protected static final Dimension PREFERRED =
		new Dimension(200, 5);
	protected static final Dimension FULL = new Dimension(200, 200);
	protected static final Insets LAST_INSET_TOP_LEFT =
		new Insets(0, 0, 0, 0);
	protected static final Insets LAST_INSET_TOP_RIGHT =
		new Insets(0, 0, 0, 0);
	protected static final Insets LAST_INSET_BOTTOM_LEFT =
		new Insets(0, 0, 0, 0);
	protected static final Insets LAST_INSET_BOTTOM_RIGHT =
		new Insets(0, 0, 0, 0);
	protected Graphics2D g;

	@Test
	void getBorderInsets_1_initialize_with_insets_1() {
		ConditionedBorder b = new ConditionedBorder();
		b.setInsets(INSETS_1);
		assertFalse("should return false but was not", b.isBorderInsetsDefault());
		assertEquals("should be the default-inset if there is no insets yet", PREFERRED, b.getBorderInsets(null, null));
	}
	@Test
	void getBorderInsets_1_to_inset() {
		ConditionedBorder b = new ConditionedBorder();
		b.setInsets(new Insets(10, 20, 20, 20));
		assertFalse("should return false but was not", b.isBorderInsetsDefault());
		assertEquals("should be the default-inset if there is no insets yet", PREFERRED, b.getBorderInsets(null, null));
	}
	@Test
	void getBorderInsets_1_insets() {
		ConditionedBorder b = new ConditionedBorder();
		assertTrue("should return true but was not", b.isBorderInsetsDefault());
		assertTrue("should not return true but was not", b.isBorderInsets(INSETS_1, null, null));
		assertFalse("should return false but was not", b.isBorderInsets(null, null, PREFERRED));
	}
	@Test
	void getBorderInsets_1_first() {
		ConditionedBorder b = new ConditionedBorder();
		b.setInsets(new Insets(0, 30, 0, 30));
		assertTrue("should return true but was not", b.isBorderInsetsDefault());
		assertEquals("should insets return correct value with insets-1", FULL, b.getBorderInsets(null, null, null));
	}
	@Test
	void getBorderInsets_1_last() {
		ConditionedBorder b = new ConditionedBorder();
		b.setInsets(new Insets(0, 30, 0, 0));
		assertFalse("should return false but was not", b.isBorderInsetsDefault());
		assertFalse("should return false but was not", b.isBorderInsets(null, null, null));
		assertEquals("should return false but was not", 0, b.getBorderInsets(null, null, INSETS_1).width);
	}
	@Test
	void getBorderInsets_1_insets1() {
		ConditionedBorder b = new ConditionedBorder();
		b.setInsets(new Insets(30, 30, 30, 30));
		assertFalse("should return false but was not", b.isBorderInsetsDefault());
		assertEquals("should insets return correct value with insets-2", PREFERRED, b.getBorderInsets(null, null, null));
	}
	@Test
	void getBorderInsets_1_insets2() {
		ConditionedBorder b = new ConditionedBorder();
		b.setInsets(new Insets(0, 0, 30, 30));
		assertFalse("should return false but was not", b.isBorderInsetsDefault());
		assertEquals("should insets return correct value with insets-2", INSETS_1, b.getBorderInsets(null, null, null));
	}

	/**
	 * Test constructor of {@link ConditionalBorder}.
	 */
	@Test
	void constructor_1_insets_2() {
		ConditionedBorder border = new ConditionalBorder(new Insets(30, 30, 30, 30));
	}
	/**
	 * Test the isBorderInsets() method of {@link ConditionalBorder}.
	 */
	@Test
	void isBorderInsets_1_with_insets2() {
		ConditionedBorder border = new ConditionalBorder(new Insets(0, 0, 0, 0), new Insets(0, 0, 0, 0));
		assertFalse("should return false but was not", border.isBorderInsetsDefault());
		assertFalse("should return false but was not", border.isBorderInsets(NEW_INSETS_1, null, null));
	}
}