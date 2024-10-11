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
		 * Test method for {@link de.beiri22.stringincrementor.helper.ExtBoolArray#left()}.
		 */
		@Test
    public void testLeft() {
    	System.out.println("left");
    	ExtBoolArray extBoolArray = new ExtBoolArray();
    	extBoolArray.setFalse(0, 1);
    	extBoolArray.setTrue(1, 2);
    	assertEquals((Integer) 1, extBoolArray.length());
		}

		/**
		 * Test method for {@link de.beiri22.stringincrementor.helper.ExtBoolArray#innerRight()}.
		 */
		@Test
    public void testInnerRight() {
    	ExtBoolArray extBoolArray = new ExtBoolArray();
    	extBoolArray.setFalse(1, 2);
    	extBoolArray.setTrue(0, 1);
    	extBoolArray.setFalse(0, 2);
    	extBoolArray.setTrue(0, 3);
    	extBoolArray.setTrue(0, 4);
    	assertEquals((Integer) 2, extBoolArray.length());
    	assertEquals((Integer) 3, extBoolArray.innerRight(2).length());
    }

    /**
     * Test method for {@link de.beiri22.stringincrementor.helper.ExtBoolArray#innerRight()}.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testInnerRightExpectedException() {
		new ExtBoolArray().innerRight(-1);
    }

}