package scenario2;


class Encrypt {
    /**
     * Create a function encrypt that takes a string as an argument and
     * returns a string encrypted with the alphabet being rotated.
     * The alphabet should be rotated in a manner such that the letters
     * shift down by two multiplied to two places.
     */
    public static String encrypt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c += 2 * 2;
                if (c > 'z') {
                    c -= 26;
                }
            }
            result += c;
        }
        return result;
    }

}