// _CompleteResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains one unit test case for the {@link _CompleteResponse#getTypeDesc()} method.
*/
class _CompleteResponseTest {

	@Test
    public void testGetTypeDesc() {
		String tn = _CompleteResponse.getTypeDesc().getTypeName();

		assertEquals("mygrid.web.CompleteResponse", tn);
	}


}