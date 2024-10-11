// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {

	@Test
	void testFilter() {
		String testString = "";
		String expectedString = "";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter1() {
		String testString = "abc";
		String expectedString = "abc";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter2() {
		String testString = "abc<def";
		String expectedString = "abc&lt;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter3() {
		String testString = "abc>def";
		String expectedString = "abc&gt;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter4() {
		String testString = "abc\"def";
		String expectedString = "abc&quot;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter5() {
		String testString = "abc'def";
		String expectedString = "abc&#39;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter6() {
		String testString = "abc&def";
		String expectedString = "abc&amp;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter7() {
		String testString = "abc<def>ghi";
		String expectedString = "abc&lt;def&gt;ghi";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter8() {
		String testString = "abc<def>ghi\"jkl";
		String expectedString = "abc&lt;def&gt;ghi&quot;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter9() {
		String testString = "abc<def>ghi'jkl";
		String expectedString = "abc&lt;def&gt;ghi&#39;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter10() {
		String testString = "abc<def>ghi&jkl";
		String expectedString = "abc&lt;def&gt;ghi&amp;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
}

// HTMLFilter.java
package com.imsmart.servlet;

public final class HTMLFilter {

    /**
     * Filter the specified message string for characters that are sensitive
     * in HTML.  This avoids potential attacks caused by including JavaScript
     * codes in the request URL that is often reported in error messages.
     *
     * @param message The message string to be filtered
     */
    public static String filter(String message) {

        if (message == null)
            return (null);

        char content[] = new char[message.length()];
        message.getChars(0, message.length(), content, 0);
        StringBuffer result = new StringBuffer(content.length + 50);
        for (int i = 0; i < content.length; i++) {
            switch (content[i]) {
            case '<':
                result.append("&lt;");
                break;
            case '>':
                result.append("&gt;");
                break;
            case '&':
                result.append("&amp;");
                break;
            case '"':
                result.append("&quot;");
                break;
            case '\'':
                result.append("&#39;");
                break;
            default:
                result.append(content[i]);
            }
        }
        return (result.toString());

    }

}

// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
	@Test
	void testFilter() {
		String testString = "";
		String expectedString = "";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter1() {
		String testString = "abc";
		String expectedString = "abc";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter2() {
		String testString = "abc<def";
		String expectedString = "abc&lt;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter3() {
		String testString = "abc>def";
		String expectedString = "abc&gt;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter4() {
		String testString = "abc\"def";
		String expectedString = "abc&quot;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter5() {
		String testString = "abc'def";
		String expectedString = "abc&#39;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter6() {
		String testString = "abc&def";
		String expectedString = "abc&amp;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter7() {
		String testString = "abc<def>ghi";
		String expectedString = "abc&lt;def&gt;ghi";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter8() {
		String testString = "abc<def>ghi\"jkl";
		String expectedString = "abc&lt;def&gt;ghi&quot;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter9() {
		String testString = "abc<def>ghi'jkl";
		String expectedString = "abc&lt;def&gt;ghi&#39;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter10() {
		String testString = "abc<def>ghi&jkl";
		String expectedString = "abc&lt;def&gt;ghi&amp;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
}

// HTMLFilter.java
package com.imsmart.servlet;

public final class HTMLFilter {

    /**
     * Filter the specified message string for characters that are sensitive
     * in HTML.  This avoids potential attacks caused by including JavaScript
     * codes in the request URL that is often reported in error messages.
     *
     * @param message The message string to be filtered
     */
    public static String filter(String message) {

        if (message == null)
            return (null);

        char content[] = new char[message.length()];
        message.getChars(0, message.length(), content, 0);
        StringBuffer result = new StringBuffer(content.length + 50);
        for (int i = 0; i < content.length; i++) {
            switch (content[i]) {
            case '<':
                result.append("&lt;");
                break;
            case '>':
                result.append("&gt;");
                break;
            case '&':
                result.append("&amp;");
                break;
            case '"':
                result.append("&quot;");
                break;
            case '\'':
                result.append("&#39;");
                break;
            default:
                result.append(content[i]);
            }
        }
        return (result.toString());

    }

}

// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
	@Test
	void testFilter() {
		String testString = "";
		String expectedString = "";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter1() {
		String testString = "abc";
		String expectedString = "abc";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter2() {
		String testString = "abc<def";
		String expectedString = "abc&lt;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter3() {
		String testString = "abc>def";
		String expectedString = "abc&gt;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter4() {
		String testString = "abc\"def";
		String expectedString = "abc&quot;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter5() {
		String testString = "abc'def";
		String expectedString = "abc&#39;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter6() {
		String testString = "abc&def";
		String expectedString = "abc&amp;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter7() {
		String testString = "abc<def>ghi";
		String expectedString = "abc&lt;def&gt;ghi";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter8() {
		String testString = "abc<def>ghi\"jkl";
		String expectedString = "abc&lt;def&gt;ghi&quot;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter9() {
		String testString = "abc<def>ghi'jkl";
		String expectedString = "abc&lt;def&gt;ghi&#39;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter10() {
		String testString = "abc<def>ghi&jkl";
		String expectedString = "abc&lt;def&gt;ghi&amp;jkl";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
}

// HTMLFilter.java
package com.imsmart.servlet;

public final class HTMLFilter {

    /**
     * Filter the specified message string for characters that are sensitive
     * in HTML.  This avoids potential attacks caused by including JavaScript
     * codes in the request URL that is often reported in error messages.
     *
     * @param message The message string to be filtered
     */
    public static String filter(String message) {

        if (message == null)
            return (null);

        char content[] = new char[message.length()];
        message.getChars(0, message.length(), content, 0);
        StringBuffer result = new StringBuffer(content.length + 50);
        for (int i = 0; i < content.length; i++) {
            switch (content[i]) {
            case '<':
                result.append("&lt;");
                break;
            case '>':
                result.append("&gt;");
                break;
            case '&':
                result.append("&amp;");
                break;
            case '"':
                result.append("&quot;");
                break;
            case '\'':
                result.append("&#39;");
                break;
            default:
                result.append(content[i]);
            }
        }
        return (result.toString());

    }

}

// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
	@Test
	void testFilter() {
		String testString = "";
		String expectedString = "";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter1() {
		String testString = "abc";
		String expectedString = "abc";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter2() {
		String testString = "abc<def";
		String expectedString = "abc&lt;def";
		String actualString = HTMLFilter.filter(testString);
		assertEquals(expectedString, actualString);
	}
	
	@Test
	void testFilter3() {
		String testString = "abc>def";
		String expectedString = "abc&gt;def";
		String actualString = HTML