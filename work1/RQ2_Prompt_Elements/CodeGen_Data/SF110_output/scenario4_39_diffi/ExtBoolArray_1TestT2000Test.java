// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {

	@Test
	    public void test_left_Null() {
	        ExtBoolArray arr = new ExtBoolArray(); assertNull(arr.left());
	    }

	    @Test
	    public void test_left() {
	        ExtBoolArray arr = new ExtBoolArray(3);
	        assertEquals(3, arr.len());

	        for (int i = 0; i < 2; i++) {
	                obj:
	            {
	                	if (i==0) {
	                		arr.setTrue(0, 1);
	                	}
	                else {
	                		arr.setFalse(0, 1);
	                	}
	            }
	        }

	        assertEquals(3, arr.len());
	        assertTrue(3 == arr.left());
	        assertEquals(1, arr.len());
	    }

}
