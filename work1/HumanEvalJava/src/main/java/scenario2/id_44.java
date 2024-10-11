package scenario2;


class ChangeBase {
    /**
     * Change numerical base of input number x to base.
     * return string representation after the conversion.
     * base numbers are less than 10.
     */
    public static String changeBase(int x, int base) {
        String result = "";
        while (x > 0) {
            result = (x % base) + result;
            x = x / base;
        }
        return result;
    }

}