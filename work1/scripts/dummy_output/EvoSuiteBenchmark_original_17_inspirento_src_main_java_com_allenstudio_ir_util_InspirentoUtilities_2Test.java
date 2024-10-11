package com.allenstudio.ir.util;
java
import static org.junit.jupiter.api.Assertions.assertEquals;

class InspirentoUtilities_2Test {

    @Test
    void testEscapeText() {
        String input = "This is a <test> string & with 'special' characters";
        String expected = "This is a &lt;test&gt; string &amp; with &apos;special&apos; characters";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }

    @Test
    void testEscapeText_EmptyString() {
        String input = "";
        String expected = "";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }

    @Test
    void testEscapeText_NoSpecialCharacters() {
        String input = "No special characters here";
        String expected = "No special characters here";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }

    @Test
    void testEscapeText_OnlySpecialCharacters() {
        String input = "& < > \" '";
        String expected = "&amp; &lt; &gt; &quot; &apos;";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }

    @Test
    void testEscapeText_WithMixedCharacters() {
        String input = "Special &amp; characters &lt; here &gt;";
        String expected = "Special &amp;amp; characters &amp;lt; here &amp;gt;";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }

    @Test
    void testEscapeText_WithNumbers() {
        String input = "123 & 456 < 789 >";
        String expected = "123 &amp; 456 &lt; 789 &gt;";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }

    @Test
    void testEscapeText_WithSpecialCharacters() {
        String input = "!@#$%^*()_+-={}[]|\\:;\"'<>,.?/";
        String expected = "!@#$%^*()_+-={}[]|\\:;\"'&lt;&gt;,.?/";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }

    @Test
    void testEscapeText_WithWhitespace() {
        String input = "   Test   ";
        String expected = "   Test   ";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }

    @Test
    void testEscapeText_WithTabsAndNewlines() {
        String input = "\tTest\n";
        String expected = "\tTest\n";
        String result = InspirentoUtilities.escapeText(input);
        assertEquals(expected, result);
    }
}
