package scenario1;


class Multiply {

    public static int multiply(int a, int b) {
        if (a < 0) a = -a;
        if (b < 0) b = -b;
        return (a % 10) * (b % 10);
    }

}