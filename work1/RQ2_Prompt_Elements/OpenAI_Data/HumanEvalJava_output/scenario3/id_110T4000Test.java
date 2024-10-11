// ExchangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

	@Test
	void testExchange1() {
		List<Integer> lst1 = List.of(1, 2, 3, 4);
		List<Integer> lst2 = List.of(1, 2, 3, 4);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange2() {
		List<Integer> lst1 = List.of(1, 2, 3, 4);
		List<Integer> lst2 = List.of(1, 5, 3, 4);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange3() {
		List<Integer> lst1 = List.of(1, 2, 3, 4);
		List<Integer> lst2 = List.of(2, 1, 4, 3);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange4() {
		List<Integer> lst1 = List.of(5, 7, 3);
		List<Integer> lst2 = List.of(2, 6, 4);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange5() {
		List<Integer> lst1 = List.of(5, 7, 3);
		List<Integer> lst2 = List.of(2, 6, 3);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange6() {
		List<Integer> lst1 = List.of(3, 2, 6, 1, 8, 9);
		List<Integer> lst2 = List.of(3, 5, 5, 1, 1, 1);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange7() {
		List<Integer> lst1 = List.of(100, 200);
		List<Integer> lst2 = List.of(200, 200);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange8() {
		List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange9() {
		List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 11);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
	}
	
	@Test
	void testExchange10() {
		List<Integer> lst1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
}