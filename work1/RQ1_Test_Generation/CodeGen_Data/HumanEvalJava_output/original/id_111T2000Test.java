// HistogramTest.java
package original;

import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains one unit test case for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {

	// Class under test of histogram(String).
	@Test
	void histogram() {
        final Histogram histogram = Histogram.histogram(null);
        Map<String, Integer> res = new HashMap<>();
		if (histogram!= null) {
			for (String i : histogram.keySet()) {
				res.put(i, histogram.get(i));
			}
		}
		
		assertNotNull(res);
		assertNotNull(res.entrySet());
		assertNotNull(res.values());
		assertEquals(2, res.size());
		assertEquals(2, res.values().length);
		assertEquals(1, res.values().setSize(1).get(1));
		
		assertEquals(0, res.values().add(1, 2));
		assertEquals(1, res.values().add(2, 3));

		assertEquals(1, histogram.keySet().values().size());
		assertEquals(0, histogram.keySet().value(3));
		
		assertEquals(null, histogram.keySet().value(null));
	}

	    @Test
	        void key() { // key(String)
        final Histogram histogram = Histogram.histogram("");
        assertEquals(null, histogram.get(null));
        assertEquals(null, histogram.clear());
	}

	    @Test
	        void getter() { // getter(String)
        final Histogram histogram = Histogram.histogram("");
        final String getter = "getter";
        assertEquals("N/A", histogram.get(getter));
        assertEquals("N/A", histogram.getValue(getter));
        assertEquals("N/A", histogram.get(new StringBuilder(getter)));
	}

	    @Test
	        void valueString() {
            final Histogram histogram = Histogram.histogram("");
            final String valueString = "N/A";
            assertEquals("N/A", histogram.getValue(valueString));
            assertEquals("N/A", histogram.getValue("N/A"));
        }

        @Test
        void value() {
            final Histogram histogram = Histogram.histogram("");
            assertEquals("N/A", histogram.value(""));
            assertEquals("N/A", histogram.value("NaN"));
            assertEquals("5", histogram.value("5"));
            assertEquals("9", histogram.value("9"));
            assertEquals("10", histogram.value("10"));
            assertEquals("+2", histogram.value("+2"));
        }
		  
        @Test
        void notHistogram() {
            final Histogram histogram = new Histogram();
            assertTrue(histogram instanceof Histogram);
        }
	
	// Class under test of value(String).
	@Test
	void valueString() { // value(String)
        final Histogram histogram = Histogram.histogram("");
        assertEquals("N/A", histogram.value(""));
        assertEquals("N/A", histogram.value("NaN"));
        assertEquals("5", histogram.value("5"));
        assertEquals("9", histogram.value("9"));
        assertEquals("10", histogram.value("10"));
        assertEquals("+2", histogram.value("+2"));
    }
}
