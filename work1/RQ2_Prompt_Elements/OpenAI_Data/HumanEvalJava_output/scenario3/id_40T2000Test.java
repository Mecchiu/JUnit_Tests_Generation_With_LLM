// TriplesSumToZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
	@Test
			void testTriplesSumToZero() {
				List<Integer> l1 = List.of(1, 3, 5, 0);
				List<Integer> l2 = List.of(1, 3, 5, -1);
				List<Integer> l3 = List.of(1, 3, -2, 1);
				List<Integer> l4 = List.of(1, 2, 3, 7);
				List<Integer> l5 = List.of(1, 2, 5, 7);
				List<Integer> l6 = List.of(2, 4, -5, 3, 9, 7);
				List<Integer> l7 = List.of(1);
				List<Integer> l8 = List.of(1, 3, 5, -100);
				List<Integer> l9 = List.of(100, 3, 5, -100);
				List<Integer> l10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
				
				assertFalse(TriplesSumToZero.triplesSumToZero(l1));
				assertFalse(TriplesSumToZero.triplesSumToZero(l2));
				assertTrue(TriplesSumToZero.triplesSumToZero(l3));
				assertFalse(TriplesSumToZero.triplesSumToZero(l4));
				assertFalse(TriplesSumToZero.triplesSumToZero(l5));
				assertTrue(TriplesSumToZero.triplesSumToZero(l6));
				assertFalse(TriplesSumToZero.triplesSumToZero(l7));
				assertFalse(TriplesSumToZero.triplesSumToZero(l8));
				assertFalse(TriplesSumToZero.triplesSumToZero(l9));
				assertFalse(TriplesSumToZero.triplesSumToZero(l10));
			}
}
