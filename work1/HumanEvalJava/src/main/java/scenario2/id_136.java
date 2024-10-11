package scenario2;


import java.util.ArrayList;
import java.util.List;


class LargestSmallestIntegers {
    /**
     * * Create a function that returns a tuple (a, b), where 'a' is
     * the largest of negative integers, and 'b' is the smallest
     * of positive integers in a list.
     * If there is no negative or positive integers, return them as None.
     */
    public static List<Integer> largestSmallestIntegers(List<Object> lst) {
        List<Integer> result = new ArrayList<Integer>();
        int largestNegative = Integer.MIN_VALUE;
        int smallestPositive = Integer.MAX_VALUE;
        for (int i = 0; i < lst.size(); i++) {
            int curr = (Integer) lst.get(i);
            if (curr < 0) {
                if (curr > largestNegative) {
                    largestNegative = curr;
                }
            } else if (curr > 0) {
                if (curr < smallestPositive) {
                    smallestPositive = curr;
                }
            }
        }
        if (largestNegative == Integer.MIN_VALUE) {
            result.add(null);
        } else {
            result.add(largestNegative);
        }
        if (smallestPositive == Integer.MAX_VALUE) {
            result.add(null);
        } else {
            result.add(smallestPositive);
        }
        return result;
    }

}