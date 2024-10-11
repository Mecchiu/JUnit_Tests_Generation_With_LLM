package scenario1;


import java.util.ArrayList;
import java.util.List;


class Intersperse {

    public static List<Object> intersperse(List<Object> numbers, int delimiter) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add(numbers.get(i));
            if (i < numbers.size() - 1) {
                result.add(delimiter);
            }
        }
        return result;
    }

}