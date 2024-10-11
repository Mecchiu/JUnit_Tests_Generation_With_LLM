// CheckDictCaseTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {
			/**
			* Test case 1: Test with a dictionary with all keys in lower case.
			*/
			@Test
			void testCase1() {
				Object dict = new Object();
				dict.put("p", "pineapple");
				dict.put("b", "banana");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 2: Test with a dictionary with all keys in upper case.
			*/
			@Test
			void testCase2() {
				Object dict = new Object();
				dict.put("P", "pineapple");
				dict.put("B", "banana");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 3: Test with a dictionary with both upper and lower case keys.
			*/
			@Test
			void testCase3() {
				Object dict = new Object();
				dict.put("p", "pineapple");
				dict.put("A", "banana");
				dict.put("B", "banana");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 4: Test with a dictionary with a non-string key.
			*/
			@Test
			void testCase4() {
				Object dict = new Object();
				dict.put("p", "pineapple");
				dict.put(5, "banana");
				dict.put("a", "apple");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 5: Test with a dictionary with a non-string key.
			*/
			@Test
			void testCase5() {
				Object dict = new Object();
				dict.put("Name", "John");
				dict.put("Age", "36");
				dict.put("City", "Houston");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 6: Test with a dictionary with all keys in upper case.
			*/
			@Test
			void testCase6() {
				Object dict = new Object();
				dict.put("STATE", "NC");
				dict.put("ZIP", "12345");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 7: Test with a dictionary with all keys in lower case.
			*/
			@Test
			void testCase7() {
				Object dict = new Object();
				dict.put("fruit", "Orange");
				dict.put("taste", "Sweet");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 8: Test with an empty dictionary.
			*/
			@Test
			void testCase8() {
				Object dict = new Object();
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 9: Test with a dictionary with all keys in lower case.
			*/
			@Test
			void testCase9() {
				Object dict = new Object();
				dict.put("p", "pineapple");
				dict.put("b", "banana");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 10: Test with a dictionary with all keys in upper case.
			*/
			@Test
			void testCase10() {
				Object dict = new Object();
				dict.put("P", "pineapple");
				dict.put("B", "banana");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}
}