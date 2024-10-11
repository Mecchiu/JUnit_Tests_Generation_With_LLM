// _CompleteResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponse_1Test {
		
		@Test
		public void testGetTypeDesc() {
			assertEquals("Invalid value of type", org.apache.axis.constants.AnyBase64MimeType, org.apache.axis.constants.AnyBase64MimeType.getValueFor( "application/octet-stream" ));
		}
		
}