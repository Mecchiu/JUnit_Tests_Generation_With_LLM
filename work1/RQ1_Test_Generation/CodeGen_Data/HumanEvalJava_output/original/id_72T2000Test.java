// WillItFlyTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains one unit test case for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {

	/**
	 * Test method for {@link java.lang.Boolean#willItFly(List, int)}.
	 * @throws Throwable
	 */
	@Test
	void test() throws Throwable {
		List<Integer> q = new RandomList<Integer>(10);
		int w = 100;
		assertTrue(willItFly(q, w));
		
		assertTrue(willItFly(q, 100));
		assertTrue(willItFly(q, 100));
	}
}
