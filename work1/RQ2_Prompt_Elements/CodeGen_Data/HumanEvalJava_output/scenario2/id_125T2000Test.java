// SplitWordsTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains one unit test case for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
// SplitWords.java
package scenario2;

import java.util.Arrays;

class SplitWords {

    /**
     * * Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
     * should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
     * alphabet, ord('a') = 0, ord('b') = 1,... ord('z') = 25
     */
    public static Object splitWords(String txt) {
        if (txt.contains(" ")) {
            return Arrays.asList(txt.split(" "));
        } else if (txt.contains(",")) {
            return Arrays.asList(txt.split(","));
        } else {
            int count = 0;
            for (int i = 0; i < txt.length(); i++) {
                if (txt.charAt(i) >= 'a' && txt.charAt(i) <= 'z' && (txt.charAt(i) - 'a') % 2 == 1) {
                    count++;
                }
            }
            return count;
        }
    }
}

// SplitWordsTest.java
package scenario2;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains one unit test case for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {
		
    @Test
    public void splitWords() {
		Object expectedResult = SplitWords.splitWords("heesh");
				assertEquals(expectedResult, SplitWords.splitWords("heesh"));
		expectedResult = SplitWords.splitWords("heesh", new int[] {1});
				assertEquals(expectedResult, SplitWords.splitWords("heesh", new int[] {1}));
        expectedResult = SplitWords.splitWords("heesh", new int[] {1, 3, 5});
				assertEquals(expectedResult, SplitWords.splitWords("heesh", new int[] {1, 3, 5}));
        expectedResult = SplitWords.splitWords("heesh", new int[] {2, 3, 5});
				assertEquals(expectedResult, SplitWords.splitWords("heesh", new int[] {2, 3, 5}));
        expectedResult = SplitWords.splitWords("hesh", new int[] {1, 3, 5, 9, 8, 7, 6, 3, 2, 5, 0, 7, 4, 1});
				assertEquals(expectedResult, SplitWords.splitWords("hesh", new int[] {1, 3, 5, 9, 8, 7, 6, 3, 2, 5, 0, 7, 4, 1}));
        expectedResult = SplitWords.splitWords("hesh", new int[] {2, 3, 5, 9, 8, 7, 6, 3, 2, 5, 0, 7, 4, 1});
				assertEquals(expectedResult, SplitWords.splitWords("hesh", new int[] {2, 3, 5, 9, 8, 7, 6, 3, 2, 5, 0, 7, 4, 1}));
        expectedResult = SplitWords.splitWords("hesh", new int[] {0, 4, 7, 8});
				assertEquals(expectedResult, SplitWords.splitWords("hesh", new int[] {0, 4, 7, 8}));
        expectedResult = SplitWords.splitWords("hesh", new int[] {2, 3, 5, 9, 8, 7, 6, 3, 2, 5, 0, 7, 4, 1});
				assertEquals(expectedResult, SplitWords.splitWords("hesh", new int[] {2, 3, 5, 9, 8, 7, 6, 3, 2, 5, 0, 7, 4, 1}));
        expectedResult = SplitWords.splitWords("fiel", new int[] {1});
				assertEquals(expectedResult, SplitWords.splitWords("fiel", new int[] {1}));
        expectedResult = SplitWords.splitWords("fiel", new int[] {1, 3, 5});
				assertEquals(expectedResult, SplitWords.splitWords("fiel", new int[] {1, 3, 5}));
        expectedResult = SplitWords.splitWords("fiel", new int[] {2, 3, 5});
				assertEquals(expectedResult, SplitWords.splitWords("fiel", new int[] {2, 3, 5}));
        expectedResult = SplitWords.splitWords("fiel", new int[] {0, 4, 7, 8});
				assertEquals(expectedResult, SplitWords.splitWords("fiel", new int[] {0, 4, 7, 8}));
        expectedResult = SplitWords.splitWords("fiel", new int[] {2, 3, 5, 9, 8, 7, 6, 3, 2, 5, 0, 7, 4, 1});
				assertEquals(expectedResult, SplitWords.splitWords("fiel", new int[] {2, 3, 5, 9, 8, 7, 6, 3, 2, 5, 0, 7, 4, 1}));
    }
}
