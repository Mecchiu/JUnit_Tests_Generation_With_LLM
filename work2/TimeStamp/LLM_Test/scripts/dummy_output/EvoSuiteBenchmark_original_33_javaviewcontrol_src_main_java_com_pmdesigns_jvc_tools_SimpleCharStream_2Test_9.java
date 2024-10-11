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
	public final void testGetImage() {
		assertEquals("testGetImage should return \"testImage\"", "testImage", SimpleCharStream.GetImage());
	}

	/**
	 * Test method for {@link com.pmdesigns.jvc.tools.SimpleCharStream#Init(java.io.Reader, int)]}.
	 */
	@Test
	public final void testInitReaderIntStart() throws Exception {
		assertEquals("Init should return \"init\"", "init", SimpleCharStream.Init(null, 0));
	}

	/**
	 * Test method for {@link com.pmdesigns.jvc.tools.SimpleCharStream#Init(java.io.Reader, int, int, if the string starts with \"test\".", 0)]}.
	 */
	@Test
	public final void testInitReaderIntStartStringBefore() throws Exception {
		assertEquals("Init should return \"init\"", "init", SimpleCharStream.Init(null, 0, 2, "test"));
	}

}