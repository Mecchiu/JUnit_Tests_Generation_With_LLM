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
	* Test method for {@link ParamsUrlTools#getPairParams(String)}.
	* (see testCase for description)
	*/
	@Test
    public void getPairParamsTest() {
	    HttpRequest request = new HttpRequest();
	    HttpMethod method = new HttpMethod();
	    String query = "";
		request.setRequestMethod("GET");
		request.setUri(new URI( "http://www.google.com/"));
		assertFalse(request.getParams().isEmpty());
		request.setRawHeaders(("x-app-name", "test"));
		assertFalse(request.getParams().isEmpty());
		query = request.toQueryString();
		assertNoQuery();
		List<NameValuePair> nameValuePairs = request.getParams();
		List<NameValuePair> nameValue = (List<NameValuePair>)nameValuePairs.get(0);
		List<NameValuePair> valueList = (List<NameValuePair>)nameValuePairs.get(1);
		String key = (String)valueList.get(1).getValue();
		assertEquals("x-app-name", key);
		assertFalse(query.equals(""));
		request.addParameters(new ArrayList<NameValuePair>());
		nameValue = (List<NameValuePair>)request.getParams().get(0);
		urlEncode(nameValue.get(1));
		uriEncode(nameValue.get(1));
		assertEquals("http://www.google.com/", query);
		
	}
	/**
	 * Test method for {@link ParamsUrlTools#uriEncode(java.lang.String)}.
	 * (see testCase for description)
	*/
	@SuppressWarnings("deprecation")
    @Test
    public void uriEncodeTest() {
	    HttpRequest request = new HttpRequest();
	    HttpMethod method = new HttpMethod();
	    String query = "";
		request.setRequestMethod("GET");
		@SuppressWarnings("deprecation")
		URI uri = (new URI("http://test.test.com/simple/test/")).toURI();
		request.setUri(uri);
		request.setRawHeaders(("x-app-name", "test"));
		assertFalse(request.getParams().isEmpty());
		request.setRawHeaders(new ArrayList<NameValuePair>());
		request.setQueryString(query);
		assertEquals("https://test.test.com/simple/test/", uri);
		String result = uriEncode(request);
		request.setUri(null);
		assertFalse(result.equals(""));
	}
	/**
	 * Test method for {@link ParamsUrlTools#urlEncode(java.lang.String)}.
	 * (see testCase for description)
	*/
	@SuppressWarnings("deprecation")
    @Test
    public void uriEncodeNoContentTypeTest() {
	    HttpRequest request = new HttpRequest();
	    HttpMethod method = new HttpMethod();
	    String query = "";
		request.setRequestMethod(null);
		request.setUri(new URI( "http://test.test.com/simple/test/"));
		request.setRawHeaders(new ArrayList<NameValuePair>());
		request.setQueryString(query);
		assertFalse(request.getParams().isEmpty());
		assertEquals("http://test.test.com/simple/test/", request.getUri());
		String result = urlEncode(request);
		request.setQueryString("");
		request.setUri(null);
		assertFalse(result.equals(""));
	}
}
