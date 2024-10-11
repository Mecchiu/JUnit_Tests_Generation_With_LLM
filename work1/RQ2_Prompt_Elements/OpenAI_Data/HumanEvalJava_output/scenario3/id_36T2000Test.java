// FizzBuzzTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
	@Test
			void testFizzBuzz1() {
				assertEquals(0, FizzBuzz.fizzBuzz(50));
			}

			@Test
			void testFizzBuzz2() {
				assertEquals(2, FizzBuzz.fizzBuzz(78));
			}

			@Test
			void testFizzBuzz3() {
				assertEquals(3, FizzBuzz.fizzBuzz(79));
			}

			@Test
			void testFizzBuzz4() {
				assertEquals(0, FizzBuzz.fizzBuzz(50));
			}

			@Test
			void testFizzBuzz5() {
				assertEquals(2, FizzBuzz.fizzBuzz(78));
			}

			@Test
			void testFizzBuzz6() {
				assertEquals(3, FizzBuzz.fizzBuzz(79));
			}

			@Test
			void testFizzBuzz7() {
				assertEquals(3, FizzBuzz.fizzBuzz(100));
			}

			@Test
			void testFizzBuzz8() {
				assertEquals(6, FizzBuzz.fizzBuzz(200));
			}

			@Test
			void testFizzBuzz9() {
				assertEquals(192, FizzBuzz.fizzBuzz(4000));
			}

			@Test
			void testFizzBuzz10() {
				assertEquals(639, FizzBuzz.fizzBuzz(10000));
			}

			@Test
			void testFizzBuzz11() {
				assertEquals(8026, FizzBuzz.fizzBuzz(100000));
			}
}
