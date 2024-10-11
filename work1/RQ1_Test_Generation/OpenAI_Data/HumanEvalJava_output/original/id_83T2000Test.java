// StartsOneEndsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartsOneEnds}.
* It contains ten unit test cases for the {@link StartsOneEnds#startsOneEnds(int)} method.
*/
class StartsOneEndsTest {
	/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 1.
			*/
			@Test
			void testStartsOneEnds1() {
						assertEquals(1, StartsOneEnds.startsOneEnds(1));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 2.
			*/
			@Test
			void testStartsOneEnds2() {
						assertEquals(18, StartsOneEnds.startsOneEnds(2));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 3.
			*/
			@Test
			void testStartsOneEnds3() {
						assertEquals(180, StartsOneEnds.startsOneEnds(3));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 4.
			*/
			@Test
			void testStartsOneEnds4() {
						assertEquals(1800, StartsOneEnds.startsOneEnds(4));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 5.
			*/
			@Test
			void testStartsOneEnds5() {
						assertEquals(18000, StartsOneEnds.startsOneEnds(5));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 6.
			*/
			@Test
			void testStartsOneEnds6() {
						assertEquals(180000, StartsOneEnds.startsOneEnds(6));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 7.
			*/
			@Test
			void testStartsOneEnds7() {
						assertEquals(1800000, StartsOneEnds.startsOneEnds(7));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 8.
			*/
			@Test
			void testStartsOneEnds8() {
						assertEquals(18000000, StartsOneEnds.startsOneEnds(8));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 9.
			*/
			@Test
			void testStartsOneEnds9() {
						assertEquals(180000000, StartsOneEnds.startsOneEnds(9));
			}

			/**
			* Test case for {@link StartsOneEnds#startsOneEnds(int)}.
			* It tests the method with the input 10.
			*/
			@Test
			void testStartsOneEnds10() {
						assertEquals(1800000000, StartsOneEnds.startsOneEnds(10));
			}
}
