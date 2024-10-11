// GetClosestVowelTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
			/**
			* Test case 1
			* Case: "yogurt"
			* Expected Output: "u"
			*/
			@Test
			void testCase1() {
						String word = "yogurt";
						String expected = "u";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 2
			* Case: "full"
			* Expected Output: "u"
			*/
			@Test
			void testCase2() {
						String word = "full";
						String expected = "u";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 3
			* Case: "easy"
			* Expected Output: ""
			*/
			@Test
			void testCase3() {
						String word = "easy";
						String expected = "";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 4
			* Case: "eAsy"
			* Expected Output: ""
			*/
			@Test
			void testCase4() {
						String word = "eAsy";
						String expected = "";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 5
			* Case: "ali"
			* Expected Output: ""
			*/
			@Test
			void testCase5() {
						String word = "ali";
						String expected = "";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 6
			* Case: "bad"
			* Expected Output: "a"
			*/
			@Test
			void testCase6() {
						String word = "bad";
						String expected = "a";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 7
			* Case: "most"
			* Expected Output: "o"
			*/
			@Test
			void testCase7() {
						String word = "most";
						String expected = "o";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 8
			* Case: "ab"
			* Expected Output: ""
			*/
			@Test
			void testCase8() {
						String word = "ab";
						String expected = "";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 9
			* Case: "ba"
			* Expected Output: ""
			*/
			@Test
			void testCase9() {
						String word = "ba";
						String expected = "";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 10
			* Case: "quick"
			* Expected Output: ""
			*/
			@Test
			void testCase10() {
						String word = "quick";
						String expected = "";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 11
			* Case: "anime"
			* Expected Output: "i"
			*/
			@Test
			void testCase11() {
						String word = "anime";
						String expected = "i";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 12
			* Case: "Asia"
			* Expected Output: ""
			*/
			@Test
			void testCase12() {
						String word = "Asia";
						String expected = "";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}

			/**
			* Test case 13
			* Case: "Above"
			* Expected Output: "o"
			*/
			@Test
			void testCase13() {
						String word = "Above";
						String expected = "o";
						String actual = GetClosestVowel.getClosestVowel(word);
						assertEquals(expected, actual);
			}
}