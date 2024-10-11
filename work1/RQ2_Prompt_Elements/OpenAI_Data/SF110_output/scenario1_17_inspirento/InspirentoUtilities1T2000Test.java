// InspirentoUtilitiesTest.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilitiesTest {

	@Test
	void testEscapeText() {
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
	}
}

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

    public static String escapeText(String str) {
        StringBuffer buffer = new StringBuffer(str);
        stringReplaceAll(buffer, '&', "&amp;");
        stringReplaceAll(buffer, '<', "&lt;");
        stringReplaceAll(buffer, '>', "&gt;");
        stringReplaceAll(buffer, '"', "&quot;");
        stringReplaceAll(buffer, '\'', "&apos;");
        return buffer.toString();
    }
}

// InspirentoUtilitiesTest.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilitiesTest {
		
	@Test
	void testEscapeText() {
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
	}
}

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

    public static String escapeText(String str) {
        StringBuffer buffer = new StringBuffer(str);
        stringReplaceAll(buffer, '&', "&amp;");
        stringReplaceAll(buffer, '<', "&lt;");
        stringReplaceAll(buffer, '>', "&gt;");
        stringReplaceAll(buffer, '"', "&quot;");
        stringReplaceAll(buffer, '\'', "&apos;");
        return buffer.toString();
    }
}

// InspirentoUtilitiesTest.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilitiesTest {
		
	@Test
	void testEscapeText() {
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"\'"));
	}