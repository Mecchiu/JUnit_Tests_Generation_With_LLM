package scenario1;


import java.util.Arrays;
import java.util.List;


class Eat {

    public static List<Integer> eat(int number, int need, int remaining) {

        if (need <= remaining) {
            return Arrays.asList(number + need, remaining - need);
        } else {
            return Arrays.asList(number + remaining, 0);
        }
    }

}