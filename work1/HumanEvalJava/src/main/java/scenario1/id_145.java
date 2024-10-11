package scenario1;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class OrderByPoints {

    public static List<Object> orderByPoints(List<Object> nums) {
        Collections.sort(nums, new Comparator<Object>() {
            int digitsum(int n) {
                boolean neg = false;
                if (n < 0) {
                    neg = true;
                    n = -n;
                }
                int sum = 0;
                while (n > 0) {
                    if (n / 10 == 0 && neg)
                        sum -= n % 10;
                    else
                        sum += n % 10;
                    n = n / 10;
                }
                return sum;
            }

            public int compare(Object o1, Object o2) {
                return digitsum((int) o1) - digitsum((int) o2);
            }
        });
        return nums;
    }

}