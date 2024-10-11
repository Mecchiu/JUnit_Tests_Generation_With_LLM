// IsBoredTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains one unit test case for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

    /**
     * Tests the case of a correct result, when IsBored::isBored(String) is
     * called:
     * <pre>
     * void test()...
     * </pre>
     * @throws Exception
     */
	@Test
    public void test() throws Exception {
        String _s = "Hello";
        int a = 123;
        int b = 345;
        assertEquals(a, IsBored.isBored(_s));
        assertEquals(b, IsBored.isBored(_s+ " "));
        assertEquals(b, isBored(null));
        assertEquals(-1, isBored(_s + " "));
    }
}
