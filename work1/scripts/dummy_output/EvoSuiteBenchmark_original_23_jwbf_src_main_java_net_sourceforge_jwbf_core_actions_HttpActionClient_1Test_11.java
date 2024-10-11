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
	 * The test fixture.
	 */
	private final File testFile;
	
	/**
	 * Constructor.
	 */
	public HttpActionClient_1Test() {
		
        String content = getClass().getResourceAsStream("/get.xml").getBytes();
        String path = getClass().getResource("/").getFile();
        
        try {
        	File f = new File(path + "/" + "get.xml");
        	f.createNewFile();
        	FileUtils.writeStringToFile(f, content);
        } catch(IOException ex) {
        	System.err.println(ex);
        }

		testFile = new File(path + "/" + "get.xml");

	}
	
	/**
	 * @throws HttpException
	 * @throws IOException
	 */
	@Test
	public void test() throws HttpException, IOException {
		JWBF.start();
		ClientProtocolException.assertNoSuchMethod(HttpAction.METHOD_NAME);
		//HttpActionClient.doHttpAction(new URL(getHostUrl()), new ByteArrayInputStream(path), new HttpAction() {
			//@Override
		//public String performAction(HttpRequestBase request, HttpAction ha, ContentProcessable cp) throws HttpException, IOException {
			//return ha.getUrl();
		//}
		//});
		ClientException.assertInvalidState("HTTP ERROR", "POST NOT FOUND: ResourceNotFound");
}
}