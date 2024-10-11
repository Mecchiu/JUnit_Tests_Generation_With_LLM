// ConditionalBorder_0Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorder_0Test {

		@Test
		void test_0() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = null;
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_1() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = null;
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_2() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_3() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_4() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_5() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_6() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_7() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_8() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_9() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
}

// ConditionalBorder_1Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorder_1Test {
		
		@Test
		void test_0() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = null;
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_1() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = null;
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_2() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_3() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_4() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_5() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_6() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_7() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(c, insets);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_8() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = conditionalBorder.getBorderInsets(c);
				assertEquals(1, insets.left);
				assertEquals(1, insets.top);
				assertEquals(1, insets.right);
				assertEquals(1, insets.bottom);
		}
		
		@Test
		void test_9() {
				Color color = new Color(0, 0, 0);
				int thickness = 1;
				int innerThickness = 0;
				ConditionalBorder conditionalBorder = new ConditionalBorder(color, thickness, innerThickness);
				Component c = new Component() {
				};
				Insets insets = new Insets(0, 0, 0, 0);
				conditionalBorder.getBorderInsets(