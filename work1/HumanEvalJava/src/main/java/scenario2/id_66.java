package scenario2;


class Digitsum {
    /**
     * Task
     * Write a function that takes a string as input and returns the sum of the upper characters only'
     * ASCII codes.
     */
    public static int digitSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sum += c;
            }
        }
        return sum;
    }

}