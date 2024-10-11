package scenario1;


import java.util.List;


class CanArrange {

    public static int canArrange(List<Object> arr) {
        int max = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) instanceof Integer) {
                if (i > 0 && (int) arr.get(i) < (int) arr.get(i - 1)) {
                    max = i;
                }
            }
        }
        return max;
    }

}