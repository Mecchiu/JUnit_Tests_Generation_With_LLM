package scenario2;


class RemoveVowels {
    /**
     * * remove_vowels is a function that takes string and returns string without vowels.
     */
    public static String removeVowels(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                result += c;
            }
        }
        return result;
    }

}