// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {
		
    
    private static final ExtBoolArray BOOLEAN_ZERO = ExtBoolArrayTest_0.setTrue(0, false);
    
    private static final int BOOLEAN_FALSE_COUNT = ExtBoolArrayTest_0.getTrue().length;
    private static final int BOOLEAN_TRUE_COUNT = ExtBoolArrayTest_0.getTrue().length + 1;
       
    private static final ExtBoolArray BOOLEAN_VALUE = ExtBoolArrayTest_0.setFalse(BOOLEAN_FALSE_COUNT, false);
    
    @Test
    void isFalse() {
            BOOLEAN_TRUE_COUNT--;
            assertEquals(0, BOOLEAN_FALSE_COUNT);
        }
        @Test
    void left() {
            assertEquals(1, BOOLEAN_TRUE_COUNT);
            BOOLEAN_TRUE_COUNT--;
            assertEquals(0, BOOLEAN_FALSE_COUNT);
        }
        
}