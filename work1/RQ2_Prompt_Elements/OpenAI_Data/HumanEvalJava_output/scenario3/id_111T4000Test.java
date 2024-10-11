// HistogramTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains ten unit test cases for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

	@Test
	void testHistogram() {
		assertEquals(Histogram.histogram("a b b a"), "{\"a\": 2, \"b\": 2}");
		assertEquals(Histogram.histogram("a b c a b"), "{\"a\": 2, \"b\": 2}");
		assertEquals(Histogram.histogram("a b c d g"), "{\"a\": 1, \"b\": 1, \"c\": 1, \"d\": 1, \"g\": 1}");
		assertEquals(Histogram.histogram("r t g"), "{\"r\": 1, \"t\": 1, \"g\": 1}");
		assertEquals(Histogram.histogram("b b b b a"), "{\"b\": 4}");
		assertEquals(Histogram.histogram("r t g"), "{\"r\": 1, \"t\": 1, \"g\": 1}");
		assertEquals(Histogram.histogram(""), "{}");
		assertEquals(Histogram.histogram("a"), "{\"a\": 1}");
		assertEquals(Histogram.histogram("a b c"), "{\"a\": 1, \"b\": 1, \"c\": 1}");
		assertEquals(Histogram.histogram("a b c d e f g h i j k l m n o p q r s t u v w x y z"), "{\"a\": 1, \"b\": 1, \"c\": 1, \"d\": 1, \"e\": 1, \"f\": 1, \"g\": 1, \"h\": 1, \"i\": 1, \"j\": 1, \"k\": 1, \"l\": 1, \"m\": 1, \"n\": 1, \"o\": 1, \"p\": 1, \"q\": 1, \"r\": 1, \"s\": 1, \"t\": 1, \"u\": 1, \"v\": 1, \"w\": 1, \"x\": 1, \"y\": 1, \"z\": 1}");
	}
}