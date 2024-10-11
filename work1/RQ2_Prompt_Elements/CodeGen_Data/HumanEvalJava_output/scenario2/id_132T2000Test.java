// IsNestedTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains one unit test case for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {
@Test
		public void testTestCase() {
			assertTrue(IsNested.class.isInstance(IsNested.isNested("[''", "]]")));
			assertTrue(IsNested.class.isInstance((IsNested) null));
			assertFalse(IsNested.class.isInstance(1));
		}
}

// {@link IsNestedTest}

