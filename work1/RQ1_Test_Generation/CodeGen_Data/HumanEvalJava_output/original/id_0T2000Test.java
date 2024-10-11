// HasCloseElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HasCloseElements}.
* It contains one unit test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method.
*/
class HasCloseElementsTest {

	/** A generic test case for the {@link HasCloseElements#hasCloseElements(List, Double)} method. */
	@Test
	public void testHasCloseElements() {
		// Setup
		final List<Double> numbers = Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1);
		
		// Test
		
		// HasCloseElements.hasCloseElements[numbers]
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.5).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.95).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.4).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.01).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.3).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.075).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.2).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.005).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.0).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.7).getClass());
		assertSame(boolean.class, HasCloseElements.hasCloseElements(numbers, 0.5).getClass());
	}
}