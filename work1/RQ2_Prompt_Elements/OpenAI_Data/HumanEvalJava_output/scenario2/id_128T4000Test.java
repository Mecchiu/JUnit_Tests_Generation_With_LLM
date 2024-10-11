// ProdSignsTest.java
package scenario2;

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
		assertEquals(null, ProdSigns.prodSigns(List.of()));
		assertEquals(0, ProdSigns.prodSigns(List.of(0)));
		assertEquals(1, ProdSigns.prodSigns(List.of(1)));
		assertEquals(1, ProdSigns.prodSigns(List.of(1, 1)));
		assertEquals(2, ProdSigns.prodSigns(List.of(1, 1, 1)));
		assertEquals(2, ProdSigns.prodSigns(List.of(1, 1, 1, 1)));
		assertEquals(6, ProdSigns.prodSigns(List.of(1, 1, 1, 1, 1)));
		assertEquals(6, ProdSigns.prodSigns(List.of(1, 1, 1, 1, 1, 1)));
		assertEquals(24, ProdSigns.prodSigns(List.of(1, 1, 1, 1, 1, 1, 1)));
		assertEquals(24, ProdSigns.prodSigns(List.of(1, 1, 1, 1, 1, 1, 1, 1)));
	}
}