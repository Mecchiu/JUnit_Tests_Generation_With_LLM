// SolutionTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains one unit test case for the {@link Solution#solution(List)} method.
*/
class SolutionTest {
@Test
        public final void test() {
            assertEquals("", Solution.solution(new List<>()));
            assertEquals("", Solution.solution(new List<Integer>()));
        }
}