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
* It contains ten unit test cases for the {@link ParamsUrlTools#getPairParams(String)} method.
*/
class ParamsUrlToolsTest {

	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams() {
		System.out.println("getPairParams");
		ParamsUrlTools instance = new ParamsUrlTools();
		
		// Test case 1
		String params = "";
		List<NameValuePair> expResult = new ArrayList<>();
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 2
		params = "key=value";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 3
		params = "key=value&key2=value2";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 4
		params = "key=value&key2=value2&key3=value3";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 5
		params = "key=value&key2=value2&key3=value3&key4=value4";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 6
		params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 7
		params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		expResult.add(new BasicNameValuePair("key6", "value6"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 8
		params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		expResult.add(new BasicNameValuePair("key6", "value6"));
		expResult.add(new BasicNameValuePair("key7", "value7"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 9
		params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		expResult.add(new BasicNameValuePair("key6", "value6"));
		expResult.add(new BasicNameValuePair("key7", "value7"));
		expResult.add(new BasicNameValuePair("key8", "value8"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
		
		// Test case 10
		params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9";
		expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		expResult.add(new BasicNameValuePair("key6", "value6"));
		expResult.add(new BasicNameValuePair("key7", "value7"));
		expResult.add(new BasicNameValuePair("key8", "value8"));
		expResult.add(new BasicNameValuePair("key9", "value9"));
		result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of splitUrl method, of class ParamsUrlTools.
	 */
	@Test
	public void testSplitUrl() {
		System.out.println("splitUrl");
		ParamsUrlTools instance = new ParamsUrlTools();
		
		// Test case 1
		String startUrl = "http://www.google.com";
		JFrame parentFrame = new JFrame();
		String[] expResult = {"www.google.com", "80", "/", "http://www.google.com"};
		String[] result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 2
		startUrl = "http://www.google.com:8080";
		expResult = {"www.google.com", "8080", "/", "http://www.google.com:8080"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 3
		startUrl = "http://www.google.com:8080/";
		expResult = {"www.google.com", "8080", "/", "http://www.google.com:8080/"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 4
		startUrl = "http://www.google.com:8080/index.html";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 5
		startUrl = "http://www.google.com:8080/index.html?key=value";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 6
		startUrl = "http://www.google.com:8080/index.html?key=value&key2=value2";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value&key2=value2"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 7
		startUrl = "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 8
		startUrl = "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 9
		startUrl = "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 10
		startUrl = "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 11
		startUrl = "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 12
		startUrl = "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
		
		// Test case 13
		startUrl = "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9";
		expResult = {"www.google.com", "8080", "/index.html", "http://www.google.com:8080/index.html?key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9"};
		result = instance.splitUrl(startUrl, parentFrame);
		assertArrayEquals(expResult, result);
	}
}

// ParamsUrlTools.java
package httpanalyzer;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

/**
 * @author vlad
 */
public class ParamsUrlTools {

    /**
     * Transform long String line with parameters
     * to List (key, value)
     * @param params String
     * @return List<NameValuePair>
     */
    public List<NameValuePair> getPairParams(String params) {
        List<NameValuePair> list = new ArrayList<>();
        String[] paramsArray = params.split("&");
        for (String param : paramsArray) {
            String[] keyValue = param.split("=");
            list.add(new BasicNameValue