package scenario2;


import java.util.List;


class MaxElement {
    /**
     * Return maximum element in the list.
     */
    public static int maxElement(List<Integer> l) {
        int max = Integer.MIN_VALUE;
        for (Integer i : l) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}