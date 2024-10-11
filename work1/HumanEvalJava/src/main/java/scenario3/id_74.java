package scenario3;


import java.util.List;


class TotalMatch {
    /**
     * * Write a function that accepts two lists of strings and returns the list that has
     * total number of chars in the all strings of the list less than the other list.
     *
     * if the two lists have the same number of chars, return the first list.
     *
     * Examples
     * total_match([], []) ➞ []
     * total_match(['hi', 'admin'], ['hI', 'Hi']) ➞ ['hI', 'Hi']
     * total_match(['hi', 'admin'], ['hi', 'hi', 'admin', 'project']) ➞ ['hi', 'admin']
     * total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) ➞ ['hI', 'hi', 'hi']
     * total_match(['4'], ['1', '2', '3', '4', '5']) ➞ ['4']
     *
     * > totalMatch([], [])
     * []
     * > totalMatch(["hi", "admin"], ["hi", "hi"])
     * ["hi", "hi"]
     * > totalMatch(["hi", "admin"], ["hi", "hi", "admin", "project"])
     * ["hi", "admin"]
     * > totalMatch(["4"], ["1", "2", "3", "4", "5"])
     * ["4"]
     * > totalMatch(["hi", "admin"], ["hI", "Hi"])
     * ["hI", "Hi"]
     * > totalMatch(["hi", "admin"], ["hI", "hi", "hi"])
     * ["hI", "hi", "hi"]
     * > totalMatch(["hi", "admin"], ["hI", "hi", "hii"])
     * ["hi", "admin"]
     * > totalMatch([], ["this"])
     * []
     * > totalMatch(["this"], [])
     * []
     */
    public static List<Object> totalMatch(List<Object> lst1, List<Object> lst2) {

    }


}