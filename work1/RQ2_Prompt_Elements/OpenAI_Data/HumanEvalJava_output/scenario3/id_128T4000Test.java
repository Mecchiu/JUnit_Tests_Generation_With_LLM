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
		assertEquals(Integer.valueOf(-9), ProdSigns.prodSigns(List.of(1, 2, 2, -4)));
		assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(List.of(0, 1)));
		assertEquals(null, ProdSigns.prodSigns(List.of()));
		assertEquals(Integer.valueOf(-10), ProdSigns.prodSigns(List.of(1, 1, 1, 2, 3, -1, 1)));
		assertEquals(Integer.valueOf(20), ProdSigns.prodSigns(List.of(2, 4, 1, 2, -1, -1, 9)));
		assertEquals(Integer.valueOf(4), ProdSigns.prodSigns(List.of(-1, 1, -1, 1)));
		assertEquals(Integer.valueOf(-4), ProdSigns.prodSigns(List.of(-1, 1, 1, 1)));
		assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(List.of(-1, 1, 1, 0)));
	}
}