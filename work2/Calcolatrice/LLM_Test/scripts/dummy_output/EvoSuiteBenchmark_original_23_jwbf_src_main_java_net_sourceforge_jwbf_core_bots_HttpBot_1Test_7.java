// HttpBot_1Test.java
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
* It contains one unit test case for the {@link HttpBot#performAction(ContentProcessable)} method.
*/
class HttpBot_1Test {
		
   // Tests that do not use getBytes, return null
   @Deprecated
    @Test
    public final void testPerformActionNPE() throws MalformedURLException, IOException {
       System.out.println(HTTP_RESPONSE_CONTENT);
       HttpActionClient client = new HttpActionClient();
       ContentProcessable a = new GetPage("http://www.test.net");
       try {
           client.getEntityData(a);
       } catch (ActionException e) {
           // check if the method returned null
           System.out.println("testPerformActionNPE threw: " + e);
        }
    }

    @Test
    public final void testGetPageNPE() throws MalformedURLException, IOException {
        HttpActionClient client = new HttpActionClient();
        System.out.println(HTTP_RESPONSE_CONTENT);
        ContentProcessable a = new GetPage("http://www.test.net");
        try {
            client.getEntityData(a);
        } catch (ActionException expected) {
            return;
        }
        fail("No Exception");
    }
}
// HttpBot_1Test.java