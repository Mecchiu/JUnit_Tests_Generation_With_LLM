// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {
		
	private ExtBoolArray beirite;

	/**
	 * @throws Exception should not occur
	 */
	@Test
	public void isFalse_int_int() throws Exception {
		
		beirite = new ExtBoolArray(3);
		
		assertFalse(beirite.left());
	}

}