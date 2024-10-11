package scenario2;


class CircularShift {
    /**
     * Circular shift the digits of the integer x, shift the digits right by shift
     * and return the result as a string.
     * If shift > number of digits, return digits reversed.
     */
    public static String circularShift(int x, int shift) {
        String result = "";
        String xString = Integer.toString(x);
        int xLength = xString.length();
        if (shift > xLength) {
            for (int i = xLength - 1; i >= 0; i--) {
                result += xString.charAt(i);
            }
        } else {
            for (int i = xLength - shift; i < xLength; i++) {
                result += xString.charAt(i);
            }
            for (int i = 0; i < xLength - shift; i++) {
                result += xString.charAt(i);
            }
        }
        return result;
    }

}