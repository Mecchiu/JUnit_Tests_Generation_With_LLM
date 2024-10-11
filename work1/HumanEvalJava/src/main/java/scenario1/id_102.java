package scenario1;


class ChooseNum {

    public static int chooseNum(int x, int y) {
        int max = -1;
        for (int i = x; i <= y; i++) {
            if (i % 2 == 0 && i > max) {
                max = i;
            }
        }
        return max;
    }

}