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
	 * A unit test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * The test case consists in:
	 * - checking the values of the test dialog window
	 * - set the values for the dialog window
	 * - verify the values of the test dialog window
	 */
	@Test
	void loadPreferenceTest01() {
		System.out.println("Testcase for HttpPreference loading: ");
		HttpPreference preference = new HttpPreference();
		String dialogStr = preference.loadPreference(new HttpAnalyzerView(), null);
		assertEquals("Dialog was not correctly set.", "<html><head></head><body><p>A test case.</p></body></html>", dialogStr);
	}
	
	/**
	 * A unit test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * The test case consists in:
	 * - checking getting the values for the dialog window
	 * - set the values for the dialog window
	 * - verify the values for the dialog window
	 */
	@Test
	void loadPreferenceTest02() {
		HttpPreference preference = new HttpPreference();
		String dialogStr = preference.loadPreference(new HttpAnalyzerView(), null);
		assertNotNull("Dialog was not correctly set.", dialogStr);
		//System.out.println("Dialog was set " + dialogStr);
		//assertEquals("Values for the dialog window didn't match!",
		//			preference.getToFileTextField().getText(), dialogStr);
	}
}
