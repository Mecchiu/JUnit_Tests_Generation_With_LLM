package scenario2;


import java.util.Collections;
import java.util.List;


class Median {
    /**
     * Return median of elements in the list l.
     */
    public static Number median(List<Integer> l) {
        Collections.sort(l);
        int size = l.size();
        if (size % 2 == 0) {
            return (l.get(size / 2) + l.get(size / 2 - 1)) / 2.0;
        } else {
            return l.get(size / 2);
        }
    }

}