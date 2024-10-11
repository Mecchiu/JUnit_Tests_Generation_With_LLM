// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {

	/**
	 * Test method for {@link ExtBoolArray#isFalse(int, int)}.
	 */
	@Test
	void isFalse_int_int() {
		final int A = 12;
		final boolean B = true;
		final boolean C = false;
		ExtBoolArray.isFalse(A, B);
		
		assertFalse(C);
		assertFalse(B);
		assertFalse(A);
	}

	/**
	 * Test method for {@link ExtBoolArray#isFalse(int, int)}.
	 */
	@Test
	void isFalse_int_boolean() {
		final int A = 12;
		final boolean B = true;
		final boolean C = false;
		ExtBoolArray.isFalse(A, B);
		
		assertFalse(C);
		assertFalse(B);
		assertFalse(A);
	}
	
	/**
	 * Test method for {@link ExtBoolArray#isFalse(int, int)}.
	 */
	@Test
	void isFalse_int_long() {
		final int A = 12;
		final boolean B = true;
		final boolean C = false;
		ExtBoolArray.isFalse(A, B);
		
		assertFalse(C);
		assertFalse(B);
		assertFalse(A);
	}

	/**
	 * Test method for {@link ExtBoolArray#isFalse(long, long)}.
	 */
	@Test
	void isFalse_long_long() {
		final long A = 12;
		final boolean B = true;
		final boolean C = false;
		ExtBoolArray.isFalse(A, B);
		
		assertFalse(C);
		assertFalse(B);
		assertFalse(A);
	}
}
