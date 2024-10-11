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
		
	@Test
	public void test() {
		HttpActionClient test = new HttpActionClient("localhost");
	}
}

/**
* This class represents an HTTP Request. It is used to test the {@link HttpAction#execute(HttpRequestBase)} method and all operations
* that occur inside the action.
*/
@Slf4j
class HttpRequestBaseTest {

	public static final HttpResponse execute(HttpRequestBase request) throws ClientProtocolException, ProcessException {
		final HttpResponse response = client.execute(host, request);
		switch (response.getStatusLine().getStatusCode()) {
			case HttpStatus.SC_OK:
				return response;
			case HttpStatus.SC_UNAUTHORIZED:
				throw new CookieException("user", "password", "userpassword", "cannotberead", "Cannot check password");
			case HttpStatus.SC_FORBIDDEN:
				throw new CookieException("user", "password", "userpassword", "cannotberead", "Cannot check password");
			case HttpStatus.SC_BAD_REQUEST:
			default:
				throw new ProcessException("HTTP_RESPONDER_REPLY_ERROR", new String[0]);
		}
	}

	public static final String executeRequest(HttpUriRequest httpRequest) throws ClientProtocolException, ProcessException {
}
}