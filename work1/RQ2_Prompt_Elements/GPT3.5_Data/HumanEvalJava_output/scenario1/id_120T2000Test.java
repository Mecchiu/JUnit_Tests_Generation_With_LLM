// Maximum1.java
package scenario1;

import java.util.*;

class Maximum1 {

    /**
     * Returns the k maximum elements from the given list.
     * If the list is empty or k is 0, returns an empty list.
     * If the list size is less than or equal to k, returns the sorted list.
     * Otherwise, uses a priority queue to find the k maximum elements.
     *
     * @param arr the list of integers
     * @param k   the number of maximum elements to return
     * @return a list of the k maximum elements
     */
    public static List<Integer> maximum(List<Integer> arr, int k) {
        int n = arr.size();
        if (n == 0 || k == 0) {
            return new ArrayList<>();
        }
        if (n <= k) {
            Collections.sort(arr);
            return new ArrayList<>(arr);
        }
        List<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(k);
        for (int i = 0; i < n; i++) {
            if (i < k) {
                heap.add(arr.get(i));
            } else {
                if (arr.get(i) > heap.peek()) {
                    heap.poll();
                    heap.add(arr.get(i));
                }
            }
        }
        for (int i = 0; i < k; i++) {
            res.add(heap.poll());
        }
        Collections.sort(res);
        return res;
    }
}

// Maximum1Test.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Maximum1}.
 * It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
 */
class Maximum1Test {

    @Test
    void testEmptyList() {
        List<Integer> arr = new ArrayList<>();
        List<Integer> res = Maximum1.maximum(arr, 3);
        assertEquals(0, res.size());
    }

    @Test
    void testZeroK() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 0);
        assertEquals(0, res.size());
    }

    @Test
    void testListSizeLessThanK() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 7);
        assertEquals(arr, res);
    }

    @Test
    void testListSizeEqualToK() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 5);
        assertEquals(arr, res);
    }

    @Test
    void testListSizeGreaterThanK() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 3);
        assertEquals(Arrays.asList(3, 4, 5), res);
    }

    @Test
    void testListWithDuplicates() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        List<Integer> res = Maximum1.maximum(arr, 4);
        assertEquals(Arrays.asList(2, 3, 4, 5), res);
    }

    @Test
    void testListWithNegativeNumbers() {
        List<Integer> arr = Arrays.asList(-5, -4, -3, -2, -1);
        List<Integer> res = Maximum1.maximum(arr, 2);
        assertEquals(Arrays.asList(-2, -1), res);
    }

    @Test
    void testListWithZero() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 0, -1, -2);
        List<Integer> res = Maximum1.maximum(arr, 3);
        assertEquals(Arrays.asList(1, 2, 3), res);
    }

    @Test
    void testListWithAllEqualNumbers() {
        List<Integer> arr = Arrays.asList(1, 1, 1, 1, 1);
        List<Integer> res = Maximum1.maximum(arr, 2);
        assertEquals(Arrays.asList(1, 1), res);
    }

    @Test
    void testListWithOneNumber() {
        List<Integer> arr = Arrays.asList(42);
        List<Integer> res = Maximum1.maximum(arr, 1);
        assertEquals(Arrays.asList(42), res);
    }
}