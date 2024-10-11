package timestamp;
// TimeStamp_9Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#hashCode()} method.
*/
class TimeStamp_9Test {
    /**
     * Test case for hashCode method.
     * It tests if two TimeStamp objects with the same ntpTime have the same hash code.
     */
    @Test
    void testHashCodeEquality() {
        TimeStamp ts1 = new TimeStamp(0x12345678L);
        TimeStamp ts2 = new TimeStamp(0x12345678L);
        assertEquals(ts1.hashCode(), ts2.hashCode(), "Hash codes should be equal for the same ntpTime");
    }

    /**
     * Test case for hashCode method.
     * It tests if two TimeStamp objects with different ntpTime have different hash codes.
     */
    @Test
    void testHashCodeInequality() {
        TimeStamp ts1 = new TimeStamp(0x12345678L);
        TimeStamp ts2 = new TimeStamp(0x87654321L);
        assertNotEquals(ts1.hashCode(), ts2.hashCode(), "Hash codes should be different for different ntpTime");
    }

    /**
     * Test case for hashCode method.
     * It tests if the hash code is consistent for the same TimeStamp object.
     */
    @Test
    void testHashCodeConsistency() {
        TimeStamp ts = new TimeStamp(0x12345678L);
        int initialHashCode = ts.hashCode();
        assertEquals(initialHashCode, ts.hashCode(), "Hash code should be consistent for the same object");
    }

    /**
     * Test case for hashCode method.
     * It tests if the hash code is correctly calculated for a known ntpTime.
     */
    @Test
    void testHashCodeKnownValue() {
        TimeStamp ts = new TimeStamp(0x12345678L);
        int expectedHashCode = (int) (0x12345678L ^ (0x12345678L >>> 32));
        assertEquals(expectedHashCode, ts.hashCode(), "Hash code should match the expected value");
    }

    /**
     * Test case for hashCode method.
     * It tests if the hash code is correctly calculated for a zero ntpTime.
     */
    @Test
    void testHashCodeZeroValue() {
        TimeStamp ts = new TimeStamp(0L);
        assertEquals(0, ts.hashCode(), "Hash code should be zero for ntpTime of zero");
    }

    /**
     * Test case for hashCode method.
     * It tests if the hash code is correctly calculated for a negative ntpTime.
     */
    @Test
    void testHashCodeNegativeValue() {
        TimeStamp ts = new TimeStamp(-0x12345678L);
        int expectedHashCode = (int) (-0x12345678L ^ (-0x12345678L >>> 32));
        assertEquals(expectedHashCode, ts.hashCode(), "Hash code should match the expected value for negative ntpTime");
    }

    /**
     * Test case for hashCode method.
     * It tests if the hash code is correctly calculated for the maximum long value.
     */
    @Test
    void testHashCodeMaxValue() {
        TimeStamp ts = new TimeStamp(Long.MAX_VALUE);
        int expectedHashCode = (int) (Long.MAX_VALUE ^ (Long.MAX_VALUE >>> 32));
        assertEquals(expectedHashCode, ts.hashCode(), "Hash code should match the expected value for Long.MAX_VALUE");
    }

    /**
     * Test case for hashCode method.
     * It tests if the hash code is correctly calculated for the minimum long value.
     */
    @Test
    void testHashCodeMinValue() {
        TimeStamp ts = new TimeStamp(Long.MIN_VALUE);
        int expectedHashCode = (int) (Long.MIN_VALUE ^ (Long.MIN_VALUE >>> 32));
        assertEquals(expectedHashCode, ts.hashCode(), "Hash code should match the expected value for Long.MIN_VALUE");
    }

    /**
     * Test case for hashCode method.
     * It tests if the hash code is correctly calculated for a random ntpTime.
     */
    @Test
    void testHashCodeRandomValue() {
        long randomNtpTime = 0xABCDEF1234567890L;
        TimeStamp ts = new TimeStamp(randomNtpTime);
        int expectedHashCode = (int) (randomNtpTime ^ (randomNtpTime >>> 32));
        assertEquals(expectedHashCode, ts.hashCode(), "Hash code should match the expected value for random ntpTime");
    }
}