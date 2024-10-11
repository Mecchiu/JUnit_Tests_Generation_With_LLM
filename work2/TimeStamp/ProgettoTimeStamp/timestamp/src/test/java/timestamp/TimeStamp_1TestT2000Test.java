package timestamp;
// TimeStamp_1Test.java


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TimeStamp}.
* It contains ten unit test cases for the {@link TimeStamp#getSeconds()} method.
*/
class TimeStamp_1Test {
    /**
     * Test case for verifying the seconds part of the NTP timestamp.
     * This test checks if the getSeconds() method correctly extracts
     * the high-order 32 bits representing the seconds.
     */
    @Test
    void testGetSeconds() {
        // Test with a known NTP timestamp value
        long ntpTime = 0xc1a089bd00000000L; // Example NTP timestamp
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedSeconds = 0xc1a089bdL; // Expected seconds part
        assertEquals(expectedSeconds, timeStamp.getSeconds(), "The seconds part of the NTP timestamp is incorrect.");
    }

    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp is zero.
     */
    @Test
    void testGetSecondsZero() {
        TimeStamp timeStamp = new TimeStamp(0L);
        assertEquals(0L, timeStamp.getSeconds(), "The seconds part of the NTP timestamp should be zero.");
    }

    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp is at its maximum value.
     */
    @Test
    void testGetSecondsMaxValue() {
        TimeStamp timeStamp = new TimeStamp(0xFFFFFFFFFFFFFFFFL);
        assertEquals(0xFFFFFFFFL, timeStamp.getSeconds(), "The seconds part of the NTP timestamp is incorrect for max value.");
    }

    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp is at its minimum value.
     */
    @Test
    void testGetSecondsMinValue() {
        TimeStamp timeStamp = new TimeStamp(0x8000000000000000L);
        assertEquals(0x80000000L, timeStamp.getSeconds(), "The seconds part of the NTP timestamp is incorrect for min value.");
    }

    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp has only fractional seconds.
     */
    @Test
    void testGetSecondsFractionOnly() {
        long ntpTime = 0x00000000fc904f6dL; // Only fractional part
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        assertEquals(0L, timeStamp.getSeconds(), "The seconds part of the NTP timestamp should be zero when only fractional part is present.");
    }

    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp has both seconds and fractional seconds.
     */
    @Test
    void testGetSecondsWithFraction() {
        long ntpSeconds = 0xc1a089bdL; // Parte dei secondi dell'esempio di timestamp NTP
        long ntpFraction = 0xfc904f6dL; // Parte frazionaria dell'esempio di timestamp NTP

        // Combina i secondi e la frazione nel formato NTP completo (shiftando la frazione di 32 bit)
        long ntpTime = (ntpSeconds << 32) | ntpFraction;

        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedSeconds = 0xc1a089bdL; // Parte dei secondi attesa
        assertEquals(expectedSeconds, timeStamp.getSeconds(), "La parte dei secondi del timestamp NTP è incorretta quando è presente una frazione.");
    }


    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp is negative.
     */
    @Test
    void testGetSecondsNegative() {
        long ntpTime = -0x1a089bd00000000L; // Negative NTP timestamp
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedSeconds = 0xe5f97643L; // Expected seconds part after conversion
        assertEquals(expectedSeconds, timeStamp.getSeconds(), "The seconds part of the NTP timestamp is incorrect for negative value.");
    }

    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp is a random value.
     */
    @Test
    void testGetSecondsRandomValue() {
        long ntpTime = 0x123456789abcdef0L; // Random NTP timestamp
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedSeconds = 0x12345678L; // Expected seconds part
        assertEquals(expectedSeconds, timeStamp.getSeconds(), "The seconds part of the NTP timestamp is incorrect for random value.");
    }

    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp is a large positive value.
     */
    @Test
    void testGetSecondsLargePositive() {
        long ntpTime = 0x7fffffffffffffffL; // Large positive NTP timestamp
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedSeconds = 0x7fffffffL; // Expected seconds part
        assertEquals(expectedSeconds, timeStamp.getSeconds(), "The seconds part of the NTP timestamp is incorrect for large positive value.");
    }

    /**
     * Test case for verifying the seconds part of the NTP timestamp
     * when the timestamp is a large negative value.
     */
    @Test
    void testGetSecondsLargeNegative() {
        long ntpTime = 0x8000000000000001L; // Large negative NTP timestamp
        TimeStamp timeStamp = new TimeStamp(ntpTime);
        long expectedSeconds = 0x80000000L; // Expected seconds part
        assertEquals(expectedSeconds, timeStamp.getSeconds(), "The seconds part of the NTP timestamp is incorrect for large negative value.");
    }
}