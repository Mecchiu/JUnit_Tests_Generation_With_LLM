package scenario1;


import java.util.ArrayList;
import java.util.List;


class FilterBySubstring {

    public static List<Object> filterBySubstring(List<Object> strings, String substring) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).toString().contains(substring)) {
                result.add(strings.get(i));
            }
        }
        return result;
    }

}