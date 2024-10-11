// HttpActionClient_1Test.java
package net.sourceforge.jwbf.core.actions;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.JWBF;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.CookieException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpActionClient}.
* It contains one unit test case for the {@link HttpActionClient#get(Get)} method.
*/
class HttpActionClient_1Test {

	/**
	 * Simple test of {@link HttpActionClient#get(Get)} method.
	 * It generates a cookie and uses it in the GET operation.
	 *
	 * @throws ProcessException on problems
	 * @throws CookieException on problems
	 */
	@SuppressWarnings("ConstantNamingConvention")
	@Test
	public void HttpActionClient_1_1() throws ProcessException, CookieException {

		final String body = "12345678";
		final String[] headers = {"Cookie: " + HttpActionClient_1Test.cookie};

		// Setup HttpClient
		final HttpClient client = new DefaultHttpClient();
		assertNotNull(client);

		// Create Get request
		final HttpUriRequest getRequest = new HttpGet(HttpActionClient_1Test.url);
		getRequest.addHeader("Cookie", CredentialsFilter.getInstance().credentialsFilter(null));
		getRequest.addHeader(ClientPNames.HOST_ADDRESS_CONSTRAINTS_PROPERTY, AddressFilter.getInstance().addressFilter());

		// Setup Cookie header
		final Map<String,List<String>> cookies = new HashMap<>();
		// Set cookie value
		String setValue = "A";
		cookies.put(new Cookie("A", setValue), new String[]{"A"});
		final Cookie setCookie = new Cookie("A", setValue);
		setCookie.setHttpOnly(true);

		// Create POST request
		final HttpPost postRequest = new HttpPost(HttpActionClient_1Test.url);
		postRequest.setHeader("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36");
		postRequest.addHeader("Cookie", cookies.get(new CredentialsFilter.CookieValue(null)));
		postRequest.setEntity(new FileBody(body));

		// Parse POST request
		final HttpClientParams httpClientParams = client.getParams();
		httpClientParams.setConnectionManager(JWBF.getConnectionManager());
		final HttpParams httpParams = httpClientParams.getParams();

		// Setup HttpClient
		final DefaultHttpClient httpClient = new DefaultHttpClient(client);
		assertNotNull(httpClient);

		// Start a new HTTP get request
		final HttpResponse response = httpClient.execute(getRequest);
		assertNotNull(response);

		// Check response status
		assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());

		// Check response content
		final ContentEntity content = new ContentEntity(response, "text/html");
		assertNotNull(content);
		assertEquals("text/html", response.getEntity().getContentType().getValue());
		assertNotNull(content.getContent());
		assertEquals(new String(body.getBytes(Charset.forName("UTF-8"))), new String(content.getContent()));
		
	}
	
	
	private String cookies;
	private String url;
}
