// TimeStamp_10Test.java

package timestamp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#equals(Object)} method.
*/
class TimeStamp_10Test {
    /**
     * Test case for equals method with identical TimeStamp objects.
     */
    @Test
    void testEqualsIdentical() {
        TimeStamp ts1 = new TimeStamp(0x12345678L);
        TimeStamp ts2 = new TimeStamp(0x12345678L);
        assertTrue(ts1.equals(ts2), "Identical TimeStamps should be equal");
    }

    /**
     * Test case for equals method with different TimeStamp objects.
     */
    @Test
    void testEqualsDifferent() {
        TimeStamp ts1 = new TimeStamp(0x12345678L);
        TimeStamp ts2 = new TimeStamp(0x87654321L);
        assertFalse(ts1.equals(ts2), "Different TimeStamps should not be equal");
    }

    /**
     * Test case for equals method with null object.
     */
    @Test
    void testEqualsNull() {
        TimeStamp ts1 = new TimeStamp(0x12345678L);
        assertFalse(ts1.equals(null), "TimeStamp should not be equal to null");
    }

    /**
     * Test case for equals method with different object type.
     */
    @Test
    void testEqualsDifferentType() {
        TimeStamp ts1 = new TimeStamp(0x12345678L);
        String notATimeStamp = "Not a TimeStamp";
        assertFalse(ts1.equals(notATimeStamp), "TimeStamp should not be equal to a different object type");
    }

    /**
     * Test case for equals method with itself.
     */
    @Test
    void testEqualsItself() {
        TimeStamp ts1 = new TimeStamp(0x12345678L);
        assertTrue(ts1.equals(ts1), "TimeStamp should be equal to itself");
    }

    /**
     * Test case for equals method with TimeStamp created from Date.
     */
    @Test
    void testEqualsFromDate() {
        Date date = new Date();
        TimeStamp ts1 = new TimeStamp(date);
        TimeStamp ts2 = new TimeStamp(date);
        assertTrue(ts1.equals(ts2), "TimeStamps created from the same Date should be equal");
    }

    /**
     * Test case for equals method with TimeStamp created from hex string.
     */
    @Test
    void testEqualsFromHexString() {
        TimeStamp ts1 = new TimeStamp("12345678.9abcdef0");
        TimeStamp ts2 = new TimeStamp("12345678.9abcdef0");
        assertTrue(ts1.equals(ts2), "TimeStamps created from the same hex string should be equal");
    }

    /**
     * Test case for equals method with TimeStamp created from different hex strings.
     */
    @Test
    void testEqualsFromDifferentHexString() {
        TimeStamp ts1 = new TimeStamp("12345678.9abcdef0");
        TimeStamp ts2 = new TimeStamp("87654321.0fedcba9");
        assertFalse(ts1.equals(ts2), "TimeStamps created from different hex strings should not be equal");
    }

    /**
     * Test case for equals method with TimeStamp created from current time.
     */
    @Test
    void testEqualsCurrentTime() {
        TimeStamp ts1 = TimeStamp.getCurrentTime();
        TimeStamp ts2 = TimeStamp.getCurrentTime();
        assertFalse(ts1.equals(ts2), "TimeStamps created from current time should not be equal due to time difference");
    }

    /**
     * Test case for equals method with TimeStamp created from zero time.
     */
    @Test
    void testEqualsZeroTime() {
        TimeStamp ts1 = new TimeStamp(0L);
        TimeStamp ts2 = new TimeStamp(0L);
        assertTrue(ts1.equals(ts2), "TimeStamps created from zero time should be equal");
    }
}