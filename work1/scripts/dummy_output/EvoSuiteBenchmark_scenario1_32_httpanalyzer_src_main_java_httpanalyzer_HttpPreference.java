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
	void testLoadPreference_1() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.tools.options.merge", "true");
		instance.loadPreference(mainView, parentFrame);
		assertEquals(true, mainView.mergeInfoCheckBox.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxytype" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxytype" property is "None".
	 */
	@Test
	void testLoadPreference_2() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.proxytype", "None");
		instance.loadPreference(mainView, parentFrame);
		assertEquals(true, mainView.proxyNoneRadioButton.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxytype" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxytype" property is "Http".
	 */
	@Test
	void testLoadPreference_3() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.proxytype", "Http");
		instance.loadPreference(mainView, parentFrame);
		assertEquals(true, mainView.proxyHttpRadioButton.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxytype" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxytype" property is "Socks".
	 */
	@Test
	void testLoadPreference_4() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.proxytype", "Socks");
		instance.loadPreference(mainView, parentFrame);
		assertEquals(true, mainView.proxySocksRadioButton.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxy" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxy" property is "127.0.0.1".
	 */
	@Test
	void testLoadPreference_5() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.proxy", "127.0.0.1");
		instance.loadPreference(mainView, parentFrame);
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
	void testLoadPreference_6() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.proxyauth", "true");
		instance.loadPreference(mainView, parentFrame);
		assertEquals(true, mainView.proxyAuthCheckBox.isSelected());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.proxyuser" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.proxyuser" property is "user".
	 */
	@Test
	void testLoadPreference_7() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.proxyuser", "user");
		instance.loadPreference(mainView, parentFrame);
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
	void testLoadPreference_8() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.proxypassword", "password");
		instance.loadPreference(mainView, parentFrame);
		assertEquals("password", mainView.proxyPassPasswordField.getText());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.httpversion" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.httpversion" property is "1.1".
	 */
	@Test
	void testLoadPreference_9() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.httpversion", "1.1");
		instance.loadPreference(mainView, parentFrame);
		assertEquals("1.1", mainView.httpVersionComboBox.getSelectedItem());
	}
	
	/**
	 * Test case for {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
	 * <p>
	 * Test case for checking the correct loading of the "httpanalyzer.options.httpversion" property.
	 * <p>
	 * Expected result: the value of the "httpanalyzer.options.httpversion" property is "1.0".
	 */
	@Test
	void testLoadPreference_10() {
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		Properties properties = new Properties();
		properties.setProperty("httpanalyzer.options.httpversion", "1.0");
		instance.loadPreference(mainView, parentFrame);
		assertEquals("1.0", mainView.httpVersionComboBox.getSelectedItem());
	}
}