// Maximum1.java
package scenario2;

import java.util.*;

class Maximum1 {

    /**
     * * Given an array arr of integers and a positive integer k, return a sorted list
     * of length k with the maximum k numbers in arr.
     *
     * Note:
     * 1. The length of the array will be in the range of [1, 1000].
     * 2. The elements in the array will be in the range of [-1000, 1000].
     * 3. 0 <= k <= len(arr)
     */
    public static List<Integer> maximum(List<Integer> arr, int k) {
        int n = arr.size();
        if (n == 0 || k == 0) {
            return new ArrayList<Integer>();
        }
        if (n <= k) {
            Collections.sort(arr);
            return new ArrayList<Integer>(arr);
        }
        List<Integer> res = new ArrayList<Integer>();
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k);
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
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Maximum1}.
* It contains ten unit test cases for the {@link Maximum1#maximum(List, int)} method.
*/
class Maximum1Test {

    @Test
    void testEmptyArray() {
        List<Integer> arr = new ArrayList<Integer>();
        List<Integer> res = Maximum1.maximum(arr, 3);
        assertEquals(0, res.size());
    }

    @Test
    void testKZero() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 0);
        assertEquals(0, res.size());
    }

    @Test
    void testKGreaterThanArrayLength() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 6);
        assertEquals(arr, res);
    }

    @Test
    void testKEqualsArrayLength() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 5);
        assertEquals(arr, res);
    }

    @Test
    void testKOne() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 1);
        assertEquals(Arrays.asList(5), res);
    }

    @Test
    void testKTwo() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, 2);
        assertEquals(Arrays.asList(4, 5), res);
    }

    @Test
    void testKNegative() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> res = Maximum1.maximum(arr, -1);
        assertEquals(0, res.size());
    }

    @Test
    void testAllEqual() {
        List<Integer> arr = Arrays.asList(5, 5, 5, 5, 5);
        List<Integer> res = Maximum1.maximum(arr, 3);
        assertEquals(Arrays.asList(5, 5, 5), res);
    }

    @Test
    void testRandomArray() {
        List<Integer> arr = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        List<Integer> res = Maximum1.maximum(arr, 4);
        assertEquals(Arrays.asList(5, 5, 6, 9), res);
    }

    @Test
    void testNegativeNumbers() {
        List<Integer> arr = Arrays.asList(-5, -2, -3, -1, -4);
        List<Integer> res = Maximum1.maximum(arr, 3);
        assertEquals(Arrays.asList(-2, -3, -1), res);
    }
}