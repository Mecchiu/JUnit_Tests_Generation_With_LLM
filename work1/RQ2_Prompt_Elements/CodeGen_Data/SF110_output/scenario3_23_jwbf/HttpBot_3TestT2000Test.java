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
     * Test method to get plain HTML or XML data e.g. from custom specialpages
     * or xml newsfeeds.
     *
     * @param u url like index.php?title=Main_Page
     * @return HTTP response with plain text data content
     */
    @Test
    void testGet(String u) {
        try {
            Get g = new Get(new URL("http://localhost:9000/Main_Page?title=Main_Page&format=xml"));
            g.setFromServer(true);
            byte[] result;
            String resultStr;
            result = g.doAction();
            resultStr = new String(result);
            assertNotNull("The result is null!", result);
            assertEquals("Expecting the response to have a content type of xml or html",
                ContentProcessable.ResponseType.xml | ContentProcessable.ResponseType.html,
                ContentProcessable.getContentType(resultStr));
        } catch (IOException | ActionException | MalformedURLException e) {
            // do nothing
        }
    }
    
}