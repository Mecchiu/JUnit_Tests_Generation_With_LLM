package scenario1;


class Solve {

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