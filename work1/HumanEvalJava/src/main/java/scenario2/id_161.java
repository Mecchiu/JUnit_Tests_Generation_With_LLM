package scenario2;


class Solve {
    /**
     * You are given a string s.
     * if s[i] is a letter, reverse its case from lower to upper or vise versa,
     * otherwise keep it as it is.
     * If the string contains no letters, reverse the string.
     * The function should return the resulted string.
     */
    public static String solve(String s) {
        String result = "";
        boolean hasLetters = false;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                hasLetters = true;
                if (Character.isUpperCase(s.charAt(i))) {
                    result += Character.toLowerCase(s.charAt(i));
                } else {
                    result += Character.toUpperCase(s.charAt(i));
                }
            } else {
                result += s.charAt(i);
            }
        }
        if (!hasLetters) {
            result = new StringBuilder(result).reverse().toString();
        }
        return result;
    }

}