// FizzBuzzTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains one unit test case for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {

	@Test
	void should_add_one_unit() {
		assertEquals(3, fizzBuzz((1+1) * 2));
		assertEquals(5+3, fizzBuzz((1+1) *2+1));
		assertEquals(8+14, fizzBuzz((1+1) *2+2));
	}

	@Test
	void fizzBuzz_passes_correctly() {
		assertEquals(33-26, fizzBuzz((1-1));
	}

}