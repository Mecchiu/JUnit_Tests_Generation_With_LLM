package scenario1;


import java.util.List;


class TotalMatch {

    public static List<Object> totalMatch(List<Object> lst1, List<Object> lst2) {
        int sum1 = 0;
        int sum2 = 0;
        for (Object value : lst1) {
            if (value instanceof String) {
                sum1 += ((String) value).length();
            }
        }
        for (Object value : lst2) {
            if (value instanceof String) {
                sum2 += ((String) value).length();
            }
        }
        if (sum1 <= sum2) {
            return lst1;
        } else {
            return lst2;
        }
    }

}