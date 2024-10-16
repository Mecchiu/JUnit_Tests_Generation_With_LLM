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
	* Test case for the following input value :
	* <ul>
	* 	<li><code>null</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_1() throws Exception {
		// Arrange
		String pText = null;
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>""</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_2() throws Exception {
		// Arrange
		String pText = "";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>" "</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_3() throws Exception {
		// Arrange
		String pText = " ";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>"test"</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_4() throws Exception {
		// Arrange
		String pText = "test";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("test's", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>"test "</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_5() throws Exception {
		// Arrange
		String pText = "test ";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("test's", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>"test s"</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_6() throws Exception {
		// Arrange
		String pText = "test s";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("test s's", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>"test s "</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_7() throws Exception {
		// Arrange
		String pText = "test s ";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("test s's", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>"test s s"</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_8() throws Exception {
		// Arrange
		String pText = "test s s";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("test s s's", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>"test s s "</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_9() throws Exception {
		// Arrange
		String pText = "test s s ";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("test s s's", result);
	}
	
	/**
	* Test case for {@link Functions#addS(String)} method.
	* Test case for the following input value :
	* <ul>
	* 	<li><code>"test s s s"</code></li>
	* </ul>
	* @throws Exception
	*/
	@Test
	public void testAddS_10() throws Exception {
		// Arrange
		String pText = "test s s s";
		
		// Act
		String result = Functions.addS(pText);
		
		// Assert result
		assertEquals("test s s s's", result);
	}
	
}