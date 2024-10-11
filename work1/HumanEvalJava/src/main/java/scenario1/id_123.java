package scenario1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class GetOddCollatz {

    public static List<Integer> getOddCollatz(int n) {
        List<Integer> result = new ArrayList<Integer>();
        while (n != 1) {
            if (n % 2 == 1) {
                result.add(n);
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        result.add(1);
        Collections.sort(result);
        return result;
    }

}