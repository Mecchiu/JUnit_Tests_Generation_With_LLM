// Maximum1Test.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains one unit test case for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

protected Maximum1Test() {
	}
		
	/**
	 * Unit test for maximum1.
	 */
	@Test
	public void test() {
		// TODO Auto-generated method stub
		List<Integer>  list = new ArrayList<>();
		for (int i = 0; i < 3; ++i) {
			list.add(i);
		}
	    assertEquals(3, maximum(list, 3).size());

        List<Integer>  list1 = new ArrayList<>();
        for (int k = 1; k < 50; ++k) {
            list1.add(k);
        }

    	list = new ArrayList<>();
    	list.add(4);
    	assertEquals(4, maximum(list, 3).size());
    	
    	list.add(4);
    	list.add(5);
    	list.add(4);
    	assertEquals(30, maximum(list, 3).size());
    	
    	list.add(4);
    	list.add(5);
    	list1.add(6);
    	assertEquals(7, maximum(list1, 3).size());

	
		list1 = new ArrayList<>();
        for (int k = 1; k < 50; ++k) {
            list1.add(k);
        }
        int sum1 = 0;
        int max1 = 0;
        list = new ArrayList<>();
        list1.add(4);
        for (int k = 1; k < 50; k ++) {
            list.add(k);
            sum1 += k;
            max1 = Math.max(sum1, max1);
            list1.add(k);
        }
        list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(4);
    	assertEquals(50, max1);
        list.add(5);
    	list.add(4);
    	list.add(5);
    	assertEquals(50, list.size());
    }


}
