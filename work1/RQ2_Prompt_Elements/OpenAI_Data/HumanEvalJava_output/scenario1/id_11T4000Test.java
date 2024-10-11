// StringXorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains ten unit test cases for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {

		/**
		* Test case 1.
		* The method {@link StringXor#stringXor(String, String)} is tested with two empty strings.
		* The expected result is an empty string.
		*/
		@Test
		void testStringXor1() {
				String a = "";
				String b = "";
				String expected = "";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 1.
		* The expected result is a string of length 1.
		*/
		@Test
		void testStringXor2() {
				String a = "0";
				String b = "1";
				String expected = "1";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 2.
		* The expected result is a string of length 2.
		*/
		@Test
		void testStringXor3() {
				String a = "01";
				String b = "10";
				String expected = "11";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 3.
		* The expected result is a string of length 3.
		*/
		@Test
		void testStringXor4() {
				String a = "010";
				String b = "101";
				String expected = "111";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 4.
		* The expected result is a string of length 4.
		*/
		@Test
		void testStringXor5() {
				String a = "0101";
				String b = "1010";
				String expected = "1111";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 5.
		* The expected result is a string of length 5.
		*/
		@Test
		void testStringXor6() {
				String a = "01010";
				String b = "10101";
				String expected = "11111";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 6.
		* The expected result is a string of length 6.
		*/
		@Test
		void testStringXor7() {
				String a = "010101";
				String b = "101010";
				String expected = "111111";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 7.
		* The expected result is a string of length 7.
		*/
		@Test
		void testStringXor8() {
				String a = "0101010";
				String b = "1010101";
				String expected = "1111111";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 8.
		* The expected result is a string of length 8.
		*/
		@Test
		void testStringXor9() {
				String a = "01010101";
				String b = "10101010";
				String expected = "11111111";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The method {@link StringXor#stringXor(String, String)} is tested with two strings of length 9.
		* The expected result is a string of length 9.
		*/
		@Test
		void testStringXor10() {
				String a = "010101010";
				String b = "101010101";
				String expected = "111111111";
				String actual = StringXor.stringXor(a, b);
				assertEquals(expected, actual);
		}
}