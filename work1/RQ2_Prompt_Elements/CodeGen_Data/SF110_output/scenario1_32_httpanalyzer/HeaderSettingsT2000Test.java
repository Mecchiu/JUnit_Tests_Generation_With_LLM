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

	@Test
	void testHeaderSet() {
		HeaderSettings s = new HeaderSettings ();
		s.addHeader(new Header("Header_1", "value"));
		Header[] all = s.setHeaders();
		assertTrue(all.length == 1);
		assertTrue(all[0].getName().equals("Header_1"));
		assertTrue(all[0].getValue().equals("value"));
	}
		
	@Test
	void testSetGet() {
		HeaderSettings s = new HeaderSettings ();
		s.addHeader(new Header("Header_1", "value"));
		assertEquals(s.getHeaders().length, 1);
		assertEquals(s.getHeaders()[0], new Header("Header_1", "value"));
	}
		
	@Test
	void testRequest() {
		HeaderSettings s = new HeaderSettings ();
		assertEquals(s.request(), new HttpGet ( "https://demo.io/some/path" ));
	}
		
	@Test
	void testSetUrlEncoding() {
		HeaderSettings s = new HeaderSettings ();
		assertFalse((s.hasParam("param1")? false : true));
		assertFalse((s.hasQueryString("queryString11")? true : false));
		s.setUrlEncoding(true);
		assertTrue((s.hasParam("param1")? true : false));
		assertTrue((s.hasParam("param1")? s.hasQueryString("queryString11") : false));
		
		s.setUrlEncoding(false);
		assertTrue((s.hasParam("param1")? false : true));
		assertTrue((s.hasParam("param1")? s.hasQueryString("queryString11") : true));
		
	}
	
	@Test
	void testHeaders() {
		HeaderSettings s = new HeaderSettings ();
		assertTrue(s.headers == null || s.headers.length == 0);
	}
}