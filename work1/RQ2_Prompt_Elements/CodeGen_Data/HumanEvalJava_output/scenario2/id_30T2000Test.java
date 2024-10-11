// GetPositiveTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains one unit test case for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

	/**
	* Test case for {@link GetPositive#getPositive(List)}.
	*/	

	@Test
	void testGetPositive(){
		List<Integer> l1  = new ArrayList<Integer>();
		l1.add(1);
		List<Integer> l2  = new ArrayList<Integer>();
		l2.add(2);
		List<Object> l3  = new ArrayList<Object>() {{}, l1, l2 };
		List<Object> l4  = new ArrayList<Object>() {{}, l2, l1 };
		System.out.printf("l1 = %s ", l1);
		System.out.printf("l2 = %s ", l2);
		System.out.printf("l3 = %s ", l3);
		System.out.printf("l4 = %s ", l4);
		System.out.printf("the number of elements %s ", getPositive(l3).size());
		System.out.printf("the number of elements %s ", getPositive(l4).size());
		
		// test getPositive from list of two lists
		assertNotNull(getPositive(l3));
		assertFalse(getPositive(l3).isEmpty());
		assertTrue(getPositive(l3).contains(1));
		assertTrue(getPositive(l4).contains(1));
		
		// test a list of two lists where one list contains a list of two integers
		// and the other contain one integer.
		assertFalse(getPositive(l3).equals(getPositive(l4)));
		
		// test two lists where one list contains a list of two integers
		// and the other contain two numbers.
		List<Object> l5   = new ArrayList<Object>() {{}};
		assertTrue(getPositive(l3).equals(getPositive(l5)));

		// test two lists where one list contains a list of two ints
		// and the other contains three numbers.
		List<Integer> l6   = new ArrayList<Integer>() {{}};
		assertTrue(getPositive(l3).equals(getPositive(l6)));
		
		// test the case where a list contains a single integer as the third
		// element and the list contains two integers.
		List<Object> l7  = new ArrayList<Integer>() {{}};
		assertFalse(getPositive(l3).equals(getPositive(l7)));
	}
}
