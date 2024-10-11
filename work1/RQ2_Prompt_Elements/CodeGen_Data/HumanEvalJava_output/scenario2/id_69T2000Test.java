// SearchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains one unit test case for the {@link Search#search(List)} method.
*/
class SearchTest {

    private static final int LIST_SIZE = 20; 
		
    private static final int NUM_OF_SEARCHS = 3;

    @Test
    void shouldReturnGreatestIntegerGreatestPositivInteger() {
        assertEquals(-1, new Search().search(LIST_SIZE));
        assertEquals(-1, new Search().search(LIST_SIZE * LIST_SIZE));
    }

    @Test
    void shouldReturnGreatestIntegerGreatestPositivTwo() {
        assertEquals(-1, new Search().search(LIST_SIZE * LIST_SIZE + LIST_SIZE + 1));
        assertEquals(-1, new Search().search(2 * LIST_SIZE - LIST_SIZE * LIST_SIZE + LIST_SIZE));
    }

    @Test
    void shouldReturnMaximumInteger() {
        int max = 0;
        for (int i = 0; i < LIST_SIZE * LIST_SIZE * LIST_SIZE; i++) {
            max = Math.max(max,i);
        }
        assertTrue(max >= 0);
        assertEquals(LIST_SIZE, max);
    }
}
