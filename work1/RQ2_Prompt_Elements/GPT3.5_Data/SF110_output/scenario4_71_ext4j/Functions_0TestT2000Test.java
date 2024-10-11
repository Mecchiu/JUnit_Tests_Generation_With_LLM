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
    void testDateFormatWithNullDate() {
        String result = Functions.dateFormat(null, "yyyy-MM-dd");
        assertNull(result);
    }

    @Test
    void testDateFormatWithNullPattern() {
        Date date = new Date();
        String result = Functions.dateFormat(date, null);
        assertNull(result);
    }

    @Test
    void testDateFormatWithEmptyPattern() {
        Date date = new Date();
        String result = Functions.dateFormat(date, "");
        assertNull(result);
    }

    @Test
    void testDateFormatWithInvalidPattern() {
        Date date = new Date();
        String result = Functions.dateFormat(date, "invalid pattern");
        assertNull(result);
    }

    @Test
    void testDateFormatWithValidPattern() {
        Date date = new Date();
        String result = Functions.dateFormat(date, "yyyy-MM-dd");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String expected = sdf.format(date);
        assertEquals(expected, result);
    }

    @Test
    void testDateFormatWithDifferentPattern() {
        Date date = new Date();
        String result = Functions.dateFormat(date, "dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String expected = sdf.format(date);
        assertEquals(expected, result);
    }

    @Test
    void testDateFormatWithLongPattern() {
        Date date = new Date();
        String result = Functions.dateFormat(date, "yyyy-MM-dd HH:mm:ss.SSS");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String expected = sdf.format(date);
        assertEquals(expected, result);
    }

    @Test
    void testDateFormatWithShortPattern() {
        Date date = new Date();
        String result = Functions.dateFormat(date, "yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String expected = sdf.format(date);
        assertEquals(expected, result);
    }

    @Test
    void testDateFormatWithSpecialCharacters() {
        Date date = new Date();
        String result = Functions.dateFormat(date, "dd/MM/yyyy 'at' HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy 'at' HH:mm:ss");
        String expected = sdf.format(date);
        assertEquals(expected, result);
    }

    @Test
    void testDateFormatWithSingleQuote() {
        Date date = new Date();
        String result = Functions.dateFormat(date, "yyyy-MM-dd'T'HH:mm:ss.SSS");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        String expected = sdf.format(date);
        assertEquals(expected, result);
    }
}