// Functions_0Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Functions}.
 * It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
 */
class Functions_0Test {

    @Test
    void testDateFormat_NullDate() {
        String oResult = Functions.dateFormat(null, "yyyy-MM-dd");
        assertEquals("", oResult);
    }

    @Test
    void testDateFormat_EmptyPattern() {
        Date oDate = new Date();
        String oResult = Functions.dateFormat(oDate, "");
        assertEquals("", oResult);
    }

    @Test
    void testDateFormat_NullPattern() {
        Date oDate = new Date();
        String oResult = Functions.dateFormat(oDate, null);
        assertEquals("", oResult);
    }

    @Test
    void testDateFormat_InvalidPattern() {
        Date oDate = new Date();
        String oResult = Functions.dateFormat(oDate, "invalid pattern");
        assertEquals("", oResult);
    }

    @Test
    void testDateFormat_ValidPattern() {
        Date oDate = new Date();
        String oResult = Functions.dateFormat(oDate, "yyyy-MM-dd");
        SimpleDateFormat oFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String oExpected = oFormatter.format(oDate);
        assertEquals(oExpected, oResult);
    }

    @Test
    void testDateFormat_InvalidDate() {
        String oResult = Functions.dateFormat(new Date(Long.MAX_VALUE), "yyyy-MM-dd");
        assertEquals("", oResult);
    }

    @Test
    void testDateFormat_ValidDate() {
        Date oDate = new Date();
        String oResult = Functions.dateFormat(oDate, "yyyy-MM-dd");
        SimpleDateFormat oFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String oExpected = oFormatter.format(oDate);
        assertEquals(oExpected, oResult);
    }

    @Test
    void testDateFormat_InvalidDateTime() {
        String oResult = Functions.dateFormat(new Date(Long.MAX_VALUE), "yyyy-MM-dd HH:mm:ss");
        assertEquals("", oResult);
    }

    @Test
    void testDateFormat_ValidDateTime() {
        Date oDate = new Date();
        String oResult = Functions.dateFormat(oDate, "yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat oFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String oExpected = oFormatter.format(oDate);
        assertEquals(oExpected, oResult);
    }
}