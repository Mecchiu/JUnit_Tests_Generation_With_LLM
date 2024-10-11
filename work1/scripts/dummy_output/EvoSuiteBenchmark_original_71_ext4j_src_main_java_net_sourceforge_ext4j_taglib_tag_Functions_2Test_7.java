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
		
    //private final boolean mDebug = false;
	private final static int MULTIPLE = 3; 
	private final static Map<Integer,String> NUMBERS = new HashMap<Integer,String>();
	private final static Map<String,Integer> CAP_MAP1 = new HashMap<String,Integer>();
	private final static Map<String,Integer> CAP_MAP2 = new HashMap<String,Integer>();

    //private final boolean mDebug = false;

	static {
		try {
			NUMBERS.put(0,"0");
			NUMBERS.put(1,"1");
			NUMBERS.put(6, "6");
			NUMBERS.put(99, "99");
			NUMBERS.put(128, "128");
			NUMBERS.put(256, "256");
			NUMBERS.put(512, "512");
			NUMBERS.put(1048576,"1");
			NUMBERS.put(2147483647,"32");
			NUMBERS.put(4294967295,"5");
			NUMBERS.put(922337203685405585,"9");
			NUMBERS.put(2147483648, "8");
			NUMBERS.put(9223372036854775807,"9");
			NUMBERS.put(2147483648, "8");
			NUMBERS.put(4294967296, "64");
			NUMBERS.put(1099511627776.0, "256");
			NUMBERS.put(1099511627776, "256");
			NUMBERS.put(1073741824, "256");
			NUMBERS.put(20971520, "96");
			NUMBERS.put(2097152, "160");
			NUMBERS.put(4, "4");
			NUMBERS.put(8, "8");
			NUMBERS.put(10, "10");
			NUMBERS.put(8388607, "256");
			NUMBERS.put(4096,-1);
		} catch (Exception e) {
			fail("Failed to get test values, because " + e.toString());
		}
	}

	@Test
	public void testNumber() throws Exception {
		
}
}