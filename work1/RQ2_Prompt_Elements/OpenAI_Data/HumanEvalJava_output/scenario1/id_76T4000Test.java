// IsSimplePowerTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {

		/**
		* Test case 1.
		* The method should return true if the first argument is a simple power of the second argument.
		*/
		@Test
		void test1() {
				assertTrue(IsSimplePower.isSimplePower(1, 1));
		}
		
		/**
		* Test case 2.
		* The method should return false if the first argument is not a simple power of the second argument.
		*/
		@Test
		void test2() {
				assertFalse(IsSimplePower.isSimplePower(2, 1));
		}
		
		/**
		* Test case 3.
		* The method should return true if the first argument is a simple power of the second argument.
		*/
		@Test
		void test3() {
				assertTrue(IsSimplePower.isSimplePower(4, 2));
		}
		
		/**
		* Test case 4.
		* The method should return false if the first argument is not a simple power of the second argument.
		*/
		@Test
		void test4() {
				assertFalse(IsSimplePower.isSimplePower(8, 2));
		}
		
		/**
		* Test case 5.
		* The method should return true if the first argument is a simple power of the second argument.
		*/
		@Test
		void test5() {
				assertTrue(IsSimplePower.isSimplePower(27, 3));
		}
		
		/**
		* Test case 6.
		* The method should return false if the first argument is not a simple power of the second argument.
		*/
		@Test
		void test6() {
				assertFalse(IsSimplePower.isSimplePower(27, 2));
		}
		
		/**
		* Test case 7.
		* The method should return true if the first argument is a simple power of the second argument.
		*/
		@Test
		void test7() {
				assertTrue(IsSimplePower.isSimplePower(256, 4));
		}
		
		/**
		* Test case 8.
		* The method should return false if the first argument is not a simple power of the second argument.
		*/
		@Test
		void test8() {
				assertFalse(IsSimplePower.isSimplePower(256, 2));
		}
		
		/**
		* Test case 9.
		* The method should return true if the first argument is a simple power of the second argument.
		*/
		@Test
		void test9() {
				assertTrue(IsSimplePower.isSimplePower(3125, 5));
		}
		
		/**
		* Test case 10.
		* The method should return false if the first argument is not a simple power of the second argument.
		*/
		@Test
		void test10() {
				assertFalse(IsSimplePower.isSimplePower(3125, 2));
		}
}