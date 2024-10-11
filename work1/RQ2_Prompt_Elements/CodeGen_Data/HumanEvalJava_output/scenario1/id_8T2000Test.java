// SumProductTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains one unit test case for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {

	@Test
    public final void test() {
             List<Integer> actual = SumProduct.sumProduct(new ArrayList<Object>());
             assertEquals("invalid array length",1,actual.size());
	} 

}
