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
HttpActionClient _myActionClient;

		/**
		 * @throws ProcessException on problems with http, cookies and io
		 */
		public void testHttpClient_0() throws ProcessException {
				_myActionClient = new HttpActionClient();
				_myActionClient.setHTTPClientParams(getClientParams());
				assertEquals(HttpActionClient.DEFAULT_SOCKET_CLOSE, HttpActionClient.getClientSocketClose());
		} //TestHttpClient_0

		/**
		 * @throws ProcessException on problems with cookies and io
		 */

		@Slf4j
		public void testGet()
		throws ProcessException {
				final StatusLine statusLine = HttpActionClient.getResponseByUri(JWBF.getBaseURL() + "/login?ver="+JWBF.getBaseURL().substring(JWBF.getBaseURL().indexOf('/')+1)+"&action=login&pass="+JWBF.loginPassword);
				assertEquals(StatusLine.OK, statusLine);

				final Map<String, String> result = new HashMap<>();
				result.put("login", "doe");
				result.put("pass", "password");
				result.put("ver", "0.1.0");

				assertNotNull(result);

				final Map<String, String> expected = new HashMap<>();

				expected.put("pass", "password");
				expected.put("login", "doe");

				assertEquals(statusLine.getStatusCode(), 200);
				assertEquals(statusLine.getStatusMessage(), "OK");

				assertEquals(expected, result);

				// Now without the cookie.

				byte[] content = getBytesFromFile("/http01");
				String resultStr = new String(content, Charset.forName("UTF-8"));
				assertNotNull(resultStr);
				assertArrayEquals(getBytesFromFile("/http01.xml"), resultStr.getBytes());

				assertThrowsExceptions(new Exception() {
						@Override
						public
						void
						run
						()
						throws Exception
						{
							final Map<String, String> result = new HashMap<>();
							result.put("login", "doe");
							result.put("pass", "password");
							result.put("ver", "0.1.0");
							_myActionClient.performAction(result.getClass().getName(), new String[0]);
						}
				}, ClientProtocolException.class, CookieException.class);

				// Now with the cookie.

				Cookie cookie = _myActionClient.cookies();
				assertNotNull(cookie);
				assertEquals(1, _myActionClient.headers().length);
				assertNotNull(_myActionClient.headers()[0].parseValue("\"ver\""));

				Result result2 = new Result();
				assertEquals(result2, _myActionClient.performAction(_myActionClient.contentClass(),  new String[]{"get"}));

				assertEquals(statusLine.getStatusCode(), 200);
				assertEquals(
						new StringBody(
								"<action><request><cookie><name>ver</name><value>1.1.0</value><use>cookiefile</use></cookie></request></action>"),
				result2);
		} //Get

		/**
		 * @throws ProcessException on problems with cookies and io
		 */

		@Slf4j
		public void testPost()
		throws ProcessException {

				final Cookie cookie = new Cookie("ver", "0.1.0");
				final Result result = (Result) HttpActionClient.performAction(_myActionClient.