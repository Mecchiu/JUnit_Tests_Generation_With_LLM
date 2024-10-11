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
		private final Map<String, String> cookies = new HashMap<String, String>();

		public void setUp() throws Exception {
			final String server = "www.localhost.org";
			final String path = "/of/wiki";
			final String hostUrl = JWBF.CONTEXT_URL + "//" + server + path;

			final HttpAction ha = HttpAction.create();

			final Map<String, String> cookieTransform = this.cookies;
			this.cookies.put("jWBId", "id");
			this.cookies.put("jWBId", "id");
			this.cookies.put("wbi", "value");
			this.cookies.put("wbi", "value");

			final String fileContent= "file content";
			final File file = new File(fileContent);
			final FileBody fileBody = new FileBody(file, Charset.forName("UTF-8"));
			final HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Content-Disposition", "/file.txt");
			final MultipartEntity entity = new BasicHttpEntity<StringBuilder>(new StringBuilder(), Charset.forName("UTF-8"));
			final MultipartEntity entityTwo = new BasicHttpEntity<StringBuilder>(new StringBuilder(), Charset.forName("UTF-8"));
			entity.setContent(new String[] {fileContent,fileBody.getBytes() }, "application/octet-stream");

			this.client = new DefaultHttpClient();
}
}