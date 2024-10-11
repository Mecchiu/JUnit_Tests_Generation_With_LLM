// PairsSumToZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains one unit test case for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {
pairsSumToZero(List<Integer> expected) {
			assertTrue(expected.isEmpty());
		}

		@Test
		void pairsSumToZeroSucceeds() {
			assertTrue(pairsSumToZero(new List[] {1, 2, 2, 2} ).isEmpty());
		}
}
