// MakeAPileTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

	@Test
	void testMakeAPile() {
		List<Integer> result = MakeAPile.makeAPile(3);
		assertEquals(3, result.size());
		assertEquals(3, result.get(0).intValue());
		assertEquals(5, result.get(1).intValue());
		assertEquals(7, result.get(2).intValue());
		
		result = MakeAPile.makeAPile(4);
		assertEquals(4, result.size());
		assertEquals(4, result.get(0).intValue());
		assertEquals(6, result.get(1).intValue());
		assertEquals(8, result.get(2).intValue());
		assertEquals(10, result.get(3).intValue());
		
		result = MakeAPile.makeAPile(5);
		assertEquals(5, result.size());
		assertEquals(5, result.get(0).intValue());
		assertEquals(7, result.get(1).intValue());
		assertEquals(9, result.get(2).intValue());
		assertEquals(11, result.get(3).intValue());
		assertEquals(13, result.get(4).intValue());
		
		result = MakeAPile.makeAPile(6);
		assertEquals(6, result.size());
		assertEquals(6, result.get(0).intValue());
		assertEquals(8, result.get(1).intValue());
		assertEquals(10, result.get(2).intValue());
		assertEquals(12, result.get(3).intValue());
		assertEquals(14, result.get(4).intValue());
		assertEquals(16, result.get(5).intValue());
		
		result = MakeAPile.makeAPile(8);
		assertEquals(8, result.size());
		assertEquals(8, result.get(0).intValue());
		assertEquals(10, result.get(1).intValue());
		assertEquals(12, result.get(2).intValue());
		assertEquals(14, result.get(3).intValue());
		assertEquals(16, result.get(4).intValue());
		assertEquals(18, result.get(5).intValue());
		assertEquals(20, result.get(6).intValue());
		assertEquals(22, result.get(7).intValue());
	}
}