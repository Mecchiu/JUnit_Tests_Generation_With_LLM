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
		
    private String file1;

    @Test
    public void testGet() throws IOException, ClientProtocolException, ProcessException {
		log.info("TESTRUN");

		String output="";
		String expected = "Hello";
		try (BufferedReader in = new BufferedReader(new StringReader(expected))) {
			output = in.readLine();
		}

		// the input for this server should contain just
		// the expectedString, and the second one is no-content
		// which triggers the next request
		String actual = "Hello";
		assertEquals(input2("Hello"), output, expected, actual);
    }

    @Test
    public void testString() throws IOException, ClientProtocolException, ProcessException {
		log.info("TESTRUN");

		// String -> int
		String output = "42";
		try (BufferedReader in = new BufferedReader(new StringReader(output))) {
			output = in.readLine();
		}

		// the input for this server should contain just
		// the expectedString
		String actual = "42";
		assertEquals(input2("42"), output, expected, actual);
    }

    @Test
    public void testStringInBody() throws IOException, ClientProtocolException, ProcessException {
		log.info("TESTRUN");

		// String[] <- int -> str
		String output = "42";
}
}