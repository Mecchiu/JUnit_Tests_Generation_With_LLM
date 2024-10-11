// UniqueTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains one unit test case for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

        @Test
        public List<String> test() {
                List<String> expected = new ArrayList<>();
                Set<String> set = new HashSet<>();
                expected.add("");
                expected.add("a");
                expected.add("abc");
                
                set.add("");
                expected.add("");
                expected.add("b");
                expected.add("def");
                
                System.out.println(expected);

                Set<String> result = Unique.unique(expected);
                assertEquals("duplicated values from set", set, result);
                return expected;
        }
}
