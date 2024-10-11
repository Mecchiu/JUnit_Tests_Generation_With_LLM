// HistogramTest.java
package scenario1;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains one unit test case for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {
@Test
		void test() {
			Histogram t = new Histogram();
			assertEquals(0, t.histogram("a"));
			assertEquals(1, t.histogram("b"));
			assertEquals(2, t.histogram("c"));
		}
}
