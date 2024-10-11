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
ParamsUrlToolsTest() {
		}

	/**
	 * Test {@link ParamsUrlTools#getPairParams(String)}.
	 * Create the test URL {@code example} and
	 * put the {@code url} on the end of the test URL.
	 */
	@Test
	public void testParamsUrlTools() {
		try {
			List<NameValuePair> paramsList = new ArrayList<>(2);
			paramsList.add(new BasicNameValuePair("example", "localhost"));
			paramsList.add(new BasicNameValuePair("scheme", "http"));
			paramsList.add(new BasicNameValuePair("url", "example"));
			uri = new URI(String.valueOf(UrlToolsTools.createDefaultRequestURL(UrlToolsTools.getFullParamUrl(paramsList))));
			// create parameter list for test
			List<NameValuePair> params = getPairParams(UrlTools.getFullParamUrl(paramsList));
		    assertTrue(params.size() == 4);
		    List<String> expected = new ArrayList<>(4); // "host", "scheme", "url", "checkedUrl"
			expected.add(uri.getHost()+":"+uri.getHostPort()+"?scheme="+uri.getScheme()+"&url="+uri.getEscapedQueryParam(UrlTools.URL_PATH_PARAM_KEY)+"&checkedUrl="+uri.getEscapedQueryParam(UrlTools.URL_CHECKED_PARAM_KEY));
			expected.add(String.valueOf(uri) + "?" + UrlTools.PARAM_URL_PARAM_KEY + "=" + UrlTools.parseUrl(uri.getEscapedQueryParam(UrlTools.URL_PATH_PARAM_KEY)));
			expected.add(String.valueOf(uri) + "?" + UrlTools.PARAM_URL_CHECKED_PARAM_KEY + "=" + UrlTools.parseUrl(uri.getEscapedQueryParam(UrlTools.URL_CHECKED_PARAM_KEY)));
			// check parameter list
			assertTrue(expected.equals(params.get(0).getValues()));
			assertTrue(expected.equals(params.get(1).getValues()));
		    assertEquals("url="+uri.getEscapedQueryParam(UrlTools.URL_CHECKED_PARAM_KEY) + "&&checkedUrl="+uri.getEscapedQueryParam(UrlTools.URL_CHECKED_PARAM_KEY),
		    	params.get(2).getValues());
			assertEquals("url="+uri.getEscapedQueryParam(UrlTools.URL_CHECKED_PARAM_KEY) + "&&checkedUrl="+uri.getEscapedQueryParam(UrlTools.URL_CHECKED_PARAM_KEY),
				params.get(3).getValues());
		} catch(URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("Cannot parse test URL");
		} catch(NullPointerException npe) {
			// TODO Auto-generated catch block
			npe.printStackTrace();
			fail("Cannot parse test URL");
		}
	}
}
