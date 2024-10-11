// ParamsUrlToolsTest.java
package httpanalyzer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParamsUrlTools}.
* It contains one unit test case for the {@link ParamsUrlTools#getPairParams(String)} method.
*/
class ParamsUrlToolsTest {
		
	static {
		System.setProperty("java.awt.headless", "true");
		System.setProperty("java.awt.translucentBackground", "true");
		System.setProperty("java.awt.headless.screen", "true");
	}

	/** Tests GET method. */
	@Test
    public void getPairParams_1()  {
        List<NameValuePair> p1 = new ArrayList<>();
        p1.add(new BasicNameValuePair("key1", "value1"));
        p1.add(new BasicNameValuePair("key2", "value2"));
        List<NameValuePair> p2 = getPairParams("p1 + p2");
        assertEquals(p1, p2);
    }

    /** Tests PARAMS method  1. splitUrl. */
    @Test
    public void splitUrl_1()  {
        URI uriTest = null;
        final String[] uri = splitUrl("http://x.com/p1/p2?a=1+p3; b=2", uriTest);
        assertTrue(uri.length == 3);
        assertEquals(uriTest.toString(), uri[0]);
        assertEquals(uriTest.toString(), uri[1]);
        assertEquals("p1", uriTest.getScheme());
        assertEquals("http://x.com/p1", uriTest.getSchemeSpecificPart());
        assertEquals("p2", uriTest.getSchemeSpecificPart());
    }

    /** Tests URL. */
    @Test
    public void splitUrl_2()  {
        URI u = null;
        u = new URI(false, "x.com", 9999, "p1/p2?a=1+p3", "p4");
        String[] s = uri("http://x.com/p1/p13p4");
        assertTrue(s.length == 3);
        assertEquals(s[0], "p1");
        assertEquals(s[1], "p1/p2");
        assertEquals(s[2], "p13p4");
    }
}