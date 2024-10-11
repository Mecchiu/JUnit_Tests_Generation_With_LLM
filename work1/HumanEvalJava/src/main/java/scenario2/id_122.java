package scenario2;


import java.util.List;


class AddElements {
    /**
     * * Given a non-empty array of integers arr and an integer k, return
     * the sum of the elements with at most two digits from the first k elements of arr.
     */
    public static int addElements(List<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

}