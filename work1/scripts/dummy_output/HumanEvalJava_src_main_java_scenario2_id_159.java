// EatTest.java
package scenario2;

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
			* Test case 1: number = 0, need = 0, remaining = 0
			* Expected result: [0, 0]
			*/
			@Test
			void test1() {
				List<Integer> result = Eat.eat(0, 0, 0);
				assertEquals(Arrays.asList(0, 0), result);
			}

			/**
			* Test case 2: number = 0, need = 0, remaining = 1
			* Expected result: [0, 1]
			*/
			@Test
			void test2() {
				List<Integer> result = Eat.eat(0, 0, 1);
				assertEquals(Arrays.asList(0, 1), result);
			}

			/**
			* Test case 3: number = 0, need = 1, remaining = 0
			* Expected result: [0, 0]
			*/
			@Test
			void test3() {
				List<Integer> result = Eat.eat(0, 1, 0);
				assertEquals(Arrays.asList(0, 0), result);
			}

			/**
			* Test case 4: number = 0, need = 1, remaining = 1
			* Expected result: [1, 0]
			*/
			@Test
			void test4() {
				List<Integer> result = Eat.eat(0, 1, 1);
				assertEquals(Arrays.asList(1, 0), result);
			}

			/**
			* Test case 5: number = 1, need = 0, remaining = 0
			* Expected result: [1, 0]
			*/
			@Test
			void test5() {
				List<Integer> result = Eat.eat(1, 0, 0);
				assertEquals(Arrays.asList(1, 0), result);
			}

			/**
			* Test case 6: number = 1, need = 0, remaining = 1
			* Expected result: [1, 1]
			*/
			@Test
			void test6() {
				List<Integer> result = Eat.eat(1, 0, 1);
				assertEquals(Arrays.asList(1, 1), result);
			}

			/**
			* Test case 7: number = 1, need = 1, remaining = 0
			* Expected result: [1, 0]
			*/
			@Test
			void test7() {
				List<Integer> result = Eat.eat(1, 1, 0);
				assertEquals(Arrays.asList(1, 0), result);
			}

			/**
			* Test case 8: number = 1, need = 1, remaining = 1
			* Expected result: [2, 0]
			*/
			@Test
			void test8() {
				List<Integer> result = Eat.eat(1, 1, 1);
				assertEquals(Arrays.asList(2, 0), result);
			}

			/**
			* Test case 9: number = 0, need = 1, remaining = 2
			* Expected result: [1, 1]
			*/
			@Test
			void test9() {
				List<Integer> result = Eat.eat(0, 1, 2);
				assertEquals(Arrays.asList(1, 1), result);
			}

			/**
			* Test case 10: number = 1, need = 2, remaining = 3
			* Expected result: [4, 0]
			*/
			@Test
			void test10() {
				List<Integer> result = Eat.eat(1, 2, 3);
				assertEquals(Arrays.asList(4, 0), result);
			}
}