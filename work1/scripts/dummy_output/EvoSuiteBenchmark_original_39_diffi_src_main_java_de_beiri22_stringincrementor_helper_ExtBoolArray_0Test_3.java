// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {
		

	//TestParameter p0_int: (2, 3);
	@Test
	void test() {
		ExtBoolArray ext = new ExtBoolArray(2);
		assertNull(ext.getTrue());
		ext.setTrue(1, 3);
		assertEquals(3, ext.getTrue().length());
	}
}