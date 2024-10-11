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

	private final static Insets insets4 = new Insets(5, 11, 5, 8);
	private final static Insets insets5 = new Insets(0, 6, 8, 0);
	
								
	@Test
	public void insets5Thickness() throws BorderFactoryConfigurationError {
		

		
		assertFalse(border4.isBorderThick());
		assertTrue(border4.isBorderEmpty());
		
		assertEquals(insets4, border5.getBorderInsets(new JLabel(), insets5));
		assertEquals(insets5, border5.getBorderInsets(new JPanel(), insets5));
		assertEquals(insets5, border5.getBorderInsets(new JPanel(), insets5));
	
	
	}

	@Test
	public void bordersWithNull() throws BorderFactoryConfigurationError {
		
		
		assertFalse(border4.isBorderThick());
		assertTrue(border4.isBorderEmpty());
				
		final JPanel panel3 = new JPanel(new BorderLayout());
		panel3.add(new JPanel(), BorderLayout.NORTH);
		assertFalse(border4.isBorderThick());
		assertFalse(border4.isBorderEmpty());
				
		
		panel3.setBorder(new ConditionalBorder(null, border5, BorderFactory.createEmptyBorder(5,10,5,8)));
		
		assertFalse(border4.isBorderThick());
		assertTrue(border4.isBorderEmpty());
				
		border4.setBorder(null);
		assertTrue(border4.isBorderEmpty());

	}



	
}
