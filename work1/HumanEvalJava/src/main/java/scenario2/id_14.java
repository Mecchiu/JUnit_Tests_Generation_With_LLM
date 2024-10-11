package scenario2;


import java.util.ArrayList;
import java.util.List;


class AllPrefixes {
    /**
     * Return list of all prefixes from shortest to longest of the input string
     */
    public static List<Object> allPrefixes(String string) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.substring(0, i + 1));
        }
        return result;
    }

}