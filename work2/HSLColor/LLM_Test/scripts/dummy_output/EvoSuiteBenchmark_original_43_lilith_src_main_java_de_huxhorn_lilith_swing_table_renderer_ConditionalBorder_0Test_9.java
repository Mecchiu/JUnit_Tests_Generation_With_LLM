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
		/**
	 * {@link ConditionalBorder#getBorderInsets(Component)} method test-case, where c is a parameter.
	 * (The condition that must be fulfilled in parameter is that c must be used as a parameter)
	 */
	@Test
	void test_0() {
		Component c1 = testComponent();
		assertEquals(Integer.valueOf(0), new ConditionalBorder().getBorderInsets(c1));
	}
	
	/**
	 * {@link ConditionalBorder#getBorderInsets(Component)} method, where c is a non-parameter condition.
	 */
	@Test(expected = NoClassDefFoundError.class)
	void test_1() {
		testComponent();
	}
	
	/**
	 * Sets up the test.
	 */
	static void initConditionalBorder_1() {
		// Method'setBorder'-method throws class-name.
		new ConditionalBorder().getBorderInsets((Component)null);
		
		// A method 'getBorderInsets'-method throws class-name.
		Border b = ConditionalBorder.class.getDeclaredMethod("getBorderInsets", null);
		try {
			b.getBorderInsets((Component)null);
			fail("should throw NoClassDefFoundError");
		} catch (NoClassDefFoundError e) {
			// Expected result.
		}
	}
	
	/**
	 * Sets up the test.
	 */
	static void initConditionalBorder_2() {
		// No method'setBorder'-method throws class-name.
		new ConditionalBorder().getBorderInsets(null);
	}
	
	/**
	 * Tests the {@link #test()} parameter class.
	 */
	static void testConditionalBorder_1() {
		ConditionalBorder condition = new ConditionalBorder();
		
		assertFalse(condition.getBorderInsets(testComponent()).equals(0));
	}
	
	/**
	 * Tests the getBorderInsets(Component) method.
	 */
	static void testConditionalBorder_2() {
		// No method 'getBorderInsets'-method throws class-name.
		new ConditionalBorder().getBorderInsets(testComponent());
	}
	
	/**
	 * Tests the {@link #getBorderInsets(Component)}.
	 */
	static void getBorderInsets(Component c) {
		// No method 'getBorderInsets'-method throws class-name.
		new ConditionalBorder().getBorderInsets(c);
	}
	
}