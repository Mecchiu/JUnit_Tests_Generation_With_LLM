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
     * Test class of {@link ParamsUrlTools}.
     */
    @Test
    public void testParamsUrl () {

        String testString = "http://www.google.com";
        String[] params = new String[] {
            "s=\"value\"",
            "c=/",
            "f=A",
            "r=1",
            "u=\"http://a.org\""
        };

        List<NameValuePair> paramsList = new ArrayList<>();
        //
        for (String paramRaw : params) {
            paramsList.add(new BasicNameValuePair("rawParameter", paramRaw));
        }
        //
        List<NameValuePair> expectedRawList = new ArrayList<>();
        //
        for (NameValuePair value : paramsList) {
            expectedRawList.add(value);
            //
        }

        //
        // HTTP protocol
        String[] uri = getUrlStringUtil().getURI(testString, "GET", null);
        //
        assertArrayEquals(params, uri, expectedRawList.toArray());
	}
	
    /**
     * Test class of {@link ParamsUrlTools}.
     */
    @Test
    public void testParamsUrlWithHttpPort() throws Exception {
        
        String testString = "http://www.google.com";
        //
        URI[] uri = getUrlStringUtil().getURI(testString, "GET", null);
        //
        String[] uriArray = getUrlStringUtil().getURIArray(uri, null);
        //
        assertArrayEquals(uriArray, 
                        getUrlStringUtil().getURI(testString, "GET", null), 
                            new ArrayList<>());
    }
}