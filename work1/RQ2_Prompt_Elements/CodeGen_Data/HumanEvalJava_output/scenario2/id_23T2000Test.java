// StrlenTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains one unit test case for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {
/**
		* Returns true if the given string is equal.
		*/
		public static boolean isEqual(String a, String b) {
			return (a.compareTo(b)!=-1);
		}

		/**
		* Returns true if the given string is different from the
		* same, and false otherwise
		*/
		public static boolean isDifferent(String a, String b) {
			if (a.indexOf(b)!=-1) {
				return false;
			}else {
				return true;
			}
		}
}

/**
* Unit tests for class {@link StrlenTest}.
*/
class StrlenTestTest {
			/**
			* Method which tests if two strings are equal.
			*/
			@Test
			public void test_equal_same() {
				assertTrue(Strlen.isEqual(null, null));
			}

			/**
			* Method which tests if two strings are different.
			*/
			@Test
			public void test_different_string() {
				assertFalse(Strlen.isDifferent(null, null));
			}

		/**
		* Unit tests for class {@link StrlenTest}.
		*/
		@Test
		public void test_equals_different_string() {
			assertFalse(Strlen.isEqual("foo", "bar"));
		}
}

/**
* Unit tests for class {@link StrlenTest}.
*/
class StrlenTestTest2 {

		/**
		* Unit tests for class {@link StrlenTest2}.
		*/
		@Test
		public void test_equals_non_empty_string() {
				String s1 = "fo";
				String s2 = "fo";
				assertFalse(Strlen.isEqual(s1, s2));
		}
}






