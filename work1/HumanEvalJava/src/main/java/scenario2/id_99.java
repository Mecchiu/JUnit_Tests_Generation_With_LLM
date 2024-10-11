package scenario2;


class ClosestInteger {
    /**
     * * Create a function that takes a value (string) representing a number
     * and returns the closest integer to it. If the number is equidistant
     * from two integers, round it away from zero.
     *
     *
     *
     * Note:
     * Rounding away from zero means that if the given number is equidistant
     * from two integers, the one you should return is the one that is the
     * farthest from zero. For example closest_integer("14.5") should
     * return 15 and closest_integer("-14.5") should return -15.
     */
    public static int closestInteger(String value) {
        double d = Double.parseDouble(value);
        if (d > 0) {
            return (int) Math.floor(d + 0.5);
        } else {
            return (int) Math.ceil(d - 0.5);
        }
    }

}