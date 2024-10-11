// OddCountTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains ten unit test cases for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
			/**
			* Test case #1.
			* Input: ["1234567"]
			* Expected output: ["the number of odd elements 4n the str4ng 4 of the 4nput."]
			*/
			@Test
			void testCase1() {
						List<String> input = List.of("1234567");
						List<String> expected = List.of("the number of odd elements 4n the str4ng 4 of the 4nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case #2.
			* Input: ["3", "11111111"]
			* Expected output: ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput."]
			*/
			@Test
			void testCase2() {
						List<String> input = List.of("3", "11111111");
						List<String> expected = List.of("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 8n the str8ng 8 of the 8nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case #3.
			* Input: ["271", "137", "314"]
			* Expected output: ["the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput."]
			*/
			@Test
			void testCase3() {
						List<String> input = List.of("271", "137", "314");
						List<String> expected = List.of("the number of odd elements 2n the str2ng 2 of the 2nput.", "the number of odd elements 3n the str3ng 3 of the 3nput.", "the number of odd elements 2n the str2ng 2 of the 2nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case #4.
			* Input: ["1", "2", "3", "4", "5", "6", "7", "8", "9"]
			* Expected output: ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 0n the str0ng 2 of the 0nput.", "the number of odd elements 1n the str1ng 3 of the 1nput.", "the number of odd elements 0n the str0ng 4 of the 0nput.", "the number of odd elements 1n the str1ng 5 of the 1nput.", "the number of odd elements 0n the str0ng 6 of the 0nput.", "the number of odd elements 1n the str1ng 7 of the 1nput.", "the number of odd elements 0n the str0ng 8 of the 0nput.", "the number of odd elements 1n the str1ng 9 of the 1nput."]
			*/
			@Test
			void testCase4() {
						List<String> input = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
						List<String> expected = List.of("the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 0n the str0ng 2 of the 0nput.", "the number of odd elements 1n the str1ng 3 of the 1nput.", "the number of odd elements 0n the str0ng 4 of the 0nput.", "the number of odd elements 1n the str1ng 5 of the 1nput.", "the number of odd elements 0n the str0ng 6 of the 0nput.", "the number of odd elements 1n the str1ng 7 of the 1nput.", "the number of odd elements 0n the str0ng 8 of the 0nput.", "the number of odd elements 1n the str1ng 9 of the 1nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case #5.
			* Input: ["123456789"]
			* Expected output: ["the number of odd elements 5n the str5ng 5 of the 5nput."]
			*/
			@Test
			void testCase5() {
						List<String> input = List.of("123456789");
						List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case #6.
			* Input: ["2468"]
			* Expected output: ["the number of odd elements 0n the str0ng 2 of the 0nput."]
			*/
			@Test
			void testCase6() {
						List<String> input = List.of("2468");
						List<String> expected = List.of("the number of odd elements 0n the str0ng 2 of the 0nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case #7.
			* Input: ["13579"]
			* Expected output: ["the number of odd elements 5n the str5ng 5 of the 5nput."]
			*/
			@Test
			void testCase7() {
						List<String> input = List.of("13579");
						List<String> expected = List.of("the number of odd elements 5n the str5ng 5 of the 5nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case #8.
			* Input: ["2468", "13579"]
			* Expected output: ["the number of odd elements 0n the str0ng 2 of the 0nput.", "the number of odd elements 5n the str5ng 5 of the 5nput."]
			*/
			@Test
			void testCase8() {
						List<String> input = List.of("2468", "13579");
						List<String> expected = List.of("the number of odd elements 0n the str0ng 2 of the 0nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

			/**
			* Test case #9.
			* Input: ["2468", "13579", "123456789"]
			* Expected output: ["the number of odd elements 0n the str0ng 2 of the 0nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput."]
			*/
			@Test
			void testCase9() {
						List<String> input = List.of("2468", "13579", "123456789");
						List<String> expected = List.of("the number of odd elements 0n the str0ng 2 of the 0nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.", "the number of odd elements 5n the str5ng 5 of the 5nput.");
						List<String> actual = OddCount.oddCount(input);
						assertEquals(expected, actual);
			}

}