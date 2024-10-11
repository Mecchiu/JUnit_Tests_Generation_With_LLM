// EncryptTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {

		/**
		* Test case 1.
		* The input string is "abc".
		* The expected output is "cde".
		*/
		@Test
		void test1() {
				String input = "abc";
				String expected = "cde";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input string is "xyz".
		* The expected output is "zab".
		*/
		@Test
		void test2() {
				String input = "xyz";
				String expected = "zab";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input string is "abcdefghijklmnopqrstuvwxyz".
		* The expected output is "cdefghijklmnopqrstuvwxyzab".
		*/
		@Test
		void test3() {
				String input = "abcdefghijklmnopqrstuvwxyz";
				String expected = "cdefghijklmnopqrstuvwxyzab";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input string is "ABCDEFGHIJKLMNOPQRSTUVWXYZ".
		* The expected output is "CDEFGHIJKLMNOPQRSTUVWXYZAB".
		*/
		@Test
		void test4() {
				String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String expected = "CDEFGHIJKLMNOPQRSTUVWXYZAB";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input string is "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".
		* The expected output is "cdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZab".
		*/
		@Test
		void test5() {
				String input = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String expected = "cdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZab";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input string is "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".
		* The expected output is "CDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzAB".
		*/
		@Test
		void test6() {
				String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
				String expected = "CDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzAB";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input string is "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".
		* The expected output is "cdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ab".
		*/
		@Test
		void test7() {
				String input = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
				String expected = "cdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789ab";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input string is "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".
		* The expected output is "CDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789AB".
		*/
		@Test
		void test8() {
				String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
				String expected = "CDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789AB";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input string is "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".
		* The expected output is "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZab".
		*/
		@Test
		void test9() {
				String input = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String expected = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZab";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input string is "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".
		* The expected output is "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzAB".
		*/
		@Test
		void test10() {
				String input = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
				String expected = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzAB";
				String actual = Encrypt.encrypt(input);
				assertEquals(expected, actual);
		}
}