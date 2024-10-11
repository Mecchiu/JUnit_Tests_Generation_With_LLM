// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {
		
	/**
	 * Test method for {@link ExtBoolArray#left()}
	 */
	@Test
	public void testLeft() {
		ExtBoolArray _ = new ExtBoolArray();
		assertTrue(_.left() == 0);
	}

}