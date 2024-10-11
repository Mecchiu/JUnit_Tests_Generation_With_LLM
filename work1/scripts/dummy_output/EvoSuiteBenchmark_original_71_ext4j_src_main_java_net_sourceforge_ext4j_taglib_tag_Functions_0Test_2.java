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
    public void test_1(){
        Map<String,String> m_ParametersFormatMappings = new HashMap<String,String>();
        m_ParametersFormatMappings.put("month", STRING_SPACE + STRING_FULLN - STRING_EMPTY);//"yyyy-mm"
        m_ParametersFormatMappings.put("dateUTC", STRING_UNDERSCORE_ONE_OR_MORE + STRING_UNDERSCORE);//"yyyy-MM-dd'T'HH:mm:ss.SSSZ"
        m_ParametersFormatMappings.put("day", STRING_EMPTY);//null
        m_ParametersFormatMappings.put("hour", STRING_EMPTY);//null
        m_ParametersFormatMappings.put("minute", STRING_EMPTY);//null
        m_ParametersFormatMappings.put("second",STRING_EMPTY);//null
        m_ParametersFormatMappings.put("fullN", STRING_EMPTY);//null
//        m_ParametersFormatMappings.put("full", EMPTY);//null
        m_ParametersFormatMappings.put("decimalFormat", STRING_DOT);//"MM.DD HH:mm:ss.SSSZ"
        m_ParametersFormatMappings.put("formatMapping", STRING_EMPTY);
        return;
    }

    @Test
    public void test_2(){
        String[] a_pList = {"2010", "2010", "2010", "2010"};
        assertEquals(Arrays.asList(a_pList), Functions.orderWords("2010"));
        return;
    }

    //unit tests for the following functions
//    @Test
//    public void test_5() throws Exception{
//
//        DecimalFormat m = new DecimalFormat("##########");
//        String s = "12-30-2014";
//
//        m.setMaximumFractionDigits(m_ParametersFormatMappings.get("month"));
//        Calendar c = Calendar.getInstance();
//        s = new DecimalFormat("").format(c.getTime()) + "-" + dFormat(s);
//        m.setMaximumFractionDigits(m_ParametersFormatMappings.get("day"));
//        String result = Functions.dateFormat(new Date(new Long(
}