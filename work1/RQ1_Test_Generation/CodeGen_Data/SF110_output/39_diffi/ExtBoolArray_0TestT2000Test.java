// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {

	@Test
	/**
	 * Tests the <code>isFalse()</code> method of the {@link ExtBoolArray} class.
	 */
	public void test() {
		ExtBoolArray b = new ExtBoolArray(5);
		b.setTrue(0, 2);

		assertTrue(!b.isFalse(0, 0));
		assertTrue(!b.isFalse(0, 0));
		assertTrue(!b.isFalse(0, true));
		assertTrue(!b.isFalse(1, true));
		assertTrue(!b.isFalse(1, false));

		assertTrue(b.isFalse(2, false));
		assertTrue(b.isFalse(1, 2));
		assertTrue(b.isFalse(0, 1));
		assertTrue(b.isFalse(0, false));
		assertTrue(b.isFalse(3, 1));
		assertTrue(b.isFalse(2, 0));
		assertTrue(b.isFalse(4, false));

		assertTrue(b.isFalse(5, 2));
		assertTrue(b.isFalse(5, -1));
		assertTrue(b.isFalse(4, 2));
	}
}

// ExtBoolArray_1Test.java
