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
    public void testIsFalse_int_int() {
        int arr1[] = new int[10];
        boolean expected=false;
        boolean actual=isFalse(0, 10);
        assertEquals(expected, actual);
    }
}
