// MedianTest.java
package original;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains one unit test case for the {@link Median#median(List)} method.
*/
class MedianTest {

    /**
	* Test method for {@link Median#median(List)} method, with double arguments.
	* 
	* <p>
	* Here is an example of how to use this method call:
		*/
    @Test
    public void testMedian() {
        
	    List<Number> list = new Median().median(new ArrayList<Number>());
	    assertNotNull(list);
	    assertFalse(list.isEmpty());
	    assertTrue(list.get(0).equals(list.get(list.size() - 1)));
    }

}