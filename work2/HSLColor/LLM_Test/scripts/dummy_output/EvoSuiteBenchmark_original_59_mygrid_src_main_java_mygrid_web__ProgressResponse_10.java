// _ProgressResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponseTest {
		public void testGetTypeDesc() {
			assertEquals(org.junit.jupiter.api.Assertions.assertSame(_ProgressResponse.class), _ProgressResponse.getTypeDesc());
		}
}