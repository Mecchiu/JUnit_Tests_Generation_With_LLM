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
	 * Test constructor
	 * @throws URISyntaxException 
	 */
    @Test
    void constructorString(){
        StringBuilder url = new StringBuilder("http://127.0.0.1:9988/rest/httpanalyzer");
        assertNotNull(ParamsUrlTools.getPairParams(url.toString()).length);
    }
	
	/**
	 * Test method for constructor with URI.
	 * @throws URISyntaxException 
	 */
    @Test
    void constructorURIString(){
        URI uri = null;
        StringBuilder uriStr = new StringBuilder("http://127.0.0.1:9988/rest/httpanalyzer/something");
        try {
            uriStr = new StringBuilder(uriStr, "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException ex) {
            fail("String creation error" + "ex: " + ex.getMessage());
        }
        assertNotNull(ParamsUrlTools.getPairParams(uriStr.toString()).length);
    }
	
	/**
	 * Test method for constructor with List.
	 * @throws URISyntaxException 
	 */
    @Test
    void constructorList(){
    	List<NameValuePair> p = new ArrayList<>();
    	p.add(new BasicNameValuePair("param1", "param1"));
    	p.add(new BasicNameValuePair("param5", "param5"));
    	p.add(new BasicNameValuePair("param2", "param2"));
    	p.add(new BasicNameValuePair("param7", "param7"));
    	p.add(new BasicNameValuePair("param3", "param3"));
    	p.add(new BasicNameValuePair("param4", "param4"));
    	p.add(new BasicNameValuePair("param8", "param8"));
    	p.add(new BasicNameValuePair("param9", "param9"));
    	
    	StringBuilder url = new StringBuilder("http://127.0.0.1:9988/rest/httpanalyzer/");
    	assertEquals(url.toString(), url.toString());
    	List<NameValuePair> params = ParamsUrlTools.getPairParams(url.toString());
    	assertEquals(p, params);
    }
}