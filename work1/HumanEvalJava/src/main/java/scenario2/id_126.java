package scenario2;


import java.util.HashMap;
import java.util.List;


class IsSorted {
    /**
     * * Given a list of numbers, return whether or not they are sorted
     * in ascending order. If list has more than 1 duplicate of the same
     * number, return False. Assume no negative numbers and only integers.
     */
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