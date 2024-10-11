// ConditionalBorderTest.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorderTest {

	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 0);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(1, insets.left);
		assertEquals(1, insets.top);
		assertEquals(1, insets.right);
		assertEquals(1, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets2() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(2, insets.left);
		assertEquals(2, insets.top);
		assertEquals(2, insets.right);
		assertEquals(2, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets3() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 2);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(3, insets.left);
		assertEquals(3, insets.top);
		assertEquals(3, insets.right);
		assertEquals(3, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets4() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 3);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(4, insets.left);
		assertEquals(4, insets.top);
		assertEquals(4, insets.right);
		assertEquals(4, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets5() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 4);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(5, insets.left);
		assertEquals(5, insets.top);
		assertEquals(5, insets.right);
		assertEquals(5, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets6() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 5);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(6, insets.left);
		assertEquals(6, insets.top);
		assertEquals(6, insets.right);
		assertEquals(6, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets7() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 6);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(7, insets.left);
		assertEquals(7, insets.top);
		assertEquals(7, insets.right);
		assertEquals(7, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets8() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 7);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(8, insets.left);
		assertEquals(8, insets.top);
		assertEquals(8, insets.right);
		assertEquals(8, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets9() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 8);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(9, insets.left);
		assertEquals(9, insets.top);
		assertEquals(9, insets.right);
		assertEquals(9, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Expected result: {@link Insets} object with left, top, right and bottom values equal to the thickness of the border.
	*/
	@Test
	public void testGetBorderInsets10() {
		ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 9);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(10, insets.left);
		assertEquals(10, insets.top);
		assertEquals(10, insets.right);
		assertEquals(10, insets.bottom);
	}
}