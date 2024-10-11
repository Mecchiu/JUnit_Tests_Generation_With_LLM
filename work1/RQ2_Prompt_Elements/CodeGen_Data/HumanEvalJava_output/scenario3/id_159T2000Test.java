// EatTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains one unit test case for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {

	/**
	 * Test empty input.
	 */
	@Test
	void test_empty_input() {
		final List<Integer> expected = List.of();
		final Eat eat = new Eat();
		assertEquals(expected, eat.eat(2, 2, 2));
		assertEquals(expected, eat.eat(4, 2, 2));
		assertFalse(expected.isEmpty());
	}
	
	/**
	 * Test wrong input.
	 */
	@Test
	void test_wrong_input() {
		final List<Integer> expected = List.of(10);
		final Eat eat = new Eat();
		assertEquals(expected, eat.eat(4, 2, 2));
		final String inputErrorMesage = "Eats count must be in range [0, 1000] but was set to [4, 5, 7]";
		assertEquals(inputErrorMesage, eat.test(4, 5, 7));
		final String expectedOutputErrorMessage = "I am eating [4, 5, 7] for [4, 5, 7]. How many carrots would you eat?";
		assertEquals(expectedOutputErrorMessage, eat.test(4, 5, 7));
	}
	
	/**
	 * Test correct input.
	 */
	@Test
	void test_correct_input() {
		final List<Integer> expected = List.of(3);
		final Eat eat = new Eat();

		assertEquals(expected, eat.eat(3, 5, 3));
		assertTrue(expected.containsAll(eat.eat(4, 5, 3)));
	}
}
