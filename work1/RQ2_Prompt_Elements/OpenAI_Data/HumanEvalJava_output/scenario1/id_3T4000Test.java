// BelowZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

	@Test
	void testBelowZero_1() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
		assertFalse(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_2() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0);
		assertTrue(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_3() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0, 6.0);
		assertTrue(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_4() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0, 6.0, -7.0);
		assertTrue(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_5() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0, 6.0, -7.0, 8.0);
		assertTrue(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_6() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0, 6.0, -7.0, 8.0, -9.0);
		assertTrue(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_7() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0, 6.0, -7.0, 8.0, -9.0, 10.0);
		assertTrue(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_8() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0, 6.0, -7.0, 8.0, -9.0, 10.0, -11.0);
		assertTrue(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_9() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0, 6.0, -7.0, 8.0, -9.0, 10.0, -11.0, 12.0);
		assertTrue(BelowZero.belowZero(operations));
	}
	
	@Test
	void testBelowZero_10() {
		List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, -5.0, 6.0, -7.0, 8.0, -9.0, 10.0, -11.0, 12.0, -13.0);
		assertTrue(BelowZero.belowZero(operations));
	}
}