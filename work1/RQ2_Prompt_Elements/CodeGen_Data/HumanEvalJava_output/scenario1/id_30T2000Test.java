// GetPositiveTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains one unit test case for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
/**
		* Method for generating seed set.
		*/
    @Test
    public void test() {
        List<Object> l1 = new ArrayList<Object>();
        l1.add(null);
        List<Object> l2 = getPositive(l1);
        assertListEqual(l1,l2);
    }
}