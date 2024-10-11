package scenario1;


class Encrypt {

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