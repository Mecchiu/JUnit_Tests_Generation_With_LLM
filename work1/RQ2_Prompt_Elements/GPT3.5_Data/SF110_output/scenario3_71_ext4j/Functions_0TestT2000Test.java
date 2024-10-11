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
    void testDateFormat() {
        Date date = new Date();
        String pattern = "yyyy-MM-dd";
        String expected = new SimpleDateFormat(pattern).format(date);
        String actual = Functions.dateFormat(date, pattern);
        assertEquals(expected, actual);
    }

    @Test
    void testDateFormatWithTime() {
        Date date = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String expected = new SimpleDateFormat(pattern).format(date);
        String actual = Functions.dateFormat(date, pattern);
        assertEquals(expected, actual);
    }

    @Test
    void testDateFormatWithDifferentPattern() {
        Date date = new Date();
        String pattern = "dd/MM/yyyy";
        String expected = new SimpleDateFormat(pattern).format(date);
        String actual = Functions.dateFormat(date, pattern);
        assertEquals(expected, actual);
    }

    @Test
    void testDateFormatWithNullDate() {
        String pattern = "yyyy-MM-dd";
        String expected = "";
        String actual = Functions.dateFormat(null, pattern);
        assertEquals(expected, actual);
    }

    @Test
    void testDateFormatWithNullPattern() {
        Date date = new Date();
        String expected = date.toString();
        String actual = Functions.dateFormat(date, null);
        assertEquals(expected, actual);
    }

    @Test
    void testDateFormatWithEmptyPattern() {
        Date date = new Date();
        String expected = date.toString();
        String actual = Functions.dateFormat(date, "");
        assertEquals(expected, actual);
    }

    @Test
    void testDateFormatWithInvalidPattern() {
        Date date = new Date();
        String pattern = "invalid pattern";
        String expected = date.toString();
        String actual = Functions.dateFormat(date, pattern);
        assertEquals(expected, actual);
    }

    @Test
    void testDateFormatWithThreadSafety() throws InterruptedException {
        Date date = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String expected = sdf.format(date);
        String actual = Functions.dateFormat(date, pattern);
        assertEquals(expected, actual);
        Thread.sleep(1000);
        expected = sdf.format(new Date());
        actual = Functions.dateFormat(new Date(), pattern);
        assertEquals(expected, actual);
    }

    @Test
    void testDateFormatWithPerformance() {
        Date date = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Functions.dateFormat(date, pattern);
        }
        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start) + " ms");
    }
}