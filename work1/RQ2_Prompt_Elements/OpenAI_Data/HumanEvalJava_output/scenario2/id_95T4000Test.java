// CheckDictCaseTest.java
package scenario2;

import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckDictCase}.
* It contains ten unit test cases for the {@link CheckDictCase#checkDictCase(Object)} method.
*/
class CheckDictCaseTest {

		/**
		* Test case 1:
		* Input: {'a': 1, 'b': 2, 'c': 3}
		* Expected output: true
		*/
		@Test
		void testCase1() {
				Map<String, Integer> dict = Map.of("a", 1, "b", 2, "c", 3);
				assertTrue(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 2:
		* Input: {'A': 1, 'B': 2, 'C': 3}
		* Expected output: true
		*/
		@Test
		void testCase2() {
				Map<String, Integer> dict = Map.of("A", 1, "B", 2, "C", 3);
				assertTrue(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 3:
		* Input: {'a': 1, 'B': 2, 'c': 3}
		* Expected output: false
		*/
		@Test
		void testCase3() {
				Map<String, Integer> dict = Map.of("a", 1, "B", 2, "c", 3);
				assertFalse(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 4:
		* Input: {'A': 1, 'b': 2, 'C': 3}
		* Expected output: false
		*/
		@Test
		void testCase4() {
				Map<String, Integer> dict = Map.of("A", 1, "b", 2, "C", 3);
				assertFalse(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 5:
		* Input: {'a': 1, 'b': 2, 'C': 3}
		* Expected output: false
		*/
		@Test
		void testCase5() {
				Map<String, Integer> dict = Map.of("a", 1, "b", 2, "C", 3);
				assertFalse(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 6:
		* Input: {'A': 1, 'B': 2, 'c': 3}
		* Expected output: false
		*/
		@Test
		void testCase6() {
				Map<String, Integer> dict = Map.of("A", 1, "B", 2, "c", 3);
				assertFalse(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 7:
		* Input: {'a': 1, 'B': 2, 'C': 3}
		* Expected output: false
		*/
		@Test
		void testCase7() {
				Map<String, Integer> dict = Map.of("a", 1, "B", 2, "C", 3);
				assertFalse(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 8:
		* Input: {'A': 1, 'b': 2, 'c': 3}
		* Expected output: false
		*/
		@Test
		void testCase8() {
				Map<String, Integer> dict = Map.of("A", 1, "b", 2, "c", 3);
				assertFalse(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 9:
		* Input: {}
		* Expected output: false
		*/
		@Test
		void testCase9() {
				Map<String, Integer> dict = Map.of();
				assertFalse(CheckDictCase.checkDictCase(dict));
		}
		
		/**
		* Test case 10:
		* Input: {'a': 1, 'b': 2, 'c': 3, 'd': 4, 'e': 5, 'f': 6, 'g': 7, 'h': 8, 'i': 9, 'j': 10}
		* Expected output: true
		*/
		@Test
		void testCase10() {
				Map<String, Integer> dict = Map.of("a", 1, "b", 2, "c", 3, "d", 4, "e", 5, "f", 6, "g", 7, "h", 8, "i", 9, "j", 10);
				assertTrue(CheckDictCase.checkDictCase(dict));
		}
}