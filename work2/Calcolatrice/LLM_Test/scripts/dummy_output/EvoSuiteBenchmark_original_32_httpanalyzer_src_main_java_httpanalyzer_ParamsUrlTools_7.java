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
     * Test case for {@link ParamsUrlTools#splitUrl(String, JFrame)}
     * <p>
     * This case contains one test case for all the parts of URL.
     */
    @Test
    void testUrlSplit() throws URISyntaxException{
        int length = Integer.MAX_VALUE;
        
        URISyntaxException e = null;
        
        String urlString = "www.abc.com:80/api/v1/";
        
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        try {
            List<BasicNameValuePair> pairs = new ArrayList<BasicNameValuePair>();
            for (int start = 0;start< urlString.length();start++) {
                pairs.add(new BasicNameValuePair("param.key", urlString.substring(start,start+length)));
            }
            
            
            
            URI uri = new URI(urlString);
            
            List<NameValuePair> result = ParamsUrlTools.splitUrl(urlString, new JFrame());
            
            params = ParamsUrlTools.getPairParams(uri.getRawQuery());
            
            for (int i = 0;i < urlString.length();i++) {
                if (uri.getQuery()!= null)
                    assertTrue("Expected empty query ", params.get(i).getValue() == "");
            
                    if (i< urlString.length() && uri.getQuery()!= null )
                        params.get(i).setValue(uri.getQuery().substring(i));
                    else
                        ((BasicNameValuePair)params.get(i)).setValue(urlString.substring(i));
                
            }
            
        } catch(URISyntaxException e2) {
            e = e2;
        }
        assertNotNull("Test case for the splitUrl method throws a URISyntaxException for empty URI",e);
        
        assertEquals("The expected length should be equal to the url part. ",length, params.size());
    }

}