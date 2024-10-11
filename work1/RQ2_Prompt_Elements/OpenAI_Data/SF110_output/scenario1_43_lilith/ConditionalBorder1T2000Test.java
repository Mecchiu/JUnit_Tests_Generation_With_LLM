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
	* Test data: thickness = 0, innerThickness = 0.
	* Expected result: insets.left = 0, insets.top = 0, insets.right = 0, insets.bottom = 0.
	*/
	@Test
	void testGetBorderInsets_1() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(0);
		border.setInnerThickness(0);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(0, insets.left);
		assertEquals(0, insets.top);
		assertEquals(0, insets.right);
		assertEquals(0, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: thickness = 1, innerThickness = 0.
	* Expected result: insets.left = 1, insets.top = 1, insets.right = 1, insets.bottom = 1.
	*/
	@Test
	void testGetBorderInsets_2() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(0);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(1, insets.left);
		assertEquals(1, insets.top);
		assertEquals(1, insets.right);
		assertEquals(1, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: thickness = 0, innerThickness = 1.
	* Expected result: insets.left = 1, insets.top = 1, insets.right = 1, insets.bottom = 1.
	*/
	@Test
	void testGetBorderInsets_3() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(0);
		border.setInnerThickness(1);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(1, insets.left);
		assertEquals(1, insets.top);
		assertEquals(1, insets.right);
		assertEquals(1, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: thickness = 1, innerThickness = 1.
	* Expected result: insets.left = 2, insets.top = 2, insets.right = 2, insets.bottom = 2.
	*/
	@Test
	void testGetBorderInsets_4() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(1);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(2, insets.left);
		assertEquals(2, insets.top);
		assertEquals(2, insets.right);
		assertEquals(2, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: thickness = -1, innerThickness = 0.
	* Expected result: insets.left = 0, insets.top = 0, insets.right = 0, insets.bottom = 0.
	*/
	@Test
	void testGetBorderInsets_5() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(-1);
		border.setInnerThickness(0);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(0, insets.left);
		assertEquals(0, insets.top);
		assertEquals(0, insets.right);
		assertEquals(0, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: thickness = 0, innerThickness = -1.
	* Expected result: insets.left = 0, insets.top = 0, insets.right = 0, insets.bottom = 0.
	*/
	@Test
	void testGetBorderInsets_6() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(0);
		border.setInnerThickness(-1);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(0, insets.left);
		assertEquals(0, insets.top);
		assertEquals(0, insets.right);
		assertEquals(0, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: thickness = -1, innerThickness = -1.
	* Expected result: insets.left = 0, insets.top = 0, insets.right = 0, insets.bottom = 0.
	*/
	@Test
	void testGetBorderInsets_7() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(-1);
		border.setInnerThickness(-1);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(0, insets.left);
		assertEquals(0, insets.top);
		assertEquals(0, insets.right);
		assertEquals(0, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: thickness = -1, innerThickness = 1.
	* Expected result: insets.left = 1, insets.top = 1, insets.right = 1, insets.bottom = 1.
	*/
	@Test
	void testGetBorderInsets_8() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(-1);
		border.setInnerThickness(1);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(1, insets.left);
		assertEquals(1, insets.top);
		assertEquals(1, insets.right);
		assertEquals(1, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: thickness = 1, innerThickness = -1.
	* Expected result: insets.left = 1, insets.top = 1, insets.right = 1, insets.bottom = 1.
	*/
	@Test
	void testGetBorderInsets_9() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(