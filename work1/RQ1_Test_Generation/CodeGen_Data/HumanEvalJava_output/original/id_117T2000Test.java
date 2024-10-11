// SelectWordsTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SelectWords}.
* It contains one unit test case for the {@link SelectWords#selectWords(String, int)} method.
*/
class SelectWordsTest {

    /**
     * Test the selectWords function.
	 * @test
	 * Validates the selectWords function.
	 * <ul>
	 * <li>input string: is empty string or contains only words characters of length 1 and the char at index 1 must be the character <b><font style="italics">'a'</font></b> must be in the string </li>
	 * <li>input int: is the integer 1</li>
	 * <li>output list: is the list of words in the string</li>
	 * </ul>
    */
    @Test
    public void test() {
        List<Object> testCases = new ArrayList<Object>();
        String[] wordArray = {"a", "b", "c", "d", "e", "f"};
        int[] expectedResults = {1, 2, 1, 1, 1, 1};
        int testCaseCount = wordArray.length;

        for (int i = 0; i < testCaseCount; i++) {
            String string = null;
            int expectedIntValue = expectedResults[i];
            string = "Simple white space";
            List<Object> resultList = SelectWords.selectWords(string, expectedIntValue);
            if (i == 0) {
                assertArrayEquals(expectedResults, (int[]) resultList.get(0));
            } else {
                assertArrayEquals((int[]) resultList.get(1), (int[]) expectedResults);
            }
        }

        for (int i = testCaseCount; i < wordArray.length; i++) {
            String word = "No word";
            List<Object> resultList = SelectWords.selectWords(word, expectedIntValue + i);
            if (i == 0) {
                assertArrayEquals(expectedResults, (int[]) resultList.get(0));
            } else {
                if (wordArray[i]!= null) {
                    assertArrayEquals(new String[] {wordArray[i]}, (int[]) resultList.get(1));
                } else {
                    assertEquals(0, resultList.size());
                }
            }
        }

        wordArray = {"a", "b", "c", "d", "e", "f"};
        int[] expectedResults = {1, 2, 1, 1, 1, 1};
        int testCaseCount = wordArray.length;
        List<Object> resultList = SelectWords.selectWords(String.valueOf(wordArray[0]), expectedResults[0]);
        assertArrayEquals(expectedResults, (int[]) resultList.get(0));

        for (int i = 0; i < testCaseCount; i++) {
            int inputInt = Integer.parseInt(String.valueOf(wordArray[i]));
            String string = null;
            String[] resultList = SelectWords.selectWords(string, inputInt);
            assertArrayEquals(resultList, (String[]) resultList.get(0));
            assertEquals(testCaseCount, resultList.size());
            assertEquals(wordArray[i], (String) resultList.get(1));
        }
    }
}
