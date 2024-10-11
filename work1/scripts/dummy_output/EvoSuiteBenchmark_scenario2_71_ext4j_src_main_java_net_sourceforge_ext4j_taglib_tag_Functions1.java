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
	 * It tests the case when the input is null.
	 */
	@Test
	void testAddS_null() {
		assertEquals("", Functions.addS(null));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is empty.
	 */
	@Test
	void testAddS_empty() {
		assertEquals("", Functions.addS(""));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is "James".
	 */
	@Test
	void testAddS_James() {
		assertEquals("James's", Functions.addS("James"));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is "Daniel".
	 */
	@Test
	void testAddS_Daniel() {
		assertEquals("Daniel's", Functions.addS("Daniel"));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is "James ".
	 */
	@Test
	void testAddS_James_space() {
		assertEquals("James 's", Functions.addS("James "));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is "James  ".
	 */
	@Test
	void testAddS_James_2spaces() {
		assertEquals("James  's", Functions.addS("James  "));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is "James\t".
	 */
	@Test
	void testAddS_James_tab() {
		assertEquals("James\t's", Functions.addS("James\t"));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is "James\n".
	 */
	@Test
	void testAddS_James_newline() {
		assertEquals("James\n's", Functions.addS("James\n"));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is "James\r".
	 */
	@Test
	void testAddS_James_carriageReturn() {
		assertEquals("James\r's", Functions.addS("James\r"));
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input is "James\r\n".
	 */
	@Test
	void testAddS_James_carriageReturnNewline() {
		assertEquals("James\r\n's", Functions.addS("James\r\n"));
	}
}