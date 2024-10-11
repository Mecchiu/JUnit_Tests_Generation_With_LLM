package scenario1;


import java.util.*;


class Unique {

    public static List<Integer> unique(List<Integer> l) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : l) {
            set.add(i);
        }
        List<Integer> result = new ArrayList<Integer>(set);
        Collections.sort(result);
        return result;
    }

}