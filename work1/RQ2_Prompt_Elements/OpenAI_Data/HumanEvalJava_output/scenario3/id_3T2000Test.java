// BelowZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {
	@Test
			void testBelowZero() {
				List<Object> operations = List.of(1, 2, 3);
				assertFalse(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithNegative() {
				List<Object> operations = List.of(1, 2, -4, 5);
				assertTrue(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithEmptyList() {
				List<Object> operations = List.of();
				assertFalse(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithNoNegative() {
				List<Object> operations = List.of(1, 2, -3, 1, 2, -3);
				assertFalse(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithPositive() {
				List<Object> operations = List.of(1, 2, -4, 5, 6);
				assertTrue(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithPositiveAndNegative() {
				List<Object> operations = List.of(1, -1, 2, -2, 5, -5, 4, -4);
				assertFalse(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithPositiveAndNegativeAndLastNegative() {
				List<Object> operations = List.of(1, -1, 2, -2, 5, -5, 4, -5);
				assertTrue(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithPositiveAndNegativeAndFirstPositive() {
				List<Object> operations = List.of(1, -2, 2, -2, 5, -5, 4, -4);
				assertTrue(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithPositiveAndNegativeAndFirstNegative() {
				List<Object> operations = List.of(-1, -2, 2, -2, 5, -5, 4, -4);
				assertTrue(BelowZero.belowZero(operations));
			}

			@Test
			void testBelowZeroWithPositiveAndNegativeAndLastPositive() {
				List<Object> operations = List.of(1, -2, 2, -2, 5, -5, 4, 4);
				assertFalse(BelowZero.belowZero(operations));
			}
}
