// FizzBuzzTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains one unit test case for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
/**
		 * Empty test.
		 * Just to check no exception occurs. 
		*/
	@Test
	void shouldNotThrowAnyExceptions() {
	}

	/**
	 * Test case of {@link FizzBuzz#fizzBuzz(int)} method.
	 */
	@Test
	void shouldReturnCorrectResult() {
		final FizzBuzz fizzBuzz = new FizzBuzz();
		final int expected = 0;
		assertEquals(expected, fizzBuzz.fizzBuzz(0));
		assertEquals(expected, fizzBuzz.fizzBuzz(400));
	}
}