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
		
	/**
	 * Constructor for this class.
	 * 
	 * @param fTest Class
	 */
	public ParamsUrlToolsTest(Class<?> fTest) {
		superClass = ParamsUrlTools.class.getSuperclass();
		superClass.init(fTest);
	}
	private String superClass;
	
    /**
     * Test method for 'getPairParams(String)'
     */
    @Test
    public final void testGetPairParams() {
        List<NameValuePair> paramsList = new ArrayList<NameValuePair>();
        for (int i = 0; i < 5; i++) {
            paramsList.add(new BasicNameValuePair("key" + i, "value" + i));
        }
        getPairParams("https://www.google.com/search?q=http://java.org");
        assertEquals(5 + 1, paramsList.size());
        int i = 0;
        for (String name : paramsList.keySet()) {
            assertEquals(paramsList.get(i++).getName(), name);
        }
        for (NameValuePair param : paramsList) {
            assertNotNull(param);
        }
    }


    /**
	 * Constructor for this class.
	 * 
	 * @param fTest Class
	 * @param host String
	 * @return URI
	 * @throws URISyntaxException
	 */
    public URI constructURI(String host) throws URISyntaxException {
        return new URI("https://" + host);
    }
    
    /**
     * Test method for'splitUrl(String, JFrame)'
     * 
     * @throws IllegalArgumentException if 'host' starts with "http://" or "https://"
     */
    @Test
    public final void testSplitUrl() throws IllegalArgumentException {
        String testHost = "http://www.google.com/search?q=http://java.org";
        List<List<NameValuePair>> list = new ArrayList<List<NameValuePair>>();
        list.add(new ArrayList<NameValuePair>());
        list.add(new ArrayList<NameValuePair>());
        
        // Test method
        String[] splitUrl = splitUrl(testHost, null);
        assertThrows(IllegalArgumentException.class, () -> splitUrl[0]);
        assertThrows(IllegalArgumentException.class, () -> splitUrl[1]);
        assertThrows(IllegalArgumentException.class, () -> splitUrl[2]);

        // Test method
        list = splitUrl(testHost, null);
        assertEquals(2, list.size());
        list.get(0).add(new BasicNameValuePair("key" + 1, "value" + 1));
        list.add(new BasicNameValuePair("key" + 2, "value" + 1));
        list.add(new BasicNameValuePair("key" + 3, "value" + 2));
        list.get(1).add(new BasicNameValuePair("key" + 5, "value" + 2));

        // Test method
        splitUrl = splitUrl(testHost, null);
        assertEquals(3, splitUrl.length);
        assertEquals("http://www.google.com/search?q=http://java.org", splitUrl[0]);
        assertEquals("http://www.google.com/search?q=http://java.org", splitUrl[1]);
        assertEquals("https://www.google.com/search?q=https://java.org", splitUrl[2]);
    }
}