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
		final String content_source = "/index.php?title=Special:Recentchanges&feed=rss";
	@Test
	public void test_0_1() {
// Check the result of this action
//				boolean result=false;
	String got = new GetPage(content_source).processReturningText(processReturningText(content_source),httpAction1);
//				assertTrue(result);

		// FIXME: test this code for getContent()
		assertTrue(got.getBytes().length > 0);
		assertTrue("expected content\n\n" + content_source + "\n-->\n\n" + got + content_source, got.equals(content_source));
	}
	
	private GetPageRequest httpAction1 = new GetPageRequest("https://" + content_source);
	
	@Test
	public void test_1_2() {
	  String got = new GetPage(httpAction1).processReturningText(httpAction1.getBody(), HttpAction.GET);
	  //assertEquals(got, text);
	 }
}