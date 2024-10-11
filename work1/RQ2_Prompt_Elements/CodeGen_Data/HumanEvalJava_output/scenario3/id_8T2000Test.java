// SumProductTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumProduct}.
* It contains one unit test case for the {@link SumProduct#sumProduct(List)} method.
*/
class SumProductTest {
/**
		* Test case for sumProduct(List).
		*/
		@Test
		public void testSumProduct() {
				SumProduct sc = new SumProduct();
				assertEquals(new Integer(0),sc.sumProduct((List<Integer>)null));
		}
}