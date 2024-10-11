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
		private static String sTest = "http://joey.doe/tld/webtld.php";
		private static String sRequest = "http://joey.doe/tld/webtld.php?_action=add%3c";
		private static String sRequestFromOther = "http://joey.doe/tld/webtld.php?_action=add%3c&" + pName;
		private static String sRequestFromSame = "http://joey.doe/tld/webtld.php?_action=add&" + pName;
		private static String sRequestFromSelf = "http://joey.doe/tld/webtld.php?_action=add";
		private String pName = "joey";
		private static final int NUM_CHARS_TO_LEN = 4;
		private static final int STRING_LEN = 3;
		private static final int NUM_CHARS_TO_DELIMITER = 2;
		private static final int NUM_CHARS_TO_QUOTE = 3;

	public static String chopStringAfterLastSpace(String s, String pStart) {
    		if (s.length() > pStart.length()) {
    			int pos = s.lastIndexOf(pStart);
    			if (pos > pStart.length())
    				pos = pStart.length();
    			s = s.substring(pos + pStart.length());
    			pos = s.lastIndexOf(" ");
    			if (pos > 0)
    				s = s.substring(pos);
    		}
    		return s.trim();
	}

	@Test
	public void test_addS() throws JspTagException {
		String s = "hello";

		long l = 11;
		int i = 13;

		assertEquals("hello", Functions.addS(s));
	}

	@Test
	public void test_addS_2() throws JspTagException {
		String s = "hello";

		assertEquals("hello", Functions.addS(STRING_SPACE + s));
	}

	@Test
	public void test_addS_3() throws JspTagException {
		String s = "hello, world";

}
}