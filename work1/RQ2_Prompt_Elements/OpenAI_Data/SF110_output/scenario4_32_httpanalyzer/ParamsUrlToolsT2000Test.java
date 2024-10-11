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
