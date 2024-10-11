package scenario1;


import java.util.List;


class WillItFly {

    public static Boolean willItFly(List<Integer> q, int w) {
        int sum = 0;
        for (int i = 0; i < q.size(); i++) {
            sum += q.get(i);
        }
        if (sum > w) {
            return false;
        }
        for (int i = 0; i < q.size() / 2; i++) {
            if (q.get(i) != q.get(q.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}