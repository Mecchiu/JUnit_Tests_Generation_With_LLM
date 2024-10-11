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
		/**
* Create a unit test for the {@link Functions#addS(String)} method.
*
*/
	@Test
	public void unitTestADD_S() throws Exception {
		fillTens(1, "-");
		fillTens(5, "_");
		fillTens(10, ":");
		fillTens(20, "'");
		fillTens(60, "\"");
		fillTens(40, TEXT_BRACE_ROUND_RIGHT_LEFT_TO_BOTH);
		fillTens(1, "'");
		assertNull(Functions.addS(null));
		//assertNull(Functions.addS(new String()));
		assertEquals("", Functions.addS(""));
		assertEquals("", Functions.addS(""));
		assertEquals("1234", Functions.addS("1234"));
		assertEquals("1234", Functions.addS("  1234  "));
		assertEquals("1234", Functions.addS("1234  "));
		assertEquals("1234", Functions.addS("1234    "));
		assertEquals("1234", Functions.addS("1234  \"  "));
	}
}