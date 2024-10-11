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
	 * It checks if the method returns an array of headers with the correct name and value.
	 */
	@Test
	void testSetHeadersNameValue() {
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "Accept");
		assertEquals(headers[0].getValue(), "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9");
		assertEquals(headers[1].getName(), "Accept-Encoding");
		assertEquals(headers[1].getValue(), "gzip, deflate, br");
		assertEquals(headers[2].getName(), "Accept-Language");
		assertEquals(headers[2].getValue(), "en-US,en;q=0.9");
		assertEquals(headers[3].getName(), "Cache-Control");
		assertEquals(headers[3].getValue(), "max-age=0");
		assertEquals(headers[4].getName(), "Connection");
		assertEquals(headers[4].getValue(), "keep-alive");
		assertEquals(headers[5].getName(), "Host");
		assertEquals(headers[5].getValue(), "www.google.com");
		assertEquals(headers[6].getName(), "Sec-Fetch-Dest");
		assertEquals(headers[6].getValue(), "document");
		assertEquals(headers[7].getName(), "Sec-Fetch-Mode");
		assertEquals(headers[7].getValue(), "navigate");
		assertEquals(headers[8].getName(), "Sec-Fetch-Site");
		assertEquals(headers[8].getValue(), "none");
		assertEquals(headers[9].getName(), "Upgrade-Insecure-Requests");
		assertEquals(headers[9].getValue(), "1");
	}
}