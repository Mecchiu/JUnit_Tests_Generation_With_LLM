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
		

    public HttpBot_2Test() {
    }

    /**
     * @param client
     */
    public HttpBot_2Test(final HttpActionClient client) {
    }

    /**
     * @param url
     */
    public HttpBot_2Test(final String url) {
    }


    @Test
    public void testHttpBot() {

        HttpBot bot = new HttpBot();
        bot.setHttpActionClient(new HttpActionClient());
        final URL wiki = new URL("https://www.wikipedia.org/wiki/Main_Page?title=Main_Page");
        final String wikipage = "http://www.wikipedia.org/wiki/Main_Page";
        final byte[] wikip = bot.getWbF().getMime("text/html", wiki);
        getPage(wikipage);
        
        bot.getHttpActionClient().run();


    }

}