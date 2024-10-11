package scenario1;


import java.util.List;


class NextSmallest {

    public static Integer nextSmallest(List<Object> lst) {
        if (lst.size() <= 1) {
            return null;
        }
        Integer smallest = (Integer) lst.get(0);
        Integer nextSmallest = null;
        for (int i = 1; i < lst.size(); i++) {
            Integer current = (Integer) lst.get(i);
            if (current < smallest) {
                nextSmallest = smallest;
                smallest = current;
            } else if (nextSmallest == null || current < nextSmallest) {
                if (current != smallest)
                    nextSmallest = current;
            }
        }
        return nextSmallest;
    }

}