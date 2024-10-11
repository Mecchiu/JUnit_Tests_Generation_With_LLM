package scenario1;


import java.util.List;


class Search {

    public static int search(List<Integer> lst) {
        int max = -1;
        int[] freq = new int[11];
        for (int i = 0; i < lst.size(); i++) {
            freq[lst.get(i)]++;
        }
        for (int i = 1; i < 11; i++) {
            if (freq[i] >= i) {
                max = i;
            }
        }
        return max;
    }

}