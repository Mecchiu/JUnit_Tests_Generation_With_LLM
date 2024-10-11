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
		 * This method is called by our unit test framework in the
		 * {@link net.sourceforge.jwbf.core.actions.ExecutorTestcaseTest#test} method in the
		 * unit testing framework.
		 *
		 * @param aTestBase a base class for the unit test.
		 * @throws ActionException  on problems
		 */
    @Test
	public void test() throws ActionException, ProcessException {
		final String getStr = "this is a GET message";

		// Set our Cookie stuff
		Cookie cookie = null; // Cookie doesn't support null
		HttpUriRequest request = new HttpRequestBase(getStr);
        request.setParams(new HttpParams());

    	if ( cookie!= null)
        {
			// Save a Cookie
			HttpResponse response = new DefaultHttpClient(new DefaultHttpClient(new HttpHost("localhost", 559))).execute(request);
			assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
			
			if(response.getEntity() instanceof MultipartEntity) response.getEntity().getContent();
			int contentLength = ((MultipartEntity) response.getEntity()).getContentLength();
			response = new DefaultHttpClient(new DefaultHttpClient(new HttpHost("localhost", 559))).execute(request);
			assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
			response.getEntity();
		}
	}
}
