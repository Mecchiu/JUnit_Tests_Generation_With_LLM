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
	 * Test method for {@link com.pmdesigns.jvc.tools.SimpleCharStream#GetImage()}.
	*/
	@Test
	public void testGetImage() throws Exception {
		SimpleCharStream stream = new SimpleCharStream();
		assertSame(CharImage.BAD_CHAR, stream.getImage());
	}


}