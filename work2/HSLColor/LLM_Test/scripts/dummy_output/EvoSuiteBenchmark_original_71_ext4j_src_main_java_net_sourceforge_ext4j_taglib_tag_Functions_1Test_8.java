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
		private Integer pOffset; 
			

    /**
    * Basic addS method for adding spaces.
    */
    @Test
    public void test1addS() throws JspTagException {
        final String value = "Hello world. (1 2 3)     ";	

        final String resultStr1 = addS(value);
        final String resultStr2 = addS(" ");
        final String resultStr3 = addS("\t") ;
        final String resultStr4 = addS(BlurB) ;
        final String resultStr5 = addS("\t" + BlurB) ;


        assertEquals(resultStr1, resultStr2);
        assertEquals(resultStr3, resultStr4);
        assertEquals(resultStr5, resultStr5);
    }

    /**
    * The set of characters in the number pattern (a-z)
    */
    @Test
    public void test3setNumChars() throws JspTagException {
        final String value = "Hello world. (1 2 3)     ";	

        final String[] result1 = setNumChars(value);
        final String[] result2 = setNumChars(" ");
        final String[] result3 = setNumChars("\t");
        final String[] result4 = setNumChars(BlurB);
        final String[] result5 = setNumChars("\t" + BlurB);


        assertArrayEquals(result1, result2);
        assertArrayEquals(result1, result3);
        assertArrayEquals(result1, result4);
        assertArrayEquals(result1, result5);
    }

    private static String[] setNumChars(String value) throws JspTagException {
        final Map<String, Object> requestParamMap = new HashMap<String, Object>();
        requestParamMap.put("_offset", new Integer(10));
        requestParamMap.put("p_number_pattern", value);

        return requestParamMap.get("p_num_char_list").toString().split(STRING_COMMA);
    }
	
	@Test
	public void testSetOpeartionsTest() {
		Integer rOffset1 = new Integer();
		Integer rOffset2 = new Integer(-10);
		Integer rOffset3 = new Integer(-15);
}
}