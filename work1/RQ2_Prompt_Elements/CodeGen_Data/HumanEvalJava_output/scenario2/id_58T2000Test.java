// CommonTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains one unit test case for the {@link Common#common(List, List)} method.
*/
class CommonTest {
// Common.java
package scenario2;

import java.util.*;

class Common {

    /**
     * Return sorted unique common elements for two lists.
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
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains one unit test case for the {@link Common#common(List, List)} method.
*/
class CommonTest {
		/**
		* Test of main method of Common class.
		*/
    @Test
    public void createList() {
        assertTrue("The list is empty.", Common.common(new ArrayList<>(), new ArrayList()));
    }
}