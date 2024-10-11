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

// HttpProxy.java
package httpanalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author vlad
 */
public class HttpProxy {

    private String proxyHost;
    private int proxyPort;
    private String proxyUser;
    private String proxyPassword;
    private String proxyType;
    private String proxyAuth;
    private String proxyAuthUser;
    private String proxyAuthPassword;
    private String httpVersion;
    private String httpAuth;
    private String httpAuthUser;
    private String httpAuthPassword;
    private String customReferer;
    private String customCookie;
    private String userAgent;
    private String method;
    private String toFile;
    private String customHeaders;
    private String intelligenceMode;
    private String notes;
    private String url;
    private String params;
    private String response;
    private String responseHeaders;
    private String responseBody;
    private String responseCode;
    private String responseMessage;
    private String responseLength;
    private String responseTime;
    private String responseRedirect;
    private String responseRedirectTime;
    private String responseRedirectUrl;
    private String responseRedirectCode;
    private String responseRedirectMessage;
    private String responseRedirectLength;
    private String responseRedirectHeaders;
    private String responseRedirectBody;
    private String responseRedirectCookies;
    private String responseCookies;
    private String responseContentType;
    private String responseContentEncoding;
    private String responseContentLanguage;
    private String responseContentDisposition;
    private String responseContentLocation;
    private String responseContentMD5;
    private String responseContentRange;
    private String responseContentTransferEncoding;
    private String responseContentLength;
    private String responseContentTypeCharset;
    private String responseContentTypeBoundary;
    private String responseContentTypeName;
    private String responseContentTypeFileName;
    private String responseContentTypeFileExt;
    private String responseContentTypeFileNameExt;
    private String responseContentTypeFileNameExt2;
    private String responseContentTypeFileNameExt3;
    private String responseContentTypeFileNameExt4;
    private String responseContentTypeFileNameExt5;
    private String responseContentTypeFileNameExt6;
    private String responseContentTypeFileNameExt7;
    private String responseContentTypeFileNameExt8;
    private String responseContentTypeFileNameExt9;
    private String responseContentTypeFileNameExt10;
    private String responseContentTypeFileNameExt11;
    private String responseContentTypeFileNameExt12;
    private String responseContentTypeFileNameExt13;
    private String responseContentTypeFileNameExt14;
    private String responseContentTypeFileNameExt15;
    private String responseContentTypeFileNameExt16;
    private String responseContentTypeFileNameExt17;
    private String responseContentTypeFileNameExt18;
    private String responseContentTypeFileNameExt19;
    private String responseContentTypeFileNameExt20;
    private String responseContentTypeFileNameExt21;
    private String responseContentTypeFileNameExt22;
    private String responseContentTypeFileNameExt23;
    private String responseContentTypeFileNameExt24;
    private String responseContentTypeFileNameExt25;
    private String responseContentTypeFileNameExt26;
    private String responseContentTypeFileNameExt27;
    private String responseContentTypeFileNameExt28;
    private String responseContentTypeFileNameExt29;
    private String responseContentTypeFileNameExt30;
    private String responseContentTypeFileNameExt31;
    private String responseContentTypeFileNameExt32;
    private String responseContentTypeFileNameExt33;
    private String responseContentTypeFileNameExt34;
    private String responseContentTypeFileNameExt35;
    private String responseContentTypeFileNameExt36;
    private String responseContentTypeFileNameExt37;
    private String responseContentTypeFileNameExt38;
    private String responseContentTypeFileNameExt39;
    private String responseContentTypeFileNameExt40;
    private String responseContentTypeFileNameExt41;
    private String responseContentTypeFileNameExt42;
    private String responseContentTypeFileNameExt43;
    private String responseContentTypeFileNameExt44;
    private String responseContentTypeFileNameExt45;
    private String responseContentTypeFileNameExt46;
    private String responseContentTypeFileNameExt47;
    private String responseContentTypeFileNameExt48;
    private String responseContentTypeFileNameExt49;
    private String responseContentTypeFileNameExt50;
    private String responseContentTypeFileNameExt51;
    private String responseContentTypeFileNameExt52;
    private String responseContentTypeFileNameExt53;
    private String responseContentTypeFileNameExt54;
    private String responseContentTypeFileNameExt55;
    private String responseContentTypeFileNameExt56;
    private String responseContentTypeFileNameExt57;
    private String responseContentTypeFileNameExt58;
    private String responseContentTypeFileNameExt59;
    private String responseContentTypeFileNameExt60;
    private String responseContentTypeFileNameExt61;
    private String responseContentTypeFileNameExt62;
    private String responseContentTypeFileNameExt63;
    private String responseContentTypeFileNameExt64;
    private String responseContentTypeFileNameExt65;
    private String responseContentTypeFileNameExt66;
    private String responseContentTypeFileNameExt67;
    private String responseContentTypeFileNameExt68;
    private String responseContentTypeFileNameExt69;
    private String responseContentTypeFileNameExt70;
    private String responseContentTypeFileNameExt71;
    private String responseContentTypeFileNameExt72;
    private String responseContentTypeFileNameExt73;
    private String responseContentTypeFileNameExt74;
    private String responseContentTypeFileNameExt75;
    private String responseContentTypeFileNameExt76;
    private String responseContentTypeFileNameExt77;
    private String responseContentTypeFileNameExt78;
    private String responseContentTypeFileNameExt79;
    private String responseContentTypeFileNameExt80;
    private String responseContentTypeFileNameExt81;
    private String responseContentTypeFileNameExt82;
    private String responseContentTypeFileNameExt83;
    private String responseContentTypeFileNameExt84;
    private String responseContentTypeFileNameExt85;
    private String responseContentTypeFileNameExt86;
    private String responseContentTypeFileNameExt87;
    private String responseContentTypeFileNameExt88;
    private String responseContentTypeFileNameExt89;
    private String responseContentTypeFileNameExt90;
    private String responseContentTypeFileNameExt91;
    private String responseContentTypeFileNameExt92;
    private String responseContentTypeFileNameExt93;
    private String responseContentTypeFileNameExt94;
    private String responseContentTypeFileNameExt