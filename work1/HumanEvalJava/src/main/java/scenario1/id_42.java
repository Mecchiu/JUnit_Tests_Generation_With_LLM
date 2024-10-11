package scenario1;


import java.util.ArrayList;
import java.util.List;


class IncrList {

    public static List<Object> incrList(List<Object> l) {
        List<Object> result = new ArrayList<Object>();
        for (Object value : l) {
            if (value instanceof Integer) {
                int i = (Integer) value;
                result.add(i + 1);
            }
        }
        return result;
    }

}