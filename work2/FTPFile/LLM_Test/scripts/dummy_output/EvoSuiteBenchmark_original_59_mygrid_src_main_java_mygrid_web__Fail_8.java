// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains one unit test case for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {
		
	private static final MyGridClient client = new MyGridClient(client.getProxy());
	private final _Fail bean = new _Fail();
	private final static String getTypeDescMethod = "getTypeDesc";
	
	/**
	* Test for the {@link _Fail#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		assertNotNull(MyGridClient._getTypeDesc(getTypeDescMethod));
	}

}