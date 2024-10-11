package scenario1;


import java.util.Arrays;
import java.util.List;


class ReverseDelete {

    public static List<Object> reverseDelete(String s, String c) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (c.indexOf(s.charAt(i)) == -1) {
                result += s.charAt(i);
            }
        }
        boolean isPalindrome = true;
        for (int i = 0; i < result.length() / 2; i++) {
            if (result.charAt(i) != result.charAt(result.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        return Arrays.asList(result, isPalindrome);
    }

}