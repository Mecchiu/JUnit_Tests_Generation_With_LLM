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

	@Test
	void processReturnsXMLIfTextEmpty() throws ProcessException {
		GetPage gpgTester = new GetPage();
		String s = gpgTester.processReturningText("", HttpAction.GET);
		assertEquals("", s);
		gpgTester.processReturningText(null, HttpAction.GET);
	}
	
	@Test
	void processReturnsPlainTextIfTextNotEmpty() throws ProcessException {
		GetPage gpgTester = new GetPage();
		String s = gpgTester.processReturningText("test", HttpAction.GET);
		assertEquals("test", s);
		gpgTester.processReturningText(null, HttpAction.GET);
	}
	
	@Test
	void processReturnsCustomPage() throws ProcessException {
		GetPage gpgTester = new GetPage();
		gpgTester.processReturningText("TEST", HttpAction.GET);
		assertEquals("TEST", text);
	}
	
	@Test(expected=ProcessException.class)
	void processReturnsErrorWhenDocumentIsMissing() throws ProcessException {
		GetPage gpgTester = new GetPage();
		gpgTester.processReturningText("TEST", HttpAction.GET);
	}
}