// StrangeSortListTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains one unit test case for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
// StrangeSortList.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StrangeSortList {

    /**
     * * Given list of integers, return list in strange order.
     * Strange sorting, is when you start with the minimum value,
     * then maximum of the remaining integers, then minimum and so on.
     */
    public static List<Object> strangeSortList(List<Object> lst) {
        List<Object> result = new ArrayList<Object>();
        List<Integer> sorted = new ArrayList<Integer>();
        for (Object value : lst) {
            if (value instanceof Integer) {
                sorted.add((Integer) value);
            }
        }
        Collections.sort(sorted);
        int i = 0;
        int j = sorted.size() - 1;
        while (i <= j) {
            result.add(sorted.get(i));
            if (i!= j) {
                result.add(sorted.get(j));
            }
            i++;
            j--;
        }
        return result;
    }
}

// StrangeSortListTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains one unit test case for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
		/**
		* Test for {@link strangeSortList(List)}.
		*/
        @Test
        public void strangeSortListTest() {
			
	        List<String> strings = new ArrayList<String>();
	        strings.add("one");
	        strings.add("two");
	        strings.add("three");

	        List<Number> numbers = new ArrayList<Number>();
	        numbers.add(new Integer(2));
	        numbers.add(new Long(3));
	        numbers.add(new Double(3.0));

	        List<Integer> lists = new ArrayList<Integer>();
	        lists.add(new Integer(1));
	        lists.add(new Integer(3));
	        lists.add(new Integer(2));

	        List<Integer> reversed = new ArrayList<Integer>();
	        reversed.add(lists.get(0));
	        reversed.add(lists.get(1));

	        List<Integer> list1 = new ArrayList<Integer>();
	        list1.add(new Integer(4));

	        List<Long> list2 = new ArrayList<Long>();
	        list2.add(new Long(5));

	        List<Float> list3 = new ArrayList<Float>();
	        list3.add(new Float(6.0));

	        List<Boolean> list4 = new ArrayList<Boolean>();
	        list4.add(true);
	        list4.add(false);

	        assertTrue(!isSorted(reversed));
	        assertTrue(!isSorted(list1));
	        assertTrue(isSorted(list2));
	        assertTrue(isSorted(list3));
	        assertTrue(isSorted(list4));

	        StrangeSortList.strangeSortList(strings);
	        assertTrue(isSorted(strings));

	        StrangeSortList.strangeSortList(numbers);
	        assertFalse(isSorted(strings));

	        StrangeSortList.strangeSortList(lists);
	        assertTrue(isSorted(lists));

	        StrangeSortList.strangeSortList(reversed);
	        assertTrue(isSorted(reversed));
        }
}
