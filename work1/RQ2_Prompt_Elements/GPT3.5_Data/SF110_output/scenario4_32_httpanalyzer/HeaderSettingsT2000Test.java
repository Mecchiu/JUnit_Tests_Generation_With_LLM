// HeaderSettings.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * This class contains methods to set and retrieve HTTP headers for a request.
 */
public class HeaderSettings {

    // List of user agents to choose from
    public static String[] userAgents = { "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)", "msnbot/1.1 (+http://search.msn.com/msnbot.htm)", "Mozilla/5.0 (compatible; Yahoo! Slurp; http://help.yahoo.com/help/us/ysearch/slurp)", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16" };

    // Constants for user agent selection
    public static final int FIREFOX = 0;
    public static final int IE6 = 1;
    public static final int IE7 = 2;
    public static final int IE8 = 3;
    public static final int GOOGLEBOT = 4;
    public static final int MSNBOT = 5;
    public static final int YAHOOBOT = 6;
    public static final int IPHONE = 7;
    public static final int CUSTOM = 255;

    // Default content charset
    final String contentCharset = "utf-8";

    // User agent to set
    String setUserAgent;

    // Preset cookie to set
    private static String presetCookie;

    // Internal headers to set
    private static Header[] headersSet;

    /**
     * Get User-Agent and Referer and set internal headers.
     * @param idAgent The ID of the user agent to use.
     * @param referer The referer to set.
     */
    public static void initHeaders(int idAgent, String referer);

    /**
     * Get all headers from user and set internal headers.
     * @param myHeaders The headers to set.
     */
    public static void initHeaders(String myHeaders);

    /**
     * Send all internal headers.
     * @return The headers to send.
     */
    public static Header[] setHeaders();

    /**
     * Set internal header Cookie.
     * @param cookie The cookie to set.
     */
    public static void setCookie(String cookie);

    /**
     * Disable headers Cookie.
     */
    public static void clearCookie();

    /**
     * Get all headers as a string.
     * @return The headers as a string.
     */
    public static String getHeaders();

    /**
     * Show headers for a given request.
     * @param baseRequest The request to show headers for.
     * @return The headers as a string.
     */
    public static String showHeaders(HttpRequestBase baseRequest);

    /**
     * Show headers for a given array of headers.
     * @param headers The headers to show.
     * @return The headers as a string.
     */
    public static String showHeaders(Header[] headers);
}

// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains ten unit test cases for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {
    
    /**
     * Test that the headers returned by setHeaders() are not null.
     */
    @Test
    void testSetHeadersNotNull() {
        Header[] headers = HeaderSettings.setHeaders();
        assertNotNull(headers);
    }
    
    /**
     * Test that the headers returned by setHeaders() contain the User-Agent header.
     */
    @Test
    void testSetHeadersUserAgent() {
        Header[] headers = HeaderSettings.setHeaders();
        boolean userAgentFound = false;
        for (Header header : headers) {
            if (header.getName().equals("User-Agent")) {
                userAgentFound = true;
                break;
            }
        }
        assertTrue(userAgentFound);
    }
    
    /**
     * Test that the headers returned by setHeaders() contain the Accept header.
     */
    @Test
    void testSetHeadersAccept() {
        Header[] headers = HeaderSettings.setHeaders();
        boolean acceptFound = false;
        for (Header header : headers) {
            if (header.getName().equals("Accept")) {
                acceptFound = true;
                break;
            }
        }
        assertTrue(acceptFound);
    }
    
    /**
     * Test that the headers returned by setHeaders() contain the Accept-Language header.
     */
    @Test
    void testSetHeadersAcceptLanguage() {
        Header[] headers = HeaderSettings.setHeaders();
        boolean acceptLanguageFound = false;
        for (Header header : headers) {
            if (header.getName().equals("Accept-Language")) {
                acceptLanguageFound = true;
                break;
            }
        }
        assertTrue(acceptLanguageFound);
    }
    
    /**
     * Test that the headers returned by setHeaders() contain the Accept-Encoding header.
     */
    @Test
    void testSetHeadersAcceptEncoding() {
        Header[] headers = HeaderSettings.setHeaders();
        boolean acceptEncodingFound = false;
        for (Header header : headers) {
            if (header.getName().equals("Accept-Encoding")) {
                acceptEncodingFound = true;
                break;
            }
        }
        assertTrue(acceptEncodingFound);
    }
    
    /**
     * Test that the headers returned by setHeaders() contain the Connection header.
     */
    @Test
    void testSetHeadersConnection() {
        Header[] headers = HeaderSettings.setHeaders();
        boolean connectionFound = false;
        for (Header header : headers) {
            if (header.getName().equals("Connection")) {
                connectionFound = true;
                break;
            }
        }
        assertTrue(connectionFound);
    }
    
    /**
     * Test that the headers returned by setHeaders() contain the Referer header when set.
     */
    @Test
    void testSetHeadersReferer() {
        HeaderSettings.initHeaders(HeaderSettings.FIREFOX, "http://www.example.com");
        Header[] headers = HeaderSettings.setHeaders();
        boolean refererFound = false;
        for (Header header : headers) {
            if (header.getName().equals("Referer")) {
                refererFound = true;
                assertEquals("http://www.example.com", header.getValue());
                break;
            }
        }
        assertTrue(refererFound);
    }
    
    /**
     * Test that the headers returned by setHeaders() contain the Cookie header when set.
     */
    @Test
    void testSetHeadersCookie() {
        HeaderSettings.setCookie("mycookie=value");
        Header[] headers = HeaderSettings.setHeaders();
        boolean cookieFound = false;
        for (Header header : headers) {
            if (header.getName().equals("Cookie")) {
                cookieFound = true;
                assertEquals("mycookie=value", header.getValue());
                break;
            }
        }
        assertTrue(cookieFound);
    }
    
    /**
     * Test that the headers returned by setHeaders() do not contain the Cookie header when cleared.
     */
    @Test
    void testSetHeadersClearCookie() {
        HeaderSettings.setCookie("mycookie=value");
        HeaderSettings.clearCookie();
        Header[] headers = HeaderSettings.setHeaders();
        boolean cookieFound = false;
        for (Header header : headers) {
            if (header.getName().equals("Cookie")) {
                cookieFound = true;
                break;
            }
        }
        assertFalse(cookieFound);
    }
    
    /**
     * Test that the headers returned by setHeaders() contain custom headers when set.
     */
    @Test
    void testSetHeadersCustomHeaders() {
        HeaderSettings.initHeaders("X-Custom-Header: value");
        Header[] headers = HeaderSettings.setHeaders();
        boolean customHeaderFound = false;
        for (Header header : headers) {
            if (header.getName().equals("X-Custom-Header")) {
                customHeaderFound = true;
                assertEquals("value", header.getValue());
                break;
            }
        }
        assertTrue(customHeaderFound);
    }
}