package scenario1;


import java.util.List;


class SmallestChange {

    public static int smallestChange(List<Integer> arr) {
        int result = 0;
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) != arr.get(j)) {
                result++;
            }
            i++;
            j--;
        }
        return result;
    }

}