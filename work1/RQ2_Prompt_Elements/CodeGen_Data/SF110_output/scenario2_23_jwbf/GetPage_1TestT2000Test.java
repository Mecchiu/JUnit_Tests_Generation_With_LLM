// GetPage_1Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains one unit test case for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_1Test {

	static final String URL = "http://www.test.net/page/test.xml";

	static final String USER_AGENT = "testagent";
	static final String AUTH_COOKIE = "testCookie";
	
	static final String GET_HTML = "Get html";
	
	static {
		assertNotNull(USER_AGENT);
		assertNotNull(AUTH_COOKIE);
		
		System.out.println("=============");
		System.out.println(USER_AGENT);
		System.out.println(AUTH_COOKIE);
	}

	//@Test
	public void testGetFromCustomPage() throws ProcessException, ProcessException {
		// Check the return value and the body.
		String xml = getTextAndCookies("GetPage.java", "http://www.test.net/page/test.xml");
		System.out.println(xml);
		String expected = "<html><head></head><body><div>";
		String actual = xml.replaceAll("&", "&amp;");
		if (expected.equals(actual)) {
			System.out.println("OK (normal case)");
			expected = "<html><head></head><body>Get html<br><br>";
		} else
			System.out.println("Inner error. Expected: "+ expected +" but got: "+actual);
		
		// The XML data is returned, extract the HTML and see.		
		String html = getXmlFromPage("GetPage.java", URL, USER_AGENT, AUTH_COOKIE);
		expected = "<html><body>Get xml from page <b>http://www.test.net/page/test.xml</b><br>&lt;br></body>";
		if (expected.equals(html)) {
			System.out.println("OK (normal test)");
		} else
			System.out.println("Inner error. Expected: "+ expected +" but got: "+html);
	}

	//@Test
	public void testGetFromCustomPage2() throws ProcessException, ProcessException {
		try {
			getContent("GetPage.java", null, "Get Page XML", USER_AGENT, "GET_HTML");
		} catch (ProcessException ex) {
			assertEquals(1, ex.getErrorIndex());
			return;
		}
		throw new AssertionError("Failed to throw ProcessException");
	}

	private void assertEquals(int expected, String actual) {
		assertEquals(expected, actual);
		//System.out.println(actual);
	}

	private String getXmlFromPage(String action, String url, String userAgent, String authHeader)
			throws ProcessException, ProcessException {
		try {
			ProcessRequestImpl req = new ProcessRequestImpl(action, url, null, userAgent);
			RequestResponseImpl rep = ((HttpAction)req.getAction()).createReply();
			rep.setXmlContent();
			rep.setAuthCookie(authHeader);
			return rep.callAndReturn(req.getHeaders());
		} catch (ProcessException ex) {
			assertNotNull(ex);
			System.out.println("Got a Process Exception");
			System.out.println(ex);
			return null;
		}
	}

	private String getTextAndCookies(String action, String url) {
		try {
			ProcessRequestImpl req = new ProcessRequestImpl(action, url, null, USER_AGENT);
			RequestResponseImpl rep = ((HttpAction)req.getAction()).createReply();
			rep.setUserAgent();
			rep.setCookies(AUTH_COOKIE, "");
			return rep.callAndReturn(req.getHeaders());
		} catch (ProcessException ex) {
			System.out.println("Got a Process Exception");
			System.out.println(ex);
			return null;
		}
	}
}
