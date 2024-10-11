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
			void test1() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 8);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test2() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 9);
				assertEquals("NO", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test3() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 10);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test4() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 11);
				assertEquals("NO", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test5() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 12);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test6() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 13);
				assertEquals("NO", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test7() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 14);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test8() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 15);
				assertEquals("NO", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test9() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 16);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			@Test
			void test10() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(5, 6, 7, 17);
				assertEquals("NO", Exchange.exchange(lst1, lst2));
			}
}
