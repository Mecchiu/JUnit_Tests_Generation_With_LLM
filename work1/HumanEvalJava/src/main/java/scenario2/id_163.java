package scenario2;


import java.util.ArrayList;
import java.util.List;


class GenerateIntegers {
    /**
     * * Given two positive integers a and b, return the even digits between a
     * and b, in ascending order.
     */
    public static List<Object> generateIntegers(int a, int b) {
        int lower = Math.max(2, Math.min(a, b));
        int upper = Math.min(8, Math.max(a, b));
        List<Object> result = new ArrayList<>();
        for (int i = lower; i <= upper; i++) {
            if (i % 2 == 0) {
                result.add(i);
            }
        }
        return result;
    }


}