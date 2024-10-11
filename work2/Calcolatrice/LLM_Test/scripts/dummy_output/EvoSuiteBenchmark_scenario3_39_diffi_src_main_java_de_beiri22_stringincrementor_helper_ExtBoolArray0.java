// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArrayTest {
		
	@Test
	void testIsFalse() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		
		// Test case 1
		assertTrue(extBoolArray.isFalse(0, 0));
		
		// Test case 2
		assertTrue(extBoolArray.isFalse(0, 1));
		
		// Test case 3
		assertTrue(extBoolArray.isFalse(0, 2));
		
		// Test case 4
		assertTrue(extBoolArray.isFalse(0, 3));
		
		// Test case 5
		assertTrue(extBoolArray.isFalse(0, 4));
		
		// Test case 6
		assertTrue(extBoolArray.isFalse(0, 5));
		
		// Test case 7
		assertTrue(extBoolArray.isFalse(0, 6));
		
		// Test case 8
		assertTrue(extBoolArray.isFalse(0, 7));
		
		// Test case 9
		assertTrue(extBoolArray.isFalse(0, 8));
		
		// Test case 10
		assertTrue(extBoolArray.isFalse(0, 9));
	}
}