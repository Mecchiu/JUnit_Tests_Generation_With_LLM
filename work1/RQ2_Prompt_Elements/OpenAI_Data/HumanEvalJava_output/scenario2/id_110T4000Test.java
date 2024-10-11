// ExchangeTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {

	@Test
	void testExchange() {
		List<Integer> lst1 = List.of(1, 2, 3, 4, 5);
		List<Integer> lst2 = List.of(6, 7, 8, 9, 10);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 11);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 10, 11);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 10, 11, 12);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 10, 11, 12, 13);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 10, 11, 12, 13, 14);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
		assertEquals("NO", Exchange.exchange(lst1, lst2));
		
		lst1 = List.of(1, 2, 3, 4, 5);
		lst2 = List.of(6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
		assertEquals("YES", Exchange.exchange(lst1, lst2));
	}
}