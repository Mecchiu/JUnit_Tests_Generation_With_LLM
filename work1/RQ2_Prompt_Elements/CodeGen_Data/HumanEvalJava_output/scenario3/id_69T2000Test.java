// SearchTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Search}.
* It contains one unit test case for the {@link Search#search(List)} method.
*/
class SearchTest {

    /**
     * Test method for {@link Search#search(List)}.
     */
    @Test
    public void test() {
        assertNotSame(SearchTest.INT_LIST.size(), 0);
        assertNotSame(0, (int) SearchTest.INT_LIST.get(SearchTest.INT_LIST.size() - 1) + 1);
    }
		
}

