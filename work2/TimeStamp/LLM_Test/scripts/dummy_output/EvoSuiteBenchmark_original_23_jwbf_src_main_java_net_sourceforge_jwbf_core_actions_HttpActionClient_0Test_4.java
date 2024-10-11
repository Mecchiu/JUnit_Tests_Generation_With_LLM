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
		private final int TESTS_COUNT = 20;
		private final HttpClient client = new DefaultHttpClient();
		private final HttpRequestBase req = new HttpGet();

		public HttpActionClient_0Test(ContentProcessable cp) {
		}

		@Test
		void performAction_notCalled();

		@Test
		void performAction_noContentProcessable();

		@Test
		void performAction_contentProcessable_shouldExecutePostOnly();

		@Test
		void performAction_contentProcessable_shouldExecuteGetOnly();

		@Test
		void performAction_contentProcessable_shouldReturnExecuteOnly();

		/**
		 * @param cp
		 * @throws CookieException
		 * @throws ClientProtocolException
		 * @throws IOException
		 *
		 */
		@SuppressWarnings("deprecation")
	    public void showCookies() throws CookieException, ClientProtocolException, IOException {
	    	client.getParams().setParameter("Cookie", new com.sun.jersey.config.property.ClientProperty(java.nio.charset.CharsetSet.NAME));
	    	client.getParams().setParameter("CookieVersion", 2);
	    	client.getParams().setParameter("Accept-Encoding", com.melloware.jws.http.ClientHeaderValues.QUOTE);
    		showCookieTransform(new HttpActionClient_0Ticketed(null));
}
}