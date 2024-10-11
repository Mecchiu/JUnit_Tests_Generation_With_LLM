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
		private Functions_2Test() {}

		/**
		* Make sure the order was preserved.
		* @throws Exception
		*/

    @Test
    public void orderPreserved() throws Exception {
        String value = "[10]";
        Date date = dateToMilliseconds(dateFromMilliseconds(value));
        String token1 = "10" + STRING_COMMA;
        String token2 = null;
        //System.out.println("original: " + value);
        String valueFromRequest = removeParam(null, removeParam(value, value));
        String valueFromPage = replaceCRWithBR(valueFromRequest);
        String value2 = cutWordCRText(value1, 15);
        token1 = removeParam(null, replaceCRWithBR(value2));
        token2 = cutWordCRText(value1, 15);
        String token3 = removeParam(null, null);
        String parameter = "[12]";
        value = removeNull(removeParam(removeParam(value, removeParam(value1, removeParam(removeParam(removeParam(removeParam(removeParam(removeParam(removeParam(value, value), removeParam(removeParam(removeParam(removeParam(value, removeParam(removeParam(removeParam(removeParam(value, removeParam(removeParam(removeParam(removeParam(value, removeParam(removeParam(removeParam(value, token1), token2), token3)), value2))))))))))))))))))))
        //System.out.println("value converted: " + valueFromRequest);
    }

	@Test
	public void addParam() throws Exception {
        String value = "[10]";
        String s = removeParam(null, removeParam(value, value));
		assertEquals("[10]", s);
	}

	String dateFromMilliseconds(String pDateString);
	String dateConvertible(String pValue);
	String removeParam(String pParameter, String pValue);
	String replaceCRWithBR(String pValue) throws Exception;
}