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
	 * Runs the test method.
	 *
	 * @param args the command line arguments
	 */
	@Test
	void methodWithInsets_doesNotInvokeSetBorder() {
		
		Component c = new Component();
		c.setBounds(23,24,13,1);
		
		Border insetsBorder = new EmptyBorder(1,1,1,1);
		
		// Test: null border insets value parameter
		c.setBorder(new EmptyBorder(2,2,2,2));
		Insets insets = c.getBorder().getBorderInsets(c,null);
		assertNull("setBorder Insets is null",insets);
		

		// Test: insets parameter: insetsBorder
		c.setBorder(new EmptyBorder(insetsBorder));
		insets = c.getBorder().getBorderInsets(c,insetsBorder);
		assertTrue("Insets.getBorderInsets(Component, insets)",(insetsBorder == insets));
		
		// Test: insets parameter: null border
		c.setBorder(new EmptyBorder(insetsBorder));
		c.setBounds(0,0,0,0);
		assertEQ("setBorder insets is different",insetsBorder,c.getBorder().getBorderInsets(c,null));
		
		// Test: insets parameter: insetsBorder
		// This is more complicated
		insets = new Insets(3,4,5,6);
		c.setBorder(new EmptyBorder(insetsBorder));
		insets = c.getBorder().getBorderInsets(c,insetsBorder);
		assertTrue("Insets.getBorderInsets(Component,insets)+"+insets+"!= insets",(insetsBorder == insets));
		
		// Test: insets parameter: null border
		// This is more complicated
		insets = null;
		c.setBorder(new EmptyBorder());
		insets = c.getBorder().getBorderInsets(c,insetsBorder);
		assertEQ("setBorder insets is"+insets,insetsBorder,c.getBorder().getBorderInsets(c,insets));
	}


}