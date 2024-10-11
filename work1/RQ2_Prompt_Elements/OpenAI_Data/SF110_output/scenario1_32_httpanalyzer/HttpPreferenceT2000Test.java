// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains ten unit test cases for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {

	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.tools.options.merge" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.tools.options.merge" property is "true".
	 */
	@Test
	void testLoadPreference_MergeInfoCheckBox() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertTrue(mainView.mergeInfoCheckBox.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxytype" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxytype" property is "None".
	 */
	@Test
	void testLoadPreference_ProxyNoneRadioButton() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertTrue(mainView.proxyNoneRadioButton.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxy" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxy" property is "127.0.0.1".
	 */
	@Test
	void testLoadPreference_ProxyField() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertEquals("127.0.0.1", mainView.proxyField.getText());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxyauth" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxyauth" property is "true".
	 */
	@Test
	void testLoadPreference_ProxyAuthCheckBox() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertTrue(mainView.proxyAuthCheckBox.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxyuser" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxyuser" property is "user".
	 */
	@Test
	void testLoadPreference_ProxyUserTextField() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertEquals("user", mainView.proxyUserTextField.getText());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxypassword" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxypassword" property is "password".
	 */
	@Test
	void testLoadPreference_ProxyPassPasswordField() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertEquals("password", new String(mainView.proxyPassPasswordField.getPassword()));
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.httpversion" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.httpversion" property is "1.1".
	 */
	@Test
	void testLoadPreference_HttpVersionComboBox() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertEquals("1.1", mainView.httpVersionComboBox.getSelectedItem());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.httpauth" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.httpauth" property is "true".
	 */
	@Test
	void testLoadPreference_HttpAuthCheckBox() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertTrue(mainView.httpAuthCheckBox.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.httpauthuser" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.httpauthuser" property is "user".
	 */
	@Test
	void testLoadPreference_HttpUserTextField() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertEquals("user", mainView.httpUserTextField.getText());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.httpauthpassword" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.httpauthpassword" property is "password".
	 */
	@Test
	void testLoadPreference_HttpPassPasswordField() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		HttpPreference preference = new HttpPreference();
		JFrame parentFrame = new JFrame();
		preference.loadPreference(mainView, parentFrame);
		assertEquals("password", new String(mainView.