// ParamsUrlToolsTest.java
package httpanalyzer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParamsUrlTools}.
* It contains one unit test case for the {@link ParamsUrlTools#getPairParams(String)} method.
*/
class ParamsUrlToolsTest {
		/**
		 * Test class of {@link ParamsUrlTools}.
		 */
	@Test
	public void checkUrl() throws URISyntaxException {
		List<NameValuePair> pair = new ArrayList<>();
		pair.add(new BasicNameValuePair("host", "example.com"));
		pair.add(new BasicNameValuePair("http-scheme", "https"));
		pair.add(new BasicNameValuePair("port", "80"));
		pair.add(new BasicNameValuePair("path", "/queryString"));
		pair.add(new BasicNameValuePair("path", "/file"));
		pair.add(new BasicNameValuePair("checked_url", "/"));
		pair.add(new BasicNameValuePair("checked_url", "true"));
		pair = ParamsUrlTools.checkUrl(pair);
		assertEquals(new URI("https://example.com/queryString"), pair.get(0).getURI());
		assertNull(pair.get(1).getURI());
		assertEquals(new URI("http://host.com:80/queryString"), pair.get(2).getURI());
		assertNull(pair.get(3).getURI());
		assertEquals(new URI("http://host.com/queryString"), pair.get(4).getURI());
		assertNull(pair.get(5).getURI());
		assertTrue(pair.get(6).getValue().equals("path=/queryString"));
	}
}