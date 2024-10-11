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
		
    /**
     * Unit test for {@link HttpBot#performAction(ContentProcessable)} method.
     */
    @Test
    void test_performAction() { // throws ContentProcessException, IOException
        final String cntpage = "http://www.slf.net/slf/";
        String cntpageU = "http://slf.net/#";
        String cntid = "net-slf-1";
        String cntidU = "net-slf-1#";

        HtmlPage cntgene = new HtmlPage();
        cntgene.setContent(createHtmlData(cntpage));

        Get g = new Get(cntgene);

        HttpActionClient client_0 = new HttpActionClient();
        client_0.addParameter(ActionConstants.PARAMETER__VERSION, "2.0");        
        client_0.addParameter(ActionConstants.PARAMETER__HOST, "http://www.slf.net");
        GetPage g0 = client_0.performAction(g);

        assertTrue(g0.isSucceeded());
        assertTrue(g0.isError());
        assertEquals("", g0.getResponse());

        ContentProcessable c = (ContentProcessable) g0.getContentProcessable();
        assertTrue(c instanceof HttpBot);
        HtmlPage webpage = c.getPage();
        assertTrue(webpage.isValidHTML());
        assertTrue(!getHtml(webpage, "../css/style.css").equals(""));
        assertTrue(!getHtml(webpage, "/s/n/index.php/").equals(""));

        // test non-valid page
        HttpActionClient client = new HttpActionClient();
        HttpActionClient.setParam(ActionConstants.PARAMETER__HOST, "www.wikitag");
		url = "http://wikimedia.org/a/";
		cc = client;
		g = new Get(url);
        client.addParameter(ActionConstants.PARAMETER__PATH, cntidU);
		GetPage g1 = client.performAction(g);
        assertTrue(g1.isSucceeded());
        assertTrue(g1.isError());
        assertEquals("Failed to construct get page", null, g1.getResponse());

        g = new Get(url);
        cc = new HttpActionClient();
        client.addParameter(ActionConstants.PARAMETER__PATH, cntidU);
		GetPage g1a = client.performAction(g);
        assertTrue(g1a.isSucceeded());
        assertTrue(g1a.isError());
        assertEquals("Failed to construct get page", null, g1a.getResponse());
        if (g1a.getResponse().endsWith(".html"))
            assertTrue(g1a.getResponse().contains("<title>Main_Page</title>"));
        else
            assertFalse(g1a.getResponse().contains("<title>Main_Page</title>"));

        g = new Get(url);
        url = "https://www.wikitag";
        cc = new HttpActionClient();
        client.addParameter("path", url);
		g1 = client.performAction(g);
        assertTrue(g1.isSucceeded());
        assertTrue(g1.isError());
        assertEquals("Failed to construct get page", null, g1.getResponse());

        // test non-valid page
        HttpActionClient client1 = new HttpActionClient();
        cc = client1;
        g = new GetPage(cntid);
        cc.addParameter(ActionConstants.PARAMETER__TYPE, "wiki");
        g.addParameter(ActionConstants.PARAMETER__VERSION, "2.0");
        g1 = client1.performAction(g);
}
}