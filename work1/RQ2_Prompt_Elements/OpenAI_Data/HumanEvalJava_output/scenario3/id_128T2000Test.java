// ProdSignsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {
	@Test
			void testProdSigns() {
				assertEquals(-9, ProdSigns.prodSigns(List.of(1, 2, 2, -4)));
				assertEquals(0, ProdSigns.prodSigns(List.of(0, 1)));
				assertNull(ProdSigns.prodSigns(List.of()));
				assertEquals(-10, ProdSigns.prodSigns(List.of(1, 1, 1, 2, 3, -1, 1)));
				assertEquals(20, ProdSigns.prodSigns(List.of(2, 4, 1, 2, -1, -1, 9)));
				assertEquals(4, ProdSigns.prodSigns(List.of(-1, 1, -1, 1)));
				assertEquals(-4, ProdSigns.prodSigns(List.of(-1, 1, 1, 1)));
				assertEquals(0, ProdSigns.prodSigns(List.of(-1, 1, 1, 0)));
				assertEquals(0, ProdSigns.prodSigns(List.of(0, 0, 0, 0)));
				assertEquals(0, ProdSigns.prodSigns(List.of(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)));
			}
}
