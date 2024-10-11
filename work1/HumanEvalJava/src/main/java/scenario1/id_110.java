package scenario1;


import java.util.List;


class Exchange {

    public static String exchange(List<Integer> lst1, List<Integer> lst2) {
        int count = 0;
        for (int i = 0; i < lst1.size(); i++) {
            if (lst1.get(i) % 2 != 0) {
                count++;
            }
        }
        for (int i = 0; i < lst2.size(); i++) {
            if (lst2.get(i) % 2 == 0) {
                count--;
            }
        }
        if (count <= 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

}