// IscubeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains ten unit test cases for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {

		/**
		* Test case 1.
		* The input is a negative number.
		* The expected result is false.
		*/
		@Test
		void test1() {
				assertFalse(Iscube.iscube(-1));
		}
		
		/**
		* Test case 2.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test2() {
				assertTrue(Iscube.iscube(1));
		}
		
		/**
		* Test case 3.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test3() {
				assertTrue(Iscube.iscube(8));
		}
		
		/**
		* Test case 4.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test4() {
				assertTrue(Iscube.iscube(27));
		}
		
		/**
		* Test case 5.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test5() {
				assertTrue(Iscube.iscube(64));
		}
		
		/**
		* Test case 6.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test6() {
				assertTrue(Iscube.iscube(125));
		}
		
		/**
		* Test case 7.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test7() {
				assertTrue(Iscube.iscube(216));
		}
		
		/**
		* Test case 8.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test8() {
				assertTrue(Iscube.iscube(343));
		}
		
		/**
		* Test case 9.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test9() {
				assertTrue(Iscube.iscube(512));
		}
		
		/**
		* Test case 10.
		* The input is a positive number.
		* The expected result is true.
		*/
		@Test
		void test10() {
				assertTrue(Iscube.iscube(729));
		}
}