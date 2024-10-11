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
		
	@Test
    public void test_() {
// Check null input
        if(null == new VerticalBlock(null,0,0,0,0)) {
            throw new IllegalArgumentException("Parameter must not be null");
        }

// Check empty input
        if(null == new VerticalBlock(new ArrayList<Position>(),0,0,0,0)) {
            throw new IllegalArgumentException("Parameter must not be null");
        }
        
// Check non-empty input
        if(null!= new VerticalBlock(new ArrayList<Position>(),0,0,0,0)) {
            throw new IllegalArgumentException("Parameter must not be null or empty");
        }

    }
}