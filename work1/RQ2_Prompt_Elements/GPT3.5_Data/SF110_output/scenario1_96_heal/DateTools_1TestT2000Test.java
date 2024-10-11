Here's the code for the test class:

```
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date, String)} method.
*/
class DateTools_1Test {

    @Test
    void testFormatWithNullDate() {
        assertNull(DateTools.format(null, "yyyy-MM-dd"));
    }

    @Test
    void testFormatWithValidDateAndFormat() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date, "yyyy-MM-dd"));
    }

    @Test
    void testFormatWithInvalidFormat() {
        Date date = new Date();
        assertThrows(IllegalArgumentException.class, () -> {
            DateTools.format(date, "invalid format");
        });
    }

    @Test
    void testFormatWithEmptyFormat() {
        Date date = new Date();
        assertThrows(IllegalArgumentException.class, () -> {
            DateTools.format(date, "");
        });
    }

    @Test
    void testFormatWithNullFormat() {
        Date date = new Date();
        assertThrows(IllegalArgumentException.class, () -> {
            DateTools.format(date, null);
        });
    }

    @Test
    void testFormatWithDefaultFormat() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        assertEquals(formatter.format(date), DateTools.format(date, null));
    }

    @Test
    void testFormatWithDifferentFormats() throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2021-01-01");
        assertEquals("2021-01-01", DateTools.format(date, "yyyy-MM-dd"));
        assertEquals("2021-01-01 00:00:00", DateTools.format(date, "yyyy-MM-dd HH:mm:ss"));
        assertEquals("01/01/2021", DateTools.format(date, "dd/MM/yyyy"));
    }

    @Test
    void testFormatWithDifferentDates() throws ParseException {
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2021-01-01");
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse("2022-02-02");
        assertEquals("2021-01-01", DateTools.format(date1, "yyyy-MM-dd"));
        assertEquals("2022-02-02", DateTools.format(date2, "yyyy-MM-dd"));
    }

    @Test
    void testFormatWithThreadSafety() throws InterruptedException {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String expected = formatter.format(date);
        String[] results = new String[2];
        Thread thread1 = new Thread(() -> {
            results[0] = DateTools.format(date, null);
        });
        Thread thread2 = new Thread(() -> {
            results[1] = DateTools.format(date, null);
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        assertEquals(expected, results[0]);
        assertEquals(expected, results[1]);
    }

    @Test
    void testFormatWithPerformance() {
        Date date = new Date();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            DateTools.format(date, "yyyy-MM-dd HH:mm:ss");
        }
        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start) + " ms");
    }
}
```