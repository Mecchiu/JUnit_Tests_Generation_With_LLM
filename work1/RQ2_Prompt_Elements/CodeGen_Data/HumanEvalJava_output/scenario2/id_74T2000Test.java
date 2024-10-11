// TotalMatchTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TotalMatch}.
* It contains one unit test case for the {@link TotalMatch#totalMatch(List, List)} method.
*/
class TotalMatchTest {
@Test
    public void testTotalMatch() {
        // the list is a list of strings, and the list has total number of chars
        // only
        List<String> input = asList("hello", "world", "goodbye", "world");
        Class<? extends Number> cnth = String.class;
        String inputStr = "<" + cnth.getTypeName() + "> <String>";
        Object result = new TotalMatch().totalMatch(input, asList(inputStr));
        assertTrue(result instanceof List);
        assertEquals(2, ((List) result).size());
    }
}

// TotalMatch2.java: totalMatch.txt
