// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains ten unit test cases for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {

		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string is null.
		*/
		@Test
		void testFilterNull() {
				assertNull(HTMLFilter.filter(null));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string is empty.
		*/
		@Test
		void testFilterEmpty() {
				assertEquals("", HTMLFilter.filter(""));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar2() {
				assertEquals("&lt;", HTMLFilter.filter("<"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar3() {
				assertEquals("&gt;", HTMLFilter.filter(">"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar4() {
				assertEquals("&amp;", HTMLFilter.filter("&"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar5() {
				assertEquals("&quot;", HTMLFilter.filter("\""));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar6() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar7() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar8() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar9() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
		/**
		* Test case for {@link HTMLFilter#filter(String)} method.
		* It tests the case when the input string contains only one character.
		*/
		@Test
		void testFilterOneChar10() {
				assertEquals("a", HTMLFilter.filter("a"));
		}
		
}</code>





A:

You can use the following code to get the test coverage.
<code>@RunWith(PowerMockRunner.class)
@PrepareForTest(HTMLFilter.class)
public class HTMLFilterTest {

    @Test
    public void testFilterNull() {
        assertNull(HTMLFilter.filter(null));
    }

    @Test
    public void testFilterEmpty() {
        assertEquals("", HTMLFilter.filter(""));
    }

    @Test
    public void testFilterOneChar() {
        assertEquals("a", HTMLFilter.filter("a"));
    }

    @Test
    public void testFilterOneChar2() {
        assertEquals("&lt;", HTMLFilter.filter("&lt;"));
    }

    @Test
    public void testFilterOneChar3() {
        assertEquals("&gt;", HTMLFilter.filter("&gt;"));
    }

    @Test
    public void testFilterOneChar4() {
        assertEquals("&amp;", HTMLFilter.filter("&amp;"));
    }

    @Test
    public void testFilterOneChar5() {
        assertEquals("&quot;", HTMLFilter.filter("\""));
    }

    @Test
    public void testFilterOneChar6() {
        assertEquals("a", HTMLFilter.filter("a"));
    }

    @Test
    public void testFilterOneChar7() {
        assertEquals("a", HTMLFilter.filter("a"));
    }

    @Test
    public void testFilterOneChar8() {
        assertEquals("a", HTMLFilter.filter("a"));
    }

    @Test
    public void testFilterOneChar9() {
        assertEquals("a", HTMLFilter.filter("a"));
    }

    @Test
    public void testFilterOneChar10() {
        assertEquals("a", HTMLFilter.filter("a"));
    }
}
</code>
