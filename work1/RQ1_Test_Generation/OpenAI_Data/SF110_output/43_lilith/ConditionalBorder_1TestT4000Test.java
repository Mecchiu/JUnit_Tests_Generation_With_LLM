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
		* The test case tests the border insets for a border with a thickness of 1 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_1_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(1, insets.top);
				assertEquals(1, insets.left);
				assertEquals(1, insets.bottom);
				assertEquals(1, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 2 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_2_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(2, insets.top);
				assertEquals(2, insets.left);
				assertEquals(2, insets.bottom);
				assertEquals(2, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 3 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_3_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 3, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(3, insets.top);
				assertEquals(3, insets.left);
				assertEquals(3, insets.bottom);
				assertEquals(3, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 4 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_4_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 4, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(4, insets.top);
				assertEquals(4, insets.left);
				assertEquals(4, insets.bottom);
				assertEquals(4, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 5 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_5_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 5, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(5, insets.top);
				assertEquals(5, insets.left);
				assertEquals(5, insets.bottom);
				assertEquals(5, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 6 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_6_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 6, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(6, insets.top);
				assertEquals(6, insets.left);
				assertEquals(6, insets.bottom);
				assertEquals(6, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 7 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_7_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 7, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(7, insets.top);
				assertEquals(7, insets.left);
				assertEquals(7, insets.bottom);
				assertEquals(7, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 8 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_8_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 8, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(8, insets.top);
				assertEquals(8, insets.left);
				assertEquals(8, insets.bottom);
				assertEquals(8, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 9 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_9_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 9, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(9, insets.top);
				assertEquals(9, insets.left);
				assertEquals(9, insets.bottom);
				assertEquals(9, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 10 and an inner thickness of 0.
		*/
		@Test
		public void testGetBorderInsets_10_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 10, 0);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(10, insets.top);
				assertEquals(10, insets.left);
				assertEquals(10, insets.bottom);
				assertEquals(10, insets.right);
		}
		
}

// ConditionalBorder_2Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_2Test {
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 1 and an inner thickness of 1.
		*/
		@Test
		public void testGetBorderInsets_1_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(2, insets.top);
				assertEquals(2, insets.left);
				assertEquals(2, insets.bottom);
				assertEquals(2, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 2 and an inner thickness of 1.
		*/
		@Test
		public void testGetBorderInsets_2_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 1);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(3, insets.top);
				assertEquals(3, insets.left);
				assertEquals(3, insets.bottom);
				assertEquals(3, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 3 and an inner thickness of 1.
		*/
		@Test
		public void testGetBorderInsets_3_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 3, 1);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(4, insets.top);
				assertEquals(4, insets.left);
				assertEquals(4, insets.bottom);
				assertEquals(4, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 4 and an inner thickness of 1.
		*/
		@Test
		public void testGetBorderInsets_4_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 4, 1);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(5, insets.top);
				assertEquals(5, insets.left);
				assertEquals(5, insets.bottom);
				assertEquals(5, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 5 and an inner thickness of 1.
		*/
		@Test
		public void testGetBorderInsets_5_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 5, 1);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(6, insets.top);
				assertEquals(6, insets.left);
				assertEquals(6, insets.bottom);
				assertEquals(6, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 6 and an inner thickness of 1.
		*/
		@Test
		public void testGetBorderInsets_6_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 6, 1);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(7, insets.top);
				assertEquals(7, insets.left);
				assertEquals(7, insets.bottom);
				assertEquals(7, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 7 and an inner thickness of 1.
		*/
		@Test
		public void testGetBorderInsets_7_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 7, 1);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(8, insets.top);
				assertEquals(8, insets.left);
				assertEquals(8, insets.bottom);
				assertEquals(8, insets.right);
		}
		
		/**
		* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
		* The test case tests the border insets for a border with a thickness of 8 and an inner thickness of 1.
		*/
		@Test
		public void testGetBorderInsets_8_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 8, 1);
				Insets insets = new Insets(0, 0, 0, 0);
				border.getBorderInsets(null, insets);
				assertEquals(9, insets.top);
				