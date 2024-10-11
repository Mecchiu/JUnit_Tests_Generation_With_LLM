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
		
    private final boolean innerBorderInnerTop = true;
    private final boolean innerBorderInnerBottom = true;
    private final boolean innerBorderInnerLeft = true;
    private final boolean innerBorderInnerRight = true;

    /**
     * Executes one of the O(n) tests of getBorderInsets(Component).
     *
     * @throws Throwable if any error occurs
     */
    @Test
    public void testGetBorderInsets() throws Throwable {
        
    	CellInfo ci = new CellInfo();

    	
        AbstractBorder childBorder  = null;
        AbstractBorder border = null;
        AbstractBorder border1 = null;

        
        Border childBorderBorder1 = null ;
        AbstractBorder border2 = null;
        
        AbstractBorder border3 = null;
        
        CellInfo child = new CellInfo();
        
        child.cellInfo = ci.child = child;
        
        Color childColor = Color.black;
        
        child.color = childColor;
        
        ChildInfo ci1 = new ChildInfo();
        
        Color child1Color = Color.red;

        ci1.child = ci;
        
        ChildInfo ci2 = new ChildInfo();
        
        Color child2Color = Color.yellow;

        ci2.child = ci;

        
        
        
        CellInfo childCI = new CellInfo();

        child.childInfo = ci;
        
        ChildInfo ci1b = new ChildInfo();
        
        Color child1Color1 = Color.darkRed;
        
        ci1b.child = ci;
        
        ChildInfo ci2b = new ChildInfo();
        
        Color child2Color1 = Color.YELLOW;
        
        ci2b.child = ci;

        if(!innerBorderInnerTop) {
            childBorder = innerBorderInnerTop;
            border = childBorder;}
        
        
        if(!innerBorderInnerBottom) {
        	childBorder = innerBorderInnerBottom;
            border = childBorder;}
        
        if(!innerBorderInnerLeft) {
        	childBorder = innerBorderInnerLeft;
            border = childBorder;}
        
        if(!innerBorderInnerRight) {
        	childBorder = innerBorderInnerRight;
            border = childBorder;}
        
        
        
        borders = newBorder[]{border, childBorder, border1, childBorder1};
        
        borders1 = newBorder[]{border2, childBorder2, border3, childBorder3};
        
        border = border1;
        
        parentBorder = border;
        
        border = border1;        
        
        borders1 = newBorder[]{  border5, border6, border7   }    

    }
    
}