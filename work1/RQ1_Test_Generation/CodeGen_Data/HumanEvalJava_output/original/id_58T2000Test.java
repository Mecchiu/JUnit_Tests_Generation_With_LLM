// CommonTest.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains one unit test case for the {@link Common#common(List, List)} method.
*/
class CommonTest {
// Common.java
package original;

import java.util.*;

class Common {

    /**
     * Return sorted unique common elements for two lists.
     *
     * > common([1, 4, 3, 34, 653, 2, 5], [5, 7, 1, 5, 9, 653, 121])
     * [1, 5, 653]
     * > common([5, 3, 2, 8], [3, 2])
     * [2, 3]
     * > common([4, 3, 2, 8], [3, 2, 4])
     * [2, 3, 4]
     * > common([4, 3, 2, 8], [])
     * []
     */
    public static List<Object> common(List<Integer> l1, List<Object> l2) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer value : l1) {
            set.add(value);
        }
        List<Object> result = new ArrayList<Object>();
        for (Object value : l2) {
            if (value instanceof Integer) {
                int i = (Integer) value;
                if (set.contains(i) &&!result.contains(i)) {
                    result.add(i);
                }
            }
        }
        Collections.sort(result, new Comparator<Object>() {

            public int compare(Object o1, Object o2) {
                if (o1 instanceof Integer && o2 instanceof Integer) {
                    return (Integer) o1 - (Integer) o2;
                }
                return 0;
            }
        });
        return result;
    }
}

// CommonTest.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains one unit test case for the {@link Common#common(List, List)} method.
*/
class CommonTest {
		
    /**
     * Test method for {@link Common#common(List, List)}.
	*/
    @Test
    public void testUnrelatedList() {
        List<Integer> list = new ArrayList<Integer>();
        assertEquals(list, null);
        assertEquals(list, new ArrayList<Integer>());
        assertEquals(list, new ArrayList<Integer>());
        setList(list);
		assertEquals(list, null);
		assertEquals(list, new ArrayList<Integer>());
		assertEquals(list, new ArrayList<Integer>());
	}
        
    /**
     * Test method for {@link Common#common(List, Map)}.
	*/
    @Test
    public void testUnrelatedMap() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        assertEquals(map, null);
        assertEquals(map, new TreeMap<String, Integer>());
        assertEquals(map, new TreeMap<String, Integer>());
        setMap(map);
		assertEquals(map, null);
		assertEquals(map, new TreeMap<String, Integer>());
		assertEquals(map, new TreeMap<String, Integer>());
    }
}
