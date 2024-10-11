// GenericSortedListModelTest.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenericSortedListModel}.
* It contains one unit test case for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {
		
	public static void assertContains(List<T> list, T listElement) {
		assertEquals(list.contains(listElement), true);
	}

	public static void assertEquals(int expected, Object found) {
		assertSame(expected, found);
	}

	public static void assertSortedElements(List<T> list, T[] listElements) {
    if (list!= null) {
    	assertEquals(list.size(), listElements.length);
		ListIterator<T> iter = Collections.list(list).listIterator(listElements.length);
		if (iter.hasNext()) {
        	assertEquals(iter.next(), listElements[0]);
        }
    } else {
    	assertArrayEquals(listElements, new T[] { listElements[0] });
    }
	}

	public static void assertUnsortedElements(List<T> list, T[] listElements) {
		assertNotSame(list, list.size() * listElements.length);
		assertEquals(list.size(), listElements.length);
		ListIterator<T> iter = Collections.list(list).listIterator(listElements.length);
    if (iter.hasNext()) {
        assertEquals(iter.next(), listElements[list.size() - 1]);
        }
	}

}

/**
* Unit test for {@link GenericSortedListModel#getElementAt(int)}.
*/
class GenericSortedListModelTest2 extends GenericSortedListModelTest {

    public void testGetElementAt(int index) {
        assertEquals(Collections.binarySearch(data, data.get(index)) + 1, index);
	}
}

/**
* Unit test for {@link GenericSortedListModel#remove(Object)}.
*/
class GenericSortedListModelTest3 extends GenericSortedListModelTest {

    public void testRemove(List<T> list, T element) {
        list.remove(element);
    }
}

/**
 * A unit test for the sorting algorithms.
 *
 * @author Alexander Rose
 */

public class SortedModelTest {
	private GenericSortedListModel<String> sdm = new GenericSortedListModel<>();

	private final String[] data0 = { "ab", "ab", "ac", "ac" };
	private final String[] data1 = { "ab", "ab", "ac", "abc" };
	private final String[] data2 = { "ab", "ac" };

    private static final Comparator<String> comparator = new Comparator<String>() {
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public void doTestSortedList(List<Integer> ints, List<Integer> ots) {

        int listSz = ints.size();
        int listAllSz = ots.size();

        if (listAllSz!= 0) {
            assertTrue("List size must be 0", listSz == 0);
        }

        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < listSz; ++i) {
            T t = data0[index1];
            if (ints.contains(index1)) {
                assertEquals(ints.get(i), data1[index1]);
            } else {
                assertUnsortedElements(data, data1);
            }
            index1++;
        }
        for (int i = 0; i < listSz; ++i) {
            if (ints.contains(index2) && ots.contains(index2)) {
                assertEquals("Sorted list element mismatch", data1[index2], data2[index2]);
            } else {
                T t = data2[index2];
                assertEquals("Sorted list element mismatch", data2[index2], data0[index2]);
                assertContains(data, t);
            }

            if (++index2 < listSz) {
                index1++;
            } else {
                assertEquals("The list is empty", index1, index2);
                ++index1;
            }
        }
    }

    public void testSortedList() {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(data0));
        testSortedList(list, list);
    }

    public void testUnsortedList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < data1.length; ++i) {
            list.addAll(Arrays.asList(data1 + i));
        }
        testSortedList(list, list);
    }
	
	public static void main(String[] args) {
		new GenericSortedListModelTest2().testSortedList();
		new GenericSortedListModelTest3().testSortedList();
	}
}