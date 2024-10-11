// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains one unit test case for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {
// HeaderSettings.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;

/**
 * @author vlad
 */
public class HeaderSettings {

    public static String[] userAgents = { "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1;.NET CLR 1.1.4322;.NET CLR 2.0.50727)", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)", "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)", "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)", "msnbot/1.1 (+http://search.msn.com/msnbot.htm)", "Mozilla/5.0 (compatible; Yahoo! Slurp; http://help.yahoo.com/help/us/ysearch/slurp)", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16" };

    public static final int FIREFOX = 0;

    public static final int IE6 = 1;

    public static final int IE7 = 2;

    public static final int IE8 = 3;

    public static final int GOOGLEBOT = 4;

    public static final int MSNBOT = 5;

    public static final int YAHOOBOT = 6;

    public static final int IPHONE = 7;

    public static final int CUSTOM = 255;

    final String contentCharset = "utf-8";

    String setUserAgent;

    private static String presetCookie;

    private static Header[] headersSet;

    /**
     * Get User-Agent&Referer and set
     * internal headers
     */
    public static void initHeaders(int idAgent, String referer);

    /**
     * Get all headers from user from
     * and set internal headers
     */
    public static void initHeaders(String myHeaders);

    /**
     * Send all internal headers
     */
    public static Header[] setHeaders();

    /**
     * Set internal header Cookie:
     */
    public static void setCookie(String cookie);

    /**
     * Disable headers Cookie
     */
    public static void clearCookie();

    public static String getHeaders();

    public static String showHeaders(HttpRequestBase baseRequest);

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
* It contains one unit test case for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {
		
	private static final String myHeaders =
        "Content-Type: text/html\n" + 
        "\n" +
        "<div>\n" + 
        "\t<ol>\n" + 
        "\t\t<li>test</li>\n" + 
        "\n" + 
        "  </ol>\n" + 
        "</div>\n";

			
    @Test
    public void setsNoCookies(){
        HeaderSettings headers = new HeaderSettings();
        String contentCharset = "UTF-8";
        assertNotNull(headers.getCookie(), "No Cookie should be set");
    }

    @Test
    //If userAgent is MSN(ie7), it should be set by default
    public void setsCustomHeadersNoSites(){
        HeaderSettings headers = new HeaderSettings();
        headers.setUserAgent("Custom-Test-User-Agent");
        String contentCharset = "UTF-8";
        assertNull(headers.getCookie(), "No cookie should be set");
        assertNotNull(headers.getHeaders(), "Should set global headers.");
        assertSame(headers.getHeaders().get(0).getName(), new String[] { "User-Agent", "X-Custom-Test-User-Agent", "Accept", "text/html; charset=" }, new String[] { "Content-Type", "text/html", "Accept", contentCharset }, headers.getHeaders().get(0));
    }

    @Test
    public void setsSitesAndCookies(){
        HeaderSettings headers = new HeaderSettings();
        headers.setUserAgent("myAgent");
        headers.clearCookie();
        headers.setSites(["http://www.google.com"]);
        String contentCharset = "UTF-8";
        assertNull(headers.getCookie(), "No cookie should be set");
        assertNotNull(headers.getHeaders(), "Should set global headers.");
        assertSame(headers.getHeaders().get(0).getName(), new String[] { "User-Agent", "myAgent", "Accept", "text/html; charset=" }, new String[] { "Content-Type", "text/html", "Accept", contentCharset }, headers.getHeaders().get(0));
    }

    @Test
    public void setSitesDefaultHeaders(){
        HeaderSettings headers = new HeaderSettings();
        headers.setSites([]);
        headers.getSites()[1] = "https://google.com";
        String contentCharset = "UTF-8";
        assertNotNull(headers.getCookie(), "No cookie should be set");
        assertNotNull(headers.getCookie(), "No Cookie Cookie should be created");
        assertNull(headers.getHeaders(), "Should set global headers");
    }

    @Test
    public void setCookies(){
        HeaderSettings cookies = new HeaderSettings();
        headersSet = new Header[2];
        headersSet[0] = new Header("Set-cookie", "custom-agent=" + System.currentTimeMillis() + "; path=/");
        headersSet[1] = new Header("set-cookie", "Set-cookie: custom-agent=" + System.currentTimeMillis() + "; path=/");
        assertNotNull(headersSet);
        cookies.setCookie(headersSet);
        assertEquals(headersSet[0], new Header("Set-cookie", "custom-agent=" + System.currentTimeMillis() + "; path=/"));
        assertEquals(headersSet[1], new Header("set-cookie", "set-cookie: custom-agent=" + System.currentTimeMillis() + "; path=/"));
        assertNull(headersSet[0]);
        assertNotNull(headersSet[1]);
    }

    @Test
    public void setUserAgent(){
        HeaderSettings cookies = new HeaderSettings();
        headersSet = new Header[2];
        headersSet[0] = new Header("Set-cookie", "custom-agent=" + System.currentTimeMillis() + "; path=/");
        headersSet[1] = new Header("set-cookie", "Custom-Test-User-Agent; path=/");
        assertNull(headersSet);
        headersSet = new Header[2];
        headersSet[0] = new Header("Set-cookie", "custom-agent=" + System.currentTimeMillis() + "; path=/");
        headersSet[1] = new Header("set-cookie", "Custom-Test-User-Agent=" + System.currentTimeMillis() + "; path=/");
        assertSame(headersSet[0], new Header("Set-cookie", "custom-agent=" + System.currentTimeMillis() + "; path=/"));
        assertSame(headersSet[1], new Header("set-cookie", "Custom-Test-User-Agent=" + System.currentTimeMillis() + "; path=/"));
    }

    @Test
    public void resetCookies(){
        HeaderSettings cookies = new HeaderSettings();
        long time = System.currentTimeMillis();
        cookies.setCookie(headersSet);
        headersSet = new Header[2];
        assert