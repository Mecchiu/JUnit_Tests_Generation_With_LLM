package scenario2;


class ChooseNum {
    /**
     * This function takes two positive numbers x and y and returns the
     * biggest even integer number that is in the range [x, y] inclusive. If
     * there's no such number, then the function should return -1.
     */
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