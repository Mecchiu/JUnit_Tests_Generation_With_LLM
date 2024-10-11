// ClosestIntegerTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains ten unit test cases for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
			/**
			* Test case for the method {@link ClosestInteger#closestInteger(String)}.
			* It tests the method with the value "10".
			*/
			@Test
			void testClosestInteger1() {
						assertEquals(10, ClosestInteger.closestInteger("10"));
			}

			/**
			* Test case for the method {@link ClosestInteger#closestInteger(String)}.
			* It tests the method with the value "14.5".
			*/
			@Test
			void testClosestInteger2() {
						assertEquals(15, ClosestInteger.closestInteger("14.5"));
			}

			/**
			* Test case for the method {@link ClosestInteger#closestInteger(String)}.
			* It tests the method with the value "-15.5".
			*/
			@Test
			void testClosestInteger3() {
						assertEquals(-16, ClosestInteger.closestInteger("-15.5"));
			}

			/**
			* Test case for the method {@link ClosestInteger#closestInteger(String)}.
			* It tests the method with the value "15.3".
			*/
			@Test
			void testClosestInteger4() {
						assertEquals(15, ClosestInteger.closestInteger("15.3"));
			}

			/**
			* Test case for the method {@link ClosestInteger#closestInteger(String)}.
			* It tests the method with the value "0".
			*/
			@Test
			void testClosestInteger5() {
						assertEquals(0, ClosestInteger.closestInteger("0"));
			}

			/**
			* Test case for the method {@link ClosestInteger#closestInteger(String)}.
			* It tests the method with the value "0.5".
			*/
			@Test
			void testClosestInteger6() {
						assertEquals(1, ClosestInteger.closestInteger("0.5"));
			}

			/**
			* Test case for the method {@link ClosestInteger#closestInteger(String)}.
			* It tests the method with the value "-0.5".
			*/
			@Test
			void testClosestInteger7() {
						assertEquals(-1, ClosestInteger.closestInteger("-0.5"));
			}

}