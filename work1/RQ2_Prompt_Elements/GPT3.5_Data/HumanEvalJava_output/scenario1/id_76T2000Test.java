// IsSimplePower.java
package scenario1;

class IsSimplePower {

    public static Boolean isSimplePower(int x, int n) {
        if (x == 1) {
            return true;
        }
        if (n == 1) {
            return false;
        }
        int y = n;
        while (y < x) {
            y *= n;
        }
        return y == x;
    }
}

// IsSimplePowerTest.java
package scenario1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {
    
    @Test
    void testIsSimplePower() {
        assertTrue(IsSimplePower.isSimplePower(1, 2));
        assertFalse(IsSimplePower.isSimplePower(2, 1));
        assertTrue(IsSimplePower.isSimplePower(4, 2));
        assertTrue(IsSimplePower.isSimplePower(8, 2));
        assertTrue(IsSimplePower.isSimplePower(16, 2));
        assertFalse(IsSimplePower.isSimplePower(15, 2));
        assertTrue(IsSimplePower.isSimplePower(27, 3));
        assertTrue(IsSimplePower.isSimplePower(81, 3));
        assertFalse(IsSimplePower.isSimplePower(80, 3));
        assertFalse(IsSimplePower.isSimplePower(0, 2));
    }
}