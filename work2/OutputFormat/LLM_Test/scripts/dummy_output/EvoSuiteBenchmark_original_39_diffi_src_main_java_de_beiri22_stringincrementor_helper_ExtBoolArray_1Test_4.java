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
     * SetTest for {@link ExtBoolArray#left()}.
     * Vergleich nicht durch den Test.
     */
    @Test
    public void setTest(){
        final int[] data = {0,1,1,2,0,1,2};

        final ExtBoolArray ob = new ExtBoolArray(data);

        assertTrue(ob.left() == 5);

        final int i;
        for(i = 0; i < 5; i++)
                assertTrue(i + 1 == ob.left(i), 0);

        for(i= 0; i < data.length; i++)
            assertTrue(i + 1 == ob.left(i), 0);

        final int j;
        for(j = 0; j < 0; j++)
            assertTrue(j + 1 == isFalse(1, 1, 1, 0), 0);
    }
}