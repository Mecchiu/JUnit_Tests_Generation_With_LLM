// HttpActionClient_0Test.java
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
* It contains one unit test case for the {@link HttpActionClient#performAction(ContentProcessable)} method.
*/
class HttpActionClient_0Test {
// CHECKSTYLE:OFF
	/**
	 * The {@link net.sourceforge.jwbf.core.actions.HttpActionClient#performAction(ContentProcessable)} method of HttpRequest.
	 * @throws ActionException
	 *             for problems with the request
	 * @throws ClientProtocolException
	 *             for problems with the network
	 * @throws ProcessException
	 *             if the request fails
	 * @see net.sourceforge.jwbf.core.actions.HttpActionService
	 * @see net.sourceforge.jwbf.core.actions.HttpAction
	 */
	@Test
	void performAction()
		throws ActionException,
		   ClientProtocolException,
		   ProcessException {

			// PRE:
			// The following are created
			final DefaultHttpClient httpClient = new DefaultHttpClient();
			final DefaultHttpResponse httpResponse = new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpStatus.SC_OK);
			final HttpRequestBase httpPost = createPostRequest("Test URL ", httpRequest -> httpRequest.setContent(new StringBody("Test Message")));

			// POST:
			final HttpResponse httpResponsePost = executePost(httpPost, httpRequest -> {
				return httpRequest.getResponseBody();
			});

			// Fetch the body of the response
			final HttpResponse httpResponseGet = httpResponsePost.getEntity().getContent();
			final ByteArrayOutputStream out = new ByteArrayOutputStream();
			int size;
			byte[] response;
