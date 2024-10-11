package scenario2;


import java.util.List;


class Search {
    /**
     * * You are given a non-empty list of positive integers. Return the greatest integer that is greater than
     * zero, and has a frequency greater than or equal to the value of the integer itself.
     * The frequency of an integer is the number of times it appears in the list.
     * If no such a value exist, return -1.
     */
    public static int search(List<Integer> lst) {
        int max = -1;
        int[] freq = new int[11];
        for (int i = 0; i < lst.size(); i++) {
            freq[lst.get(i)]++;
        }
        for (int i = 1; i < 11; i++) {
            if (freq[i] >= i) {
                max = i;
            }
        }
        return max;
    }

}