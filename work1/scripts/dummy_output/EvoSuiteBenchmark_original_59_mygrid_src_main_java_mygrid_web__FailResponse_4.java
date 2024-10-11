// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {
		public final static String TEST_NAME = "_FailResponseTest";
	
	/**
	* getTypeDesc() method test.
	* It returns the type descriptor of the <code>_FailResponse</code> and is used to write test.
	*/
	@Test
    public void getTypeDesc() {
        assertNotNull(new _FailResponse().getTypeDesc());
    }
}