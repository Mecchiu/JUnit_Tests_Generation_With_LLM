package scenario2;


import java.util.ArrayList;
import java.util.List;


class FilterBySubstring {
    /**
     * Filter an input list of strings only for ones that contain given substring
     */
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