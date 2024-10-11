// IntToMiniRomanTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains ten unit test cases for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {
	/**
			* Test case for the number 1.
			*/
			@Test
			void test1() {
						assertEquals("i", IntToMiniRoman.intToMiniRoman(1));
			}

			/**
			* Test case for the number 2.
			*/
			@Test
			void test2() {
						assertEquals("ii", IntToMiniRoman.intToMiniRoman(2));
			}

			/**
			* Test case for the number 3.
			*/
			@Test
			void test3() {
						assertEquals("iii", IntToMiniRoman.intToMiniRoman(3));
			}

			/**
			* Test case for the number 4.
			*/
			@Test
			void test4() {
						assertEquals("iv", IntToMiniRoman.intToMiniRoman(4));
			}

			/**
			* Test case for the number 5.
			*/
			@Test
			void test5() {
						assertEquals("v", IntToMiniRoman.intToMiniRoman(5));
			}

			/**
			* Test case for the number 6.
			*/
			@Test
			void test6() {
						assertEquals("vi", IntToMiniRoman.intToMiniRoman(6));
			}

			/**
			* Test case for the number 7.
			*/
			@Test
			void test7() {
						assertEquals("vii", IntToMiniRoman.intToMiniRoman(7));
			}

			/**
			* Test case for the number 8.
			*/
			@Test
			void test8() {
						assertEquals("viii", IntToMiniRoman.intToMiniRoman(8));
			}

			/**
			* Test case for the number 9.
			*/
			@Test
			void test9() {
						assertEquals("ix", IntToMiniRoman.intToMiniRoman(9));
			}

			/**
			* Test case for the number 10.
			*/
			@Test
			void test10() {
						assertEquals("x", IntToMiniRoman.intToMiniRoman(10));
			}
}
