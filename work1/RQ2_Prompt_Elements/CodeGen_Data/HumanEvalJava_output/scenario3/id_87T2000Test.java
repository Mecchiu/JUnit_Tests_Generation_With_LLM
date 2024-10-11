// GetRowTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains one unit test case for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
// GetRow.java
package scenario3;

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
     *
     * Examples:
     * getRow([
     * [1,2,3,4,5,6],
     * [1,2,3,4,1,6],
     * [1,2,3,4,5,1]
     * ], 1) == [(0, 0), (1, 4), (1, 0), (2, 5), (2, 0)]
     * getRow([], 1) == []
     * getRow([[], [1], [1, 2, 3]], 3) == [(2, 2)]
     *
     * > getRow([], 1)
     * []
     * > getRow([[1]], 2)
     * []
     * > getRow([[], [1], [1, 2, 3]], 3)
     * [[2, 2]]
     */
    public static List<Object> getRow(List<Object> lst, int x) {
    }
}

// GetRowTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains one unit test case for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
		/**
		* Test of getRow.
		*/
		@Test
		void given1() {
				GetRow obj = new GetRow();
				assertEquals(0, obj.getRow(null, 0));
				assertEquals(0, obj.getRow(null, 1));
				assertEquals(1, obj.getRow(null, 2));
				assertEquals(2, obj.getRow(null, 3));
				assertEquals(2, obj.getRow(null, 4));
				assertEquals(1, obj.getRow(null, 5));
				assertEquals(1, obj.getRow(null, 6));
		}
}
