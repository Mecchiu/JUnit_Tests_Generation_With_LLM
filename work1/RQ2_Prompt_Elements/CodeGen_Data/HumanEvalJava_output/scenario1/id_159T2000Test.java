// EatTest.java
package scenario1;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Eat}.
* It contains one unit test case for the {@link Eat#eat(int, int, int)} method.
*/
class EatTest {

    @Test
    void EatTest1() {
        List<Integer> list = eat(0, 1, 2);
        assertEquals(2, list.size());
        assertTrue(list.contains(0) && list.contains(2));
    }
    
}