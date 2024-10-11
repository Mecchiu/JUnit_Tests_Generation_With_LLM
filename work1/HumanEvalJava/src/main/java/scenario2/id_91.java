package scenario2;


class IsBored {
    /**
     * You'll be given a string of words, and your task is to count the number
     * of boredoms. A boredom is a sentence that starts with the word "I".
     * Sentences are delimited by '.', '?' or '!'.
     */
    public static int isBored(String s) {
        int count = 0;
        String[] sentences = s.split("[.!?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            boolean firstWord = false;
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                else {
                    firstWord = true;
                    if (word.equals("I")) {
                        count++;
                    }
                }
                if (firstWord)
                    break;
            }

        }
        return count;
    }

}