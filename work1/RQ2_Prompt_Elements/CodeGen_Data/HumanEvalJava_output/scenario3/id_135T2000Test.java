// CanArrangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains one unit test case for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {
   
        @Test
        void testCanArrange() {
        	List<Object> arr = null;
            assertNotNull(Arrays.asList("10"));
            assertNotNull(Arrays.asList(new Object[]{20, 30}) );
            assertNotNull(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7}) );
            assertTrue(Arrays.asList(new Integer[]{21, 22, 23, 24, 25, 30})
                   .contains("10") );
            assertTrue(Arrays.asList(new Integer[]{21})
                   .contains("10") );
            assertTrue(Arrays.asList(new Integer[]{34})
                   .contains("10") );
            assertTrue(Arrays.asList(new Integer[]{21, 22, 34})
                   .contains("10") );
            assertTrue(Arrays.asList(new Integer[]{31, 32, 33})
                   .contains("10") );
            assertTrue(Arrays.asList(new Integer[]{21, 22, 34, 32, 33, 34})
                   .contains("10") );
        }
	}
