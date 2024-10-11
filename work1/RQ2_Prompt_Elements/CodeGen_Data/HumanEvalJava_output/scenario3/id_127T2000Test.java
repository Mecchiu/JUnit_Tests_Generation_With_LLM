// IntersectionTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains one unit test case for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {

	@Test
	void interval1() throws Exception {
		List<Integer> intervalA = null;
		List<Integer> intervalB = null;
		assertTrue(intersection(intervalA, intervalB).equals("YES"));
	}
	
	@Test
	void interval2() throws Exception {
		List<Integer> intervalA = null;
		List<Integer> intervalB = null;
		assertTrue(intersection(intervalA, intervalB).equals("NO"));
	}
	
	@Test
	void interval3() throws Exception {
		List<Integer> intervalA = null;
		List<Integer> intervalB = null;
		assertTrue(intersection(intervalA, intervalB).equals("YES"));
	}	
	
	@Test
	void test1() throws Exception {
		List<Integer> interval = null;
		List<Integer> interval2 = null;
		
		boolean expectedValue = true;
		String output = intersection(interval, interval2).equals("YES")? "YES" : "NO";
		boolean actualValue = true;
		
		assertTrue(expectedValue);
		assertFalse(output.equals("NO"));
		assertTrue(output.equals(expectedValue));
	}
	
	@Test
	void test2() throws Exception {
		List<Integer> interval = null;
		List<Integer> interval2 = null;
		
		Boolean expectedValue = true;
		String output = intersection(interval, interval2).equals("YES")? "YES" : "NO";
		Boolean actualValue = true;
		
		assertTrue(expectedValue);
		assertFalse(output.equals("NO"));
		assertTrue(actualValue);
	}
}
