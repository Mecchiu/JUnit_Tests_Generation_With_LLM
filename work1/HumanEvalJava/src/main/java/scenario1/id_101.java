package scenario1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class WordsString {

    public static List<Object> wordsString(String s) {
        if (s.length() == 0)
            return new ArrayList<Object>();
        String[] words = s.split("[, ]+");
        return Arrays.asList(words);
    }

}