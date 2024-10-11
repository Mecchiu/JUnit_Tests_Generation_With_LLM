// HistogramTest.java
package original;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

	@Test
	void testHistogram() {
		Map<String, Integer> expected = new HashMap<>();
		expected.put("a", 2);
		expected.put("b", 2);
		assertEquals(expected, Histogram.histogram("a b b a"));
		
		expected = new HashMap<>();
		expected.put("a", 2);
		expected.put("b", 2);
		assertEquals(expected, Histogram.histogram("a b c a b"));
		
		expected = new HashMap<>();
		expected.put("a", 1);
		expected.put("b", 1);
		expected.put("c", 1);
		expected.put("d", 1);
		expected.put("g", 1);
		assertEquals(expected, Histogram.histogram("a b c d g"));
		
		expected = new HashMap<>();
		expected.put("r", 1);
		expected.put("t", 1);
		expected.put("g", 1);
		assertEquals(expected, Histogram.histogram("r t g"));
		
		expected = new HashMap<>();
		expected.put("b", 4);
		assertEquals(expected, Histogram.histogram("b b b b a"));
		
		expected = new HashMap<>();
		expected.put("r", 1);
		expected.put("t", 1);
		expected.put("g", 1);
		assertEquals(expected, Histogram.histogram("r t g"));
		
		expected = new HashMap<>();
		assertEquals(expected, Histogram.histogram(""));
		
		expected = new HashMap<>();
		expected.put("a", 1);
		assertEquals(expected, Histogram.histogram("a"));
		
		expected = new HashMap<>();
		expected.put("a", 1);
		expected.put("b", 1);
		expected.put("c", 1);
		assertEquals(expected, Histogram.histogram("a b c"));
		
		expected = new HashMap<>();
		expected.put("a", 1);
		expected.put("b", 1);
		expected.put("c", 1);
		expected.put("d", 1);
		expected.put("e", 1);
		expected.put("f", 1);
		expected.put("g", 1);
		expected.put("h", 1);
		expected.put("i", 1);
		expected.put("j", 1);
		assertEquals(expected, Histogram.histogram("a b c d e f g h i j"));
	}
}