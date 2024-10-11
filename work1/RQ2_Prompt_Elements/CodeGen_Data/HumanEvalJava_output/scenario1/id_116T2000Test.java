// SortArrayTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains one unit test case for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {
/**
		* Tests the default constructor in the {@link SortArray} class.
		*/
    @Test
    public void default1() { 
       List<Object> list = new ArrayList<Object>(7);
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       Comparator comparator = new ListCompareComparator();
       Collections.sort(list, comparator);
       assertTrue(comparator.compare(list, 6) < 0);
    }

    /**
    * Tests the default constructor in the {@link SortArray} class.
    */
    @Test
    public void default2() {
        List<Object> list = new ArrayList<Object>(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);

        Comparator comparator = new ListCompareComparator();
        Collections.sort(list, comparator);

        assertEquals(9, comparator.compare(list, 10));
    }
}

// <generated>
