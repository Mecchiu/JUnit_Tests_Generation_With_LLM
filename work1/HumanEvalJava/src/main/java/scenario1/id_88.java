package scenario1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SortArray1 {

    public static List<Object> sortArray(List<Object> array) {
        if (array.size() <= 1) {
            return array;
        }
        int sum = (Integer) array.get(0) + (Integer) array.get(array.size() - 1);
        List<Object> sortedArray = new ArrayList<Object>(array);
        Collections.sort(sortedArray, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return (Integer) o1 - (Integer) o2;
            }
        });
        if (sum % 2 == 0) {
            Collections.reverse(sortedArray);
        }
        return sortedArray;
    }

}