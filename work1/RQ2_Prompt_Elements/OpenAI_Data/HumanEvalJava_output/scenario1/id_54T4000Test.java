// SameCharsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {

		/**
		* Test case 1.
		* The method {@link SameChars#sameChars(String, String)} should return true.
		*/
		@Test
		void testSameChars1() {
				assertTrue(SameChars.sameChars("abc", "cba"));
		}
		
		/**
		* Test case 2.
		* The method {@link SameChars#sameChars(String, String)} should return false.
		*/
		@Test
		void testSameChars2() {
				assertFalse(SameChars.sameChars("abc", "cbd"));
		}
		
		/**
		* Test case 3.
		* The method {@link SameChars#sameChars(String, String)} should return true.
		*/
		@Test
		void testSameChars3() {
				assertTrue(SameChars.sameChars("abcd", "dcba"));
		}
		
		/**
		* Test case 4.
		* The method {@link SameChars#sameChars(String, String)} should return false.
		*/
		@Test
		void testSameChars4() {
				assertFalse(SameChars.sameChars("abcd", "dcbd"));
		}
		
		/**
		* Test case 5.
		* The method {@link SameChars#sameChars(String, String)} should return true.
		*/
		@Test
		void testSameChars5() {
				assertTrue(SameChars.sameChars("abcde", "edcba"));
		}
		
		/**
		* Test case 6.
		* The method {@link SameChars#sameChars(String, String)} should return false.
		*/
		@Test
		void testSameChars6() {
				assertFalse(SameChars.sameChars("abcde", "edcbd"));
		}
		
		/**
		* Test case 7.
		* The method {@link SameChars#sameChars(String, String)} should return true.
		*/
		@Test
		void testSameChars7() {
				assertTrue(SameChars.sameChars("abcdef", "fedcba"));
		}
		
		/**
		* Test case 8.
		* The method {@link SameChars#sameChars(String, String)} should return false.
		*/
		@Test
		void testSameChars8() {
				assertFalse(SameChars.sameChars("abcdef", "fedcbd"));
		}
		
		/**
		* Test case 9.
		* The method {@link SameChars#sameChars(String, String)} should return true.
		*/
		@Test
		void testSameChars9() {
				assertTrue(SameChars.sameChars("abcdefg", "gfedcba"));
		}
		
		/**
		* Test case 10.
		* The method {@link SameChars#sameChars(String, String)} should return false.
		*/
		@Test
		void testSameChars10() {
				assertFalse(SameChars.sameChars("abcdefg", "gfedcbd"));
		}
}