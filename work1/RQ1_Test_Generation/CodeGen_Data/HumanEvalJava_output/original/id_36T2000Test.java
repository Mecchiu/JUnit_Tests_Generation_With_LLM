// FizzBuzzTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains one unit test case for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {

	@Test
	public void testFizzBuzz() {
		assertEquals(1, FizzBuzz.fizzBuzz(9));
	}
}
