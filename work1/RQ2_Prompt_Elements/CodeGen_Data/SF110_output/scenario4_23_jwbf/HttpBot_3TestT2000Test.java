// HttpBot_3Test.java
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
* It contains one unit test case for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 */
	@Test
	public void testGetBytes(final String arg0, final String arg1, final String arg2) {
		final String result0 = getBytes(arg0);
		final String result1 = getBytes(arg1);
		final String result2 = getBytes(arg2);
		assertNotNull(result0);
		System.out.println("result0: " + result0);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		assertEquals("URL", "http://www.yourOwnWiki.org/wiki/" + arg0, result0);
		assertEquals("URL", "http://www.yourOwnWiki.org/wiki/" + arg1, result1);
		assertEquals("URL", "http://www.yourOwnWiki.org/wiki/" + arg2, result2);
	}

	/**
	 * Simple test.
	 * @throws ActionException
	 * @throws ProcessException
	 */
	@Test
	public final void doTest() throws ActionException, ProcessException {
		//System.out.println(this.getClass().getName() + ".doTest");
		final HttpActionClient cc = new HttpActionClient();
		cc.getHostUrl("http://www.yourOwnWiki.org/wiki/" + "Main_Page");
		final ContentProcessable res = cc.performAction(new Get("Main_Page"));
		assertNotNull(res);
		assertTrue(res instanceof Get);
		final Get get = (Get) res;
		final String res0 = get.getTextStatusCode();
		final String res1 = get.getTextStatusCode();
		System.out.println(res0);
		System.out.println(res1);
		System.out.println(res0 + " - " + res1);
		assertEquals("Result of HttpBot GET", "Main_Page", res0.trim());
		assertEquals("Result of HttpBot GET", "Main_Page", res1.trim());
	}

	private byte[] getBytes(String fileName) {
			return "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.0)"
					.getBytes();
			}

}
