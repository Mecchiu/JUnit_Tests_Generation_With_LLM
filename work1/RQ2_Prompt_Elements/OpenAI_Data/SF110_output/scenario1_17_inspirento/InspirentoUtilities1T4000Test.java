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
		assertEquals("&amp;", InspirentoUtilities.escapeText("&"));
		assertEquals("&lt;", InspirentoUtilities.escapeText("<"));
		assertEquals("&gt;", InspirentoUtilities.escapeText(">"));
		assertEquals("&quot;", InspirentoUtilities.escapeText("\""));
		assertEquals("&apos;", InspirentoUtilities.escapeText("'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'&<>\"'"));
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
		assertEquals("&amp;", InspirentoUtilities.escapeText("&"));
		assertEquals("&lt;", InspirentoUtilities.escapeText("<"));
		assertEquals("&gt;", InspirentoUtilities.escapeText(">"));
		assertEquals("&quot;", InspirentoUtilities.escapeText("\""));
		assertEquals("&apos;", InspirentoUtilities.escapeText("'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'&<>\"'"));
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
		assertEquals("&amp;", InspirentoUtilities.escapeText("&"));
		assertEquals("&lt;", InspirentoUtilities.escapeText("<"));
		assertEquals("&gt;", InspirentoUtilities.escapeText(">"));
		assertEquals("&quot;", InspirentoUtilities.escapeText("\""));
		assertEquals("&apos;", InspirentoUtilities.escapeText("'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'&<>\"'"));
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
		assertEquals("&amp;", InspirentoUtilities.escapeText("&"));
		assertEquals("&lt;", InspirentoUtilities.escapeText("<"));
		assertEquals("&gt;", InspirentoUtilities.escapeText(">"));
		assertEquals("&quot;", InspirentoUtilities.escapeText("\""));
		assertEquals("&apos;", InspirentoUtilities.escapeText("'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'&<>\"'"));
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
		assertEquals("&amp;", InspirentoUtilities.escapeText("&"));
		assertEquals("&lt;", InspirentoUtilities.escapeText("<"));
		assertEquals("&gt;", InspirentoUtilities.escapeText(">"));
		assertEquals("&quot;", InspirentoUtilities.escapeText("\""));
		assertEquals("&apos;", InspirentoUtilities.escapeText("'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'&<>\"'"));
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
		assertEquals("&amp;", InspirentoUtilities.escapeText("&"));
		assertEquals("&lt;", InspirentoUtilities.escapeText("<"));
		assertEquals("&gt;", InspirentoUtilities.escapeText(">"));
		assertEquals("&quot;", InspirentoUtilities.escapeText("\""));
		assertEquals("&apos;", InspirentoUtilities.escapeText("'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&quot;&apos;", InspirentoUtilities.escapeText("&<>\"'&<>\"'&<>\"'&<>\"'"));
		assertEquals("&amp;&lt;&gt;&quot;&apos;&amp;&lt;&gt;&qu