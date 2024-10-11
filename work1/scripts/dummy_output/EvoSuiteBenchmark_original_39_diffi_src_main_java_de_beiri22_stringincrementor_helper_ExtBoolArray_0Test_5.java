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
		 * Test method for {@link de.beiri22.stringincrementor.helper.ExtBoolArray#isFalse(int, int)}.
		 * @jmx.broken NoBoolArray
		 * @jmx.details An Index
		 * @jmx.note True, if there are no False-Werte.
		 * @jmx.optional Description
		 */
	@Test
	public void isFalse_1_true() {
		ExtBoolArray s = new ExtBoolArray(1);
		assertFalse(s.isFalse(0, 0));
	}
	
	/**
	 * Test method for {@link de.beiri22.stringincrementor.helper.ExtBoolArray#isFalse(int, int)}.
	 * @jmx.broken NoBoolArray
	 * @jmx.details An Index
	 * @jmx.note False, if there are all False-Werte.
	 * @jmx.optional Description
		 * @jmx.optional
		 */
	@Test(expected = NoBooleanArrayException.class)
	public void isFalse_1_false() {}


	/**
	 * Test method for {@link de.beiri22.stringincrementor.helper.ExtBoolArray#left()}.
	 * @jmx.broken NoBoolArray
	 * @jmx.details void
	 * @jmx.optional Description
	 * @jmx.optional
	 */
	@Test(expected = NoBoolArrayException.class)
	public void left() {}

}
// ExtBoolArray.java