// CheckDictCaseTest.java
package original;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {
			/**
			* Test case 1: checkDictCase({"p": "pineapple", "b": "banana"})
			* Expected output: true
			*/
			@Test
			void testCase1() {
				Map<String, String> dict = Map.of("p", "pineapple", "b", "banana");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 2: checkDictCase({"p": "pineapple", "A": "banana", "B": "banana"})
			* Expected output: false
			*/
			@Test
			void testCase2() {
				Map<String, String> dict = Map.of("p", "pineapple", "A", "banana", "B", "banana");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 3: checkDictCase({"p": "pineapple", 5: "banana", "a": "apple"})
			* Expected output: false
			*/
			@Test
			void testCase3() {
				Map<Object, String> dict = Map.of("p", "pineapple", 5, "banana", "a", "apple");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 4: checkDictCase({"Name": "John", "Age": "36", "City": "Houston"})
			* Expected output: false
			*/
			@Test
			void testCase4() {
				Map<String, String> dict = Map.of("Name", "John", "Age", "36", "City", "Houston");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 5: checkDictCase({"STATE": "NC", "ZIP": "12345"})
			* Expected output: true
			*/
			@Test
			void testCase5() {
				Map<String, String> dict = Map.of("STATE", "NC", "ZIP", "12345");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 6: checkDictCase({"fruit": "Orange", "taste": "Sweet"})
			* Expected output: true
			*/
			@Test
			void testCase6() {
				Map<String, String> dict = Map.of("fruit", "Orange", "taste", "Sweet");
				assertTrue(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 7: checkDictCase({})
			* Expected output: false
			*/
			@Test
			void testCase7() {
				Map<String, String> dict = Map.of();
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 8: checkDictCase({"p": "pineapple", "b": "banana", "A": "apple"})
			* Expected output: false
			*/
			@Test
			void testCase8() {
				Map<String, String> dict = Map.of("p", "pineapple", "b", "banana", "A", "apple");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 9: checkDictCase({"p": "pineapple", "b": "banana", "1": "apple"})
			* Expected output: false
			*/
			@Test
			void testCase9() {
				Map<String, String> dict = Map.of("p", "pineapple", "b", "banana", "1", "apple");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}

			/**
			* Test case 10: checkDictCase({"p": "pineapple", "b": "banana", "A": "apple", "1": "apple"})
			* Expected output: false
			*/
			@Test
			void testCase10() {
				Map<String, String> dict = Map.of("p", "pineapple", "b", "banana", "A", "apple", "1", "apple");
				assertFalse(CheckDictCase.checkDictCase(dict));
			}
}