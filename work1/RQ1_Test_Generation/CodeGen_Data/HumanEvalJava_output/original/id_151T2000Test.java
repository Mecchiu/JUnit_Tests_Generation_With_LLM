// DoubleTheDifferenceTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains one unit test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
DoubleTheDifferenceTest() {
			
		}
	/**
	 * Test method for {@link DoubleTheDifference#doubleTheDifference(List)}.
	 */
	@Test
	public void testDoubleTheDifferenceListNoOddNumbers() {
		List<Object> list = new List<>();
		list.add(1);
		list.add(3);
		list.add(2);
		
		assertTrue("List should have a single element.", list instanceof List);
		assertEquals("List size should be 1.", 1, list.size());

		assertEquals("List[0].get(0) should be 3.0", 3.0, ((Object) list.get(0)).getClass(), 0);
		assertEquals("List[1].get(0) should be 2.0", 2.0, ((Object) list.get(1)).getClass(), 0);
		assertEquals("List[2].get(0) should be 1.0", 1.0, ((Object) list.get(2)).getClass(), 0);
		
		
	}
}


// DoubleTheDifference.java