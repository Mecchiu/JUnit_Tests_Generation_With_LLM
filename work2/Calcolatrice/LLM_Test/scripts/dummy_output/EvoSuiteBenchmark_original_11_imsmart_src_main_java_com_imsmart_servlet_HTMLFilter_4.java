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
	public void testNormalReqUrlCase1() {

		String message = HTMLFilter.filter("<HTML><TR><TD>Foo</TD></TR></HTML>");

		assertEquals("<TABLE>", message);
	}

	@Test
	public void testNormalReqUrlCase2() {
		String message = HTMLFilter.filter("<HTML><TR><TD>Foo</TD></TR></HTML>", "http://example.com");

		assertEquals("<TR>\n    <TD>foo</TD>\n</TR>\n", message);
	}


	@Test
	public void testReqUrlUppercaseCase1() {
		String message = HTMLFilter.filter("<HTML>Foo</HTML>", "https://EXAMPLE.COM");

		assertEquals("<HTML>Foo</HTML>\n", message);
	}

	@Test
	public void testReqUrlUppercaseCase2() {
		String message = HTMLFilter.filter("<HTML>Foo</HTML>", "https://HTTPS");

		assertEquals("<HTML>Foo</HTML>", message);
	}
	
	@Test
	public void testReqUrlUppercaseCase1() {
		String message = HTMLFilter.filter("<HTML>Foo</HTML>", "HTTP");

		assertEquals("<HTML>Foo</HTML>", message);
	}
	
	@Test
	public void testReqUrlLowercaseCase1() {
		String message = HTMLFilter.filter("<HTML>Foo</HTML>", "Foo");

		assertEquals("<HTML>Foo</HTML>", message);
	}
	

	@Test
	public void testReqUrlUppercaseCase2() {
		String message = HTMLFilter.filter("<HTML>Foo</HTML>", "Foo");

		assertEquals("<HTML>Foo</HTML>", message);
	}



	@Test
	public void testReqUrlLowercaseCase2() {
		String message = HTMLFilter.filter("<HTML>Foo</HTML>", "Foo");

		assertEquals("<HTML>FoO</HTML>", message);
	}

	@Test
	public void testReqUrlLowercaseCase3() {
		String message = HTMLFilter.filter("<HTML>Foo</HTML>", "FOO");

		assertEquals("<HTML>Foo</HTML>", message);
	}

	@Test
	public void txtUrlUppercaseCase1() {
		String message = HTMLFilter.filter("text/html text\\ <html>\\ ");

		assertEquals("<TEXT> text < HTML><!----><!--></HTML>", message);
	}	 
		

}