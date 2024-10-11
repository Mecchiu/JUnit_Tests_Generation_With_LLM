// StrlenTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

		/**
		* Test case 1 for {@link Strlen#strlen(String)}.
		* It tests the method with a null string.
		*/
		@Test
		void testStrlen1() {
				assertEquals(0, Strlen.strlen(null));
		}
		
		/**
		* Test case 2 for {@link Strlen#strlen(String)}.
		* It tests the method with an empty string.
		*/
		@Test
		void testStrlen2() {
				assertEquals(0, Strlen.strlen(""));
		}
		
		/**
		* Test case 3 for {@link Strlen#strlen(String)}.
		* It tests the method with a string containing only spaces.
		*/
		@Test
		void testStrlen3() {
				assertEquals(3, Strlen.strlen("   "));
		}
		
		/**
		* Test case 4 for {@link Strlen#strlen(String)}.
		* It tests the method with a string containing only tabs.
		*/
		@Test
		void testStrlen4() {
				assertEquals(3, Strlen.strlen("\t\t\t"));
		}
		
		/**
		* Test case 5 for {@link Strlen#strlen(String)}.
		* It tests the method with a string containing only newlines.
		*/
		@Test
		void testStrlen5() {
				assertEquals(3, Strlen.strlen("\n\n\n"));
		}
		
		/**
		* Test case 6 for {@link Strlen#strlen(String)}.
		* It tests the method with a string containing only spaces, tabs and newlines.
		*/
		@Test
		void testStrlen6() {
				assertEquals(6, Strlen.strlen(" \t\n \t\n"));
		}
		
		/**
		* Test case 7 for {@link Strlen#strlen(String)}.
		* It tests the method with a string containing only letters.
		*/
		@Test
		void testStrlen7() {
				assertEquals(3, Strlen.strlen("abc"));
		}
		
		/**
		* Test case 8 for {@link Strlen#strlen(String)}.
		* It tests the method with a string containing only digits.
		*/
		@Test
		void testStrlen8() {
				assertEquals(3, Strlen.strlen("123"));
		}
		
		/**
		* Test case 9 for {@link Strlen#strlen(String)}.
		* It tests the method with a string containing only letters and digits.
		*/
		@Test
		void testStrlen9() {
				assertEquals(6, Strlen.strlen("abc123"));
		}
		
		/**
		* Test case 10 for {@link Strlen#strlen(String)}.
		* It tests the method with a string containing only letters, digits, spaces, tabs and newlines.
		*/
		@Test
		void testStrlen10() {
				assertEquals(9, Strlen.strlen("abc 123\t\n"));
		}
}