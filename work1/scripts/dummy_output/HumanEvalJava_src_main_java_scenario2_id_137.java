// CompareOneTest.java
package scenario2;


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
						assertEquals(5, CompareOne.compareOne(5, 3));
			}

			/**
			* Test case for two floats.
			*/
			@Test
			void testFloats() {
						assertEquals(5.5f, CompareOne.compareOne(5.5f, 3.3f));
			}

			/**
			* Test case for two strings representing integers.
			*/
			@Test
			void testStringsIntegers() {
						assertEquals("5", CompareOne.compareOne("5", "3"));
			}

			/**
			* Test case for two strings representing floats.
			*/
			@Test
			void testStringsFloats() {
						assertEquals("5.5", CompareOne.compareOne("5.5", "3.3"));
			}

			/**
			* Test case for two strings representing floats with comma.
			*/
			@Test
			void testStringsFloatsComma() {
						assertEquals("5.5", CompareOne.compareOne("5,5", "3,3"));
			}

			/**
			* Test case for two strings representing floats with comma and dot.
			*/
			@Test
			void testStringsFloatsCommaDot() {
						assertEquals("5.5", CompareOne.compareOne("5,5", "3.3"));
			}

			/**
			* Test case for two strings representing floats with dot and comma.
			*/
			@Test
			void testStringsFloatsDotComma() {
						assertEquals("5.5", CompareOne.compareOne("5.5", "3,3"));
			}

			/**
			* Test case for two strings representing floats with dot.
			*/
			@Test
			void testStringsFloatsDot() {
						assertEquals("5.5", CompareOne.compareOne("5.5", "3.3"));
			}

			/**
			* Test case for two strings representing floats with dot and zero.
			*/
			@Test
			void testStringsFloatsDotZero() {
						assertEquals("5.5", CompareOne.compareOne("5.5", "3.0"));
			}

			/**
			* Test case for two strings representing floats with dot and zero.
			*/
			@Test
			void testStringsFloatsDotZero2() {
						assertEquals("5.5", CompareOne.compareOne("5.5", "3"));
			}
}