// HttpBot_0Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {
ActionClient client  = null;
		String          result = "";
	/** Initialize a test object. */
	public HttpBot_0Test (ActionClient client) {
		this.client = client;
		}

	//getPage:
	@Test
	void getPage(@SupportedAction("GET") @Optional @Valid URL url) throws MalformedURLException, IOException, ContentProcessable, ActionException, InterruptedException {
		result = client.getPage(ActionUtility.ACTIONNAME_CONTENT, url);
	}

	//getPage:
	@Test
	void getPage() throws ContentProcessException, InterruptedException, IOException, ActionException {
		Thread.sleep(120000L);
	}

	//getPageNonStrict:
	@Test
	void getPageNonStrict(@SupportedAction("GET") @Optional @Valid URL url) throws ContentProcessException, InterruptedException, ActionException, IOException,  InterruptedException {
		result = client.getPageNonStrict(ActionUtility.ACTIONNAME_CONTENT, url);
	}

	//getPageNonStrict:
	@Test
	void getPageNonStrict() throws ContentProcessException, InterruptedException, IOException, ActionException {
		Thread.sleep(120000L);
	}

	//getPage:
	@Test
	void getPage(@RequiredParam("method") @SupportedAction("HTTP_BOT") @Optional @Valid String content_method) throws MalformedURLException, IOException, ContentProcessException, ActionException, InterruptedException {
		result = client.getPage(ActionUtility.ACTIONNAME_CONTENT, content_method);
	}

	//getPageXmlxpath:
	@Test
	void getPageXmlxpath(@RequiredParam("method") @SupportedAction("HTTP_BOT") @Optional @Valid String content_method) throws MalformedURLException, IOException, ContentProcessException, ActionException, InterruptedException {
		result = client.getPageXmlxpath(ActionUtility.ACTIONNAME_CONTENT, content_method);
	}

	//getPage:
	@Test
	void getPage() throws ContentProcessException, InterruptedException, IOException, ActionException, IOException, JSONException, InterruptedException {
		Thread.sleep(120000L);
	}

	//getPageXmlxpath:
	@Test
	void getPageXmlxpath() throws ContentProcessException, InterruptedException, IOException, JSONException, ActionException, InterruptedException {
		Thread.sleep(120000L);
	}

	//process:
	@Test
	void process(@RequiredParam("method") @SupportedAction("HTTP_BOT") @Optional @Valid String content_method) throws ActionException, InterruptedException, IOException, JSONException, ContentProcessException {
		Thread.sleep(120000L);
		if (result.equals("") && "".equals(((String) (client.getContentFromAction("/getPage"))))) {
			throw new ContentProcessException("no response", null);
		}
	}
	@Deprecated
	void process() throws IOException, ActionException, JSONException, InterruptedException {
		assertEquals(ProcessState.SUCCEEDED, ExecUtils.run("java " + client.getURLForAction(ActionUtility.ACTIONNAME_CONTENT) + " >/dev/null/page.page").getStatusCode());
	}
}
