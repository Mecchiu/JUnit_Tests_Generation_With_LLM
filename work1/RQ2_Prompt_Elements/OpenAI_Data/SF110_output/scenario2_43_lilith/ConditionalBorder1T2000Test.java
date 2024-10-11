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
	* Test data: {@link ConditionalBorder#thickness} = 0, {@link ConditionalBorder#innerThickness} = 0.
	* Expected result: {@link Insets} with all values set to 0.
	*/
	@Test
	public void testGetBorderInsets_0_0() {
		ConditionalBorder border = new ConditionalBorder();
		border.thickness = 0;
		border.innerThickness = 0;
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(0, insets.left);
		assertEquals(0, insets.top);
		assertEquals(0, insets.right);
		assertEquals(0, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#thickness} = 1, {@link ConditionalBorder#innerThickness} = 0.
	* Expected result: {@link Insets} with all values set to 1.
	*/
	@Test
	public void testGetBorderInsets_1_0() {
		ConditionalBorder border = new ConditionalBorder();
		border.thickness = 1;
		border.innerThickness = 0;
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(1, insets.left);
		assertEquals(1, insets.top);
		assertEquals(1, insets.right);
		assertEquals(1, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#thickness} = 0, {@link ConditionalBorder#innerThickness} = 1.
	* Expected result: {@link Insets} with all values set to 1.
	*/
	@Test
	public void testGetBorderInsets_0_1() {
		ConditionalBorder border = new ConditionalBorder();
		border.thickness = 0;
		border.innerThickness = 1;
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(1, insets.left);
		assertEquals(1, insets.top);
		assertEquals(1, insets.right);
		assertEquals(1, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#thickness} = 1, {@link ConditionalBorder#innerThickness} = 1.
	* Expected result: {@link Insets} with all values set to 2.
	*/
	@Test
	public void testGetBorderInsets_1_1() {
		ConditionalBorder border = new ConditionalBorder();
		border.thickness = 1;
		border.innerThickness = 1;
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(2, insets.left);
		assertEquals(2, insets.top);
		assertEquals(2, insets.right);
		assertEquals(2, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#thickness} = -1, {@link ConditionalBorder#innerThickness} = 0.
	* Expected result: {@link Insets} with all values set to 0.
	*/
	@Test
	public void testGetBorderInsets_minus1_0() {
		ConditionalBorder border = new ConditionalBorder();
		border.thickness = -1;
		border.innerThickness = 0;
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(0, insets.left);
		assertEquals(0, insets.top);
		assertEquals(0, insets.right);
		assertEquals(0, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#thickness} = 0, {@link ConditionalBorder#innerThickness} = -1.
	* Expected result: {@link Insets} with all values set to 0.
	*/
	@Test
	public void testGetBorderInsets_0_minus1() {
		ConditionalBorder border = new ConditionalBorder();
		border.thickness = 0;
		border.innerThickness = -1;
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(0, insets.left);
		assertEquals(0, insets.top);
		assertEquals(0, insets.right);
		assertEquals(0, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#thickness} = -1, {@link ConditionalBorder#innerThickness} = -1.
	* Expected result: {@link Insets} with all values set to 0.
	*/
	@Test
	public void testGetBorderInsets_minus1_minus1() {
		ConditionalBorder border = new ConditionalBorder();
		border.thickness = -1;
		border.innerThickness = -1;
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(0, insets.left);
		assertEquals(0, insets.top);
		assertEquals(0, insets.right);
		assertEquals(0, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#thickness} = -1, {@link ConditionalBorder#innerThickness} = 1.
	* Expected result: {@link Insets} with all values set to 1.
	*/
	@Test
	public void testGetBorderInsets_minus1_1() {
		ConditionalBorder border = new ConditionalBorder();
		border.thickness = -1;
		border.innerThickness = 1;
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(1, insets.left);
		assertEquals(1, insets.top);
		assertEquals(1, insets.right);
		assertEquals(1, insets.bottom);
	}
	
	/**
	* Test case for {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* Test data: {@link ConditionalBorder#thickness} = 1, {@link ConditionalBorder#innerThickness} = -1.
	* Expected result: {@link Insets} with all values set to 1.
	*/
	