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
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders() {
		HeaderSettings.initHeaders(HeaderSettings.FIREFOX, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders2() {
		HeaderSettings.initHeaders(HeaderSettings.IE6, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders3() {
		HeaderSettings.initHeaders(HeaderSettings.IE7, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders4() {
		HeaderSettings.initHeaders(HeaderSettings.IE8, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders5() {
		HeaderSettings.initHeaders(HeaderSettings.GOOGLEBOT, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders6() {
		HeaderSettings.initHeaders(HeaderSettings.MSNBOT, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "msnbot/1.1 (+http://search.msn.com/msnbot.htm)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders7() {
		HeaderSettings.initHeaders(HeaderSettings.YAHOOBOT, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/5.0 (compatible; Yahoo! Slurp; http://help.yahoo.com/help/us/ysearch/slurp)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders8() {
		HeaderSettings.initHeaders(HeaderSettings.IPHONE, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders9() {
		HeaderSettings.initHeaders(HeaderSettings.CUSTOM, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders10() {
		HeaderSettings.initHeaders("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)\nReferer: http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals