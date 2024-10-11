package scenario2;


import java.util.ArrayList;
import java.util.List;


class FilterIntegers {
    /**
     * Filter given list of any Java values only for integers
     */
    public static List<Object> filterIntegers(List<Object> values) {
        List<Object> result = new ArrayList<Object>();
        for (Object value : values) {
            if (value instanceof Integer) {
                result.add(value);
            }
        }
        return result;
    }

}