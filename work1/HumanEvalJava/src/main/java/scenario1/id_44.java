package scenario1;


class ChangeBase {

    public static String changeBase(int x, int base) {
        String result = "";
        while (x > 0) {
            result = (x % base) + result;
            x = x / base;
        }
        return result;
    }

}