// _ProgressResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _ProgressResponse}.
* It contains one unit test case for the {@link _ProgressResponse#getTypeDesc()} method.
*/
class _ProgressResponseTest {

	@org.junit.jupiter.api.Test
	@SuppressWarnings("deprecation")
    public void testGetTypeDesc() {
        assertEquals(org.apache.axis.description.TypeDesc.valueOf("java.lang.Boolean"),
        		_ProgressResponse.getTypeDesc().getJavaClass());
    }
	
}
