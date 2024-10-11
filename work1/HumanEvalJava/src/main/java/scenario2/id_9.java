package scenario2;


import java.util.ArrayList;
import java.util.List;


class RollingMax {
    /**
     * From a given list of integers, generate a list of rolling maximum element found until given moment
     * in the sequence.
     */
    public static List<Object> rollingMax(List<Object> numbers) {
        List<Object> result = new ArrayList<Object>();
        Integer max = null;
        for (Object number : numbers) {
            if (number instanceof Integer) {
                if (max == null || (Integer) number > max) {
                    max = (Integer) number;
                }
                result.add(max);
            } else {
                throw new IllegalArgumentException("Invalid number type");
            }
        }
        return result;
    }


}