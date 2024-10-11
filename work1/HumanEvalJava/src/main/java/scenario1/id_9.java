package scenario1;


import java.util.ArrayList;
import java.util.List;


class RollingMax {

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