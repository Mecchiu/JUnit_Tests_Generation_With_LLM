package scenario1;


import java.util.ArrayList;
import java.util.List;


class GetPositive {

    public static List<Object> getPositive(List<Object> l) {
        List<Object> result = new ArrayList<Object>();
        for (Object value : l) {
            if (value instanceof Integer) {
                int i = (Integer) value;
                if (i > 0) {
                    result.add(i);
                }
            }
        }
        return result;
    }

}