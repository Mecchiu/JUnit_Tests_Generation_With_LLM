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
		* Test for method GetImage()
		*/
		@Test
		public void testGetImage_01() {
				assertEquals("First", "First ̆̆", SimpleCharStream.GetImage());
	}


}