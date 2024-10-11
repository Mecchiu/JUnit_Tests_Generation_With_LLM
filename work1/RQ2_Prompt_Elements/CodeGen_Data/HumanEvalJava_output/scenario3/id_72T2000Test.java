// WillItFlyTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains one unit test case for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
/**
		 * Unit test for the {@link WillItFly#willItFly(List, int)} method
		*/
		@Test
		void willitfly() {
		}
}

// Main method
class Main {
	public static void main(String[] args) {
		List<Integer> r = new WillItFly().willItFly(new List<Integer>(), 3);
		assertEquals(0, r.size());
		List<Integer> t = new WillItFly().willItFly(new List<Integer>(), 11);
		assertEquals(4, r.size()); // There's only 4 elements: 0=0, 1=3, 2=12, 3=21
		assertEquals((Object) (0 + 20), r.get(0));
		assertEquals((Object) 4, r.get(1));
		assertEquals((Object) 12, r.get(2));
		assertEquals((Object) 21, r.get(3));
		assertTrue(r.contains(12));
		assertTrue(t.contains(21));
		}
}
