// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {

	/**
	* Replace single quotes with double quotes before parsing a string.
	*/
	private static final double[][] quote_replacement = {
			{1.345678, 1.34567},
			{1.3456789, 1.345678}
	};
	
	/**
	* Replace double quotes with single quotes before parsing a string.
	*/
	private static final double[][] quote_replacement_2 = {
			{1.3456789, 1.345678},
			{1.3456789, 1.345678}
	};


	/**
	* Test case for the {@link SimpleCharStream#GetImage()} method.
	*/
	@Test
	public void TestReplaceSQuote() {
		
		assertEquals("1.3456789", SimpleCharStream.ReplaceQuotes(new String("1.3456789")));
		assertEquals("1.345678", SimpleCharStream.ReplaceQuotes(new String("1.3456788")));
		assertEquals("1.34567888", SimpleCharStream.ReplaceQuotes(new String("1.3456788888")));
		assertEquals("1.345678901", SimpleCharStream.ReplaceQuotes(new String("1.3456789"), quote_replacement_2));
		
	}

}