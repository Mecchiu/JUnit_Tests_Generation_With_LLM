// ExchangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

	/**
	* Test case 1.
	* The method {@link Exchange#exchange(List, List)} should return "YES"
	* when the first list contains only even numbers and the second list contains only odd numbers.
	*/
	@Test
	void testExchange_1() {
		List<Integer> lst1 = List.of(2, 4, 6, 8, 10);
		List<Integer> lst2 = List.of(1, 3, 5, 7, 9);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 2.
	* The method {@link Exchange#exchange(List, List)} should return "YES"
	* when the first list contains only odd numbers and the second list contains only even numbers.
	*/
	@Test
	void testExchange_2() {
		List<Integer> lst1 = List.of(1, 3, 5, 7, 9);
		List<Integer> lst2 = List.of(2, 4, 6, 8, 10);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 3.
	* The method {@link Exchange#exchange(List, List)} should return "YES"
	* when the first list contains only even numbers and the second list contains only even numbers.
	*/
	@Test
	void testExchange_3() {
		List<Integer> lst1 = List.of(2, 4, 6, 8, 10);
		List<Integer> lst2 = List.of(2, 4, 6, 8, 10);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 4.
	* The method {@link Exchange#exchange(List, List)} should return "YES"
	* when the first list contains only odd numbers and the second list contains only odd numbers.
	*/
	@Test
	void testExchange_4() {
		List<Integer> lst1 = List.of(1, 3, 5, 7, 9);
		List<Integer> lst2 = List.of(1, 3, 5, 7, 9);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 5.
	* The method {@link Exchange#exchange(List, List)} should return "YES"
	* when the first list contains only even numbers and the second list contains only odd numbers.
	*/
	@Test
	void testExchange_5() {
		List<Integer> lst1 = List.of(2, 4, 6, 8, 10);
		List<Integer> lst2 = List.of(1, 3, 5, 7, 9);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 6.
	* The method {@link Exchange#exchange(List, List)} should return "YES"
	* when the first list contains only odd numbers and the second list contains only even numbers.
	*/
	@Test
	void testExchange_6() {
		List<Integer> lst1 = List.of(1, 3, 5, 7, 9);
		List<Integer> lst2 = List.of(2, 4, 6, 8, 10);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 7.
	* The method {@link Exchange#exchange(List, List)} should return "YES"
	* when the first list contains only even numbers and the second list contains only even numbers.
	*/
	@Test
	void testExchange_7() {
		List<Integer> lst1 = List.of(2, 4, 6, 8, 10);
		List<Integer> lst2 = List.of(2, 4, 6, 8, 10);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 8.
	* The method {@link Exchange#exchange(List, List)} should return "YES"
	* when the first list contains only odd numbers and the second list contains only odd numbers.
	*/
	@Test
	void testExchange_8() {
		List<Integer> lst1 = List.of(1, 3, 5, 7, 9);
		List<Integer> lst2 = List.of(1, 3, 5, 7, 9);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 9.
	* The method {@link Exchange#exchange(List, List)} should return "NO"
	* when the first list contains only even numbers and the second list contains only odd numbers.
	*/
	@Test
	void testExchange_9() {
		List<Integer> lst1 = List.of(2, 4, 6, 8, 10);
		List<Integer> lst2 = List.of(1, 3, 5, 7, 9);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
	}
	
	/**
	* Test case 10.
	* The method {@link Exchange#exchange(List, List)} should return "NO"
	* when the first list contains only odd numbers and the second list contains only even numbers.
	*/
	@Test
	void testExchange_10() {
		List<Integer> lst1 = List.of(1, 3, 5, 7, 9);
		List<Integer> lst2 = List.of(2, 4, 6, 8, 10);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
	}
}