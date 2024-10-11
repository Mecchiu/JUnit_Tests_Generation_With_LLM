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
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 0 and an inner thickness of 0.
	* The expected result is an insets object with all values set to 0.
	*/
	@Test
	void testGetBorderInsets_Thickness0_InnerThickness0() {
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
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 1 and an inner thickness of 0.
	* The expected result is an insets object with all values set to 1.
	*/
	@Test
	void testGetBorderInsets_Thickness1_InnerThickness0() {
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
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 0 and an inner thickness of 1.
	* The expected result is an insets object with all values set to 1.
	*/
	@Test
	void testGetBorderInsets_Thickness0_InnerThickness1() {
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
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 1 and an inner thickness of 1.
	* The expected result is an insets object with all values set to 2.
	*/
	@Test
	void testGetBorderInsets_Thickness1_InnerThickness1() {
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
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 2 and an inner thickness of 1.
	* The expected result is an insets object with all values set to 3.
	*/
	@Test
	void testGetBorderInsets_Thickness2_InnerThickness1() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(1);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(3, insets.left);
		assertEquals(3, insets.top);
		assertEquals(3, insets.right);
		assertEquals(3, insets.bottom);
	}
	
	/**
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 1 and an inner thickness of 2.
	* The expected result is an insets object with all values set to 3.
	*/
	@Test
	void testGetBorderInsets_Thickness1_InnerThickness2() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(1);
		border.setInnerThickness(2);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(3, insets.left);
		assertEquals(3, insets.top);
		assertEquals(3, insets.right);
		assertEquals(3, insets.bottom);
	}
	
	/**
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 2 and an inner thickness of 2.
	* The expected result is an insets object with all values set to 4.
	*/
	@Test
	void testGetBorderInsets_Thickness2_InnerThickness2() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(2);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(4, insets.left);
		assertEquals(4, insets.top);
		assertEquals(4, insets.right);
		assertEquals(4, insets.bottom);
	}
	
	/**
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 3 and an inner thickness of 2.
	* The expected result is an insets object with all values set to 5.
	*/
	@Test
	void testGetBorderInsets_Thickness3_InnerThickness2() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(3);
		border.setInnerThickness(2);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(5, insets.left);
		assertEquals(5, insets.top);
		assertEquals(5, insets.right);
		assertEquals(5, insets.bottom);
	}
	
	/**
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 2 and an inner thickness of 3.
	* The expected result is an insets object with all values set to 5.
	*/
	@Test
	void testGetBorderInsets_Thickness2_InnerThickness3() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(2);
		border.setInnerThickness(3);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(5, insets.left);
		assertEquals(5, insets.top);
		assertEquals(5, insets.right);
		assertEquals(5, insets.bottom);
	}
	
	/**
	* Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
	* The test case tests the method with a thickness of 3 and an inner thickness of 3.
	* The expected result is an insets object with all values set to 6.
	*/
	@Test
	void testGetBorderInsets_Thickness3_InnerThickness3() {
		ConditionalBorder border = new ConditionalBorder();
		border.setThickness(3);
		border.setInnerThickness(3);
		Insets insets = new Insets(0, 0, 0, 0);
		border.getBorderInsets(null, insets);
		assertEquals(6, insets.left);
		assertEquals(6, insets.top);
		assertEquals(6, insets.right);
		assertEquals(6, insets.bottom);
	}
	
}