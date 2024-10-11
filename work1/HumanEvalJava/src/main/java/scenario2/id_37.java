package scenario2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class SortEven {
    /**
     * This function takes a list l and returns a list l' such that
     * l' is identical to l in the odd indices, while its values at the even indices are equal
     * to the values of the even indices of l, but sorted.
     */
    public static List<Integer> sortEven(List<Integer> l) {
        List<Integer> l2 = new ArrayList<Integer>(l);
        for (int i = 0; i < l.size(); i++) {
            if (i % 2 == 0) {
                List<Integer> subl = new ArrayList<Integer>();
                for (int j = 0; j < l.size(); j++) {
                    if (j % 2 == 0) {
                        subl.add(l.get(j));
                    }
                }
                Collections.sort(subl);
                l2.set(i, subl.get(i / 2));
            }
        }
        return l2;
    }

}