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
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers.
	 */
	@Test
	void testSetHeaders() {
		Header[] headers = HeaderSettings.setHeaders();
		assertNotNull(headers);
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct length.
	 */
	@Test
	void testSetHeadersLength() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers.length, 10);
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct first header.
	 */
	@Test
	void testSetHeadersFirstHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "Accept");
		assertEquals(headers[0].getValue(), "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct second header.
	 */
	@Test
	void testSetHeadersSecondHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[1].getName(), "Accept-Encoding");
		assertEquals(headers[1].getValue(), "gzip, deflate, br");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct third header.
	 */
	@Test
	void testSetHeadersThirdHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[2].getName(), "Accept-Language");
		assertEquals(headers[2].getValue(), "en-US,en;q=0.9");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct fourth header.
	 */
	@Test
	void testSetHeadersFourthHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[3].getName(), "Cache-Control");
		assertEquals(headers[3].getValue(), "max-age=0");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct fifth header.
	 */
	@Test
	void testSetHeadersFifthHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[4].getName(), "Connection");
		assertEquals(headers[4].getValue(), "keep-alive");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct sixth header.
	 */
	@Test
	void testSetHeadersSixthHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[5].getName(), "Host");
		assertEquals(headers[5].getValue(), "www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct seventh header.
	 */
	@Test
	void testSetHeadersSeventhHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[6].getName(), "Sec-Fetch-Dest");
		assertEquals(headers[6].getValue(), "document");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct eighth header.
	 */
	@Test
	void testSetHeadersEighthHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[7].getName(), "Sec-Fetch-Mode");
		assertEquals(headers[7].getValue(), "navigate");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct ninth header.
	 */
	@Test
	void testSetHeadersNinthHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[8].getName(), "Sec-Fetch-Site");
		assertEquals(headers[8].getValue(), "none");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns an array of headers with the correct tenth header.
	 */
	@Test
	void testSetHeadersTenthHeader() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[9].getName(), "Upgrade-Insecure-Requests");
		assertEquals(headers[9].getValue(), "1");
	}
}

// HttpAnalyzer.java
package httpanalyzer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * @author vlad
 */
public class HttpAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, ClientProtocolException, IOException {
        // TODO code application logic here
        HttpClient client = HttpClientBuilder.create().build();
        URIBuilder builder = new URIBuilder();
        builder.setScheme("https").setHost("www.google.com").setPath("/");
        URI uri = builder.build();
        HttpGet request = new HttpGet(uri);
        Header[] headers = HeaderSettings.setHeaders();
        request.setHeaders(headers);
        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");
        System.out.println(responseString);
    }
}

// HttpAnalyzerTest.java
package httpanalyzer;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http