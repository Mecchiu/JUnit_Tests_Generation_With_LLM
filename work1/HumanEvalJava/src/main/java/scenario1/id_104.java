package scenario1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class UniqueDigits {

    public static List<Object> uniqueDigits(List<Integer> x) {
        List<Object> result = new ArrayList<Object>();
        for (int value : x) {
            boolean hasEven = false;
            int oldValue = value;
            while (value > 0) {
                if (value % 2 == 0) {
                    hasEven = true;
                    break;
                }
                value /= 10;
            }
            if (!hasEven) {
                result.add(oldValue);
            }
        }
        Collections.sort(result, new Comparator<Object>() {
            public int compare(Object a, Object b) {
                return (Integer) a - (Integer) b;
            }
        });
        return result;
    }

}