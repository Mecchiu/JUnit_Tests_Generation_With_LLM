package scenario1;


import java.util.ArrayList;
import java.util.List;


class LargestSmallestIntegers {

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