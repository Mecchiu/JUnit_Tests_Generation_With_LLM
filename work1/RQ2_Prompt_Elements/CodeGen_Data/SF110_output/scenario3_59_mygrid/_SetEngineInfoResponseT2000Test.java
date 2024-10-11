// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains one unit test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {

	/**
	* Test method for {@link mygrid.web._SetEngineInfoResponse#GetTypeDesc()}.
	* @throws Exception
	*/
	@Test
	public void testGetTypeDesc() throws Exception {

		assertNotNull(null, "The returned instance of type '__null' is null");
		assertEquals(0, ((_SetEngineInfoResponse)null).getTypeDesc().getValue());
		assertNotNull(new _SetEngineInfoResponse());
		assertEquals(0, ((_SetEngineInfoResponse)((__NullType)null)).getTypeDesc().getValue());
		assertNotNull(new __NullType());
		assertEquals(0, ((__NullType)((__NullType)null)).getTypeDesc().getValue());
	}
}
