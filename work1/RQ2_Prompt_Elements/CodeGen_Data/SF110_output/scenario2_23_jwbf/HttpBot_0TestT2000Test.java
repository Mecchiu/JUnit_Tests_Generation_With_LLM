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

// Methods to be tested

	@Test
	public void getPage() throws IOException, MalformedURLException {
		final String page = this.getPage(this.getClass().getResource("/examplePage.html").toString());
		assertEqual("expecting to get the test page", page, this.getPage(page).toString());

		// test error
		try {
			this.getPage("http://localhost/foo/bar/");
			assertEquals("getPage should throw an exception", ActionException.ACTION_ERROR, 1);
		} catch (ContentProcessable_0_2TestUtil.ContentProcessable_0_2Exception ex) {
			assertEquals("error code", 1, ex.getErrorCode());
		}
	}

// Tests

	private static final String PAGE = "http://localhost/";

	private URL getPage(String page) throws MalformedURLException, IOException {
		return new GetPage(this.PAGE + page, "");
	}

	private URL getPage(String urlString) throws MalformedURLException, IOException {
		return new GetPage(urlString, "");
	}

	private Get get(String urlString) throws Exception {
		Get get = new Get(this.PAGE + urlString, "");
		return get;
	}
	/**
	 * This method is executed before the test. It checks whether
	 * {@link HttpBot#isPageLoaded(String)} is correctly called.
	 */
	@Test
	public void isPageLoaded() throws IOException, ContentProcessable_0_2Exception {
//		System.out.println("isPageLoaded");

		assertTrue("this is not a page",!this.isPageLoaded("http://localhost/foo/bar/bar.html"));
		assertTrue("this is not a page",!this.isPageLoaded("http://localhost/foo/bar"));
		assertTrue("this is not a page",!this.isPageLoaded("http://localhost/"));

		//check default constructor
		assertTrue("default constructor", this.isPageLoaded(this.getClass().getResource("/examplePage.html").toString()));
	}

	/**
	 * This method is executed after the test. It checks whether
	 * {@link HttpBot#getPage(String,String)} is correctly called.
	 */
	@Test
	public void getPage_withNull_withPage_fromOther() throws Exception {
		//check empty path
		this.getPage(this.PAGE + "/");
		assertFalse("wrong page", this.isPageLoaded(this.PAGE + "/"));
		assertTrue("unknown page", this.getPage(this.PAGE + "foo").isProcessable());
		assertTrue("isProcessable", this.getPage(this.PAGE + this.PAGE + "/").isProcessable());

		// check with different arguments
		final String path2 = this.PAGE + "/";
		final String pathAndPage = this.PAGE + "/foo/" + path2 + this.PAGE + "bar.html";
		assertFalse("same uri", this.getPage(this.PAGE + "foo/").isProcessable());

		final Get getPageFromOther = new Get(this.PAGE, this.PAGE + this.PAGE + "/");
		final Get getPageFromOtherString = new Get(this.PAGE + this.PAGE, this.PAGE + "/" + pathAndPage);
		assertTrue("isProcessable", getPageFromOther.isProcessable());
		assertFalse("getPageFromOther_String", getPageFromOtherString.isProcessable());
		final Get getPageFromOtherWithPage = new Get(this.PAGE, this.PAGE + this.PAGE + "/");
		getPageFromOtherWithPage.setPage(pathAndPage);
		assertTrue("isProcessable", getPageFromOtherWithPage.isProcessable());
		assertTrue("isProcessable", getPageFromOtherWithPage.isProcessable());
		final Get getPageFromOthersString = new Get(this.PAGE, this.PAGE + this.PAGE + "/");
		getPageFromOthersString.setPage(pathAndPage);
		assertTrue("isProcessable", getPageFromOthersString.isProcessable());
		assertFalse("getPageFromOthers_String", getPageFromOthersString.isProcessable());
	}

	/**
	 * This method is executed before the test. It checks whether
	 * {@link ContentProcessable#isReadableFrom(String)} is correctly called.
	 */
	@Test
	public void isReadableFrom() throws ContentProcessable_0_2Exception {
		assertFalse("default isReadableFrom", this.isReadableFrom(this.getClass().getResource("/examplePage.html").toString()));
		assertFalse("unknown isReadableFrom", this.isReadableFrom(this.getClass().getResource("/foo/bar.html").toString()));

		//check default constructor
		assertTrue("empty path", this.isReadableFrom(this.getClass().getResource("/").toString()));
	}

	/**
	 * This method is executed after the test. It checks whether
	 * {@link ContentProcessable#readFrom(String,String)} is correctly called.
	 */
	@Test
	public void readFrom() throws ContentProcessable_0_2Exception, IOException, ActionException, ProcessException, MalformedURLException {
		final String fromString = this.getPage(this.getClass().getResource("/examplePage.html").toString()).getMetadata().getFrom().asString();
		final String expected = "http://localhost/";
		assertEquals("fromString", expected, fromString);
		assertEquals("isReadableFrom", true, this.isReadableFrom(expected));
		assertEquals("readFrom", expected, this.readFrom(expected));
		assertEquals("readFrom_String", (String) expected, this.readFrom(expected).asString());
		assertEquals("error", 1, this.readFrom("http://localhost/").getResult().getStatusCode());
	}
}