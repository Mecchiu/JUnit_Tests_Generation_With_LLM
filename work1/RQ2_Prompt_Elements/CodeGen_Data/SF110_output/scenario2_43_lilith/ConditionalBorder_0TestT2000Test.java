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
public static void main(String args[]) {
		
			Border emptyBorder = new EmptyBorder(10, 2, 10, 2);
			
			for(int i=0; i<10; i++)
				junit.framework.Assert.assertEquals(i, new ConditionalBorder()
					.getBorderInsets(new JPanel()).left);

		}
}

// ConditionalBorder_1Test.java
