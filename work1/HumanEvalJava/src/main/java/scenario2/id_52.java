package scenario2;


import java.util.List;


class BelowThreshold {
    /**
     * Return True if all numbers in the list l are below threshold t.
     */
    public static Boolean belowThreshold(List<Integer> l, int t) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) >= t) {
                return false;
            }
        }
        return true;
    }

}