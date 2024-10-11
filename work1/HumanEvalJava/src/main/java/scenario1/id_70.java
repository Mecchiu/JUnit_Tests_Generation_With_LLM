package scenario1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class StrangeSortList {

    public static List<Object> strangeSortList(List<Object> lst) {
        List<Object> result = new ArrayList<Object>();
        List<Integer> sorted = new ArrayList<Integer>();
        for (Object value : lst) {
            if (value instanceof Integer) {
                sorted.add((Integer) value);
            }
        }
        Collections.sort(sorted);
        int i = 0;
        int j = sorted.size() - 1;
        while (i <= j) {
            result.add(sorted.get(i));
            if (i != j) {
                result.add(sorted.get(j));
            }
            i++;
            j--;
        }
        return result;
    }

}