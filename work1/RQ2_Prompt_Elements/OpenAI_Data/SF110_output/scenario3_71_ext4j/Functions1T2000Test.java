// FunctionsTest.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#addS(String)} method.
*/
class FunctionsTest {

	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text is null.
	 */
	@Test
	public void testAddS_null() {
		String text = null;
		String result = Functions.addS(text);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text is empty.
	 */
	@Test
	public void testAddS_empty() {
		String text = "";
		String result = Functions.addS(text);
		assertEquals("", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS() {
		String text = "James";
		String result = Functions.addS(text);
		assertEquals("James'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS2() {
		String text = "James'";
		String result = Functions.addS(text);
		assertEquals("James'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS3() {
		String text = "James's";
		String result = Functions.addS(text);
		assertEquals("James's", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS4() {
		String text = "James's'";
		String result = Functions.addS(text);
		assertEquals("James's'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS5() {
		String text = "James's's";
		String result = Functions.addS(text);
		assertEquals("James's's", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS6() {
		String text = "James's's'";
		String result = Functions.addS(text);
		assertEquals("James's's'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS7() {
		String text = "James's's's";
		String result = Functions.addS(text);
		assertEquals("James's's's", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS8() {
		String text = "James's's's'";
		String result = Functions.addS(text);
		assertEquals("James's's's'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS9() {
		String text = "James's's's's";
		String result = Functions.addS(text);
		assertEquals("James's's's's", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS10() {
		String text = "James's's's's'";
		String result = Functions.addS(text);
		assertEquals("James's's's's'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS11() {
		String text = "James's's's's's";
		String result = Functions.addS(text);
		assertEquals("James's's's's's", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS12() {
		String text = "James's's's's's'";
		String result = Functions.addS(text);
		assertEquals("James's's's's's'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS13() {
		String text = "James's's's's's's";
		String result = Functions.addS(text);
		assertEquals("James's's's's's's", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS14() {
		String text = "James's's's's's's'";
		String result = Functions.addS(text);
		assertEquals("James's's's's's's'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS15() {
		String text = "James's's's's's's's";
		String result = Functions.addS(text);
		assertEquals("James's's's's's's's", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS16() {
		String text = "James's's's's's's's'";
		String result = Functions.addS(text);
		assertEquals("James's's's's's's's'", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS17() {
		String text = "James's's's's's's's's";
		String result = Functions.addS(text);
		assertEquals("James's's's's's's's's", result);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the text ends with 's.
	 */
	@Test
	public void testAddS_endsWithS18() {
		String text = "James's's