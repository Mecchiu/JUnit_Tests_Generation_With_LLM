// MonotonicTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Monotonic}.
* It contains one unit test case for the {@link Monotonic#monotonic(List)} method.
*/
class MonotonicTest {
/**
		* The unit test of {@link Monotonic#monotonic(List)}
		* method.
		*
		* > monotonic([1, 2, 4, 10])
		* true
		* > monotonic([1, 2, 4, 20])
		* true
		* > monotonic([1, 20, 4, 10])
		* true
		* > monotonic([4, 1, 0, -10])
		* true
		* > monotonic([4, 1, 1, 0])
		* true
		* > monotonic([1, 2, 3, 2, 5, 60])
		* true
		* > monotonic([1, 2, 3, 4, 5, 60])
		* true
		*/
		@Test
		public void monotonicTest() {
				Integer[] l1 = { 1 };
				Integer[] l2 = { 2 };
				Integer[] l3 = { 3 };

				// This testcase is not correct.
				// This is a sample, but not correct
				assertTrue(null == Monotonic.monotonic(l1));
				assertTrue(null == Monotonic.monotonic(l2));
				assertTrue(null == Monotonic.monotonic(l3));

				// Test case with one monotonic input
				assertTrue(Monotonic.monotonic(l1) );
				assertTrue(Monotonic.monotonic(l1) );
				assertNull(Monotonic.monotonic(l2));
				assertTrue(Monotonic.monotonic(l3) );
				assertTrue(Monotonic.monotonic(l3) );
							
		}
}
