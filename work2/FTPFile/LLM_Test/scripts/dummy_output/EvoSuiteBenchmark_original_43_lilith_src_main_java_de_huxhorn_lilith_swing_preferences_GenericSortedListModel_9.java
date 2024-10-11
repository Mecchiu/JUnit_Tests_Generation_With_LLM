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
		private final List<String> data = new ArrayList<String>();

    @Test
    void testGetElementAt() {
        data.add("Foo");
        data.add("Bar");
        data.add("Bar");
        data.add("Bar");
        data.add("Baz");
        data.add("Hoop");

        final int index = 1;

        final Object element = data.get(index);
        GenericSortedListModel<String> ssmv = new GenericSortedListModel<String>(new Comparator<String>() {
            public int compare(String left, String right) {
              return left.compareTo(right);
            }
          });

        final List<String> list = ssmv.getElementAt(index);

            assertEquals("Foo", data.get(0));
            assertEquals("Bar", data.get(1));
            assertEquals("Baz", data.get(2));
            assertEquals("Hoop", data.get(3));


        final Comparator<String> comparator = ssmv.getComparator();
        assertEquals("Foo. Bar", list.get(0));
        assertEquals("Foo. Bar", list.get(1));
        assertEquals("Foo. Baz", list.get(2));
        assertEquals("Foo. Hoop", list.get(3));
    }

    @Test
    void shouldCalculateIndexOfLastElementsInList() {
        data.add("Foo");
        data.add("Bar");
        data.add("Bar");
        data.add("Foo");
        data.add("Baz");
        data.add("Hoop");

        //test last element is the first element in list
        final int index1 = 4;
        final int index2 = index1;


        final Object element = data.get(index1);
        AbstractListModel<String> smv = new GenericSortedListModel<String>(new Comparator<String>() {
            public int compare(String left, String right) {
              return left.compareTo(right);
            }
          });

        final List<String> list = smv.getElementAt(index2);

            assertEquals("Foo", data.get(0));
            assertEquals("Bar", data.get(1));
            assertEquals("Foo", data.get(2));
            assertEquals("Foo", data.get(3));
            assertEquals("Baz", data.get(4));
            assertEquals("Hoop", data.get(5));
            assertEquals("Bar", list.get(0));
            assertEquals("Bar", list.get(1));
            assertEquals("Foo", list.get(2));
            assertEquals("Foo", list.get(3));
            assertEquals("Foo", list.get(4));
    }

    @Test
    void testGetElementCount() {
        data.add("Foo");
        data.add("Bar");
        data.add("Bar");
        data.add("Bar");
        data.add("Baz");
        data.add("Hoop");

        final int index1 = 0;
        final int index2 = 1;
        final int index3 = 2;

        final Integer index3i = null;

        final Object element = data.get(index3);
        AbstractListModel<String> smv = new GenericSortedListModel<String>(new Comparator<String>() {
            public int compare(String left, String right) {
              return left.compareTo(right);
            }
          });

        final List<String> list = smv.getElementAt(index1);
            assertEquals("Foo", data.get(0));
            assertEquals("Bar", data.get(1));
            assertEquals("Baz", data.get(2));
            assertEquals("Hoop", data.get(3));

        final Comparator<String> comparator = smv.getComparator();
        assertEquals("Foo. Bar", list.get(0));
        assertEquals("Foo. Bar", list.get(1));
        assertEquals("Foo. Baz", list.get(2));
        assertEquals("Foo. Hoop", list.get(3));
    }

    @Test
    void testFindLastAndLastWithOrder() {
        data.add("Foo");
        data.add("Bar");
        data.add("Bar");
        data.add("Baz");
        data.add("Hoop");

        final GenericSortedListModel<String> smv = new GenericSortedListModel<String>(new Comparator<String>() {
            public int compare(String left, String right) {
              return left.compareTo(right);
            }
          });

        final List<String> list = smv.getElementAt(3);
        assertEquals("Foo", list.get(0));
        assertEquals("Bar", list.get(1));
        assertEquals("Baz", list.get(2));
        assertEquals("Hoop", list.get(3));
    }

    @Test
    void testFindLastAndLastWithCase() {
        data.add("Foo");
        data.add("Baz");
        data.add("Cafe");
        data.add("Hoop");

        sortedListModel = new GenericSortedListModel<String>(new Comparator<String>() {
            public int compare(String left, String right) {
              return left.compareTo(right);
            }
          });

        final List<String> list = sortedListModel.getElementAt(10);
        assertEquals("Foo", list.get(0));
        assertEquals("Baz", list.get(1));
        assertEquals("Cafe", list.get(2));
    }

    private List<SortedListModel<String>> sortedListModel = new ArrayList<SortedListModel<String>>();

    @Test
    void testFindFirstAndLast() {
        data.add("Foo");
        data.add("Bar");
        data.add("Bar");
        data.add("Car");
        data.add("Bar");
        data.add("Baz");
        data.add("Hoop");

        final GenericSortedListModel<String> smv = new GenericSortedListModel<String>(new Comparator<String>() {
            public int compare(String left, String right) {
              return left.compareTo(right);
            }
          });

        final List<String> list = smv.getElementAt(10);
        assertEquals("Foo", list.get(0));
}
}