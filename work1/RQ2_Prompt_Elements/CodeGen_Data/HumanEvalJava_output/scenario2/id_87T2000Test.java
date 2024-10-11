// GetRowTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains one unit test case for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
// GetRow.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class GetRow {

    /**
     * * You are given a 2 dimensional data, as a nested lists,
     * which is similar to matrix, however, unlike matrices,
     * each row may contain a different number of columns.
     * Given lst, and integer x, find integers x in the list,
     * and return list of tuples, [(x1, y1), (x2, y2)...] such that
     * each tuple is a coordinate - (row, columns), starting with 0.
     * Sort coordinates initially by rows in ascending order.
     * Also, sort coordinates of the row by columns in descending order.
     */
    public static List<Object> getRow(List<Object> lst, int x) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < lst.size(); i++) {
            List<Object> row = (List<Object>) lst.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j).equals(x)) {
                    List<Object> coordinate = new ArrayList<Object>();
                    coordinate.add(i);
                    coordinate.add(j);
                    result.add(coordinate);
                }
            }
        }
        Collections.sort(result, new Comparator<Object>() {

            public int compare(Object o1, Object o2) {
                List<Object> c1 = (List<Object>) o1;
                List<Object> c2 = (List<Object>) o2;
                int row1 = (Integer) c1.get(0);
                int row2 = (Integer) c2.get(0);
                if (row1!= row2) {
                    return row1 - row2;
                }
                int col1 = (Integer) c1.get(1);
                int col2 = (Integer) c2.get(1);
                return col2 - col1;
            }
        });
        return result;
    }
}

// GetRowTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains one unit test case for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
		/**
		 * Constructs a new {@link GetRowTest} instance.
		 */
		public GetRowTest() {
		}
		
		/**
		 * Test method for {@link GetRow#getRow(List, int)}.
		 * 1. creates a 2 dimensional data structure,
		 * which is similar to matrix, but has 4 rows and 3 columns,
		 * and then sorts it in ascending order (the default).
		 * 2. sorts the row by columns, starting
		 * with the first column of the first row (first column is 0);
		 * 3. sorts the row by rows, starting
		 * with the first row of the first column (first row is 0);
		 * 4. sorts the row by columns, ascending
		 * (by the default, it uses the integer comparator).
		 * @throws Exception if one of the ordered tests fail
		 */
		@Test
    public void testGetRow() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        List<List<Integer>> listlist = new ArrayList<List<Integer>>();
        listlist.add(list);
        listlist.add(list);
        listlist.add(list);
        listlist.add(list);
        List<Comparator<String>> comparators = new ArrayList<Comparator<String>>();
        comparators.add(Collections.reverseOrder(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return ((Integer)o1).compareTo((Integer) o2);
            }
        }));
        list = getRow(listlist, 13);
        assertEquals(list.get(0), list.get(1));
        assertEquals(list.get(1), list.get(0));
        assertEquals(list.get(4), list.get(2));
        assertEquals(list.get(4), list.get(3));
        assertEquals(list.get(5), list.get(8));
        assertEquals(list.get(7), list.get(5));
        System.out.println("Comparator order of list [" + Arrays.asList(comparators.get(0)) + "]");
        System.out.println("List size of list " + list.size());
    }
}
