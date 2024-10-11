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
	 * Testcase der {@link ExtBoolArray#setTrue(int, int)}, und das {@link ExtBoolArray#left()}.
	 */
	@Test
	final public void setTrue() {
		boolean[][] bTestArray = {{true}, {false}};

		ExtBoolArray extentrue = new ExtBoolArray(3);


		BoolArrayExtendedTest.test(bTestArray);
		assertTrue(extrue.left());
		assertNull(extrue.getTrue());
		assertFalse(BoolArrayExtendedTest.findTrue(extrue, true));
	}
	
//	@Test
//	final public void findTrue() {
//		ExtBoolArray extentrue = new ExtBoolArray(2);
//
//		assertTrue(extrue.left());
//		assertNull(extrue.getTrue());
//		assertFalse(extrue.findTrue(false));
//	}

}