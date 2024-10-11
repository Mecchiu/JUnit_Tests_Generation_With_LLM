// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains ten unit test cases for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {

	/**
	* Test case for the {@link _Fail#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		_Fail fail = new _Fail();
		assertNotNull(fail.getTypeDesc());
	}
}