// HttpBot_2Test.java
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
* It contains one unit test case for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {

    /**
     * Default constructor for the method.
     */
    public HttpBot_2Test() {
	    setConnection("http");
    }

    /**
     * Test of getPage method, of class net.sourceforge.jwbf.core.bots.HttpBot.
		
     * @throws MalformedURLException
     * @throws IOException
     * @throws ProcessException 
     */
    @Test
    public void testGetPageString() throws MalformedURLException,
	    IOException, ProcessException {
	    ContentProcessable cp = new ContentProcessable();
	    HttpActionClient c = new HttpActionClient(cp);
	    GetPage g = new GetPage("http://www.google.com");
	    HttpActionClient.PerformAction(c, g);
	 
	    assertEquals("www.google.com",cp.getContents());
    }

    /**
     * Test of getPage method, of class net.sourceforge.jwbf.core.bots.HttpBot.
		
     * @throws MalformedURLException
     * @throws IOException
     * @throws ProcessException 
     */
    @Test
    public void testGetPageUrl() throws MalformedURLException,
	    IOException, ProcessException {
	    ContentProcessable cp = new ContentProcessable();
	    HttpActionClient c = new HttpActionClient(cp);
	    // HttpActionClient.setDefaultReturnPageURL("http://www.google.com");
	    GetPage g = new GetPage("http://www.google.com/");
	    HttpActionClient.PerformAction(c, g);
	 
	    assertEquals("www.google.com",cp.getContents());    
    }
}
