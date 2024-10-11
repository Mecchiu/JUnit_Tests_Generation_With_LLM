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
		
	private String word = "test";
	    
	    private DecimalFormat format = new DecimalFormat("###########");
	String result = "";
	
    private int length;

    
    @Test
    public void testParagraphStyleOrderAndSeparation() throws Exception {
    		
    		assertTrue(!isString(""+ ""));
    		assertTrue(!isString(""+ " "));
    		assertTrue(!isString("" + " "));
    		
    		assertTrue(isWordStyle(null, null, " "));
    		assertTrue(isWordStyle(null, null, " "));
    		assertTrue(isWordStyle(null, null, " " + String.valueOf(StringTokenizer.END_OF_STRINGS)));
    		assertTrue(isWordStyle(null, null, " " + String.valueOf(StringTokenizer.END_OF_STRINGS) + " "));
    		assertTrue(isWordStyle(null, null, " " + StringTokenizer.END_OF_STRINGS + " "));
    		
    		assertTrue(!isWordStyle(null, null, " " + String.valueOf(StringTokenizer.END_OF_STRINGS) + " "));
    		StringTokenizer st = new StringTokenizer(" " + String.valueOf(StringTokenizer.END_OF_STRINGS),", ");
    		StringTokenizer st2 = new StringTokenizer(" " + String.valueOf(StringTokenizer.END_OF_STRINGS) + " ");
    		st2 = new StringTokenizer(" ", String.valueOf(StringTokenizer.END_OF_STRINGS));
    		assertTrue(!isString( "1,2,3,4" + String.valueOf(StringTokenizer.END_OF_STRINGS)));
    		assertTrue(isString( "1" + String.valueOf(StringTokenizer.END_OF_STRINGS)));
    		assertTrue(isString( "1,2,3" + String.valueOf(StringTokenizer.END_OF_STRINGS)));
    		assertTrue(isString( "1" + String.valueOf(StringTokenizer.END_OF_STRINGS)));
    		
}
}