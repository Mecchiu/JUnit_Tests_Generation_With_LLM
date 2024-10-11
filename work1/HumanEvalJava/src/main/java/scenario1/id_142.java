package scenario1;


import java.util.ArrayList;
import java.util.List;


class SumSquares1 {

    public static int sumSquares(List<Object> lst) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                result.add((int) lst.get(i) * (int) lst.get(i));
            } else if (i % 4 == 0 && i % 3 != 0) {
                result.add((int) lst.get(i) * (int) lst.get(i) * (int) lst.get(i));
            } else {
                result.add((int) lst.get(i));
            }
        }
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += result.get(i);
        }
        return sum;
    }

}