package scenario1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class SortedListSum {

    public static List<Object> sortedListSum(List<String> lst) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).length() % 2 == 0) {
                result.add(lst.get(i));
            }
        }
        Collections.sort(result, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1.toString().length() == o2.toString().length()) {
                    return o1.toString().compareTo(o2.toString());
                } else {
                    return o1.toString().length() - o2.toString().length();
                }
            }
        });
        return result;
    }

}