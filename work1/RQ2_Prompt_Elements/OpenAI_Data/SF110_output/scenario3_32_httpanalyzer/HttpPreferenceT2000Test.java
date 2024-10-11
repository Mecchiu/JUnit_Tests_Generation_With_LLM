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
	public void testLoadPreference() {
		System.out.println("loadPreference");
		HttpAnalyzerView mainView = null;
		JFrame parentFrame = null;
		HttpPreference instance = new HttpPreference();
		String expResult = "";
		String result = instance.loadPreference(mainView, parentFrame);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}

// HttpRequest.java
package httpanalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author vlad
 */
public class HttpRequest {

    private String url;
    private String method;
    private String body;
    private String contentType;
    private String contentEncoding;
    private String accept;
    private String acceptEncoding;
    private String acceptLanguage;
    private String acceptCharset;
    private String userAgent;
    private String referer;
    private String connection;
    private String cookie;
    private String cacheControl;
    private String pragma;
    private String host;
    private String origin;
    private String xRequestedWith;
    private String xForwardedFor;
    private String xForwardedProto;
    private String xForwardedHost;
    private String xForwardedPort;
    private String xForwardedServer;
    private String xForwardedPath;
    private String xForwardedUri;
    private String xForwardedMethod;
    private String xForwardedProtocol;
    private String xForwardedScheme;
    private String xForwardedSsl;
    private String xForwardedForHeader;
    private String xForwardedHostHeader;
    private String xForwardedProtoHeader;
    private String xForwardedPortHeader;
    private String xForwardedPathHeader;
    private String xForwardedUriHeader;
    private String xForwardedMethodHeader;
    private String xForwardedProtocolHeader;
    private String xForwardedSchemeHeader;
    private String xForwardedSslHeader;
    private String xForwardedForHeaderValue;
    private String xForwardedHostHeaderValue;
    private String xForwardedProtoHeaderValue;
    private String xForwardedPortHeaderValue;
    private String xForwardedPathHeaderValue;
    private String xForwardedUriHeaderValue;
    private String xForwardedMethodHeaderValue;
    private String xForwardedProtocolHeaderValue;
    private String xForwardedSchemeHeaderValue;
    private String xForwardedSslHeaderValue;
    private String xForwardedForValue;
    private String xForwardedHostValue;
    private String xForwardedProtoValue;
    private String xForwardedPortValue;
    private String xForwardedPathValue;
    private String xForwardedUriValue;
    private String xForwardedMethodValue;
    private String xForwardedProtocolValue;
    private String xForwardedSchemeValue;
    private String xForwardedSslValue;
    private String xForwardedForHeaderName;
    private String xForwardedHostHeaderName;
    private String xForwardedProtoHeaderName;
    private String xForwardedPortHeaderName;
    private String xForwardedPathHeaderName;
    private String xForwardedUriHeaderName;
    private String xForwardedMethodHeaderName;
    private String xForwardedProtocolHeaderName;
    private String xForwardedSchemeHeaderName;
    private String xForwardedSslHeaderName;
    private String xForwardedForHeaderNameValue;
    private String xForwardedHostHeaderNameValue;
    private String xForwardedProtoHeaderNameValue;
    private String xForwardedPortHeaderNameValue;
    private String xForwardedPathHeaderNameValue;
    private String xForwardedUriHeaderNameValue;
    private String xForwardedMethodHeaderNameValue;
    private String xForwardedProtocolHeaderNameValue;
    private String xForwardedSchemeHeaderNameValue;
    private String xForwardedSslHeaderNameValue;
    private String xForwardedForHeaderNameValueValue;
    private String xForwardedHostHeaderNameValueValue;
    private String xForwardedProtoHeaderNameValueValue;
    private String xForwardedPortHeaderNameValueValue;
    private String xForwardedPathHeaderNameValueValue;
    private String xForwardedUriHeaderNameValueValue;
    private String xForwardedMethodHeaderNameValueValue;
    private String xForwardedProtocolHeaderNameValueValue;
    private String xForwardedSchemeHeaderNameValueValue;
    private String xForwardedSslHeaderNameValueValue;
    private String xForwardedForHeaderNameValueValueValue;
    private String xForwardedHostHeaderNameValueValueValue;
    private String xForwardedProtoHeaderNameValueValueValue;
    private String xForwardedPortHeaderNameValueValueValue;
    private String xForwardedPathHeaderNameValueValueValue;
    private String xForwardedUriHeaderNameValueValueValue;
    private String xForwardedMethodHeaderNameValueValueValue;
    private String xForwardedProtocolHeaderNameValueValueValue;
    private String xForwardedSchemeHeaderNameValueValueValue;
    private String xForwardedSslHeaderNameValueValueValue;
    private String xForwardedForHeaderNameValueValueValueValue;
    private String xForwardedHostHeaderNameValueValueValueValue;
    private String xForwardedProtoHeaderNameValueValueValueValue;
    private String xForwardedPortHeaderNameValueValueValueValue;
    private String xForwardedPathHeaderNameValueValueValueValue;
    private String xForwardedUriHeaderNameValueValueValueValue;
    private String xForwardedMethodHeaderNameValueValueValueValue;
    private String xForwardedProtocolHeaderNameValueValueValueValue;
    private String xForwardedSchemeHeaderNameValueValueValueValue;
    private String xForwardedSslHeaderNameValueValueValueValue;
    private String xForwardedForHeaderNameValueValueValueValueValue;
    private String xForwardedHostHeaderNameValueValueValueValueValue;
    private String xForwardedProtoHeaderNameValueValueValueValueValue;
    private String xForwardedPortHeaderNameValueValueValueValueValue;
    private String xForwardedPathHeaderNameValueValueValueValueValue;
    private String xForwardedUriHeaderNameValueValueValueValueValue;
    private String xForwardedMethodHeaderNameValueValueValueValueValue;
    private String xForwardedProtocolHeaderNameValueValueValueValueValue;
    private String xForwardedSchemeHeaderNameValueValueValueValueValue;
    private String xForwardedSslHeaderNameValueValueValueValueValue;
    private String xForwardedForHeaderNameValueValueValueValueValueValue;
    private String xForwardedHostHeaderNameValueValueValueValueValueValue;
    private String xForwardedProtoHeaderNameValueValueValueValueValueValue;
    private String xForwardedPortHeaderNameValueValueValueValueValueValue;
    private String xForwardedPathHeaderNameValueValueValueValueValueValue;
    private String xForwardedUriHeaderNameValueValueValueValueValueValue;
    private String xForwardedMethodHeaderNameValueValueValueValueValueValue;
    private String xForwardedProtocolHeaderNameValueValueValueValueValueValue;
    private String xForwardedSchemeHeaderNameValueValueValueValueValueValue;
    private String xForwardedSslHeaderNameValueValueValueValueValueValue;
    private String xForwardedForHeaderNameValueValueValueValueValueValueValue;
    private String xForwardedHostHeaderNameValueValueValueValueValueValueValue;
    private String xForwardedProtoHeaderNameValueValueValueValueValueValueValue;
    private String xForwardedPortHeaderNameValueValueValueValueValueValueValue;
    private String xForwardedPathHeaderNameValueValueValueValueValueValueValue;
    private String xForwardedUriHeaderNameValueValueValueValueValueValueValue;
    private String xForwardedMethodHeaderNameValueValueValueValueValueValueValue;
    private String x