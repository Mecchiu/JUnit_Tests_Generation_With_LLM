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
	void testProcessing() throws ProcessException {
		GetPage p = new GetPage(null);
		assertNull("Should not set text", p.getText());
		assertNull("Should not have more messages", p.getMoreMessages());
		p.processBody("test");
		assertNotNull("No text", p.getText());
		assertFalse("Expecting false", p.hasMoreMessages());
	}
	
	@Test
	void testException1() throws ProcessException {
		HttpAction a = new HttpAction("<html><head><title>We have text in it</title><p/> </head><body><strong>hello</strong> </body></html>");
		assertNull("Should add message", a.process("<html"));
		assertNull("Should add message", a.process("<?xml version=" + "<?xml-version>1.0</?xml-version>"));
		assertNotNull("Should have text", a.process("<html"));
	}
	
	@Test
	void testException2() throws ProcessException {
		HttpAction a = new HttpAction("<html></html>");
		assertNotNull("Should add message", a.process("<?xml version=" + "<?xml-version>1.0</?xml-version>"));
		assertNotNull("Should not have text", a.process("<html"));
	}
	
	@Test
	void testException3() throws ProcessException {
		HttpAction a = new HttpAction("<html><font style=" + "color:#aaa" + ";background-color:#aaa;" + ">" + "<a color=white><font style=" + "color:#aaa" + ";background-color:#aaa;" + ">" + "<font color=white>hello" + "</font></a>" + "</font>" + "</font></html>");
		try {
			a.process();
			assertNotNull("Should still not be set", a.process("<html"));
			assertNull("Should not have more messages", a.getMoreMessages());
			assertNotNull("Should have text", a.process("<html"));
		} catch (ProcessException pe) {
			assertNotNull("Should still not be set", a.process("<html"));
			assertNull("Should not have more messages", a.getMoreMessages());
			assertNull("Should have text", a.process("<html"));
		}
	}
}