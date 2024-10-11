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
	* Test method for {@link ExtBoolArray#left()} - method returns wrong.
	*/
	@Test
    void shouldReturnFalseWhenFirstIterationSucceeds() {
		ExtBoolArray werte = new ExtBoolArray();
		werte.setTrue(1,2);

		assertEquals(false, werte.left());

	}

    /**
	* Test method for {@link ExtBoolArray#left()} - method returns wrong.
	*/
	@Test
    void shouldReturnFalseWhenSecondIterationSucceeds() {
		ExtBoolArray werte = new ExtBoolArray();

    String[] array = {"First", "NotFirst", "Second"};

    werte.setTrue(array);
    
    assertEquals(false, werte.left());
	}
	
}