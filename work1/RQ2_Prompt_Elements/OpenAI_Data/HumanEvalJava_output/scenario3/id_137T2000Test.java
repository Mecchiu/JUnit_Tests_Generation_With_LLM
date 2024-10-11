// CompareOneTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
	/**
			* Test case for two integers.
			*/
			@Test
			void testIntegers() {
						assertEquals(2, CompareOne.compareOne(1, 2));
			}

			/**
			* Test case for an integer and a float.
			*/
			@Test
			void testIntegerAndFloat() {
						assertEquals(2.5, CompareOne.compareOne(1, 2.5));
			}

			/**
			* Test case for two floats.
			*/
			@Test
			void testFloats() {
						assertEquals(3.5, CompareOne.compareOne(2.5, 3.5));
			}

			/**
			* Test case for two strings representing real numbers.
			*/
			@Test
			void testStrings() {
						assertEquals("2,3", CompareOne.compareOne("1", "2,3"));
			}

			/**
			* Test case for two strings representing real numbers.
			*/
			@Test
			void testStrings2() {
						assertEquals("6", CompareOne.compareOne("5,1", "6"));
			}

			/**
			* Test case for two strings representing real numbers.
			*/
			@Test
			void testStrings3() {
						assertEquals("2", CompareOne.compareOne("1", "2"));
			}

			/**
			* Test case for two strings representing real numbers.
			*/
			@Test
			void testStrings4() {
						assertEquals(null, CompareOne.compareOne("1", 1));
			}

			/**
			* Test case for two strings representing real numbers.
			*/
			@Test
			void testStrings5() {
						assertEquals(null, CompareOne.compareOne("1", 1));
			}

			/**
			* Test case for two strings representing real numbers.
			*/
			@Test
			void testStrings6() {
						assertEquals(null, CompareOne.compareOne("1", 1));
			}

			/**
			* Test case for two strings representing real numbers.
			*/
			@Test
			void testStrings7() {
						assertEquals(null, CompareOne.compareOne("1", 1));
			}
}
