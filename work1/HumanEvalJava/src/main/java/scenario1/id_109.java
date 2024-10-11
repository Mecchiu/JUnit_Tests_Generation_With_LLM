package scenario1;


import java.util.List;


class MoveOneBall {

    public static Boolean moveOneBall(List<Object> arr) {
        if (arr.size() == 0) {
            return true;
        }
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if ((int) arr.get(i) > (int) arr.get((i + 1) % arr.size())) {
                count++;
            }
        }
        if (count <= 1) {
            return true;
        }
        return false;
    }

}