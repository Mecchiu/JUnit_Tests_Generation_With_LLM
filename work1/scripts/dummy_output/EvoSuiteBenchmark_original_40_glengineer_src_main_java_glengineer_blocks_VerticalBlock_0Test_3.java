// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains one unit test case for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {
		  
    /**
     * Verifies the behaviour of the abstract method
     * {@code extravl} in the constructor.
     */
    @Test
    void testExtravl() {
        VerticalBlock b1 = new VerticalBlock(Scheme.A, 12,  3, 12,  9);
        assertFalse(b1 instanceof VerticalBlock);
    }
    
    /**
     * Verifies the behaviour of the abstract method
     * {@code extravl} in the {@code extractSequentialSubblocks()} method.
     */
    @Test
    void testExtravl2() {
        VerticalBlock b1 = new VerticalBlock(Scheme.A, 1,  7,  9,  5);
}
}