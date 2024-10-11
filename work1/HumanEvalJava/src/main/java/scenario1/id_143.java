package scenario1;


class WordsInSentence {

    public static String wordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (isPrime(words[i].length())) {
                result += words[i] + " ";
            }
        }
        return result.trim();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}