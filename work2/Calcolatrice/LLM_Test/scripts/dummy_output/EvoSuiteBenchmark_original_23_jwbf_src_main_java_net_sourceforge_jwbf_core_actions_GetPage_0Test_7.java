// GetPage_0Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains one unit test case for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_0Test {
		/**
		* empty
		*/
    @Test
    public void testHasMoreMessages() {
        assertFalse(GetPage.hasMoreMessages());
    }

    /**
     * empty
     */
    @Test
    public void testProcessReturningText() throws ProcessException {
        assertNotNull(GetPage.processReturningText("", null));
        assertNotNull(GetPage.processReturningText("",
                new HttpAction("http://evil.example.com")));
    }

    /**
     * empty
     */
    @Test
    public void testProcessReturningTextWithCharset() throws ProcessException {
        assertNotNull(GetPage.processReturningText("uft-8", null));
        assertNotNull(GetPage.processReturningText("uft-8", HttpAction.POST));
    }

    /**
     * empty
     */
    @Test
    public void testProcessReturningTextWithCharsetThatIsInvalid()
            throws ProcessException {
        assertNotNull(GetPage.processReturningText("uft-8",
                new HttpAction("unvalid.charset")));
    }

    /**
	 * Test method for
	 * {@link net.sourceforge.jwbf.core.actions.ContentProcessable#processReturningText(String, HttpAction)}
	 *.
	 */
	@Test
	public void testProcessReturningText() throws ProcessException {
        assertNotNull(GetPage.processReturningText("uft-8", HttpAction.POST));
    }

}