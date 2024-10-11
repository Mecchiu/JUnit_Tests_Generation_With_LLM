// _ProgressResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponse_1Test {
		
	@Test
	public void testGetTypeDesc() throws Exception {
		// make sure the type descriptor is accurate
		assertEquals(typeDesc, _ProgressResponse.getTypeDesc());
	}
	
}