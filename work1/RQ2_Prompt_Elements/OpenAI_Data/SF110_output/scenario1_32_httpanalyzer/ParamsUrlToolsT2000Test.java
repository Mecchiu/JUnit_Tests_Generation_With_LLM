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
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "".
	* Expected result: empty list.
	*/
	@Test
	void testGetPairParams_1() {
		System.out.println("getPairParams");
		String params = "";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}

	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b".
	* Expected result: list with one element.
	*/
	@Test
	void testGetPairParams_2() {
		System.out.println("getPairParams");
		String params = "a=b";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}

	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d".
	* Expected result: list with two elements.
	*/
	@Test
	void testGetPairParams_3() {
		System.out.println("getPairParams");
		String params = "a=b&c=d";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}

	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f".
	* Expected result: list with three elements.
	*/
	@Test
	void testGetPairParams_4() {
		System.out.println("getPairParams");
		String params = "a=b&c=d&e=f";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}

	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h".
	* Expected result: list with four elements.
	*/
	@Test
	void testGetPairParams_5() {
		System.out.println("getPairParams");
		String params = "a=b&c=d&e=f&g=h";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		expResult.add(new BasicNameValuePair("g", "h"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}

	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j".
	* Expected result: list with five elements.
	*/
	@Test
	void testGetPairParams_6() {
		System.out.println("getPairParams");
		String params = "a=b&c=d&e=f&g=h&i=j";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		expResult.add(new BasicNameValuePair("g", "h"));
		expResult.add(new BasicNameValuePair("i", "j"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}

	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l".
	* Expected result: list with six elements.
	*/
	@Test
	void testGetPairParams_7() {
		System.out.println("getPairParams");
		String params = "a=b&c=d&e=f&g=h&i=j&k=l";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		expResult.add(new BasicNameValuePair("g", "h"));
		expResult.add(new BasicNameValuePair("i", "j"));
		expResult.add(new BasicNameValuePair("k", "l"));
		List<NameValuePair> result = instance.getPairParams(params);
		assertEquals(expResult, result);
	}

	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l&m=n".
	* Expected result: list with seven elements.
	*/
	@Test
	void testGetPairParams_8() {
		System.out.println("getPairParams");
		String params = "a=b&c=d&e=f&g=h&i=j&k=l&m=n";
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> expResult = new ArrayList<NameValuePair>();
		expResult.add(new BasicNameValuePair("a", "b"));
		expResult.add(new BasicNameValuePair("c", "d"));
		expResult.add(new BasicNameValuePair("e", "f"));
		expResult