// Source code for JCLO_1Test.java

package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link JCLO}.
 * It contains ten unit test cases for the {@link JCLO#usage()} method.
 */
class JCLO_1Test {

    /**
     * Test case for empty usage message.
     */
    @Test
    void testEmptyUsage() {
        JCLO jclo = new JCLO();
        String expected = "";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for single option usage message.
     */
    @Test
    void testSingleOptionUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = false;
        jclo.prefix = "-";
        jclo.doubleDashes = false;
        jclo.help = false;
        jclo.verbose = false;
        String expected = "-additional\n-help\n-prefix\n-verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for multiple option usage message.
     */
    @Test
    void testMultipleOptionUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = false;
        jclo.prefix = "-";
        jclo.doubleDashes = false;
        jclo.help = false;
        jclo.verbose = false;
        jclo.debug = false;
        jclo.quiet = false;
        String expected = "-additional\n-debug\n-help\n-prefix\n-quiet\n-verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for usage message with prefix.
     */
    @Test
    void testPrefixUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = false;
        jclo.prefix = "test";
        jclo.doubleDashes = false;
        jclo.help = false;
        jclo.verbose = false;
        String expected = "-additional\n-help\n-verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for usage message with double dashes.
     */
    @Test
    void testDoubleDashesUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = false;
        jclo.prefix = "-";
        jclo.doubleDashes = true;
        jclo.help = false;
        jclo.verbose = false;
        String expected = "--additional\n--help\n--prefix\n--verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for usage message with help option.
     */
    @Test
    void testHelpOptionUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = false;
        jclo.prefix = "-";
        jclo.doubleDashes = false;
        jclo.help = true;
        jclo.verbose = false;
        String expected = "-additional\n-help\n-prefix\n-verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for usage message with verbose option.
     */
    @Test
    void testVerboseOptionUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = false;
        jclo.prefix = "-";
        jclo.doubleDashes = false;
        jclo.help = false;
        jclo.verbose = true;
        String expected = "-additional\n-help\n-prefix\n-verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for usage message with debug and quiet options.
     */
    @Test
    void testDebugAndQuietOptionsUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = false;
        jclo.prefix = "-";
        jclo.doubleDashes = false;
        jclo.help = false;
        jclo.verbose = false;
        jclo.debug = true;
        jclo.quiet = true;
        String expected = "-additional\n-debug\n-help\n-prefix\n-quiet\n-verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for usage message with additional option.
     */
    @Test
    void testAdditionalOptionUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = true;
        jclo.prefix = "-";
        jclo.doubleDashes = false;
        jclo.help = false;
        jclo.verbose = false;
        String expected = "-help\n-prefix\n-verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }

    /**
     * Test case for usage message with all options.
     */
    @Test
    void testAllOptionsUsage() {
        JCLO jclo = new JCLO();
        jclo.additional = true;
        jclo.prefix = "test";
        jclo.doubleDashes = true;
        jclo.help = true;
        jclo.verbose = true;
        jclo.debug = true;
        jclo.quiet = true;
        String expected = "--additional\n--debug\n--help\n--prefix\n--quiet\n--verbose\n";
        String actual = jclo.usage();
        assertEquals(expected, actual);
    }
}