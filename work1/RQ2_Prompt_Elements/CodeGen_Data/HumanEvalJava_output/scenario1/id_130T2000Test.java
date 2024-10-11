// TriTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains one unit test case for the {@link Tri#tri(int)} method.
*/
class TriTest {
private Tri tri = new Tri();

		@Test
		public void testTri() {
			/* It contains one unit test case for the {@link Tri#tri(int)} method.
			 */
			assertEquals(tri.tri(10), Arrays.asList(10, 2, 4));
			System.out.println(tri.tri(1));
			assertEquals(tri.tri(33), Arrays.asList(31, 23, 33));
		}

}

