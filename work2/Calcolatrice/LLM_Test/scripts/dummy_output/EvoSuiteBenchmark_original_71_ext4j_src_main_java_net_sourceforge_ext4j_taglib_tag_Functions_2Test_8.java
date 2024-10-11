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
		
	private final static String toString = new String("toString");
	private final static char firstChar = toString.charAt(1);
	private final static char secondChar = toString.charAt(2);
	private final static String TEN_TOKEN = "_";
	String input;
	String expected;

	private Functions_2Test(){
	}

    /*
     * Test the {@link Functions#getDate()} method.
     */
    @Test
    public void test_getDate(){
	    final String input = "2004-12-12 12:12:12";
	    String expected = "13:12:12";
	    Date actual = Functions.getDate(input);

	    System.out.println("getDate: " + expected);

	    assertEquals(expected, actual.toString());
    }

    /*
     * Test the {@link Functions#replace()} method.
     */
    @Test
    public void test_replace(){
	    final String input = "2003-02-01 12:12:12";
	    String expected = "2003-02-03 12:12:12";
	    String replaced = Functions.replace(input, TEN_TOKEN, BLURB_SUFFIX);
	    System.out.println("replaced: " + replaced);

	    assertEquals(expected, replaced);
    }

    /*
     * Test the {@link Functions#decimalFormat()} method.
     */
    @Test
    public void test_decimalFormat(){
	    System.out.println("Decimal format test:");
	    DecimalFormat formatter = new DecimalFormat(UNDERSCORE);
	    formatter.setMaximumFractionDigits(4);
	    formatter.setMinimumFractionDigits(4);
       
	    String expected = "18.6,59";
	    String actual = Functions.decimalFormat(formatter, UNDERSCORE);

	    System.out.println("actual: " + actual);
	    System.out.println("expected: " + expected);
    }

    /*
     * Test the {@link Functions#numberInWord()} method.
     */
    @Test
    public void test_numberInWord(){
	    String input = "13";
	    String expected = "1";
}
}