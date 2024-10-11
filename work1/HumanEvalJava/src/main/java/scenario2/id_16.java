package scenario2;


import java.util.HashSet;
import java.util.Set;


class CountDistinctCharacters {
    /**
     * Given a string, find out how many distinct characters (regardless of case) does it consist of
     */
    public static int countDistinctCharacters(String string) {
        Set<Character> distinctCharacters = new HashSet<Character>();
        for (int i = 0; i < string.length(); i++) {
            distinctCharacters.add(Character.toLowerCase(string.charAt(i)));
        }
        return distinctCharacters.size();
    }

}