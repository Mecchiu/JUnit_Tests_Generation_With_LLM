// ProdSignsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains one unit test case for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {
private final ProdSigns prodSigns = new ProdSigns();

		/**
		 * Asserts the result of {@link ProdSigns#prodSigns(List)} method.
		*/
		@Test
		void prodSigns() {
			assertEquals("0", prodSigns.prodSigns(ArrayList.of([1])));
			assertEquals("-1", prodSigns.prodSigns(ArrayList.of([-1])));
			assertEquals("-2", prodSigns.prodSigns(ArrayList.of([-2])));
			assertEquals(null, prodSigns.prodSigns(""));
			assertEquals("21", prodSigns.prodSigns("10"));
			assertNull(prodSigns.prodSigns("x"));
			assertEquals("4", prodSigns.prodSigns(list("4", "8", "5")));
		}
}
