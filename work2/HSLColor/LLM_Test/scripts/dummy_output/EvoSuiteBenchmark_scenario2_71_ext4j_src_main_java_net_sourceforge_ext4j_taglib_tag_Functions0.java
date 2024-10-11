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
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class FunctionsTest {
		
	/**
	 * Test case for {@link Functions#dateFormat(Date, String)} method.
	 *
	 * @throws Exception
	 */
	@Test
	void testDateFormat() throws Exception {
		Date date = new Date();
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNotNull(result);
	}
}