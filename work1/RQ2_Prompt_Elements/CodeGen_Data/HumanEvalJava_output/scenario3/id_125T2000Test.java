// SplitWordsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains one unit test case for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
// SplitWords.java
package scenario3;

class SplitWords {

    /**
     * * Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
     * should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
     * alphabet, ord('a') = 0, ord('b') = 1,... ord('z') = 25
     * Examples
     * splitWords("Hello world!") ➞ ["Hello", "world!"]
     * splitWords("Hello,world!") ➞ ["Hello", "world!"]
     * splitWords("abcdef") == 3
     *
     * > splitWords("Hello world!")
     * ["Hello", "world!"]
     * > splitWords("Hello,world!")
     * ["Hello", "world!"]
     * > splitWords("Hello world,!")
     * ["Hello", "world,!"]
     * > splitWords("Hello,Hello,world!")
     * ["Hello,Hello,world", "!"]
     * > splitWords("abcdef")
     * 3
     * > splitWords("aaabb")
     * 2
     * > splitWords("aaaBb")
     * 1
     * > splitWords("")
     * 0
     */
    public static Object splitWords(String txt) {
    }
}

// SplitWordsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains one unit test case for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
		
	@Test
	void test() {
		String txt = "{0,1,2,3,4,5,6,7,8,9,[a,b,c]]";
		assertArrayEquals(new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c"}, SplitWords.splitWords(txt));
        }

}
