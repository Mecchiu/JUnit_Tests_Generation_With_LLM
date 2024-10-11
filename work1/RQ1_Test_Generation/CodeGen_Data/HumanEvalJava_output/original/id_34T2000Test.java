// UniqueTest.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains one unit test case for the {@link Unique#unique(List)} method.
*/
class UniqueTest {
   /**
		* Run test method for {@link Unique#unique}.
		*
		* Run test case {@code t} with arguments [5, 3, 5, 2, 3, 3, 9, 0, 123] and result [0, 2, 3, 5, 9, 123]
		* <pre>
		* t = 1
		* t = 2
		* </pre>
		* <i>t</i> is an instance of {@link UniqueTest}.
		*/
    @Test
    public void testFor1() {
        List<Integer> list = Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123);
        assertEquals(2, Unique.unique(list).size());
    }
}


