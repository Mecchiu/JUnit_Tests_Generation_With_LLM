// MedianTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Median}.
* It contains one unit test case for the {@link Median#median(List)} method.
*/
class MedianTest {

		@Test
		void test() {
			assertArrayEquals(new Integer[] {1}, median(asList(1)));
		}

		private static List<Integer> asList(final int n) {
		    return new List[] {2, 1};
		}
}
