// HTMLFilterTest.java
package com.imsmart.servlet;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLFilter}.
* It contains one unit test case for the {@link HTMLFilter#filter(String)} method.
*/
class HTMLFilterTest {
		
	@Test
	public void testFilter(){
			
		assertEquals("1",filter("1"));
		assertEquals("1|",filter("foo|"));
		assertEquals("1|",filter("1|"));
		assertEquals("1|foobarbaz|",filter("1|foobarbaz|"));
		assertEquals("1|foo=1|bar=1|baz=1||",filter("1|foo=1|bar=1|baz=1||"));
		assertEquals("1||2|3||",filter("1||"));
		assertEquals("1||2||3|",filter("1||2||"));
	}

}