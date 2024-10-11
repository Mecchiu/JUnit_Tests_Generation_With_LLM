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
		
    /** Tests the value is set correctly. */
    @Test public void testSet_Constant() {
        Component component = new Component();
        Component result = new ConditionalBorder().getBorderInsets(component);
        assertEquals(new Insets(5,5,5,5), result);
    }
    
    /** Tests a value which is not set yet. */
    @Test public void testGet_NotSet() {
        Component component = new Component();
        Color result = new ConditionalBorder().getBorderInsets(component);
        assertSame(new Insets(5,5,5,5), result);
    }
    
    /** Tests the insets which will be set by the method getBorderInsets(). */
    @Test public void testGetInsets_InsetEmpty() {
        Component component = new Component();
        AbstractBorder insetBorder = new ConditionalBorder();
        Insets result = insetBorder.getBorderInsets(component);
        assertSame(new Insets(10,10,10,10), result);
    }
    
    /** Tests the insets which will be set by the method getBorderInsets(). */
    @Test public void testGetInsets_InsetNotEmpty() {
        Component component = new Component();
        AbstractBorder insetBorder = new ConditionalBorder();
        Insets result = insetBorder.getBorderInsets(component);
        assertSame(new Insets(0,10,10,10), result);
    }
    
    /** Tests the insets which will be set by the method setBorderInsets(). */
    @Test public void testSetInsets_InsetEmpty() {
        Component component = new Component();
        AbstractBorder insetBorder = new ConditionalBorder();
        Insets result = insetBorder.setBorderInsets(component, new Insets(10,10,10,10));
        assertSame(new Insets(10,10,10,10), result);
    }
    
    /** Tests the insets which will be set by the method setBorderInsets(). */
    @Test public void testSetInsets_InsetNotEmpty() {
        Component component = new Component();
        AbstractBorder insetBorder = new ConditionalBorder();
        Insets result = insetBorder.setBorderInsets(component, new Insets(10,10,10,10));
        assertSame(new Insets(0,0,0,10), result);
    }

}