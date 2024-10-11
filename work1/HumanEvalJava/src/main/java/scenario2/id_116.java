package scenario2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SortArray {
    /**
     * * In this Kata, you have to sort an array of non-negative integers according to
     * number of ones in their binary representation in ascending order.
     * For similar number of ones, sort based on decimal value.
     */
    public static List<Object> sortArray(List<Object> arr) {
        List<Object> sorted = new ArrayList<Object>();
        for (int i = 0; i < arr.size(); i++) {
            int num = ((Number) arr.get(i)).intValue();
            int ones = 0;
            while (num > 0) {
                ones += num % 2;
                num /= 2;
            }
            sorted.add(new int[]{ones, ((Number) arr.get(i)).intValue()});
        }
        Collections.sort(sorted, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                int[] a1 = (int[]) o1;
                int[] a2 = (int[]) o2;
                if (a1[0] == a2[0]) {
                    return a1[1] - a2[1];
                }
                return a1[0] - a2[0];
            }
        });
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < sorted.size(); i++) {
            result.add(((int[]) sorted.get(i))[1]);
        }
        return result;
    }

}