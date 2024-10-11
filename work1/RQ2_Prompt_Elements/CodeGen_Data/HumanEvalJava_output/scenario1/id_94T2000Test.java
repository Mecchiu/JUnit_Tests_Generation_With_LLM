// SkjkasdkdTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Skjkasdkd}.
* It contains one unit test case for the {@link Skjkasdkd#skjkasdkd(List)} method.
*/
class SkjkasdkdTest {
/**
*  Class with test case for the {@link Skjkasdkd#scenario1}
*/
    @Test
    void scenario1() {
        List<Integer> lst =
            createList(new Object[] { 12345L, 7890L, 123422L,
            12345L, 1234423L, 456712L, 12345L, 2222121L, 123423L });
        assertEquals("12345678901234567890", skjkasdkd(lst).toString());
    }
}