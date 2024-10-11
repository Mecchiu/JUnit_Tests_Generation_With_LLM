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
		 * Test the method of {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} for null inputs parameters.
		 */
		@Test
		public void loadPreference_NoParameters() {
			HttpPreference.loadPreference(null, JFrame.this);
		}
}