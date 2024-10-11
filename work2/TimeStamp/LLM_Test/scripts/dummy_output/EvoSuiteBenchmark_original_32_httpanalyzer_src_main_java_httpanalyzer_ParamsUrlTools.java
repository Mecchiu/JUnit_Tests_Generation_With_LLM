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
		private final ParamsUrlTools instance;

		/**
		 * Constructor for test class.
		 * @param instance
         * @throws URISyntaxException
        */
        ParamsUrlToolsTest(ParamsUrlTools instance) throws URISyntaxException {
                this.instance = instance;
        }

  /**
	* Test of getPairParams method, of class {@link ParamsUrlTools}.
	*/
	@Test
	public void testGetPairParams_01() throws URISyntaxException{
	
		//getPairParams("http://example.com/url?query=withQuery");
		List<NameValuePair> input = getPairParams("http://abc.com/url?query=withQuery");
		assertEquals("query", input.get(0).getName());
		assertEquals("query", input.get(1).getName());
		assertEquals("query", input.get(2).getName());
    }


	/**
	* Test of getPairParams method, of class {@link ParamsUrlTools}.
	*/
	@Test
	public void testGetPairParams_02() throws URISyntaxException{
		List<NameValuePair> param1 = new ArrayList<NameValuePair>();
		param1.add(new BasicNameValuePair("key1-value1", "key1-value2"));
		List<NameValuePair> param2 = new ArrayList<NameValuePair>();
		param2.add(new BasicNameValuePair("key2-value3", "key1-value1"));
		List<NameValuePair> result = instance.getPairParams("http://abc.com/url?query=withQuery&query=withQuery");
		assertEquals(2, result.size());

		assertEquals(1, result.get(0).size());
		assertEquals("key1-value1", result.get(0).getName());
		assertEquals("key1-value2", result.get(1).getName());
		//1
        //2
		
		assertEquals(1,result.get(0).size());
		assertEquals("key1-value1", result.get(0).getName());
		
		assertEquals(2,result.get(1).size());
		assertEquals("key2-value3", result.get(1).getName());
	}

}