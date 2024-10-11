// PairsSumToZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {
			@Test
			void testPairsSumToZero() {
				List<Integer> l1 = List.of(1, 3, 5, 0);
				List<Integer> l2 = List.of(1, 3, -2, 1);
				List<Integer> l3 = List.of(1, 2, 3, 7);
				List<Integer> l4 = List.of(2, 4, -5, 3, 5, 7);
				List<Integer> l5 = List.of(1);
				List<Integer> l6 = List.of(-3, 9, -1, 3, 2, 30);
				List<Integer> l7 = List.of(-3, 9, -1, 3, 2, 31);
				List<Integer> l8 = List.of(-3, 9, -1, 4, 2, 30);
				List<Integer> l9 = List.of(-3, 9, -1, 4, 2, 31);
				List<Integer> l10 = List.of();
				assertFalse(PairsSumToZero.pairsSumToZero(l1));
				assertFalse(PairsSumToZero.pairsSumToZero(l2));
				assertFalse(PairsSumToZero.pairsSumToZero(l3));
				assertTrue(PairsSumToZero.pairsSumToZero(l4));
				assertFalse(PairsSumToZero.pairsSumToZero(l5));
				assertTrue(PairsSumToZero.pairsSumToZero(l6));
				assertTrue(PairsSumToZero.pairsSumToZero(l7));
				assertFalse(PairsSumToZero.pairsSumToZero(l8));
				assertFalse(PairsSumToZero.pairsSumToZero(l9));
				assertFalse(PairsSumToZero.pairsSumToZero(l10));
			}
}