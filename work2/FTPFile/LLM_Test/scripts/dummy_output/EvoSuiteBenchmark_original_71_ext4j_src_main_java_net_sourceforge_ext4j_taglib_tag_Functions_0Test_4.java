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
		/**
	* Unit test for {@link Functions#dateFormat(Date, String)}.
	* Test case for issue 9
	*/
	@Test
	public void test_DateFormat(@SuppressWarnings("rawtypes") IRequest pRequest) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat(pRequest.getParameter("format"));
		Map<Long, String> params = new HashMap<Long, String>();
		format.setTimeZone(Calendar.getInstance().getTimeZone());

		params.put(pRequest.getParameter("year"), String.valueOf(format.parse(pRequest.getParameter("year"))) + YEAR_SUFFIX);
		params.put(pRequest.getParameter("month"), String.valueOf(format.parse(pRequest.getParameter("month"))) + MONTH_SUFFIX);
		params.put(pRequest.getParameter("day"), String.valueOf(format.parse(pRequest.getParameter("day"))));
		params.put(pRequest.getParameter("hour"), String.valueOf(format.parse(pRequest.getParameter("hour"))) + HOUR_SUFFIX);
		params.put(pRequest.getParameter("minute"), String.valueOf(format.parse(pRequest.getParameter("minute"))));
		params.put(pRequest.getParameter("second"), String.valueOf(format.parse(pRequest.getParameter("second"))) + SECOND_SUFFIX);
		params.put(pRequest.getParameter("word"), "");
		params.put(pRequest.getParameter("decimalFormat"), format.toPattern());
		params.put(pRequest.getParameter("blurbd_suffix"), BLURB_SUFFIX);

		final String s = (String)pRequest.getAttribute("parameters");
		String v1;
		v1 = Functions_0Test.order(Functions_0Test.paramsToStr(params, false), s);
		assertEquals(v1, Functions.paramsToStr(params, false), "Should not compare an empty string - check on the getParameters method:" + v1);


		final DecimalFormat df = new DecimalFormat();
		v1 = Functions_0Test.ordinal(v1);
		String v2 = Functions.paramsToStr(params, true);
}
}