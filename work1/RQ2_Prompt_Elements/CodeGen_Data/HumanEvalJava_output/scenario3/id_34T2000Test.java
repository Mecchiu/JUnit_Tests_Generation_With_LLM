// UniqueTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains one unit test case for the {@link Unique#unique(List)} method.
*/
class UniqueTest {

	/**
	 * Test case for {@link Unique#unique(List)}.
	 * <br/>
	 * {@link Unique#unique(List)} method call without specifying a argument
	 * of a List is throwing an {@link Exception}.
	 */
	@Test
    public void whenIUseListWithoutArgumentOfListThenExceptionThrown() {
		
		final List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(3);
		l.add(2);
		final int[] i = {123, 123};
		
		try {
			Unique.unique(l);
			fail();
		} catch (Exception expected) {
			assertTrue(i.length == 1);
			assertEquals(123, i[0]);
		}
	}
}