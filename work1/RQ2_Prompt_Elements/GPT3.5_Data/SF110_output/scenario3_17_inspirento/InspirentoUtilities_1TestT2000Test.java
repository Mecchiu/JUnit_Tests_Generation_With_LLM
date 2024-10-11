// Here's an example implementation of the InspirentoUtilities class with the escapeText method:

// InspirentoUtilities.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Wraps some static utility method employed
 * in Inspirento.
 *
 * @author Allen Chue
 */
public class InspirentoUtilities {

    /**
     * Replaces all characters that may
     * affect program's normal running in the string
     * with the escape strings in HTML.
     *
     * @param str source string
     * @return a string which is processed
     */
    public static String escapeText(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '&':
                    sb.append("&amp;");
                    break;
                case '<':
                    sb.append("&lt;");
                    break;
                case '>':
                    sb.append("&gt;");
                    break;
                case '\"':
                    sb.append("&quot;");
                    break;
                case '\'':
                    sb.append("&#39;");
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }
}

// And here's an example test class for the escapeText method:

// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InspirentoUtilities}.
 * It contains ten unit test cases for the {@link InspirentoUtilities#escapeText(String)} method.
 */
class InspirentoUtilities_1Test {

    @Test
    void testEscapeTextNull() {
        assertNull(InspirentoUtilities.escapeText(null));
    }

    @Test
    void testEscapeTextEmpty() {
        assertEquals("", InspirentoUtilities.escapeText(""));
    }

    @Test
    void testEscapeTextNoSpecialChars() {
        String input = "This is a test string.";
        assertEquals(input, InspirentoUtilities.escapeText(input));
    }

    @Test
    void testEscapeTextAmpersand() {
        String input = "This & that";
        String expected = "This &amp; that";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    void testEscapeTextLessThan() {
        String input = "3 < 5";
        String expected = "3 &lt; 5";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    void testEscapeTextGreaterThan() {
        String input = "5 > 3";
        String expected = "5 &gt; 3";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    void testEscapeTextDoubleQuote() {
        String input = "She said, \"Hello.\"";
        String expected = "She said, &quot;Hello.&quot;";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    void testEscapeTextSingleQuote() {
        String input = "It's raining outside.";
        String expected = "It&#39;s raining outside.";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    void testEscapeTextMixed() {
        String input = "This & that < 5";
        String expected = "This &amp; that &lt; 5";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }

    @Test
    void testEscapeTextLongString() {
        String input = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat. Duis semper. Duis arcu massa, scelerisque vitae, consequat in, pretium a, enim. Pellentesque congue. Ut in risus volutpat libero pharetra tempor. Cras vestibulum bibendum augue. Praesent egestas leo in pede. Praesent blandit odio eu enim. Pellentesque sed dui ut augue blandit sodales. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam nibh. Mauris ac mauris sed pede pellentesque fermentum. Maecenas adipiscing ante non diam sodales hendrerit.";
        String expected = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus. Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor. Cras elementum ultrices diam. Maecenas ligula massa, varius a, semper congue, euismod non, mi. Proin porttitor, orci nec nonummy molestie, enim est eleifend mi, non fermentum diam nisl sit amet erat. Duis semper. Duis arcu massa, scelerisque vitae, consequat in, pretium a, enim. Pellentesque congue. Ut in risus volutpat libero pharetra tempor. Cras vestibulum bibendum augue. Praesent egestas leo in pede. Praesent blandit odio eu enim. Pellentesque sed dui ut augue blandit sodales. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aliquam nibh. Mauris ac mauris sed pede pellentesque fermentum. Maecenas adipiscing ante non diam sodales hendrerit.";
        assertEquals(expected, InspirentoUtilities.escapeText(input));
    }
}