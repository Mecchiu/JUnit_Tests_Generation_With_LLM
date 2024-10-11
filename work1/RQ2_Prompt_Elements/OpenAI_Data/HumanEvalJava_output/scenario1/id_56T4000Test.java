// CorrectBracketingTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing}.
* It contains ten unit test cases for the {@link CorrectBracketing#correctBracketing(String)} method.
*/
class CorrectBracketingTest {

		/**
		* Test case 1.
		* The input string is empty.
		* The expected result is true.
		*/
		@Test
		void test1() {
				assertTrue(CorrectBracketing.correctBracketing(""));
		}
		
		/**
		* Test case 2.
		* The input string is "<>".
		* The expected result is true.
		*/
		@Test
		void test2() {
				assertTrue(CorrectBracketing.correctBracketing("<>"));
		}
		
		/**
		* Test case 3.
		* The input string is "<><>".
		* The expected result is true.
		*/
		@Test
		void test3() {
				assertTrue(CorrectBracketing.correctBracketing("<><>"));
		}
		
		/**
		* Test case 4.
		* The input string is "<><><>".
		* The expected result is true.
		*/
		@Test
		void test4() {
				assertTrue(CorrectBracketing.correctBracketing("<><><>"));
		}
		
		/**
		* Test case 5.
		* The input string is "<><><><>".
		* The expected result is true.
		*/
		@Test
		void test5() {
				assertTrue(CorrectBracketing.correctBracketing("<><><><>"));
		}
		
		/**
		* Test case 6.
		* The input string is "<><><><><>".
		* The expected result is true.
		*/
		@Test
		void test6() {
				assertTrue(CorrectBracketing.correctBracketing("<><><><><>"));
		}
		
		/**
		* Test case 7.
		* The input string is "<><><><><><>".
		* The expected result is true.
		*/
		@Test
		void test7() {
				assertTrue(CorrectBracketing.correctBracketing("<><><><><><>"));
		}
		
		/**
		* Test case 8.
		* The input string is "<><><><><><><>".
		* The expected result is true.
		*/
		@Test
		void test8() {
				assertTrue(CorrectBracketing.correctBracketing("<><><><><><><>"));
		}
		
		/**
		* Test case 9.
		* The input string is "<><><><><><><><>".
		* The expected result is true.
		*/
		@Test
		void test9() {
				assertTrue(CorrectBracketing.correctBracketing("<><><><><><><><>"));
		}
		
		/**
		* Test case 10.
		* The input string is "<><><><><><><><><>".
		* The expected result is true.
		*/
		@Test
		void test10() {
				assertTrue(CorrectBracketing.correctBracketing("<><><><><><><><><>"));
		}
}