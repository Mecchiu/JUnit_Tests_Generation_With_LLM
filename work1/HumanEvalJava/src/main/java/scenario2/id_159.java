package scenario2;


import java.util.Arrays;
import java.util.List;


class Eat {
    /**
     * * You're a hungry rabbit, and you already have eaten a certain number of carrots,
     * but now you need to eat more carrots to complete the day's meals.
     * you should return an array of [ total number of eaten carrots after your meals,
     * the number of carrots left after your meals ]
     * if there are not enough remaining carrots, you will eat all remaining carrots, but will still be hungry.
     *
     *
     * Variables:
     *
     * @number : integer
     * the number of carrots that you have eaten.
     * @need : integer
     * the number of carrots that you need to eat.
     * @remaining : integer
     * the number of remaining carrots that exist in stock
     *
     * Constrain:
     * * 0 <= number <= 1000
     * * 0 <= need <= 1000
     * * 0 <= remaining <= 1000
     */
    public static List<Integer> eat(int number, int need, int remaining) {

        if (need <= remaining) {
            return Arrays.asList(number + need, remaining - need);
        } else {
            return Arrays.asList(number + remaining, 0);
        }
    }

}