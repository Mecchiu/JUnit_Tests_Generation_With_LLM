package scenario1;


class Encode {

    public static String encode(String message) {
        String result = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c -= 32;
            } else if (c >= 'A' && c <= 'Z') {
                c += 32;
            }
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                c += 2;
            }
            result += c;
        }
        return result;
    }

}