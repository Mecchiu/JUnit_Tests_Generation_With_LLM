package scenario1;


import java.util.ArrayList;
import java.util.List;


class FilterByPrefix {

    public static List<Object> filterByPrefix(List<Object> strings, String prefix) {
        List<Object> result = new ArrayList<Object>();
        for (Object string : strings) {
            if (string.toString().startsWith(prefix)) {
                result.add(string);
            }
        }
        return result;
    }

}