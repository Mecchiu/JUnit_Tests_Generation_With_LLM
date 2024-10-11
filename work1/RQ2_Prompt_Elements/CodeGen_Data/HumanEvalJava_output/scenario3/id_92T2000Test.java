// AnyIntTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains one unit test case for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {

    @Test
    void test() {
        final Integer x = new Integer(6);
        final Integer y = new Integer(3);
        final Number result = AnyInt.anyInt(x, y, 0);
        assertNotNull(result); assertEquals(2, result.intValue());
    }
}