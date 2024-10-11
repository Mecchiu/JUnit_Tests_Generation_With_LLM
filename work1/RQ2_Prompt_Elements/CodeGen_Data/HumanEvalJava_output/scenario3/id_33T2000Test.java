// SortThirdTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains one unit test case for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {
private final SortThird s = new SortThird();

		/**
		 * Test the sortThird.
		 */
    @Test
    public void testSortThird() {
    	s.sortThird(List.of(1, 9, 1, 1, 0, 5, 12, 10))
              <-s.listOf(1, 0,1, 5, 8, 1,1, 10, -2, -4, 2)
                && s.sortThird(List.of(-5, 2, 0, 5, 7, 0, 5, 10, -5, -6))
                ==(-5, 10, 0, -2, -4, 2)
              && s.sortThird(List.of(-11, 5, 10, 5, 1, 9, 2, 11))
                 <-s.listOf(1, 10, 2, 5, 12, 11) ;

    }
}