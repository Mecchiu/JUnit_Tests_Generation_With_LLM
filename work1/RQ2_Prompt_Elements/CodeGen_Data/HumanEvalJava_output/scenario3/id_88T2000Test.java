// SortArray1Test.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray1}.
* It contains one unit test case for the {@link SortArray1#sortArray(List)} method.
*/
class SortArray1Test {

    /**
     * * Create a test case for the {@link SortArray1#sortArray(List)} method.
     */
    @Test
    public void testSortArray(void) {
    	final List<String[]> list = new ArrayList<String[]>();
    	
        // Given
        list.add(new String[]{"0", "0"});  // 1. 0
        list.add(new String[]{"0", "0"});  // 2. 0
        list.add(new String[]{"0", "1"});  // 3. 0
        list.add(new String[]{"3", "0"});  // 4. 1
        list.add(new String[]{"4", "0"});  // 5. 2
        list.add(new String[]{"5", "0"});  // 6. 2
        list.add(new String[]{"3", "1"});  // 7. 1
        list.add(new String[]{"0", "1"});  // 8. 1
        list.add(new String[]{"3", "2"});  // 9. 2
        
        // When
        final List<Object[]> sortedArray = SortArray1.sortArray(list);
        
        // Then
        assertEquals(sortedArray.size(), 3);
        assertArrayEquals(sortedArray.get(0), new Object[]{"3", "2", "1"});
        assertArrayEquals(sortedArray.get(1), new Object[]{"5", "0", "1"});
        assertArrayEquals(sortedArray.get(2), new Object[]{"5", "0", "2"});
    }
}
