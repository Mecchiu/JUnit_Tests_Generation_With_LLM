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
     * Test method for {@link ConditionalBorder#getBorderInsets(Component, Insets)}.
     * If the insets value is NULL, this method returns a default insets value.
     */
    @Test
    public void testBorderInsets() {		
        Insets insets = null;
        
        ConditionlessBorder cb = new ConditionlessBorder();
        
        assertNull(cb.getBorderInsets(null, new Insets(2, 3, 4, 5)));
    }

	@Test
	public void testGetBorderPaintContext() {
        
		ConditionlessBorder cb = new ConditionlessBorder();
		Insets ins = new Insets(2,3,4,5);

		RenderingContext context = cb.getBorderPaintContext(null, ins);
		
		conditionalMock(Insets.class, context);
	}

	private  static class ConditionlessBorder extends ConditionalBorder {}
}