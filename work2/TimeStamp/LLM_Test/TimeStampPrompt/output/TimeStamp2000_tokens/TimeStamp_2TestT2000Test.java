package timestamp;
// TimeStamp_2Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#getFraction()} method.
*/
class TimeStamp_2Test {
    /**
     * Test case for verifying the fractional seconds of an NTP timestamp.
     */
    @Test
    void testGetFraction() {
        // Test with a known NTP timestamp
        TimeStamp timeStamp = new TimeStamp(0x83aa7e80L << 32 | 0x00000000L);
        assertEquals(0x00000000L, timeStamp.getFraction(), "Fractional part should be zero.");

        // Test with a fractional part
        timeStamp = new TimeStamp(0x83aa7e80L << 32 | 0x80000000L);
        assertEquals(0x80000000L, timeStamp.getFraction(), "Fractional part should be 0x80000000.");

        // Test with maximum fractional part
        timeStamp = new TimeStamp(0x83aa7e80L << 32 | 0xffffffffL);
        assertEquals(0xffffffffL, timeStamp.getFraction(), "Fractional part should be 0xffffffff.");

        // Test with a random fractional part
        timeStamp = new TimeStamp(0x83aa7e80L << 32 | 0x12345678L);
        assertEquals(0x12345678L, timeStamp.getFraction(), "Fractional part should be 0x12345678.");
    }

    /**
     * Test case for verifying the fractional seconds of an NTP timestamp with zero seconds.
     */
    @Test
    void testGetFractionWithZeroSeconds() {
        // Test with zero seconds and a fractional part
        TimeStamp timeStamp = new TimeStamp(0x00000000L << 32 | 0x80000000L);
        assertEquals(0x80000000L, timeStamp.getFraction(), "Fractional part should be 0x80000000.");

        // Test with zero seconds and maximum fractional part
        timeStamp = new TimeStamp(0x00000000L << 32 | 0xffffffffL);
        assertEquals(0xffffffffL, timeStamp.getFraction(), "Fractional part should be 0xffffffff.");
    }

    /**
     * Test case for verifying the fractional seconds of an NTP timestamp with maximum seconds.
     */
    @Test
    void testGetFractionWithMaxSeconds() {
        // Test with maximum seconds and a fractional part
        TimeStamp timeStamp = new TimeStamp(0xffffffffL << 32 | 0x80000000L);
        assertEquals(0x80000000L, timeStamp.getFraction(), "Fractional part should be 0x80000000.");

        // Test with maximum seconds and maximum fractional part
        timeStamp = new TimeStamp(0xffffffffL << 32 | 0xffffffffL);
        assertEquals(0xffffffffL, timeStamp.getFraction(), "Fractional part should be 0xffffffff.");
    }

    /**
     * Test case for verifying the fractional seconds of an NTP timestamp with random values.
     */
    @Test
    void testGetFractionWithRandomValues() {
        // Test with random seconds and fractional part
        TimeStamp timeStamp = new TimeStamp(0x12345678L << 32 | 0x9abcdef0L);
        assertEquals(0x9abcdef0L, timeStamp.getFraction(), "Fractional part should be 0x9abcdef0.");
    }
}