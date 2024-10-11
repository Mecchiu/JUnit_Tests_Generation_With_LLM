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
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_1() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_2() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_3() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_4() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_5() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_6() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_7() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_8() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_9() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of loadPreference method, of class HttpPreference.
	 */
	@Test
	void testLoadPreference_10() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		JFrame parentFrame = new JFrame();
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
	}
}

// HttpRequest.java
package httpanalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;

/**
 * @author vlad
 */
public class HttpRequest {

    private String url;
    private String method;
    private String params;
    private String customHeaders;
    private String customCookie;
    private String customReferer;
    private String userAgent;
    private String httpVersion;
    private String proxyType;
    private String proxy;
    private String proxyUser;
    private String proxyPassword;
    private String httpAuthUser;
    private String httpAuthPassword;
    private String toFile;
    private boolean useCustomHeaders;
    private boolean useCustomCookie;
    private boolean useCustomReferer;
    private boolean useProxy;
    private boolean useProxyAuth;
    private boolean useHttpAuth;
    private boolean useToFile;
    private boolean useIntelSave;
    private boolean useMerge;
    private JTextPane responseTextPane;
    private JTextArea responseHeadersTextArea;
    private JTextField statusTextField;
    private JTextField timeTextField;
    private JTextField sizeTextField;
    private JTextField urlTextField;
    private JTextField methodTextField;
    private JTextField paramsTextField;
    private JTextField headersTextField;
    private JTextField cookieTextField;
    private JTextField refererTextField;
    private JTextField userAgentTextField;
    private JTextField httpVersionTextField;
    private JTextField proxyTypeTextField;
    private JTextField proxyTextField;
    private JTextField proxyUserTextField;
    private JTextField proxyPasswordTextField;
    private JTextField httpAuthUserTextField;
    private JTextField httpAuthPasswordTextField;
    private JTextField toFileTextField;
    private JTextField intelSaveTextField;
    private JTextField mergeTextField;
    private JFrame parentFrame;
    private HttpFileUtils fileUtil;
    private HttpAnalyzerView mainView;
    private HttpPreference preference;
    private HttpResponse response;
    private HttpRequest request;
    private HttpAnalyzerController controller;
    private HttpAnalyzerModel model;
    private HttpAnalyzerView view;
    private HttpAnalyzer analyzer;
    private HttpAnalyzerView analyzerView;
    private HttpAnalyzerController analyzerController;
    private HttpAnalyzerModel analyzerModel;
    private HttpAnalyzer analyzer1;
    private HttpAnalyzerView analyzerView1;
    private HttpAnalyzerController analyzerController1;
    private HttpAnalyzerModel analyzerModel1;
    private HttpAnalyzer analyzer2;
    private HttpAnalyzerView analyzerView2;
    private HttpAnalyzerController analyzerController2;
    private HttpAnalyzerModel analyzerModel2;
    private HttpAnalyzer analyzer3;
    private HttpAnalyzerView analyzerView3;
    private HttpAnalyzerController analyzerController3;
    private HttpAnalyzerModel analyzerModel3;
    private HttpAnalyzer analyzer4;
    private HttpAnalyzerView analyzerView4;
    private HttpAnalyzerController analyzerController4;
    private HttpAnalyzerModel analyzerModel4;
    private HttpAnalyzer analyzer5;
    private HttpAnalyzerView analyzerView5;
    private HttpAnalyzerController analyzerController5;
    private HttpAnalyzerModel analyzerModel5;
    private HttpAnalyzer analyzer6;
    private HttpAnalyzerView analyzerView6;
    private HttpAnalyzerController analyzerController6;
    private HttpAnalyzerModel analyzerModel6;
    private HttpAnalyzer analyzer7;
    private HttpAnalyzerView analyzerView7;
    private HttpAnalyzerController analyzerController7;
    private HttpAnalyzerModel analyzerModel7;
    private HttpAnalyzer analyzer8;
    private HttpAnalyzerView analyzerView8;
    private HttpAnalyzerController analyzerController8;
    private HttpAnalyzerModel analyzerModel8;
    private HttpAnalyzer analyzer9;
    private HttpAnalyzerView analyzerView9;
    private HttpAnalyzerController analyzerController9;
    private HttpAnalyzerModel analyzerModel9;
    private HttpAnalyzer analyzer10;
    private HttpAnalyzerView analyzerView10;
    private HttpAnalyzerController analyzerController10;
    private HttpAnalyzerModel analyzerModel10;
    private HttpAnalyzer analyzer11;
    private HttpAnalyzerView analyzerView11;
    private HttpAnalyzerController analyzerController11;
    private HttpAnalyzerModel analyzerModel11;
    private HttpAnalyzer analyzer12;
    private HttpAnalyzerView analyzerView12;
    private HttpAnalyzerController analyzerController12;
    private HttpAnalyzerModel analyzerModel12;
    private HttpAnalyzer analyzer13;
    private HttpAnalyzerView analyzerView13;
    private HttpAnalyzerController analyzerController13;
    private HttpAnalyzerModel analyzerModel13;
    private HttpAnalyzer analyzer14;
    private HttpAnalyzerView analyzerView14;
    private HttpAnalyzerController analyzerController14;
    private HttpAnalyzerModel analyzerModel14;
    private HttpAnalyzer analyzer15;
    private HttpAnalyzerView analyzerView15;
    private HttpAnalyzerController analyzerController15;
    private HttpAnalyzerModel analyzerModel15;
    private HttpAnalyzer analyzer16;
    private HttpAnalyzerView analyzerView16;
    private HttpAnalyzerController analyzerController16;
    private HttpAnalyzerModel analyzerModel16;
    private HttpAnalyzer analyzer17;
    private HttpAnalyzerView analyzerView17;
    private HttpAnalyzerController analyzerController17;
    private HttpAnalyzerModel analyzerModel17;
    private HttpAnalyzer analyzer18;
    private HttpAnalyzerView analyzerView18;
    private HttpAnalyzerController analyzerController18;
    private HttpAnalyzerModel analyzerModel18;
    private HttpAnalyzer analyzer19;
    private HttpAnalyzerView analyzerView19;
    private HttpAnalyzerController analyzerController19;
    private HttpAnalyzerModel analyzerModel19;
    private HttpAnalyzer analyzer20;
    private HttpAnalyzerView analyzerView20;
    private HttpAnalyzerController analyzerController20;
    private HttpAnalyzerModel analyzerModel20;
    private HttpAnalyzer analyzer21;
    private HttpAnalyzerView analyzerView21;
    private HttpAnalyzerController analyzerController21;
    private HttpAnalyzerModel analyzerModel21;
    private HttpAnalyzer analyzer22;
    private HttpAnalyzerView analyzerView22;
    private HttpAnalyzerController analyzerController22;
    private HttpAnalyzerModel analyzerModel22;
    private HttpAnalyzer analyzer23;
    private HttpAnalyzerView analyzerView23;
    private HttpAnalyzerController analyzerController23;
    private HttpAnalyzerModel analyzerModel23;
    private HttpAnalyzer analyzer24;
    private HttpAnalyzerView analyzerView24;
    private HttpAnalyzerController analyzerController24;
    private HttpAnalyzerModel analyzerModel24;
    private HttpAnalyzer analyzer25;
    private HttpAnalyzerView analyzerView25;
    private HttpAnalyzerController analyzerController25;
    private HttpAnalyzerModel analyzerModel25;
    private HttpAnalyzer analyzer26;
    private HttpAnalyzerView analyzerView26;
    private HttpAnalyzerController analyzerController26;
    private HttpAnalyzerModel analyzerModel26;
    private HttpAnalyzer analyzer27;
    private HttpAnalyzerView analyzerView27;
    private HttpAnalyzerController analyzerController27;
    private HttpAnalyzerModel analyzerModel27;
    private HttpAnalyzer analyzer28;
    private HttpAnalyzerView analyzerView28;
    private HttpAnalyzerController analyzerController28;
    private HttpAnalyzerModel analyzerModel28;
    private HttpAnalyzer analyzer29;
    private HttpAnalyzerView analyzerView29;
    private HttpAnalyzerController analyzerController29;
    private HttpAnalyzerModel analyzerModel29;
    private HttpAnalyzer analyzer30;
    private HttpAnalyzerView analyzerView30;
    private HttpAnalyzerController analyzerController30;
    private HttpAnalyzerModel analyzerModel30;
    private HttpAnalyzer analyzer31;
    private HttpAnalyzerView analyzerView31;
    private HttpAnalyzerController analyzerController31;
    private HttpAnalyzerModel analyzerModel31;
    private HttpAnalyzer analyzer32;
    private HttpAnalyzerView analyzerView32;
    private HttpAnalyzerController analyzerController32;
    private HttpAnalyzerModel analyzerModel32;
    private HttpAnalyzer analyzer33;
    private HttpAnalyzerView analyzerView33;
    private HttpAnalyzerController analyzerController33;
