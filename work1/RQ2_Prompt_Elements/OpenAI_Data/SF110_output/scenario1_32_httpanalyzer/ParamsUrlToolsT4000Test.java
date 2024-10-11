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
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("");
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b".
	* Expected result: list with one element.
	*/
	@Test
	void testGetPairParams_2() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d".
	* Expected result: list with two elements.
	*/
	@Test
	void testGetPairParams_3() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b&c=d");
		assertEquals(2, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f".
	* Expected result: list with three elements.
	*/
	@Test
	void testGetPairParams_4() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b&c=d&e=f");
		assertEquals(3, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h".
	* Expected result: list with four elements.
	*/
	@Test
	void testGetPairParams_5() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b&c=d&e=f&g=h");
		assertEquals(4, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j".
	* Expected result: list with five elements.
	*/
	@Test
	void testGetPairParams_6() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b&c=d&e=f&g=h&i=j");
		assertEquals(5, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l".
	* Expected result: list with six elements.
	*/
	@Test
	void testGetPairParams_7() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b&c=d&e=f&g=h&i=j&k=l");
		assertEquals(6, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l&m=n".
	* Expected result: list with seven elements.
	*/
	@Test
	void testGetPairParams_8() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b&c=d&e=f&g=h&i=j&k=l&m=n");
		assertEquals(7, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p".
	* Expected result: list with eight elements.
	*/
	@Test
	void testGetPairParams_9() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p");
		assertEquals(8, result.size());
	}
	
	/**
	* Test case for {@link ParamsUrlTools#getPairParams(String)} method.
	* Test data: "a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p&q=r".
	* Expected result: list with nine elements.
	*/
	@Test
	void testGetPairParams_10() {
		ParamsUrlTools instance = new ParamsUrlTools();
		List<NameValuePair> result = instance.getPairParams("a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p&q=r");
		assertEquals(9, result.size());
	}
}