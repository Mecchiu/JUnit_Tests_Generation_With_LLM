package scenario1;


class GetClosestVowel {

    public static String getClosestVowel(String word) {
        String vowels = "aeiouAEIOU";
        int i = word.length() - 2;
        while (i > 0) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                if (vowels.indexOf(word.charAt(i + 1)) == -1 && vowels.indexOf(word.charAt(i - 1)) == -1) {
                    return word.substring(i, i + 1);
                }
            }
            i--;
        }
        return "";
    }

}