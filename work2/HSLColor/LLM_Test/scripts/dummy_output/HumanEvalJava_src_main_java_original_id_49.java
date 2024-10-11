// ModpTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains ten unit test cases for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {
			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 3 and the second argument is 5.
			* The expected result is 3.
			*/
			@Test
			void testModp1() {
				assertEquals(3, Modp.modp(3, 5));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 1101 and the second argument is 101.
			* The expected result is 2.
			*/
			@Test
			void testModp2() {
				assertEquals(2, Modp.modp(1101, 101));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 0 and the second argument is 101.
			* The expected result is 1.
			*/
			@Test
			void testModp3() {
				assertEquals(1, Modp.modp(0, 101));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 3 and the second argument is 11.
			* The expected result is 8.
			*/
			@Test
			void testModp4() {
				assertEquals(8, Modp.modp(3, 11));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 100 and the second argument is 101.
			* The expected result is 1.
			*/
			@Test
			void testModp5() {
				assertEquals(1, Modp.modp(100, 101));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 3 and the second argument is 5.
			* The expected result is 3.
			*/
			@Test
			void testModp6() {
				assertEquals(3, Modp.modp(3, 5));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 1101 and the second argument is 101.
			* The expected result is 2.
			*/
			@Test
			void testModp7() {
				assertEquals(2, Modp.modp(1101, 101));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 0 and the second argument is 101.
			* The expected result is 1.
			*/
			@Test
			void testModp8() {
				assertEquals(1, Modp.modp(0, 101));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 3 and the second argument is 11.
			* The expected result is 8.
			*/
			@Test
			void testModp9() {
				assertEquals(8, Modp.modp(3, 11));
			}

			/**
			* Test case for {@link Modp#modp(int, int)}.
			* It tests the case where the first argument is 100 and the second argument is 101.
			* The expected result is 1.
			*/
			@Test
			void testModp10() {
				assertEquals(1, Modp.modp(100, 101));
			}
}