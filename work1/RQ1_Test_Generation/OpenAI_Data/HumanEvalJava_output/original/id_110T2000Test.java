// ExchangeTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Exchange}.
* It contains ten unit test cases for the {@link Exchange#exchange(List, List)} method.
*/
class ExchangeTest {
	/**
			* Test case 1: exchange([1, 2, 3, 4], [1, 2, 3, 4]) => "YES"
			*/
			@Test
			void test1() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(1, 2, 3, 4);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 2: exchange([1, 2, 3, 4], [1, 5, 3, 4]) => "NO"
			*/
			@Test
			void test2() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(1, 5, 3, 4);
				assertEquals("NO", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 3: exchange([1, 2, 3, 4], [2, 1, 4, 3]) => "YES"
			*/
			@Test
			void test3() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(2, 1, 4, 3);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 4: exchange([5, 7, 3], [2, 6, 4]) => "YES"
			*/
			@Test
			void test4() {
				List<Integer> lst1 = List.of(5, 7, 3);
				List<Integer> lst2 = List.of(2, 6, 4);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 5: exchange([5, 7, 3], [2, 6, 3]) => "NO"
			*/
			@Test
			void test5() {
				List<Integer> lst1 = List.of(5, 7, 3);
				List<Integer> lst2 = List.of(2, 6, 3);
				assertEquals("NO", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 6: exchange([3, 2, 6, 1, 8, 9], [3, 5, 5, 1, 1, 1]) => "NO"
			*/
			@Test
			void test6() {
				List<Integer> lst1 = List.of(3, 2, 6, 1, 8, 9);
				List<Integer> lst2 = List.of(3, 5, 5, 1, 1, 1);
				assertEquals("NO", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 7: exchange([100, 200], [200, 200]) => "YES"
			*/
			@Test
			void test7() {
				List<Integer> lst1 = List.of(100, 200);
				List<Integer> lst2 = List.of(200, 200);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 8: exchange([1, 2, 3, 4], [1, 2, 3, 4, 5]) => "YES"
			*/
			@Test
			void test8() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(1, 2, 3, 4, 5);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 9: exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6]) => "YES"
			*/
			@Test
			void test9() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}

			/**
			* Test case 10: exchange([1, 2, 3, 4], [1, 2, 3, 4, 5, 6, 7]) => "YES"
			*/
			@Test
			void test10() {
				List<Integer> lst1 = List.of(1, 2, 3, 4);
				List<Integer> lst2 = List.of(1, 2, 3, 4, 5, 6, 7);
				assertEquals("YES", Exchange.exchange(lst1, lst2));
			}
}
