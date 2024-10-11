// Functions_1Test.java
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
* It contains one unit test case for the {@link Functions#addS(String)} method.
*/
class Functions_1Test {
		
	@Test
	public void testOneParameter() throws Exception {
		String sString = "Hello World";
		String sString1 = "Hello World";

		String sS = Functions.addS(sString);
		assertNotNull(sS);
		assertEquals(sString, sS);
	}

	@Test
	public void testTooLong() throws Exception {
		String sString1 = "Hello World";

		String sS = Functions.addS(sString1);
		assertNotNull(sS);
		assertEquals(sString1, sS);
	}

	@Test
	public void testParameterIsEmpty() throws Exception {
		String sString = "";

		String s = Functions.addS(sString);
		assertNotNull(s);
		assertEquals(sString, s);
	}

	@Test
	public void testParamIsEmpty_null() throws Exception {
		String sString = null;

		String s = Functions.addS(sString);
		assertNotNull(s);
		assertEquals(sString, s);
	}

	@Test
	public void testParamIsEmpty_invalid() throws Exception {
		String sString = "Hello";

		String s = Functions.addS(sString);
		assertNotNull(s);
		assertEquals(sString, s);
	}

	@Test
	public void testAddParam_null() throws Exception {
		String sString0 = null;

		String s = Functions.addS(sString0);
		assertNotNull(s);
		assertEquals(sString0, s);
	}

	@Test
	public void testAddParam_empty() throws Exception {
		String sString = "";
		String s = Functions.addS(sString);
		assertNotNull(s);
		assertEquals(sString, s);
	}

	@Test
	public void testAddParam_invalid() throws Exception {
		String sString = "Hello";
		String s = Functions.addS(sString);
		assertNotNull(s);
		assertEquals(sString, s);
	}

	@Test
	public void testRemoveParam_empty() throws Exception {
		String sString = "Hello";

		String s = Functions.removeS(sString);
}
}