package scenario1;


import java.util.ArrayList;
import java.util.List;


class AllPrefixes {

    public static List<Object> allPrefixes(String string) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < string.length(); i++) {
            result.add(string.substring(0, i + 1));
        }
        return result;
    }

}