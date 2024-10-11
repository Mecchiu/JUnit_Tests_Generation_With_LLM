package timestamp;
// TimeStamp_6Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#getNtpTime(long)} method.
*/
class TimeStamp_6Test {
    /**
     * Test case for verifying the conversion of Java time to NTP time.
     * This test checks if the conversion is consistent and reversible.
     */
    @Test
    void testJavaToNtpConversion() {
        long currentTimeMillis = System.currentTimeMillis();
        TimeStamp ntpTimeStamp = TimeStamp.getNtpTime(currentTimeMillis);
        long convertedBackTimeMillis = ntpTimeStamp.getTime();
        
        // Allow a small margin of error due to precision loss
        assertTrue(Math.abs(currentTimeMillis - convertedBackTimeMillis) < 1);
    }

    /**
     * Test case for verifying the conversion of NTP time to Java time.
     * This test checks if the conversion is consistent and reversible.
     */
    @Test
    void testNtpToJavaConversion() {
        TimeStamp currentNtpTimeStamp = TimeStamp.getCurrentTime();
        long javaTimeMillis = currentNtpTimeStamp.getTime();
        TimeStamp convertedNtpTimeStamp = TimeStamp.getNtpTime(javaTimeMillis);
        
        // Allow a small margin of error due to precision loss
        assertEquals(currentNtpTimeStamp.ntpValue(), convertedNtpTimeStamp.ntpValue());
    }

    /**
     * Test case for verifying the conversion of a specific date to NTP time.
     */
    @Test
    void testSpecificDateToNtpConversion() {
        Date specificDate = new Date(0); // Epoch time
        TimeStamp ntpTimeStamp = new TimeStamp(specificDate);
        long expectedNtpValue = TimeStamp.toNtpTime(0);
        
        assertEquals(expectedNtpValue, ntpTimeStamp.ntpValue());
    }

    /**
     * Test case for verifying the conversion of NTP time to a specific date.
     */
    @Test
    void testNtpToSpecificDateConversion() {
        long ntpValue = TimeStamp.toNtpTime(0); // Epoch time
        TimeStamp ntpTimeStamp = new TimeStamp(ntpValue);
        Date expectedDate = new Date(0);
        
        assertEquals(expectedDate, ntpTimeStamp.getDate());
    }

    /**
     * Test case for verifying the string representation of NTP time.
     */
    @Test
    void testNtpTimeToString() {
        long ntpValue = TimeStamp.toNtpTime(0); // Epoch time
        TimeStamp ntpTimeStamp = new TimeStamp(ntpValue);
        String expectedString = "00000000.00000000";
        
        assertEquals(expectedString, ntpTimeStamp.toString());
    }

    /**
     * Test case for verifying the equality of two identical NTP timestamps.
     */
    @Test
    void testEqualNtpTimestamps() {
        long ntpValue = TimeStamp.toNtpTime(0); // Epoch time
        TimeStamp ntpTimeStamp1 = new TimeStamp(ntpValue);
        TimeStamp ntpTimeStamp2 = new TimeStamp(ntpValue);
        
        assertEquals(ntpTimeStamp1, ntpTimeStamp2);
    }

    /**
     * Test case for verifying the inequality of two different NTP timestamps.
     */
    @Test
    void testUnequalNtpTimestamps() {
        long ntpValue1 = TimeStamp.toNtpTime(0); // Epoch time
        long ntpValue2 = TimeStamp.toNtpTime(1000); // 1 second later
        TimeStamp ntpTimeStamp1 = new TimeStamp(ntpValue1);
        TimeStamp ntpTimeStamp2 = new TimeStamp(ntpValue2);
        
        assertNotEquals(ntpTimeStamp1, ntpTimeStamp2);
    }

    /**
     * Test case for verifying the hash code consistency of NTP timestamps.
     */
    @Test
    void testNtpTimestampHashCode() {
        long ntpValue = TimeStamp.toNtpTime(0); // Epoch time
        TimeStamp ntpTimeStamp1 = new TimeStamp(ntpValue);
        TimeStamp ntpTimeStamp2 = new TimeStamp(ntpValue);
        
        assertEquals(ntpTimeStamp1.hashCode(), ntpTimeStamp2.hashCode());
    }

    /**
     * Test case for verifying the comparison of two NTP timestamps.
     */
    @Test
    void testNtpTimestampComparison() {
        long ntpValue1 = TimeStamp.toNtpTime(0); // Epoch time
        long ntpValue2 = TimeStamp.toNtpTime(1000); // 1 second later
        TimeStamp ntpTimeStamp1 = new TimeStamp(ntpValue1);
        TimeStamp ntpTimeStamp2 = new TimeStamp(ntpValue2);
        
        assertTrue(ntpTimeStamp1.compareTo(ntpTimeStamp2) < 0);
        assertTrue(ntpTimeStamp2.compareTo(ntpTimeStamp1) > 0);
    }

    /**
     * Test case for verifying the conversion of NTP timestamp to UTC string.
     */
    @Test
    void testNtpTimestampToUTCString() {
        long ntpValue = TimeStamp.toNtpTime(0); // Epoch time
        TimeStamp ntpTimeStamp = new TimeStamp(ntpValue);
        DateFormat utcFormatter = new SimpleDateFormat(TimeStamp.NTP_DATE_FORMAT + " 'UTC'", Locale.US);
        utcFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        String expectedUTCString = utcFormatter.format(new Date(0));
        
        assertEquals(expectedUTCString, ntpTimeStamp.toUTCString());
    }
}