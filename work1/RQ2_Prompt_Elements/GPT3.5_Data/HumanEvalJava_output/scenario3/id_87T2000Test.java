// GetRow.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class GetRow {

    /**
     * * You are given a 2 dimensional data, as a nested lists,
     * which is similar to matrix, however, unlike matrices,
     * each row may contain a different number of columns.
     * Given lst, and integer x, find integers x in the list,
     * and return list of tuples, [(x1, y1), (x2, y2) ...] such that
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
    public static List<List<Integer>> getRow(List<List<Integer>> lst, int x) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            List<Integer> row = lst.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j) == x) {
                    List<Integer> tuple = new ArrayList<>();
                    tuple.add(i);
                    tuple.add(j);
                    result.add(tuple);
                }
            }
        }
        result.sort((a, b) -> a.get(0) - b.get(0));
        for (List<Integer> row : result) {
            List<Integer> tuple = lst.get(row.get(0));
            tuple.sort((a, b) -> b - a);
        }
        return result;
    }
}

// GetRowTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {

    @Test
    void testEmptyList() {
        List<List<Integer>> lst = new ArrayList<>();
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(0, result.size());
    }

    @Test
    void testSingleElementList() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1));
        List<List<Integer>> result = GetRow.getRow(lst, 2);
        assertEquals(0, result.size());
    }

    @Test
    void testListWithEmptyRow() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.add(Arrays.asList(1));
        lst.add(Arrays.asList(1, 2, 3));
        List<List<Integer>> result = GetRow.getRow(lst, 3);
        assertEquals(1, result.size());
        assertEquals(Arrays.asList(2, 2), result.get(0));
    }

    @Test
    void testListWithMultipleRows() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(5, result.size());
        assertEquals(Arrays.asList(0, 0), result.get(0));
        assertEquals(Arrays.asList(1, 4), result.get(1));
        assertEquals(Arrays.asList(1, 0), result.get(2));
        assertEquals(Arrays.asList(2, 5), result.get(3));
        assertEquals(Arrays.asList(2, 0), result.get(4));
    }

    @Test
    void testListWithRepeatedElements() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        lst.add(Arrays.asList(1, 2, 3, 4, 5, 1));
        lst.add(Arrays.asList(1, 2, 3, 4, 1, 6));
        List<List<Integer>> result = GetRow.getRow(lst, 1);
        assertEquals(8, result.size());
        assertEquals(Arrays.asList(0, 0), result.get(0));
        assertEquals(Arrays.asList(1, 4), result.get(1));
        assertEquals(Arrays.asList(1, 0), result.get(2));
        assertEquals(Arrays.asList(2, 5), result.get(3));
        assertEquals(Arrays.asList(2, 0), result.get(4));
        assertEquals(Arrays.asList(3, 4), result.get(5));
        assertEquals(Arrays.asList(3, 0), result.get(6));
        assertEquals(Arrays.asList(3, 4), result.get(7));
    }

    @Test
    void testListWithNegativeElements() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(-1, -2, -3, -4, -5, -6));
        lst.add(Arrays.asList(-1, -2, -3, -4, -1, -6));
        lst.add(Arrays.asList(-1, -2, -3, -4, -5, -1));
        List<List<Integer>> result = GetRow.getRow(lst, -1);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList(0, 0), result.get(0));
        assertEquals(Arrays.asList(1, 4), result.get(1));
        assertEquals(Arrays.asList(2, 5), result.get(2));
    }

    @Test
    void testListWithZeroElements() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(0, 0, 0, 0, 0, 0));
        lst.add(Arrays.asList(0, 0, 0, 0, 1, 0));
        lst.add(Arrays.asList(0, 0, 0, 0, 0, 1));
        List<List<Integer>> result = GetRow.getRow(lst, 0);
        assertEquals(6, result.size());
        assertEquals(Arrays.asList(0, 5), result.get(0));
        assertEquals(Arrays.asList(0, 4), result.get(1));
        assertEquals(Arrays.asList(0, 3), result.get(2));
        assertEquals(Arrays.asList(0, 2), result.get(3));
        assertEquals(Arrays.asList(0, 1), result.get(4));
        assertEquals(Arrays.asList(0, 0), result.get(5));
    }

    @Test
    void testListWithMaxIntegerElements() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        lst.add(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        lst.add(Arrays.asList(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        List<List<Integer>> result = GetRow.getRow(lst, Integer.MAX_VALUE);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList(0, 2), result.get(0));
        assertEquals(Arrays.asList(1, 3), result.get(1));
        assertEquals(Arrays.asList(2, 4), result.get(2));
    }

    @Test
    void testListWithMinIntegerElements() {
        List<List<Integer>> lst = new ArrayList<>();
        lst.add(Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
        lst.add(Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
        lst.add(Arrays.asList(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
        List<List<Integer>> result = GetRow.getRow(lst, Integer.MIN_VALUE);
        assertEquals(3, result.size());
        assertEquals(Arrays.asList(0, 2), result.get(0));
        assertEquals(Arrays.asList(1, 3), result.get(1));
        assertEquals(Arrays.asList(2, 4), result.get(2));
    }
}