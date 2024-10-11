package scenario1;


import java.util.HashSet;
import java.util.List;
import java.util.Set;


class FindMax {

    public static String findMax(List<String> words) {
        if (words == null || words.size() == 0) {
            return null;
        }

        String maxWord = words.get(0);
        int maxUnique = 0;
        for (String word : words) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                seen.add(word.charAt(i));
            }
            if (seen.size() > maxUnique) {
                maxWord = word;
                maxUnique = seen.size();
            } else if (seen.size() == maxUnique && word.compareTo(maxWord) < 0) {
                maxWord = word;
            }
        }

        return maxWord;
    }

}