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
		String params = "";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams2() {
		System.out.println("getPairParams");
		String params = "key=value";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams3() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams4() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams5() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3&key4=value4";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams6() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams7() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		expResult.add(new BasicNameValuePair("key6", "value6"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams8() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		expResult.add(new BasicNameValuePair("key6", "value6"));
		expResult.add(new BasicNameValuePair("key7", "value7"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams9() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		expResult.add(new BasicNameValuePair("key6", "value6"));
		expResult.add(new BasicNameValuePair("key7", "value7"));
		expResult.add(new BasicNameValuePair("key8", "value8"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams10() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		expResult.add(new BasicNameValuePair("key4", "value4"));
		expResult.add(new BasicNameValuePair("key5", "value5"));
		expResult.add(new BasicNameValuePair("key6", "value6"));
		expResult.add(new BasicNameValuePair("key7", "value7"));
		expResult.add(new BasicNameValuePair("key8", "value8"));
		expResult.add(new BasicNameValuePair("key9", "value9"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
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
     *
     * @param params String
     * @return List<NameValuePair>
     */
    public List<NameValuePair> getPairParams(String params) {
        List<NameValuePair> list = new ArrayList<>();
        String[] pairs = params.split("&");
        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            if (keyValue.length > 1) {
                list.add(new BasicNameValuePair(keyValue[0], keyValue[1]));
            }
        }
        return list;
    }
}

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
		String params = "";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams2() {
		System.out.println("getPairParams");
		String params = "key=value";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams3() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams4() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams5() {
		System.out.println("getPairParams");
		String params = "key=value&key2=value2&key3=value3&key4=value4";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<>();
		expResult.add(new BasicNameValuePair("key", "value"));
		expResult.add(new BasicNameValuePair("key2", "value2"));
		expResult.add(new BasicNameValuePair("key3", "value3