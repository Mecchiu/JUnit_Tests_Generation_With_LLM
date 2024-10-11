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
	void testSetHeaders() {
		String originalCookie = "test-cookie";
		HeaderSettings settings = new HeaderSettings();
		// do test
		settings.setHeaders(headerSet());

		assertSame(settings.getCookie(), originalCookie);
	}
	@Test
	void testSetHeaders_nullHeaders() {
		assertThrows(IllegalArgumentException.class, settings::setHeaders);
	}
	@Test
	void testSetHeaders_nullRequest() {
		assertThrows(IllegalArgumentException.class, settings::setHeaders, 0.0);
	}
	@Test
	void testSetHeaders_setHeaders() {
		String contents = "";
		String[] originalHeaders = new String[] {"httponly"};
		Header[] originalHeadersArray = new Header[1];
		// create new instance
		HeaderSettings settings = new HeaderSettings();
		// add new headers
		settings.setHeaders(originalHeadersArray);
		// set originalHeaders
		settings.setHeaders(originalHeaders);
		// set new headers array again
		settings.setHeaders(originalHeadersArray);

		// get set headers
		assertSame(originalHeaders, settings.getHeaders());
		// compare headers
		assertArrayEquals(originalHeadersArray, settings.getHeaders());
		// compare set headers
		assertArrayEquals(originalHeadersArray, settings.getHeaders());

		// set new headers
		settings.setHeaders(originalHeaders);
		// set new headers again
		settings.setHeaders(originalHeadersArray);

		// check get headers
		assertEquals(originalHeaders, settings.getHeaders());
		// check set headers
		assertEquals(originalHeaders, settings.getHeaders());

	}
	@Test
	void testShowHeaders_nullHeaders() {
		final String expectedHeader = "";
		HeaderSettings settings = new HeaderSettings();
		assertThrows(IllegalArgumentException.class, settings::appendTo, "", null, expectedHeader);
	}
	@Test
	void testShowHeaders_nullRequest() {
		// check request and request array
		final HttpRequestBase headerRequest = (HttpRequestBase)
				new HttpGet("http://localhost/test/header").setHeader("Accept", "text/html");
		HeaderSettings.appendTo(headerRequest, "", "text/html");
		assertNull(headerRequest);
		assertEquals("text/html", headerRequest.getHeader("Accept"));
		assertEquals("text/html", headerRequest.getFirstHeader("Accept"));

	}
	@Test
	void testShowHeaders_setHeaders() {
		final String[] expectedHeader = new String[] {"text/html", "Content-Length", "Content-Encoding", "Content-Type"};
		HeaderSettings settings = new HeaderSettings();
		// check request and request array
		HeaderSettings.appendTo(new HttpGet("http://localhost/test/header").setHeader("Accept", "text")
				.setHeader("Set-Cookie", "test-cookie")
				.setHeader("Test-Header", "testValue"), expectedHeader);
		assertEquals("text/html", settings.getHeaders()[0].getValue());
		assertEquals("text/html", settings.getHeaders()[1].getValue());
		assertEquals("Content-Length", settings.getHeaders()[2].getValue());
		assertEquals("Content-Type", settings.getHeaders()[3].getValue());
	}
	@Test
	void testShowHeaders_setHeaders_oldOrder() {
		final String[] expectedHeader = new String[] {"text/html", "content-length", "content-encoding", "content-type"};
		HeaderSettings settings = new HeaderSettings();
		// check request and request array
		HeaderSettings.appendTo(new HttpGet("http://localhost/test/header").setHeader("Accept", "text")
				.setHeader("Set-Cookie", "test-cookie")
				.setHeader("Test-Header", "testValue"), expectedHeader);
		assertEquals("text/html", settings.getHeaders()[0].getValue());
		assertEquals("text/html", settings.getHeaders()[1].getValue());
		assertEquals("content-length", settings.getHeaders()[2].getValue());
		assertEquals("content-encoding", settings.getHeaders()[3].getValue());
		assertEquals("content-type", settings.getHeaders()[4].getValue());
	}

}