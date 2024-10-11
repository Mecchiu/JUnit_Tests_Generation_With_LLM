package scenario2;


import java.util.List;


class CanArrange {
    /**
     * Create a function which returns the largest index of an element which
     * is not greater than or equal to the element immediately preceding it. If
     * no such element exists then return -1. The given array will not contain
     * duplicate values.
     */
    public static int canArrange(List<Object> arr) {
        int max = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                if (i > 0 && (int) arr.get(i) < (int) arr.get(i - 1)) {
                    max = i;
                }
            }
        }
        return max;
    }

}