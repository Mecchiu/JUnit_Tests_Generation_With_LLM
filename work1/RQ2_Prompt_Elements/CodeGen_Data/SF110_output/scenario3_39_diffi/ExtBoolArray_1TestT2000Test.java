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
	 * Testmethod for {@link ExtBoolArray#ExtBoolArray(java.lang.String[])}.
	 */
	@Test
    public void whenCreationStringArray_thenNewArray() {
		
		// Act
        String[] a = new String[0];
		
        // Assert
        assertNotNull(a);
        
        // Act
        ExtBoolArray e = new ExtBoolArray(a);
        
        // Assert
        assertArrayEquals(a, e.left().toStringArray());
        
    }
}
