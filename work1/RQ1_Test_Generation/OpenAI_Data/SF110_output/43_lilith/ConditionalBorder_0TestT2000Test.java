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
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(1, insets.top);
				assertEquals(1, insets.left);
				assertEquals(1, insets.bottom);
				assertEquals(1, insets.right);
		}
		
		@Test
		void test_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 2, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(2, insets.top);
				assertEquals(2, insets.left);
				assertEquals(2, insets.bottom);
				assertEquals(2, insets.right);
		}
		
		@Test
		void test_2() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 3, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(3, insets.top);
				assertEquals(3, insets.left);
				assertEquals(3, insets.bottom);
				assertEquals(3, insets.right);
		}
		
		@Test
		void test_3() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 4, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(4, insets.top);
				assertEquals(4, insets.left);
				assertEquals(4, insets.bottom);
				assertEquals(4, insets.right);
		}
		
		@Test
		void test_4() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 5, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(5, insets.top);
				assertEquals(5, insets.left);
				assertEquals(5, insets.bottom);
				assertEquals(5, insets.right);
		}
		
		@Test
		void test_5() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 6, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(6, insets.top);
				assertEquals(6, insets.left);
				assertEquals(6, insets.bottom);
				assertEquals(6, insets.right);
		}
		
		@Test
		void test_6() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 7, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(7, insets.top);
				assertEquals(7, insets.left);
				assertEquals(7, insets.bottom);
				assertEquals(7, insets.right);
		}
		
		@Test
		void test_7() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 8, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(8, insets.top);
				assertEquals(8, insets.left);
				assertEquals(8, insets.bottom);
				assertEquals(8, insets.right);
		}
		
		@Test
		void test_8() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 9, 0);
				Insets insets = border.getBorderInsets(null);
				assertEquals(9, insets.top);
				assertEquals(9, insets.left);
				assertEquals(9, insets.bottom);
				assertEquals(9, insets.right);
		}
		
		@Test
		void test_9() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 10, 0);
				Insets insets = border.getBorderInsets(null);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorder_1Test {
		
		@Test
		void test_0() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 1);
				Insets insets = border.getBorderInsets(null);
				assertEquals(1, insets.top);
				assertEquals(1, insets.left);
				assertEquals(1, insets.bottom);
				assertEquals(1, insets.right);
		}
		
		@Test
		void test_1() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 2);
				Insets insets = border.getBorderInsets(null);
				assertEquals(2, insets.top);
				assertEquals(2, insets.left);
				assertEquals(2, insets.bottom);
				assertEquals(2, insets.right);
		}
		
		@Test
		void test_2() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 3);
				Insets insets = border.getBorderInsets(null);
				assertEquals(3, insets.top);
				assertEquals(3, insets.left);
				assertEquals(3, insets.bottom);
				assertEquals(3, insets.right);
		}
		
		@Test
		void test_3() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 4);
				Insets insets = border.getBorderInsets(null);
				assertEquals(4, insets.top);
				assertEquals(4, insets.left);
				assertEquals(4, insets.bottom);
				assertEquals(4, insets.right);
		}
		
		@Test
		void test_4() {
				ConditionalBorder border = new ConditionalBorder(Color.BLACK, 0, 5);
				Insets insets = border.getBorderInsets(null);
				assertEquals(5, insets