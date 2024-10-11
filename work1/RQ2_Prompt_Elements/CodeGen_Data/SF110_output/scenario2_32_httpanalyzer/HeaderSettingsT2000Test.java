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
static private Header[] headerset = {};
    
    /**
     * test addHeader method
     */
    @Test
    public void setHeaders() {
		// System.out.println("setHeaders()");
        Header[] headerSet = headerSet();
		assertArrayEquals(headerset,headerSet);
	}
		
		/**
		 * test addHeader method
		 */
	public static String addHeader() {
		//System.out.println("addHeader()");
        Header[] headerSet = headerset();
        headerSet.add("content-length", "100");
		return "Hello world!";
	}
}

// HeaderSettingsTest.java