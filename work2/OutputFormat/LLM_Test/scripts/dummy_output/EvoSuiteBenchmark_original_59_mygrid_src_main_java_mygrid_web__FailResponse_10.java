// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
		/**
	* Test of getTypeDesc method, of class mygrid.web._FailResponse.
	*/
	@Test
    public void testGetTypeDesc() {
        System.out.println("Getting object of type mygrid.web._FailResponse");
        _FailResponse result = _FailResponse.class.cast(mygrid.web.web_bean.t_FailResponse.get(0));
        assertEquals(typeDesc, (java.lang.Object)result);
	}
}