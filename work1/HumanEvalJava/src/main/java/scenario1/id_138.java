package scenario1;


class IsEqualToSumEven {

    public static Boolean isEqualToSumEven(int n) {
        if (n < 8) {
            return false;
        }
        return n % 2 == 0;
    }

}