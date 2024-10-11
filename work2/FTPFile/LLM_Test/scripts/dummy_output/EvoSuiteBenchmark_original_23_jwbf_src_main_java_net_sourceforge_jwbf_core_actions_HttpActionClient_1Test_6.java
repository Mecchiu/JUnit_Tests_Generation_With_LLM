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
		
	@Slf4j
	private Debugger debug;
	@Slf4j
	private HttpActionClient ha;
	@Slf4j
	private File path;
	private HttpHost host;
	private int prevHash;

	@Test
	public void test_get_with_host() throws IOException, HTTPException, ClientProtocolException, CookieException, ActionException {
		String hostUrl = JWBF.getURL(JWBF.FEDORA_HOST);
		HttpHost h = new HashedFaultCredentials().build(hostUrl);
        debug("FEDORA HOST: "+hostUrl+"\n"+"\n"+"HTTP GET: host == " + h + "\n\n"+"\n\n");
        final StringBuilder debugBuilder = new StringBuilder();
        debugBuilder.append("HTTP HOST: ");
        debugBuilder.append(h);
        debug(debugBuilder.toString(), ha, "");
        assertEquals(debug.getMessage(), debugBuilder.toString());

		StringBuilder logBuilder = new StringBuilder();
		logBuilder.append("HTTP HOST: ");
		logBuilder.append(h);
		log(logBuilder.toString(), "");
	}

	@Test
	public void test_execute() throws IOException, HTTPException, ClientProtocolException, CookieException, ActionException {
		HttpUriRequest e = new HttpGet(path+"/get");
		int code = ha.performAction(e);
}
}