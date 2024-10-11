// EatTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains ten unit test cases for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {
			/**
			* Test case 1: eat(5, 6, 10) -> [11, 4]
			*/
			@Test
			void test1() {
				List<Integer> expected = Arrays.asList(11, 4);
				List<Integer> actual = Eat.eat(5, 6, 10);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: eat(4, 8, 9) -> [12, 1]
			*/
			@Test
			void test2() {
				List<Integer> expected = Arrays.asList(12, 1);
				List<Integer> actual = Eat.eat(4, 8, 9);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: eat(1, 10, 10) -> [11, 0]
			*/
			@Test
			void test3() {
				List<Integer> expected = Arrays.asList(11, 0);
				List<Integer> actual = Eat.eat(1, 10, 10);
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: eat(2, 11, 5) -> [7, 0]
			*/
			@Test
			void test4() {
				List<Integer> expected = Arrays.asList(7, 0);
				List<Integer> actual = Eat.eat(2, 11, 5);
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: eat(4, 5, 7) -> [9, 2]
			*/
			@Test
			void test5() {
				List<Integer> expected = Arrays.asList(9, 2);
				List<Integer> actual = Eat.eat(4, 5, 7);
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: eat(4, 5, 1) -> [5, 0]
			*/
			@Test
			void test6() {
				List<Integer> expected = Arrays.asList(5, 0);
				List<Integer> actual = Eat.eat(4, 5, 1);
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: eat(0, 0, 0) -> [0, 0]
			*/
			@Test
			void test7() {
				List<Integer> expected = Arrays.asList(0, 0);
				List<Integer> actual = Eat.eat(0, 0, 0);
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: eat(0, 0, 1) -> [0, 1]
			*/
			@Test
			void test8() {
				List<Integer> expected = Arrays.asList(0, 1);
				List<Integer> actual = Eat.eat(0, 0, 1);
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: eat(0, 1, 0) -> [1, 0]
			*/
			@Test
			void test9() {
				List<Integer> expected = Arrays.asList(1, 0);
				List<Integer> actual = Eat.eat(0, 1, 0);
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: eat(1, 0, 0) -> [1, 0]
			*/
			@Test
			void test10() {
				List<Integer> expected = Arrays.asList(1, 0);
				List<Integer> actual = Eat.eat(1, 0, 0);
				assertEquals(expected, actual);
			}
}