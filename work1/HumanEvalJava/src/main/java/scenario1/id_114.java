package scenario1;


import java.util.List;


class Minsubarraysum {

    public static long minsubarraysum(List<Object> nums) {
        long s = 0;
        long max_sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            long num = ((Number) nums.get(i)).longValue();
            s -= num;
            if (s < 0) {
                s = 0;
            }
            max_sum = Math.max(s, max_sum);
        }
        if (max_sum == 0) {
            max_sum = -((Number) nums.get(0)).longValue();
            for (int i = 0; i < nums.size(); i++) {
                max_sum = Math.max(-((Number) nums.get(i)).longValue(), max_sum);
            }
        }
        long min_sum = -max_sum;
        return min_sum;
    }

}