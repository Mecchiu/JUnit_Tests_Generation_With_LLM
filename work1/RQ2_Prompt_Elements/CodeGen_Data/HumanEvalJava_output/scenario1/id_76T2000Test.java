// IsSimplePowerTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains one unit test case for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {

    @Test
    public void testIsSimplePower_0num() {
        assertTrue(IsSimplePower.isSimplePower(0, 1));
    }
	
    @Test
    public void testIsSimplePower_1num() {
        assertFalse(IsSimplePower.isSimplePower(1, 1));
    }
	
}