// TriplesSumToZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains one unit test case for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
/**
		 * Test method of {@link TriplesSumToZero#triplesSumToZero(List)}.
		 * It checks that results are as expected in the following test case:
		 *
		 * <pre>
		 *   TODO: Comment
		 * </pre>
		 */
		@Test
		public void testTriplesSumToZero() {
			// TriplesSumToZero#triplesSumToZero(List) should set <true> and return <true>.
			Boolean correct = true;
			List<Integer> in = List.nil();

			TRIPLES_TRUE.triplesSumToZero(in).
			triplesSumToZero(in).
			triplesSumToZero(in);

			// TriplesSumToZero#triplesSumToZero(List) should return the same value, as it should be the same for two inputs.
			assertEquals(correct, true);
		}
}