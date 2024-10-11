// Functions_2Test.java
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
* It contains one unit test case for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class Functions_2Test {
		
	public static final String INVALID_DATE = "Invalid date!";
	
    private static final String[] NUMBER_WORDS = new String[] {
	"",
	"abc",
	"01",
	"abcdef",
	"abcde",
	"abcdefghijklmn",
	"abcdefghijklmnopqrstuv",
	"abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789",
	"0123456789abcdefghijklmnopqrstuvABCDEFGHIJKLMNOPQRSTUVWXYZ"
	};

	@Test
	public void test01() throws Exception {
		fillTens(20, UNDERSCORE);
		String str = dateToMilliseconds(new Date()) < 5? "12345678901234567890123456789012345678901234567890123456789012345678" : "";
		assertEquals("12345678", str);
	}
	
	@Test
	public void test02() throws Exception {
		fillTens(1, STRING_SPACE);
		String str = addS(STRING_SPACE);
		assertTrue(str.endsWith(STRING_SPACE));
	}
	
	@Test
	public void test03() throws Exception {
		fillTens(10, UNDERSCORE);
		int startNumber = 1;
		int endNumber = NUMBER_WORDS.length;
		int startDigit = startNumber * 10;
		for (int i = 0; i < startNumber;) {
			if(NUMBERS_WORD.containsKey(startDigit)) {
				i++;
				startDigit++;
			}
			if (startDigit == NUMBER_WORDS.length)
				{
					startDigit = 0;
					startNumber++;
				}
		}
		fillTens(startNumber, STRING_SPACE);
		String str = addS(STRING_SPACE);
		int number = (startDigit < 10)? endNumber : startDigit;
		assertEquals(str.substring(startNumber), new DecimalFormat("").format(number));
	}
}