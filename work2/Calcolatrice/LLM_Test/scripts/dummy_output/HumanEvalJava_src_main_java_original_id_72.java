// WillItFlyTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
			/**
			* Test case 1: willItFly([3, 2, 3], 9) âžž True
			*/
			@Test
			void test1() {
				List<Integer> q = List.of(3, 2, 3);
				int w = 9;
				assertTrue(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 2: willItFly([1, 2], 5) âžž False
			*/
			@Test
			void test2() {
				List<Integer> q = List.of(1, 2);
				int w = 5;
				assertFalse(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 3: willItFly([3], 5) âžž True
			*/
			@Test
			void test3() {
				List<Integer> q = List.of(3);
				int w = 5;
				assertTrue(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 4: willItFly([3, 2, 3], 1) âžž False
			*/
			@Test
			void test4() {
				List<Integer> q = List.of(3, 2, 3);
				int w = 1;
				assertFalse(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 5: willItFly([1, 2, 3], 6) âžž False
			*/
			@Test
			void test5() {
				List<Integer> q = List.of(1, 2, 3);
				int w = 6;
				assertFalse(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 6: willItFly([5], 5) âžž True
			*/
			@Test
			void test6() {
				List<Integer> q = List.of(5);
				int w = 5;
				assertTrue(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 7: willItFly([1, 2, 3], 5) âžž False
			*/
			@Test
			void test7() {
				List<Integer> q = List.of(1, 2, 3);
				int w = 5;
				assertFalse(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 8: willItFly([3, 2, 3], 6) âžž True
			*/
			@Test
			void test8() {
				List<Integer> q = List.of(3, 2, 3);
				int w = 6;
				assertTrue(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 9: willItFly([1, 2, 3], 7) âžž False
			*/
			@Test
			void test9() {
				List<Integer> q = List.of(1, 2, 3);
				int w = 7;
				assertFalse(WillItFly.willItFly(q, w));
			}

			/**
			* Test case 10: willItFly([3, 2, 3], 5) âžž False
			*/
			@Test
			void test10() {
				List<Integer> q = List.of(3, 2, 3);
				int w = 5;
				assertFalse(WillItFly.willItFly(q, w));
			}
}