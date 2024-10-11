// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains one unit test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {

	/**
	* Test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	*/
	@Test
    void testLoadPreference() {
        HttpPreference.resetAllState();
		HttpPreference.loadCustomHeaders();
        String result = HttpPreference.loadPreference(new HttpAnalyzerView(), new JFrame());
        assertTrue("Result is 0", result.equals(""));
		HttpPreference.loadCustomHeaders();
        result = HttpPreference.loadPreference(new HttpAnalyzerView(), new JFrame());
        assertEquals("Result is 1", HttpPreference.loadPreference(new HttpAnalyzerView(), new JFrame()).equals(""));
        result = HttpPreference.loadPreference(new HttpAnalyzerView(), new JFrame());
        assertEquals("Result is 2", HttpPreference.loadPreference(new HttpAnalyzerView(), new JFrame()).equals(""));
    }
}