// Functions_0Test.java
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
* It contains one unit test case for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_0Test {
		
	@Test
	public void testDateFormat() 
	{
		//System.out.println("DateFormat");
		DecimalFormat df = new DecimalFormat("E0");

		//System.out.println(dateFormat.fabs());
		Calendar cCal = Calendar.getInstance();
		cCal.set(Calendar.ERA);
		Date date1 = df.parse("11.26.2004");
		cCal.setTime(date1);
		Date date2 = df.parse("02.02.2004");
		cCal.set(Calendar.YEAR, 11);
		date1 = df.parse("01.02.2003");
		cCal.setTime(date1);
		String date = DateFormat.getDateInstance().format(date1);
		
		String val = dateFormat.fabs() + " " + dateFormat.format(date, "h h:mm") + " ";
		assertEquals(val, dateFormat.fabs());
		val = dateFormat.fabs().replace("h", "h");
		assertEquals(val, dateFormat.fabs());
	}
}