package scenario2;


import java.util.*;


class Maximum1 {
    /**
     * * Given an array arr of integers and a positive integer k, return a sorted list
     * of length k with the maximum k numbers in arr.
     *
     *
     * Note:
     * 1. The length of the array will be in the range of [1, 1000].
     * 2. The elements in the array will be in the range of [-1000, 1000].
     * 3. 0 <= k <= len(arr)
     */
    public static List<Object> maximum(List<Integer> arr, int k) {
        int n = arr.size();
        if (n == 0 || k == 0) {
            return new ArrayList<Object>();
        }
        if (n <= k) {

            Collections.sort(arr);
            return new ArrayList<Object>(arr);
        }
        List<Object> res = new ArrayList<Object>();
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
        Collections.sort(res, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                return (int) o1 - (int) o2;
            }
        });
        return res;
    }

}