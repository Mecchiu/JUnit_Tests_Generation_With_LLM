package scenario1;


import java.util.HashMap;
import java.util.List;


class IsSorted {

    public static Boolean isSorted(List<Object> lst) {
        if (lst.size() <= 1) {
            return true;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < lst.size() - 1; i++) {
            int curr = (int) lst.get(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            if (map.get(curr) > 2) {
                return false;
            }
        }

        int prev = (int) lst.get(0);
        for (int i = 1; i < lst.size(); i++) {
            int curr = (int) lst.get(i);
            if (curr < prev) {
                return false;
            }
            prev = curr;
        }
        return true;
    }

}