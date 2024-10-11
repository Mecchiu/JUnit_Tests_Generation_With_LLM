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

		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of zero.
		*/
		@Test
		public void testGetBorderInsets_0() {
				// create a border with a thickness of zero
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(0, insets.top);
				assertEquals(0, insets.left);
				assertEquals(0, insets.bottom);
				assertEquals(0, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of one.
		*/
		@Test
		public void testGetBorderInsets_1() {
				// create a border with a thickness of one
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(1, insets.top);
				assertEquals(1, insets.left);
				assertEquals(1, insets.bottom);
				assertEquals(1, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of two.
		*/
		@Test
		public void testGetBorderInsets_2() {
				// create a border with a thickness of two
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(2, insets.top);
				assertEquals(2, insets.left);
				assertEquals(2, insets.bottom);
				assertEquals(2, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of three.
		*/
		@Test
		public void testGetBorderInsets_3() {
				// create a border with a thickness of three
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 3);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(3, insets.top);
				assertEquals(3, insets.left);
				assertEquals(3, insets.bottom);
				assertEquals(3, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of four.
		*/
		@Test
		public void testGetBorderInsets_4() {
				// create a border with a thickness of four
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 4);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(4, insets.top);
				assertEquals(4, insets.left);
				assertEquals(4, insets.bottom);
				assertEquals(4, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of five.
		*/
		@Test
		public void testGetBorderInsets_5() {
				// create a border with a thickness of five
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 5);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(5, insets.top);
				assertEquals(5, insets.left);
				assertEquals(5, insets.bottom);
				assertEquals(5, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of six.
		*/
		@Test
		public void testGetBorderInsets_6() {
				// create a border with a thickness of six
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 6);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(6, insets.top);
				assertEquals(6, insets.left);
				assertEquals(6, insets.bottom);
				assertEquals(6, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of seven.
		*/
		@Test
		public void testGetBorderInsets_7() {
				// create a border with a thickness of seven
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 7);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(7, insets.top);
				assertEquals(7, insets.left);
				assertEquals(7, insets.bottom);
				assertEquals(7, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of eight.
		*/
		@Test
		public void testGetBorderInsets_8() {
				// create a border with a thickness of eight
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 8);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(8, insets.top);
				assertEquals(8, insets.left);
				assertEquals(8, insets.bottom);
				assertEquals(8, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of nine.
		*/
		@Test
		public void testGetBorderInsets_9() {
				// create a border with a thickness of nine
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 9);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(9, insets.top);
				assertEquals(9, insets.left);
				assertEquals(9, insets.bottom);
				assertEquals(9, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
		* The test case tests the border insets for a border with a thickness of ten.
		*/
		@Test
		public void testGetBorderInsets_10() {
				// create a border with a thickness of ten
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 10);
				// create a component
				Component c = new Component() {
				};
				// get the border insets
				Insets insets = border.getBorderInsets(c);
				// check the border insets
				assertEquals(10, insets.top);
				assertEquals(10, insets.left);
				assertEquals(10, insets.bottom);
				assertEquals(10, insets.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_1Test {
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of zero.
		*/
		@Test
		public void testGetBorderInsets_0() {
				// create a border with a thickness of zero
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0);
				// create a component
				Component c = new Component() {
				};
				// create an insets object
				Insets insets = new Insets(0, 0, 0, 0);
				// get the border insets
				border.getBorderInsets(c, insets);
				// check the border insets
				assertEquals(0, insets.top);
				assertEquals(0, insets.left);
				assertEquals(0, insets.bottom);
				assertEquals(0, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of one.
		*/
		@Test
		public void testGetBorderInsets_1() {
				// create a border with a thickness of one
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1);
				// create a component
				Component c = new Component() {
				};
				// create an insets object
				Insets insets = new Insets(0, 0, 0, 0);
				// get the border insets
				border.getBorderInsets(c, insets);
				// check the border insets
				assertEquals(1, insets.top);
				assertEquals(1, insets.left);
				assertEquals(1, insets.bottom);
				assertEquals(1, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of two.
		*/
		@Test
		public void testGetBorderInsets_2() {
				// create a border with a thickness of two
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2);
				// create a component
				Component c = new Component() {
				};
				// create an insets object
				Insets insets = new Insets(0, 0, 0, 0);
				// get the border insets
				border.getBorderInsets(c, insets);
				// check the border insets
				assertEquals(2, insets.top);
				assertEquals(2, insets.left);
				assertEquals(2, insets.bottom);
				assertEquals(2, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of three.
		*/
		@Test
		public void testGetBorderInsets_3() {
				// create a border with a thickness of three
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 3);
				// create a component
				Component c = new Component() {
				};
				// create an insets object
				Insets insets = new Insets(0, 0, 0, 0);
				// get the border insets
				border.getBorderInsets(c, insets);
				// check the border insets
				assertEquals(3, insets.top);
				assertEquals(3, insets.left);
				assertEquals(3, insets.bottom);
				assertEquals(3, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder