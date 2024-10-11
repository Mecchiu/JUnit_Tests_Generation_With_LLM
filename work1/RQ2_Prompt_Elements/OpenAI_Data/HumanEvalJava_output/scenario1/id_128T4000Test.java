// ProdSignsTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ProdSigns}.
* It contains ten unit test cases for the {@link ProdSigns#prodSigns(List)} method.
*/
class ProdSignsTest {

	@Test
	void testProdSigns_1() {
		List<Object> arr = List.of(1, 2, 3, 4, 5);
		assertEquals(Integer.valueOf(15), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_2() {
		List<Object> arr = List.of(1, 2, 3, 4, -5);
		assertEquals(Integer.valueOf(-15), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_3() {
		List<Object> arr = List.of(1, 2, 3, 0, 5);
		assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_4() {
		List<Object> arr = List.of(1, 2, 3, 0, -5);
		assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_5() {
		List<Object> arr = List.of(1, 2, 3, -4, 5);
		assertEquals(Integer.valueOf(-15), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_6() {
		List<Object> arr = List.of(1, 2, 3, -4, -5);
		assertEquals(Integer.valueOf(15), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_7() {
		List<Object> arr = List.of(1, 2, -3, 4, 5);
		assertEquals(Integer.valueOf(-15), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_8() {
		List<Object> arr = List.of(1, 2, -3, 4, -5);
		assertEquals(Integer.valueOf(15), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_9() {
		List<Object> arr = List.of(1, 2, -3, 0, 5);
		assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
	}
	
	@Test
	void testProdSigns_10() {
		List<Object> arr = List.of(1, 2, -3, 0, -5);
		assertEquals(Integer.valueOf(0), ProdSigns.prodSigns(arr));
	}
}