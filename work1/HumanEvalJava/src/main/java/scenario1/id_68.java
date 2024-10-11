package scenario1;


import java.util.ArrayList;
import java.util.List;


class Pluck {

    public static List<Object> pluck(List<Object> arr) {
        List<Object> result = new ArrayList<Object>();
        int min = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                int value = (Integer) arr.get(i);
                if (value % 2 == 0 && value < min) {
                    min = value;
                    index = i;
                }
            }
        }
        if (index != -1) {
            result.add(min);
            result.add(index);
        }
        return result;
    }

}