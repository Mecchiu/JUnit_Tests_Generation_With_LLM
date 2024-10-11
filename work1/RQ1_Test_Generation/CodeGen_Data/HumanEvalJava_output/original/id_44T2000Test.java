// ChangeBaseTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeBase}.
* It contains one unit test case for the {@link ChangeBase#changeBase(int, int)} method.
*/
class ChangeBaseTest {

    /**
     * Test method for {@link ChangeBase#changeBase(int, int)}.
     */
    @Test
    void testChangeBase() {
        final int x = 1;
        assertEquals("1", changeBase(x, 10));
        x = 2;
        assertEquals(2628, changeBase(x, 10));
        x = 3;
        assertEquals(106692, changeBase(x, 10));
        x = x * 1;
        assertEquals(324748, changeBase(x, 10));
        x = x * 10;
        assertEquals(112880, changeBase(x, 10));
        x = x * 100;
        assertEquals(342700, changeBase(x, 10));
        x = x * 1024;
        assertEquals(2187368813928071460L, changeBase(x, 10));
        x = x * 2048;
        assertEquals(14783064402936202261L, changeBase(x, 10));
        x = x * 4096;
        assertEquals(67296720442412283950L, changeBase(x, 10));
        x = x * 8192;
        assertEquals(67296720442412283950L, changeBase(x, 10));
        x = x * 1024 * 1024 * 3;
        assertEquals(33245724456680782439L, changeBase(x, 10));
        x = x * 1024 * 1024 * 2;
        assertEquals(33245724456680782439L, changeBase(x, 10));
        x = x * 1024 * 1024 * 1;
        assertEquals(33245724456680782439L, changeBase(x, 10));
    }
}