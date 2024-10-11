// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains one unit test case for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {
		/** the set headers method name */
    public final static String setHeaders_SET_HEADERS_SUFFIX="set_headers";


    /** Test method for set headers method. */
	@Test
	public void testSetHeaders_methodNotCalledTwice() throws Exception{

    		assertNull(setHeaders());

    }

		/** Test method for get header headers. */
	@Test
	public void testGetHeaders() throws Exception{

    		Header set = new Header("User-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1;.NET CLR 1.1.4322;.NET CLR 2.0.50727)",
            			                                                                   "http://www.yahoo.com",
            			                                                                   "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)",
            			                                                                   "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1)",
            			                                                                   "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)",
            			                                                                   "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)",
            			                                                                   "msnbot/1.1 (+http://search.msn.com/msnbot.htm)",
            			                                                                   "Yahoo! Slurp",
            			                                                                   "Mozilla/5.0 (iPhone; U; CPU iPhone OS 2_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Mobile/8-1-cA",
            			                                                                   "MSNBC News Feed Reader",
            			                                                                   "Mozilla/5.0 (Windows; U; Windows 95; en-US) AppleWebKit/525.11 (KHTML, like Gecko)",
            			                                                                   "Mozilla/5.0 (iPad; CPU OS 9_0 like Mac OS X) AppleWebKit/535.19 (KHTML, like Gecko)",
            			                                                                   "Mozilla/5.0 (iPad; CPU OS 9_0 like Mac OS X) AppleWebKit/601.1.30 (KHTML, like Gecko) Mobile/11B5ABW",
            			                                                                   "WAPF",
            			                                                                   "Mozilla/5.0 (compatible; MSIE 9.0; Windows NT 7.1)",

            			                                                                  "MSNBC News Feed Reader (Mozilla/5.0 (iPad; CPU OS 9_0 like Mac OS X) AppleWebKit/535.19 (KHTML, like Gecko)",
            			                                                                  "WAPF"))");

    			// Assert if the number of headers not set or no headers, the internal headers will be copied
    			assertEquals("Mozilla/5.0 (iPad; CPU OS 9_0 like Mac OS X) AppleWebKit/535.19 (KHTML, like Gecko)",
            				     // The first header set from setHeaders method is null, the last one is defined
            				     new String[]{null, set, "Microsoft News Feed Reader (Mozilla/5.0 (iPad; CPU OS 9_0 like Mac OS X) AppleWebKit/535.19 (KHTML, like Gecko)", 
            				        										"WAPF")}[presetCookie]
            		);


    		 // Assert if the headers is copied, the number of headers not set, setHeaders
    		// method return it
    		assertEquals(setHeaders(), set.getHeaders());
    }

}