// StartsOneEndsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {
	/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 1.
			*/
			@Test
			void testStartsOneEnds1() {
						assertEquals(1, StartsOneEnds.startsOneEnds(1));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 2.
			*/
			@Test
			void testStartsOneEnds2() {
						assertEquals(20, StartsOneEnds.startsOneEnds(2));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 3.
			*/
			@Test
			void testStartsOneEnds3() {
						assertEquals(300, StartsOneEnds.startsOneEnds(3));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 4.
			*/
			@Test
			void testStartsOneEnds4() {
						assertEquals(4000, StartsOneEnds.startsOneEnds(4));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 5.
			*/
			@Test
			void testStartsOneEnds5() {
						assertEquals(50000, StartsOneEnds.startsOneEnds(5));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 6.
			*/
			@Test
			void testStartsOneEnds6() {
						assertEquals(600000, StartsOneEnds.startsOneEnds(6));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 7.
			*/
			@Test
			void testStartsOneEnds7() {
						assertEquals(7000000, StartsOneEnds.startsOneEnds(7));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 8.
			*/
			@Test
			void testStartsOneEnds8() {
						assertEquals(80000000, StartsOneEnds.startsOneEnds(8));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 9.
			*/
			@Test
			void testStartsOneEnds9() {
						assertEquals(900000000, StartsOneEnds.startsOneEnds(9));
			}

			/**
			* Test case for the method {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the value 10.
			*/
			@Test
			void testStartsOneEnds10() {
						assertEquals(1000000000, StartsOneEnds.startsOneEnds(10));
			}
}
