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
		public static final int TARGET_PORT = 80;
}

// HttpActionClient_1Test.java
class HttpActionClient_1Test {
	// class name of the test class in commons-collections
	private static final String COLLECTION_TEST_CLASS = "" +
			"net.sourceforge.jwbf.core.actions.HttpActionClient_0Test";

	public static final int TOLERANCE = 500;

	// A set of random requests
	private final Map<String, HttpRequestBase> requests = new HashMap<String, HttpRequestBase>();

	@Test
	@Slf4j
	public void test_performAction_1() throws ActionException, ProcessException {
		log.info("test for 1");
		HttpGet get = new HttpGet("https://jwbf.sourceforge.net/index.php");
		HttpParams hpt = ActionClient.getParams();
		hpt.setParameter(ClientPNames.COOKIE_POLICY, ClientPNames.COOKIE_POLICY_FAVORITE);
		HttpClient httpClient = new DefaultHttpClient(hpt, true);
}
}