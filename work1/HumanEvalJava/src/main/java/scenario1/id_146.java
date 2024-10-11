package scenario1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


class Specialfilter {

    public static int specialfilter(List<Object> nums) {
        int count = 0;
        for (Object num : nums) {
            if ((int) num > 10) {

                Set odd_digits = new HashSet<Integer>(Arrays.asList(1, 3, 5, 7, 9));
                String number_as_string = Integer.toString((int) num);
                if (odd_digits.contains(Integer.parseInt(number_as_string.substring(0, 1))) && odd_digits.contains(Integer.parseInt(number_as_string.substring(number_as_string.length() - 1)))) {
                    count += 1;
                }
            }
        }
        return count;
    }

}