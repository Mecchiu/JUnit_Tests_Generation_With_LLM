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


    @Test
    public void test_constructor_withOneParameter_whenConstruct() {
        Date date = new Date();
        Date date1 = new Date();
        date.setTime(date1.getTime());
        String stringParameter = "12345678";
        int minutes = 12345678;
        int hours = 12345678;
        long days = 345678L;
        long minutesSeconds = 1234578L;
        long milliseconds = 12345678L;
        long millisecondsSeconds = 12345678L;
        long millisecondsMilliseconds = 12345678L;

        Functions functions = new Functions();
        assertNotNull(functions);
//        assertEquals(FunctionType.INVALID, functions.getType("invalid"));
        assertNotNull(functions.getType("now"));
        assertNotNull(functions.getType("dateToMilliseconds"));
        assertNotNull(functions.getType("dateToMilliseconds("));
        assertNotNull(functions.getType("("));
        assertNotNull(functions.getType("(Date"));
        assertNotNull(functions.getType("()"));
        assertNotNull(functions.getType("() Date"));
//        assertNotNull(functions.getType("$"));
//        assertNotNull(functions.getType("("));
//        assertNotNull(functions.getType("(Date"));
        assertNotNull(functions.getType("{"));
        assertNotNull(functions.getType("{}"));
        assertNotNull(functions.getType("}"));
        assertNotNull(functions.getType("("));
        assertNotNull(functions.getType("(String)"));
        assertNotNull(functions.getType("+"));
        assertNotNull(functions.getType("-"));
        assertNotNull(functions.getType("*"));
        assertNotNull(functions.getType("/"));
        assertNotNull(functions.getType("|"));
        assertNotNull(functions.getType("="));
        assertNotNull(functions.getType("<"));
        assertNotNull(functions.getType(">"));
        assertNotNull(functions.getType("("));
        assertNotNull(functions.getType("+ ("));
        assertNotNull(functions.getType("- ("));
        assertNotNull(functions.getType("| ("));
        assertNotNull(functions.getType(")"));
        assertNotNull(functions.getType("("));
        assertNotNull(functions.getType(")"));
        assertNotNull(functions.getType("$ "));
        assertNotNull(functions.getType("$ ("));
        assertNotNull(functions.getType("$ ("));
        assertNotNull(functions.getType("$ $"));
        assertNotNull(functions.getType("$ $"));
        assertNotNull(functions.getType("$ #"));
        assertNotNull(functions.getType("$ # ("));
        assertNotNull(functions.getType("$ # ("));
        assertNotNull(functions.getType("$ +"));
        assertNotNull(functions.getType("$ + ("));
        assertNotNull(functions.getType("$ + ($"));
        assertNotNull(functions.getType("+ #"));
        assertNotNull(functions.getType("+ # ("));
        assertNotNull(functions.getType("+ # ("));
        assertNotNull(functions.getType("+ # $"));
        assertNotNull(functions.getType("+ # $ ("));
        assertNotNull(functions.getType("+ $ +"));
        assertNotNull(functions.getType("+ $ + ("));
        assertNotNull(functions.getType("+ $ + ("));
        assertNotNull(functions.getType("+ $ + $"));
        assertNotNull(functions.getType("+ $ + $ ("));
        assertNotNull(functions.getType("+ $ + $"));
        assertNotNull(functions.getType("+ $ + #"));
        assertNotNull(functions.getType("+ $ + # ("));
        assertNotNull(functions.getType("+ $ + # ("));
        assertNotNull(functions.getType("+ $ + $"));
        assertNotNull(functions.getType("+ $ + $ ("));
        assertNotNull(functions.getType("$ + + #"));
        assertNotNull(functions.getType("$ + + # ("));
        assertNotNull(functions.getType("\u00A9 + + "));
//        assertNotNull(functions.getType("{@"));
//        assertNotNull(functions.getType("()"));
//        assertNotNull(functions.getType("\n"));
//        assertNotNull(functions.getType("\n + "));

        assertEquals(functions.getType("\"test\""),null); // It must not equal "<"
        assertEquals(functions.getType("[\"test\"]"),null); // It must not equal <[[

        assertEquals(functions.getType("\"test\"[0]"),null);
        assertEquals(functions.getType("\"test\"[1]"),null);
        assertEquals(functions.getType(""),"test");
//        assertEquals(functions.getType("\"test\".replace('\\\\','\\')"), null);
//        assertEquals(functions.getType("\"test\".replaceRight('\\\\', '\\')"), null);
//        assertEquals(functions.getType("\"test\".replaceFirst('\\\\','\\')"), null);
//        assertEquals(functions.getType("\"test\".replaceUntil('\\\\', '\\')"), null);
//        assertEquals(functions.getType("\"test\".replaceUntilLeft('\\\\', '\\')"), null);
//        assertEquals(functions.getType("\"test\".replace(null,'')"), null);
//        assertEquals(functions.getType("\"test\".count()"), 3L);
//        assertEquals(functions.getType("\"test\".indexOf('a')"),  2);
    }

	@Test
	public void test_constructor_withOneParameter_whenEquationWithNotEquals() {
		Functions functions = new Functions();
		assertNotNull(functions);
//        assertEquals(FunctionType.INVALID, functions.get