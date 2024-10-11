// WordsStringTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WordsString}.
* It contains one unit test case for the {@link WordsString#wordsString(String)} method.
*/
class WordsStringTest {

    public static Testable testable;

    /**
     * In this section, the {@link WordsString#wordsString(String)} method is used to test the
     * {@link WordsString#wordsString(String)} method:
     * <p>{@item <em>Word splitting</em>}: test method for {@link WordsString.wordsString(String)}
     * @Test (expected=Exception.class)
     * @Test
     * @RunWith(JUnit.class)
     * public class WordsStringTest {
     *     /**
     *     * In this section, the {@link WordsString#wordsString(String)} method is used to test the
     *     * {@link WordsString#wordsString(String)} method:
     *     * <p style="font-size: 130%">{@literal @Test}</literal>
     *     * <p style="font-size: 130%">{@literal @RunWith}</literal>
     *     * <p style="font-size: 130%">{@literal public void}</literal>
     *     * <p style="font-size: 130%">{@literal private}
     *     * @Test (expected=Exception.class)
     *     * @Test
     *     * @RunWith(JUnit.class)
     *     * public class <em>Word splitting</em> {
     *     *     {@literal private}
     *     * private static Word<List<Object>> words = new Word<>(new ArrayList<>(), false, "The");<br>
     *     * }
     * </em>
     * @Test
     * @RunWith(JUnit.class)
     * public class WordsTest {<br>
     *         /**
     *         * In this section, the {@link WordsString#wordsString(String)} method is used to test the
     *         * {@link WordsString#wordsString(String)} method:
     *         * <p/><br>{@literal @Test}
     *         * <ul>
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test}
     *         * <ul>
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test}
     *         * {@literal &#64;Test(expected=Exception.class)<br>}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)&lt;br>}
     *         * <li>{@literal @Test} {@literal public}
     *         * {@literal &#64;Test(expected=Exception.class)&lt;br>}
     *         * </ul>
     * </em>
     */
    @Test
    public void test_wordsString_() {
      final List<Object> test = new ArrayList<>();
        
        test.add("The");
        test.add("The");
        assertEquals(Arrays.toString(Arrays.copyOf(listTokens(test.toArray(new String[0])), test.toArray(new Object[0])), ","),
                listTokens(wordsString("The").toArray(new String[0])));
        assertEquals(Arrays.toString(Arrays.copyOf(listTokens(test.toArray(new String[0])), test.toArray(new Object[0])), "Space"),
                listTokens(new List<Object>(Arrays.asList(getTuple(1)), String.class)));
        test.add("The");                                  // (TODO) we cannot check the values. The value of wordsString() must not be
        //   'added into the tuple - that is, the value must be set to the 'key of tuple' in the tuple
        //   because we set the value of wordsString() inside the tuple
        assertEquals(Arrays.toString(Arrays.copyOf(listTokens(test.toArray(new String[0])), "tuple key").toArray(new Object[0]), "tuple key"),
                listTokens(wordsString(test.toArray(new String[0]) + " The").toArray(new String[0])));
        assertEquals(Arrays.toString(Arrays.copyOf(listTokens(test.toArray(new String[0])), "The").toArray(new String[0]), " "),
                listTokens(wordsString("The").toArray(new String[0])));
        assertEquals(Arrays.toString(Arrays.copyOf(listTokens(test.toArray(new String[0])), "The ").toArray(new String[0]), ""),
                listTokens(wordsString("The ").toArray(new String[0])));
        assertEquals(Arrays.toString(Arrays.copyOf(listTokens(test.toArray(new String[0])), "The ").toArray(new String[0]), "The"),
                listTokens(wordsString("The ").toArray(new String[0])));
        assertEquals(Arrays.toString(Arrays.copyOf(listTokens(test.toArray(new String[0])), "The ").toArray(new String[0]), " and "),
                listTokens(wordsString("The ").toArray(new