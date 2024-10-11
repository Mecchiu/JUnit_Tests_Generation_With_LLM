// WordsStringTest.java
package scenario1;

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

    @Test
    void givenArrayOfItems() {
        assertArrayEquals(new Object [] { "1", "2" }, wordsString("1 2").toArray());
    }

    @Test
    void whenArrayOfItemsNotExist() {
        assertNull(wordsString("abcdefg".toCharArray()));
    }

    @Test
    Iterable<Object> iterate() {
        return wordsString("abcde").collect(arrayCollector(" "), ArrayList.class);
    }

    class arrayCollector implements Iterable <Object> {

        List<Object> collection = new ArrayList<Object>();

        @Override
        public Iterator <Object> iterator() {
            return collection.iterator();
        }
    }

}
