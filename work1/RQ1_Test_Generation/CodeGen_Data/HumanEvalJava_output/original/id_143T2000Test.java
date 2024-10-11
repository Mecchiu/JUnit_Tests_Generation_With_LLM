// WordsInSentenceTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsInSentence}.
* It contains one unit test case for the {@link WordsInSentence#wordsInSentence(String)} method.
*/
class WordsInSentenceTest {
/**
		 * @param test_string is an input for unit-test.
		 *
		 * A sentence will contain at least one "word" separated by a space, and has more than one word separated by a space,
		 * and the order of the words is the same as the original sentence string.
		 * Example: "This is a test"
		 * Output: "this is a test"
		*
		 * Constraints:
		 * * 1 <= len(test_string) <= 100
		* * test_string contains only letters
		*/
    @Test
    public void test() {
        String originalSentence = "This is a test";
        String result = wordsInSentence(originalSentence);

        assertTrue(result == originalSentence);
    }


		/**
		 * @param test_string are an input for test.
		 * @param result is an output for test.
		 */
    @Test
    public void testWithResult(String test_string, String result) {
        String[] sente = new String[3];
        sdeetest[] result_sde = new String[3];
        sdeetest[0]="  This is a test";
        sdeetest[1]="  ";
        sdeetest[2]="  lets go for swimming";


        sdeTest(sdeetest, result_sde);

        wordsInSentence(test_string);

        assertTrue(result.equals(sdeetest[0]));
        assertTrue(result.equals(sdeetest[1]));
        assertTrue(result.equals(sdeetest[2]));
    }



	private void sdeTest(String[] test_sentence, String[] result_sde_) {
        assertArrayEquals(test_sde_, result_sde_);
		}
}
