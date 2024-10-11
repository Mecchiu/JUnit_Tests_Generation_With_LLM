// SumSquares1Test.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains one unit test case for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
// SumSquares1.java
package scenario1;

import java.util.ArrayList;
import java.util.List;

class SumSquares1 {

    public static int sumSquares(List<Object> lst) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                result.add((int) lst.get(i) * (int) lst.get(i));
            } else if (i % 4 == 0 && i % 3!= 0) {
                result.add((int) lst.get(i) * (int) lst.get(i) * (int) lst.get(i));
            } else {
                result.add((int) lst.get(i));
            }
        }
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
        return sum;
    }
}

// SumSquares1Test.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains one unit test case for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
		
	/**
	 * Test for the <code>sumSquares(List)</code> method.
	*/
	@Test
	void testSumSquares1() {
		List<Object> list = new ArrayList<Object>();
		List<Integer> list1 = new ArrayList<Integer>();
		list.add(1);
		list1.add((int) 1);
		list1.add((int) 2);
		list1.add((int) 3);
		list1.add((int) 4);
	
		assertEquals(2, sumSquares(list));
		assertEquals(4, sumSquares(list1));
	}
	
	/**
	* Test for the <code>sumSquares(List, List)</code> method.
	*/
	@Test
	void testSumSquares1b() {
		List<Object> list = new ArrayList<Object>();
		List<Integer> list1 = new ArrayList<Integer>();
		list.add(1);
		list1.add((int) 1);
		list1.add((int) 2);
		list1.add((int) 3);
		list1.add((int) 4);
	
		assertEquals(4, sumSquares(list, list1));
	}
}
