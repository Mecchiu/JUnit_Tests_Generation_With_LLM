// StrlenTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {
			// Test case 1: Test with empty string
			@Test
			void test1() {
				String string = "";
				int expected = 0;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 2: Test with string of length 1
			@Test
			void test2() {
				String string = "a";
				int expected = 1;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 3: Test with string of length 2
			@Test
			void test3() {
				String string = "ab";
				int expected = 2;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 4: Test with string of length 3
			@Test
			void test4() {
				String string = "abc";
				int expected = 3;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 5: Test with string of length 4
			@Test
			void test5() {
				String string = "abcd";
				int expected = 4;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 6: Test with string of length 5
			@Test
			void test6() {
				String string = "abcde";
				int expected = 5;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 7: Test with string of length 6
			@Test
			void test7() {
				String string = "abcdef";
				int expected = 6;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 8: Test with string of length 7
			@Test
			void test8() {
				String string = "abcdefg";
				int expected = 7;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 9: Test with string of length 8
			@Test
			void test9() {
				String string = "abcdefgh";
				int expected = 8;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
			
			// Test case 10: Test with string of length 9
			@Test
			void test10() {
				String string = "abcdefghi";
				int expected = 9;
				int actual = Strlen.strlen(string);
				assertEquals(expected, actual);
			}
}