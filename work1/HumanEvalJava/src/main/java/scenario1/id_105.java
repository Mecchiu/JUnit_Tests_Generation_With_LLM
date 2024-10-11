package scenario1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class ByLength {

    public static List<Object> byLength(List<Object> arr) {
        List<Integer> sorted = new ArrayList<Integer>();
        for (Object value : arr) {
            if (value instanceof Integer) {
                sorted.add((Integer) value);
            }
        }
        Collections.sort(sorted);
        Collections.reverse(sorted);
        List<Object> result = new ArrayList<Object>();
        for (Integer value : sorted) {
            if (value >= 1 && value <= 9) {
                switch (value) {
                    case 1:
                        result.add("One");
                        break;
                    case 2:
                        result.add("Two");
                        break;
                    case 3:
                        result.add("Three");
                        break;
                    case 4:
                        result.add("Four");
                        break;
                    case 5:
                        result.add("Five");
                        break;
                    case 6:
                        result.add("Six");
                        break;
                    case 7:
                        result.add("Seven");
                        break;
                    case 8:
                        result.add("Eight");
                        break;
                    case 9:
                        result.add("Nine");
                        break;
                }
            }
        }
        return result;
    }

}