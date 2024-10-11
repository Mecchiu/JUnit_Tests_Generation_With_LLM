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
		private final static String TARGET="index.php?title=Main_Page";

    @Test
    public void getPageShouldReturnOnePage() throws MalformedURLException, ContentProcessable, IOException, ActionException, ProcessException {
        HttpBot bot = new HttpBot();
        String data=bot.getPage(TARGET);
        System.out.println(data);
        assertNotNull(data);
    }

    @Test
    public void getPageShouldReturnOnePageUsingURL() throws MalformedURLException, ContentProcessable, IOException {
        HttpBot bot = new HttpBot();
        String data=bot.getPage(TARGET);
        System.out.println(data);
        assertNotNull(data);
        URL url=new URL(data);
        assertNotNull(url);

        byte[] bytes=url.getContent();
        byte[] bytes1=bot.getBytes(bytes);
        byte[] bytes2=bot.getBytes(bytes);
        assertNotSame(bytes1, bytes2);
    }

    @Test
    public void getPageShouldReturnOnePageUsingURLAndHost() throws ContentProcessable, MalformedURLException, IOException, ContentProcessable, NullPointerException, ProcessException, ActionException, ActionException {
        HttpBot bot = new HttpBot();
        String data=bot.getPage(TARGET, new StringBuilder("1"));
        assertNotNull(data);
        URL url=new URL(data);
        assertNotNull(url);
        byte[] bytes=url.getContent();
        String str1=new String(bytes);
        assertNotNull(str1);
        assertEquals(TARGET,str1);
    }
}