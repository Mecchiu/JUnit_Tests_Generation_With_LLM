// IsBoredTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

		/**
		* Test case 1.
		* The input string is empty.
		* The expected result is 0.
		*/
		@Test
		void test1() {
				String s = "";
				int expected = 0;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string contains only one sentence.
		* The expected result is 0.
		*/
		@Test
		void test2() {
				String s = "I am not bored.";
				int expected = 0;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string contains only one sentence.
		* The expected result is 1.
		*/
		@Test
		void test3() {
				String s = "I am bored.";
				int expected = 1;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string contains only one sentence.
		* The expected result is 0.
		*/
		@Test
		void test4() {
				String s = "I am not bored!";
				int expected = 0;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string contains only one sentence.
		* The expected result is 1.
		*/
		@Test
		void test5() {
				String s = "I am bored!";
				int expected = 1;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string contains only one sentence.
		* The expected result is 0.
		*/
		@Test
		void test6() {
				String s = "I am not bored?";
				int expected = 0;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string contains only one sentence.
		* The expected result is 1.
		*/
		@Test
		void test7() {
				String s = "I am bored?";
				int expected = 1;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string contains multiple sentences.
		* The expected result is 2.
		*/
		@Test
		void test8() {
				String s = "I am bored. I am not bored.";
				int expected = 2;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string contains multiple sentences.
		* The expected result is 2.
		*/
		@Test
		void test9() {
				String s = "I am bored! I am not bored.";
				int expected = 2;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string contains multiple sentences.
		* The expected result is 2.
		*/
		@Test
		void test10() {
				String s = "I am bored? I am not bored.";
				int expected = 2;
				int actual = IsBored.isBored(s);
				assertEquals(expected, actual);
		}
}