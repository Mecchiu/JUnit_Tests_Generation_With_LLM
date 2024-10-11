// CompareOneTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains ten unit test cases for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {
			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is an integer and the second argument is a float.
			*/
			@Test
			void testCompareOneIntFloat() {
						Object result = CompareOne.compareOne(1, 2.5);
						assertEquals(2.5, result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is an integer and the second argument is a string.
			*/
			@Test
			void testCompareOneIntString() {
						Object result = CompareOne.compareOne(1, "2,3");
						assertEquals("2,3", result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is a string and the second argument is a string.
			*/
			@Test
			void testCompareOneStringString() {
						Object result = CompareOne.compareOne("5,1", "6");
						assertEquals("6", result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is a string and the second argument is an integer.
			*/
			@Test
			void testCompareOneStringInt() {
						Object result = CompareOne.compareOne("1", 1);
						assertEquals(null, result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is an integer and the second argument is an integer.
			*/
			@Test
			void testCompareOneIntInt() {
						Object result = CompareOne.compareOne(1, 2);
						assertEquals(2, result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is a float and the second argument is a float.
			*/
			@Test
			void testCompareOneFloatFloat() {
						Object result = CompareOne.compareOne(2.5, 3.5);
						assertEquals(3.5, result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is a float and the second argument is a string.
			*/
			@Test
			void testCompareOneFloatString() {
						Object result = CompareOne.compareOne(2.5, "3,5");
						assertEquals("3,5", result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is a string and the second argument is a float.
			*/
			@Test
			void testCompareOneStringFloat() {
						Object result = CompareOne.compareOne("2,5", 3.5);
						assertEquals(3.5, result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is a float and the second argument is an integer.
			*/
			@Test
			void testCompareOneFloatInt() {
						Object result = CompareOne.compareOne(2.5, 3);
						assertEquals(3, result);
			}

			/**
			* Test case for the {@link CompareOne#compareOne(Object, Object)} method.
			* It tests the case when the first argument is an integer and the second argument is a float.
			*/
			@Test
			void testCompareOneIntFloat2() {
						Object result = CompareOne.compareOne(1, 2.5);
						assertEquals(2.5, result);
			}
}