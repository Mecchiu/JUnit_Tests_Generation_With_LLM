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
		//@Test
		void test() throws IOException, ClientProtocolException, ProcessException {
		    try {
		        StringWriter sw = new StringWriter();
		        final ContentProcessable cp = new ContentProcessable("hi");
		        cp.process("/a", "Hello");
		        jwbf.createHttpActionClient(new HttpClient(), sw, cp);
		        assertEquals(String.valueOf(cp.getContent()), sw.toString());
		    }
		    catch (HttpActionException hae) {
		        fail("Exception during HttpActionClient process: " + hae.getMessage());
		    }
		}
		
		//@Test
	    /**
	     * Test a GET with a GET response.
	     */
/*
        @Test
	    public void testGetWithGetResponse() throws IOException, ClientProtocolException, ProcessException {
	        HttpRequestBase request = new HttpGet("/a/o");

	        final ContentProcessable cp = new ContentProcessable("hi");
	        final HttpAction ha = new HttpAction(request, cp,
	                new ClientProtocolException("Test exception"));
	        httpAction(cp, ha);
	        assertTrue(cp.hasResult());
	        assertEquals(cp.getContent(), cp(request).getContent());
	    }
*/
	}

// HttpUriRequest_1Test.java