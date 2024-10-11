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
static final String BASE_URL = "https://jwbf-users-api.herokuapp.com/users-api?user-agent=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_0) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/56.0.2950.127 Safari/537.31";

    @Test void getBytesSuccess() throws Exception {
        assertTrue(!getBytes("/").isEmpty());
    }

    @Test void getBytesSuccess1() throws Exception {
        final byte[] bytes = getBytes("/news?title=Main");
        assertArrayEquals(new byte[] {'I','s', 'a', 't','s', 'a', 'v', 'e',''}, bytes);
    }

    @Test void getBytesSuccess2() throws Exception {
        final byte[] bytes = getBytes("/news?title=Main_Page");
        assertArrayEquals(new byte[] {'I','s', 'a', 't','s', 'a', 'v', 'e',''}, bytes);
    }

    @Test void getBytesSuccess3() throws Exception {
        final byte[] bytes = getBytes("/custom/custom_page");
        assertArrayEquals(new byte[] {'I','s', 'a', 't','s', 'a', 'v', 'e',''}, bytes);
    }
}
