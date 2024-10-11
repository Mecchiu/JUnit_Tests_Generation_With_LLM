package scenario1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class GetRow {

    public static List<Object> getRow(List<Object> lst, int x) {
        List<Object> result = new ArrayList<Object>();
        for (int i = 0; i < lst.size(); i++) {
            List<Object> row = (List<Object>) lst.get(i);
            for (int j = 0; j < row.size(); j++) {
                if (row.get(j).equals(x)) {
                    List<Object> coordinate = new ArrayList<Object>();
                    coordinate.add(i);
                    coordinate.add(j);
                    result.add(coordinate);
                }
            }
        }
        Collections.sort(result, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                List<Object> c1 = (List<Object>) o1;
                List<Object> c2 = (List<Object>) o2;
                int row1 = (Integer) c1.get(0);
                int row2 = (Integer) c2.get(0);
                if (row1 != row2) {
                    return row1 - row2;
                }
                int col1 = (Integer) c1.get(1);
                int col2 = (Integer) c2.get(1);
                return col2 - col1;
            }
        });
        return result;
    }

}