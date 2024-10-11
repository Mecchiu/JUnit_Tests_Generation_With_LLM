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
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams2() {
		System.out.println("getPairParams");
		String params = "a=1";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams3() {
		System.out.println("getPairParams");
		String params = "a=1&b=2";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		expResult.add(new BasicNameValuePair("b", "2"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams4() {
		System.out.println("getPairParams");
		String params = "a=1&b=2&c=3";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		expResult.add(new BasicNameValuePair("b", "2"));
		expResult.add(new BasicNameValuePair("c", "3"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams5() {
		System.out.println("getPairParams");
		String params = "a=1&b=2&c=3&d=4";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		expResult.add(new BasicNameValuePair("b", "2"));
		expResult.add(new BasicNameValuePair("c", "3"));
		expResult.add(new BasicNameValuePair("d", "4"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams6() {
		System.out.println("getPairParams");
		String params = "a=1&b=2&c=3&d=4&e=5";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		expResult.add(new BasicNameValuePair("b", "2"));
		expResult.add(new BasicNameValuePair("c", "3"));
		expResult.add(new BasicNameValuePair("d", "4"));
		expResult.add(new BasicNameValuePair("e", "5"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams7() {
		System.out.println("getPairParams");
		String params = "a=1&b=2&c=3&d=4&e=5&f=6";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		expResult.add(new BasicNameValuePair("b", "2"));
		expResult.add(new BasicNameValuePair("c", "3"));
		expResult.add(new BasicNameValuePair("d", "4"));
		expResult.add(new BasicNameValuePair("e", "5"));
		expResult.add(new BasicNameValuePair("f", "6"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams8() {
		System.out.println("getPairParams");
		String params = "a=1&b=2&c=3&d=4&e=5&f=6&g=7";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		expResult.add(new BasicNameValuePair("b", "2"));
		expResult.add(new BasicNameValuePair("c", "3"));
		expResult.add(new BasicNameValuePair("d", "4"));
		expResult.add(new BasicNameValuePair("e", "5"));
		expResult.add(new BasicNameValuePair("f", "6"));
		expResult.add(new BasicNameValuePair("g", "7"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams9() {
		System.out.println("getPairParams");
		String params = "a=1&b=2&c=3&d=4&e=5&f=6&g=7&h=8";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		expResult.add(new BasicNameValuePair("b", "2"));
		expResult.add(new BasicNameValuePair("c", "3"));
		expResult.add(new BasicNameValuePair("d", "4"));
		expResult.add(new BasicNameValuePair("e", "5"));
		expResult.add(new BasicNameValuePair("f", "6"));
		expResult.add(new BasicNameValuePair("g", "7"));
		expResult.add(new BasicNameValuePair("h", "8"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of getPairParams method, of class ParamsUrlTools.
	 */
	@Test
	public void testGetPairParams10() {
		System.out.println("getPairParams");
		String params = "a=1&b=2&c=3&d=4&e=5&f=6&g=7&h=8&i=9";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "1"));
		expResult.add(new BasicNameValuePair("b", "2"));
		expResult.add(new BasicNameValuePair("c", "3"));
		expResult.add(new BasicNameValuePair("d", "4"));
		expResult.add(new BasicNameValuePair("e", "5"));
		expResult.add(new BasicNameValuePair("f", "6"));
		expResult.add(new BasicNameValuePair("g", "7"));
		expResult.add(new BasicNameValuePair("h", "8"));
		expResult.add(new BasicNameValuePair("i", "9"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}
}