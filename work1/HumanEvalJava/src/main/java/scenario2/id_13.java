package scenario2;


class GreatestCommonDivisor {
    /**
     * Return a greatest common divisor of two integers a and b
     */
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0) {
            return b;
        }
        return greatestCommonDivisor(b % a, a);
    }

}