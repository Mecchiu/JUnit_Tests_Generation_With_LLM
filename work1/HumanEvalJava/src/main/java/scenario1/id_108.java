package scenario1;


import java.util.List;


class CountNums {

    public static int countNums(List<Object> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            int num = (int) arr.get(i);
            boolean isNegative = num < 0;
            if (isNegative) {
                num = -num;
            }
            while (num != 0) {
                if (isNegative && num / 10 == 0) {
                    sum -= num % 10;
                } else {
                    sum += num % 10;
                }
                num /= 10;

            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

}