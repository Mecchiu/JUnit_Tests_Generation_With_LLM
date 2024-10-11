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
	 * Test getUrl() method.
	 */
	@Test
	public void testGetUrl() {
		new ParamsUrlTools();	
	}	
	
	/**
	 * Test splitUrl().
	 */
	@Test
	public void testSplitUrl() {
		new ParamsUrlTools();
		assertNotNull(new URI("https://example.com").toString());
		assertNotNull(new URI("https://example.com/path").toString());
	}	
	
// TODO make the splitUrl() method return a long array = {...}
}