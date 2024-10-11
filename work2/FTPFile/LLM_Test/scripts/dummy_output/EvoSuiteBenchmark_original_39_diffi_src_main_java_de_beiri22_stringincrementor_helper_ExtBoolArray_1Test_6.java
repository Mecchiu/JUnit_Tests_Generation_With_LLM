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
    * Für Testcase zum Erzeugen einer String angepasst und dann das Element
    * hinzuig genotet
    * TODO: Testcase über prözimalem überhaupt (Werte) (2) (3) => (1) (2) -> (1) (2)
    */
	@Test
	    public void testExtBoolArray_1() {
		
		boolean[] orig = {false, false, true};
		ExtBoolArray arr = new ExtBoolArray(4);
		
		arr.setTrue(0, false);
		arr.setTrue(2, false);
		assertEquals(true, arr.isFalse(0, 2));
		arr.setTrue(1, false);
		assertEquals(true, arr.isFalse(1, 2));

		if (orig.length == 4) {
    		assertEquals(0, arr.left());
    		assertEquals(2, arr.left());
    		assertEquals(1, arr.left());
    		assertEquals(false, arr.left());
    		
    		assertEquals(true, arr.isFalse(0, 3));
    		assertEquals(true, arr.isFalse(1, 3));
    		assertEquals(true, arr.isFalse(2, 3));
    	}
	}

	/**
    * Testcase.
    * @param e An exception thrown by the {@link #testExtBoolArray_1()} test
    * @see {@link #testExtBoolArray_1()}
	*/
	@Test
	    public void testExtBoolArray_2() {
		boolean orig[] = {false, false, true };
		boolean orig2[] = {false, false, true };
		try {
			boolean orig3[] = {true, true, false };
			boolean orig4[] = {true, true, false };
			boolean expected = false;
			assertEquals(expected, Arrays.binarySearch(orig, expected));
			assertEquals(expected, Arrays.binarySearch(orig2, expected));
			assertEquals(expected, Arrays.binarySearch(orig3, expected));
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			fail();
		}
	    }
}