package scenario1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Tri {

    public static List<Number> tri(int n) {
        if (n == 0) {
            return Arrays.asList(1);
        }
        List<Number> my_tri = new ArrayList<>();
        my_tri.add(1);
        my_tri.add(3);
        for (int i = 2; i < n + 1; i++) {
            if (i % 2 == 0) {
                my_tri.add(i / 2 + 1.0);
            } else {
                my_tri.add(my_tri.get(i - 1).doubleValue() + my_tri.get(i - 2).doubleValue() + (i + 3) / 2);
            }
        }
        return my_tri;
    }

}