// _ProgressResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponse_1Test {
		private final static String BUNDLE_NAME = "mygrid.web._ProgressResponse_1Test";

	@Test
	public void testGetTypeDesc() throws Exception {
		String output = org.apache.axis2.databinding.utils.BeanUtil.getTypeDesc
				(mygrid.web._ProgressResponse.class);
		org.apache.axis2.databinding.utils.ConverterUtil.popMethodObjectStack(output);
//		assertEquals(typeDesc, output);
	}  // end of testGetTypeDesc


}