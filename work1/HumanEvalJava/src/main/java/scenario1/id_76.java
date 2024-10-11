package scenario1;


class IsSimplePower {

    public static Boolean isSimplePower(int x, int n) {
        if (x == 1) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        int y = n;
        while (y < x) {
            y *= n;
        }
        return y == x;
    }

}