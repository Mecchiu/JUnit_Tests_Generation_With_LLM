package scenario2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class WordsString {
    /**
     * * You will be given a string of words separated by commas or spaces. Your task is
     * to split the string into words and return an array of the words.
     */
    public static List<Object> wordsString(String s) {
        if (s.length() == 0)
            return new ArrayList<Object>();
        String[] words = s.split("[, ]+");
        return Arrays.asList(words);
    }

}