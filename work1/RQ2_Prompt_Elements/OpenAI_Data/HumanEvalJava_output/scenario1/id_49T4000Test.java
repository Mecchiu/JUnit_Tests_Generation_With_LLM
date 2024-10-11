// ModpTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {

		/**
		* Test case 1.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 2 and p = 3.
		* The expected result is 1.
		*/
		@Test
		void test1() {
				int n = 2;
				int p = 3;
				int expected = 1;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 3 and p = 3.
		* The expected result is 0.
		*/
		@Test
		void test2() {
				int n = 3;
				int p = 3;
				int expected = 0;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 4 and p = 3.
		* The expected result is 1.
		*/
		@Test
		void test3() {
				int n = 4;
				int p = 3;
				int expected = 1;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 5 and p = 3.
		* The expected result is 0.
		*/
		@Test
		void test4() {
				int n = 5;
				int p = 3;
				int expected = 0;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 6 and p = 3.
		* The expected result is 1.
		*/
		@Test
		void test5() {
				int n = 6;
				int p = 3;
				int expected = 1;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 7 and p = 3.
		* The expected result is 0.
		*/
		@Test
		void test6() {
				int n = 7;
				int p = 3;
				int expected = 0;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 8 and p = 3.
		* The expected result is 1.
		*/
		@Test
		void test7() {
				int n = 8;
				int p = 3;
				int expected = 1;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 9 and p = 3.
		* The expected result is 0.
		*/
		@Test
		void test8() {
				int n = 9;
				int p = 3;
				int expected = 0;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 10 and p = 3.
		* The expected result is 1.
		*/
		@Test
		void test9() {
				int n = 10;
				int p = 3;
				int expected = 1;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The method {@link Modp#modp(int, int)} is tested with the input values
		* n = 11 and p = 3.
		* The expected result is 0.
		*/
		@Test
		void test10() {
				int n = 11;
				int p = 3;
				int expected = 0;
				int actual = Modp.modp(n, p);
				assertEquals(expected, actual);
		}
}