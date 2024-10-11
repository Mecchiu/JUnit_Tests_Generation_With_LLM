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
}
}