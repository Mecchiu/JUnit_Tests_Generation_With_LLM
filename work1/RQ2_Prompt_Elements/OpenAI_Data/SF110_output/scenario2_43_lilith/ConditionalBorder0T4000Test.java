// ConditionalBorderTest.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorderTest {

	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is zero and the inner thickness is zero.
	*/
	@Test
	void testGetBorderInsets_ThicknessZero_InnerThicknessZero() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(0);
		border.setInnerThickness(0);
		Insets insets = border.getBorderInsets(null);
		assertEquals(0, insets.top);
		assertEquals(0, insets.left);
		assertEquals(0, insets.bottom);
		assertEquals(0, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is zero and the inner thickness is one.
	*/
	@Test
	void testGetBorderInsets_ThicknessZero_InnerThicknessOne() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(0);
		border.setInnerThickness(1);
		Insets insets = border.getBorderInsets(null);
		assertEquals(1, insets.top);
		assertEquals(1, insets.left);
		assertEquals(1, insets.bottom);
		assertEquals(1, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is one and the inner thickness is zero.
	*/
	@Test
	void testGetBorderInsets_ThicknessOne_InnerThicknessZero() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(0);
		Insets insets = border.getBorderInsets(null);
		assertEquals(1, insets.top);
		assertEquals(1, insets.left);
		assertEquals(1, insets.bottom);
		assertEquals(1, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is one and the inner thickness is one.
	*/
	@Test
	void testGetBorderInsets_ThicknessOne_InnerThicknessOne() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(1);
		Insets insets = border.getBorderInsets(null);
		assertEquals(2, insets.top);
		assertEquals(2, insets.left);
		assertEquals(2, insets.bottom);
		assertEquals(2, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is one and the inner thickness is two.
	*/
	@Test
	void testGetBorderInsets_ThicknessOne_InnerThicknessTwo() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(2);
		Insets insets = border.getBorderInsets(null);
		assertEquals(3, insets.top);
		assertEquals(3, insets.left);
		assertEquals(3, insets.bottom);
		assertEquals(3, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is two and the inner thickness is zero.
	*/
	@Test
	void testGetBorderInsets_ThicknessTwo_InnerThicknessZero() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(0);
		Insets insets = border.getBorderInsets(null);
		assertEquals(2, insets.top);
		assertEquals(2, insets.left);
		assertEquals(2, insets.bottom);
		assertEquals(2, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is two and the inner thickness is one.
	*/
	@Test
	void testGetBorderInsets_ThicknessTwo_InnerThicknessOne() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(1);
		Insets insets = border.getBorderInsets(null);
		assertEquals(3, insets.top);
		assertEquals(3, insets.left);
		assertEquals(3, insets.bottom);
		assertEquals(3, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is two and the inner thickness is two.
	*/
	@Test
	void testGetBorderInsets_ThicknessTwo_InnerThicknessTwo() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(2);
		Insets insets = border.getBorderInsets(null);
		assertEquals(4, insets.top);
		assertEquals(4, insets.left);
		assertEquals(4, insets.bottom);
		assertEquals(4, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is two and the inner thickness is three.
	*/
	@Test
	void testGetBorderInsets_ThicknessTwo_InnerThicknessThree() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(3);
		Insets insets = border.getBorderInsets(null);
		assertEquals(5, insets.top);
		assertEquals(5, insets.left);
		assertEquals(5, insets.bottom);
		assertEquals(5, insets.right);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component)} method.
	* Test case for the case when the thickness is three and the inner thickness is three.
	*/
	@Test
	void testGetBorderInsets_ThicknessThree_InnerThicknessThree() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(3);
		border.setInnerThickness(3);
		Insets insets = border.getBorderInsets(null);
		assertEquals(6, insets.top);
		assertEquals(6, insets.left);
		assertEquals(6, insets.bottom);
		assertEquals(6, insets.right);
	}
	
}