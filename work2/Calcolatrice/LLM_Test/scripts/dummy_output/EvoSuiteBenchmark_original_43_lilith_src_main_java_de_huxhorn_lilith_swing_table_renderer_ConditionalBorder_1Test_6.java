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
		
	private final static Component[] WIDTHS =  new Component[1];
	private final static Component[] HEIGHTS =  new Component[1];
	
	// Test-Tests: Initialization
	

	/**
	 * Unit testing initialization of the constructor.
	 * This testcase is disabled with insets = null.
	 */
	@Test
	public void getBorderInsets_null_default() {
		getBorderInsets(WIDTHS[0], null);
	}
	
	/**
	 * Unit testing initialization of the constructor.
	 * This testcase is disable with insets = Insets.create(-1, -1, -1, -1, -1, -1);
	 */
	@Test
	public void getBorderInsets_Insets_default() {
		assertSame(getBorderInsets(WIDTHS[0], Insets.create(0, 0, 0, 0)), BorderFactory.createEmptyBorder());
	}
	/**
	 * Testcase for a component with non-existent border insets. 
	 */
	@Test
	public void getBorderInsets_Noinsets() {
		getBorderInsets(new Label(), null); // Default border insets are empty.
	}
	/**
	 * Testcase for a component with null border insets.
	 */
	@Test
	public void getBorderInsets_nullinsets() {
		getBorderInsets(WIDTHS[0], null); // Default border insets are empty
	}
	
	/**
	 * Unit testing the non-insets methods.
	 */
	@Test
	public void getBorderInsets(Component c, Insets insets) {
		c.setBorder(new ConditionalBorder_1());
		assertDefault(c.getBorder());
		WIDTHS[0] = c;
		assertEquals(insets, c.getBorder().getBorderInsets(c, insets));
	}
	
	/**
	 * Unit testing a component using the insets method without the border insets.
	 */
	@Test
	public void getBorderInsets(Component c, Insets insets) {
		c.setBorder(new ConditionalBorder_1());
		assertDefault(c.getBorder());
		WIDTHS[0] = c;
		assertDefault(insets);
	}
	
}