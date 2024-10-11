// HistogramTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Histogram}.
* It contains one unit test case for the {@link Histogram#histogram(String)} method.
*/
class HistogramTest {
/**
		 * Tests methods of {@link Histogram} class.
		 * @throws Exception
		 * thrown if a test error occurs.
		*/
    
    @Test
    public void testHistogram() throws Exception {
        Histogram hist = new Histogram();
        assertEquals(0, hist.count("a"), 0);
    }
}
