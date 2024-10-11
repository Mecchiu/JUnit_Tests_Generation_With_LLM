// SimplifyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {

		/**
		* Test case 1.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/2"</li>
		* </ul>
		* The expected result is true.
		*/
		@Test
		void test1() {
			assertTrue(Simplify.simplify("1/2", "1/2"));
		}
		
		/**
		* Test case 2.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/3"</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void test2() {
			assertFalse(Simplify.simplify("1/2", "1/3"));
		}
		
		/**
		* Test case 3.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/4"</li>
		* </ul>
		* The expected result is true.
		*/
		@Test
		void test3() {
			assertTrue(Simplify.simplify("1/2", "1/4"));
		}
		
		/**
		* Test case 4.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/5"</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void test4() {
			assertFalse(Simplify.simplify("1/2", "1/5"));
		}
		
		/**
		* Test case 5.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/6"</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void test5() {
			assertFalse(Simplify.simplify("1/2", "1/6"));
		}
		
		/**
		* Test case 6.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/7"</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void test6() {
			assertFalse(Simplify.simplify("1/2", "1/7"));
		}
		
		/**
		* Test case 7.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/8"</li>
		* </ul>
		* The expected result is true.
		*/
		@Test
		void test7() {
			assertTrue(Simplify.simplify("1/2", "1/8"));
		}
		
		/**
		* Test case 8.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/9"</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void test8() {
			assertFalse(Simplify.simplify("1/2", "1/9"));
		}
		
		/**
		* Test case 9.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/10"</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void test9() {
			assertFalse(Simplify.simplify("1/2", "1/10"));
		}
		
		/**
		* Test case 10.
		* The method {@link Simplify#simplify(String, String)} is tested with the following parameters:
		* <ul>
		* <li>x = "1/2"</li>
		* <li>n = "1/11"</li>
		* </ul>
		* The expected result is false.
		*/
		@Test
		void test10() {
			assertFalse(Simplify.simplify("1/2", "1/11"));
		}
}