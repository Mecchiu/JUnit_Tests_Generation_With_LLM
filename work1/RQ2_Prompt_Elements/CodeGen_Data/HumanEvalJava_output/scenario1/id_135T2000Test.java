// CanArrangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains one unit test case for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

    @Test
	public void shouldReturnGreater() {
		List<Object> objList = List.of(Integer.MAX_VALUE);
		int result = CanArrange.canArrange(objList);
		assertTrue(result <= 2);
	}
	
    @Test
	public void shouldReturnSmaller() {
		List<Object> objList = List.of(Integer.MIN_VALUE);
		int result = CanArrange.canArrange(objList);
		assertTrue(result <= 2);
	}
	
    @Test
	public void shouldReturnAllSameValues() {
		List<Object> objList1 = List.of(1,2, 3,4);
		List<Object> objList2 = List.of(1,2,3,4);
		int result = CanArrange.canArrange(objList1);
		assertEquals(0, result);
		result = CanArrange.canArrange(objList2);
		assertEquals(1, result);
	}
}
