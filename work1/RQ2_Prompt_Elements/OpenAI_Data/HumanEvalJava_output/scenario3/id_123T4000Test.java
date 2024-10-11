// GetOddCollatzTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

	@Test
	void testGetOddCollatz() {
		List<Integer> result = GetOddCollatz.getOddCollatz(14);
		assertEquals(6, result.size());
		assertEquals(1, result.get(0).intValue());
		assertEquals(5, result.get(1).intValue());
		assertEquals(7, result.get(2).intValue());
		assertEquals(11, result.get(3).intValue());
		assertEquals(13, result.get(4).intValue());
		assertEquals(17, result.get(5).intValue());
		
		result = GetOddCollatz.getOddCollatz(5);
		assertEquals(2, result.size());
		assertEquals(1, result.get(0).intValue());
		assertEquals(5, result.get(1).intValue());
		
		result = GetOddCollatz.getOddCollatz(12);
		assertEquals(3, result.size());
		assertEquals(1, result.get(0).intValue());
		assertEquals(3, result.get(1).intValue());
		assertEquals(5, result.get(2).intValue());
		
		result = GetOddCollatz.getOddCollatz(1);
		assertEquals(1, result.size());
		assertEquals(1, result.get(0).intValue());
	}
}