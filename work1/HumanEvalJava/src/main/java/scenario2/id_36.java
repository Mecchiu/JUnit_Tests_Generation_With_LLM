package scenario2;


class FizzBuzz {
    /**
     * Return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13.
     */
    public static int fizzBuzz(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                String s = Integer.toString(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '7') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

}