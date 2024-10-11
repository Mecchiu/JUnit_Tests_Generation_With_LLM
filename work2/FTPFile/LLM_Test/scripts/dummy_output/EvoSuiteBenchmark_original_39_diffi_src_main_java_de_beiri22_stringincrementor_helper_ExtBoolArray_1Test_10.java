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
	void testLeft() {

		boolean[] tmp = null;

		assertThrows(IndexOutOfBoundsException.class, () ->

		 {
		   tmp = new boolean[10];
		   getTrue();
		   getTrue();
		 }



		);




	},

}