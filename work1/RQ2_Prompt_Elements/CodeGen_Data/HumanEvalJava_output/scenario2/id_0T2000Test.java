// HasCloseElementsTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains one unit test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

	/**
	 * Test constructor which is called when no parameters are provided.
	 * Tests if given list of numbers are close to each other.
	 * @throws InterruptedException
	 */
	@Test
	public final void testHasCloseElements() throws InterruptedException {
		final List<Double> numbers = List.of(1.0,2.0,3.0);
		final Double threshold = 3.0;
		final Boolean result = HasCloseElements.hasCloseElements(numbers, threshold);
				
		assertEquals(true, result);
	}


}
