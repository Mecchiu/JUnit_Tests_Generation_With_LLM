// Solve1Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains ten unit test cases for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
			/**
			* Test case #1.
			* Input: 0
			* Output: 0
			*/
			@Test
			void test1() {
				assertEquals("0", Solve1.solve(0));
			}

			/**
			* Test case #2.
			* Input: 1
			* Output: 1
			*/
			@Test
			void test2() {
				assertEquals("1", Solve1.solve(1));
			}

			/**
			* Test case #3.
			* Input: 2
			* Output: 10
			*/
			@Test
			void test3() {
				assertEquals("10", Solve1.solve(2));
			}

			/**
			* Test case #4.
			* Input: 3
			* Output: 11
			*/
			@Test
			void test4() {
				assertEquals("11", Solve1.solve(3));
			}

			/**
			* Test case #5.
			* Input: 4
			* Output: 100
			*/
			@Test
			void test5() {
				assertEquals("100", Solve1.solve(4));
			}

			/**
			* Test case #6.
			* Input: 5
			* Output: 101
			*/
			@Test
			void test6() {
				assertEquals("101", Solve1.solve(5));
			}

			/**
			* Test case #7.
			* Input: 6
			* Output: 110
			*/
			@Test
			void test7() {
				assertEquals("110", Solve1.solve(6));
			}

			/**
			* Test case #8.
			* Input: 7
			* Output: 111
			*/
			@Test
			void test8() {
				assertEquals("111", Solve1.solve(7));
			}

			/**
			* Test case #9.
			* Input: 8
			* Output: 1000
			*/
			@Test
			void test9() {
				assertEquals("1000", Solve1.solve(8));
			}

			/**
			* Test case #10.
			* Input: 9
			* Output: 1001
			*/
			@Test
			void test10() {
				assertEquals("1001", Solve1.solve(9));
			}
}