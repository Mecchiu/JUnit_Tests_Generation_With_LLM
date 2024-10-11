// WillItFlyTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains one unit test case for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
// WillItFly.java
package scenario1;

import java.util.List;

class WillItFly {

    public static Boolean willItFly(List<Integer> q, int w) {
        int sum = 0;
        for (int i = 0; i < q.size(); i++) {
            sum += q.get(i);
        }
        if (sum > w) {
            return false;
        }
        for (int i = 0; i < q.size() / 2; i++) {
            if (q.get(i)!= q.get(q.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

// WillItFlyTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains one unit test case for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
		
    @Test
    void testCases() {
            assertFalse(WillItFly.willItFly(null, 4));
            assertTrue(WillItFly.willItFly(null, 0));
        }
}