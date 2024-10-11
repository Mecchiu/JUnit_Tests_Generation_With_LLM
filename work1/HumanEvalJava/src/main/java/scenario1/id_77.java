package scenario1;


class Iscube {

    public static Boolean iscube(int a) {
        if (a < 0) {
            return iscube(-a);
        }
        int i = 0;
        while (i * i * i < a) {
            i++;
        }
        return i * i * i == a;
    }

}