// PluckTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains one unit test case for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
// Pluck.java
package scenario2;

import java.util.ArrayList;
import java.util.List;

class Pluck {

    /**
     * * "Given an array representing a branch of a tree that has non-negative integer nodes
     * your task is to pluck one of the nodes and return it.
     * The plucked node should be the node with the smallest even value.
     * If multiple nodes with the same smallest even value are found return the node that has smallest index.
     *
     * The plucked node should be returned in a list, [ smallest_value, its index ],
     * If there are no even values or the given array is empty, return [].
     *
     * Constraints:
     * * 1 <= nodes.length <= 10000
     * * 0 <= node.value
     */
    public static List<Object> pluck(List<Object> arr) {
        List<Object> result = new ArrayList<Object>();
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                int value = (Integer) arr.get(i);
                if (value % 2 == 0 && value < min) {
                    min = value;
                    index = i;
                }
            }
        }
        if (index!= -1) {
            result.add(min);
            result.add(index);
        }
        return result;
    }
}

// PluckTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains one unit test case for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
		
	@Test
	public void testPluck() {
	
		int[][] results = new int[][] {{100, 2},{7, 3}};
		List<Object> results2 = new ArrayList<Object>();
		
	
		Object result = Pluck.pluck(results);
		assertTrue(result instanceof Integer);
		assertTrue(result == results.get(1)[0]);
		assertTrue(result == results.get(1)[1]);
		
		
		result = Pluck.pluck(results);
		assertTrue(result instanceof Integer);
		assertTrue(result == results.get(0)[0]);
		assertTrue(result == results.get(0)[1]);
		
		
		result2 = Pluck.pluck(results2);
		assertTrue(result2 instanceof Integer);
		assertTrue(result2 == results2.get((result2-2) % 3));	
	}
}