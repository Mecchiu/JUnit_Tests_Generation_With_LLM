package scenario2;


class GetMaxTriples {
    /**
     * * You are given a positive integer n. You have to create an integer array a of length n.
     * For each i (1 ≤ i ≤ n), the value of a[i] = i * i - i + 1.
     * Return the number of triples (a[i], a[j], a[k]) of a where i < j < k,
     * and a[i] + a[j] + a[k] is a multiple of 3.
     */
    public static int getMaxTriples(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {
                    if ((i * i - i + 1 + j * j - j + 1 + k * k - k + 1) % 3 == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}