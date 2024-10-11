// LargestSmallestIntegersTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

	@Test
	void testLargestSmallestIntegers() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(2);
		lst.add(4);
		lst.add(1);
		lst.add(3);
		lst.add(5);
		lst.add(7);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(0);
		expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(2);
		lst.add(4);
		lst.add(1);
		lst.add(3);
		lst.add(5);
		lst.add(7);
		lst.add(0);
		expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(3);
		lst.add(2);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(-2);
		expected = new ArrayList<Integer>();
		expected.add(-2);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(4);
		lst.add(5);
		lst.add(3);
		lst.add(6);
		lst.add(2);
		lst.add(7);
		lst.add(-7);
		expected = new ArrayList<Integer>();
		expected.add(-7);
		expected.add(2);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(7);
		lst.add(3);
		lst.add(8);
		lst.add(4);
		lst.add(9);
		lst.add(2);
		lst.add(5);
		lst.add(-9);
		expected = new ArrayList<Integer>();
		expected.add(-9);
		expected.add(2);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(0);
		expected = new ArrayList<Integer>();
		expected.add(null);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-3);
		lst.add(-5);
		lst.add(-6);
		expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(-1);
		lst.add(-3);
		lst.add(-5);
		lst.add(-6);
		lst.add(0);
		expected = new ArrayList<Integer>();
		expected.add(-1);
		expected.add(null);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(-6);
		lst.add(-4);
		lst.add(-4);
		lst.add(-3);
		lst.add(1);
		expected = new ArrayList<Integer>();
		expected.add(-3);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
		
		lst = new ArrayList<Object>();
		lst.add(-6);
		lst.add(-4);
		lst.add(-4);
		lst.add(-3);
		lst.add(-100);
		lst.add(1);
		expected = new ArrayList<Integer>();
		expected.add(-3);
		expected.add(1);
		assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
	}
}