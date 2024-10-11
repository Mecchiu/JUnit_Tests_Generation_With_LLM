// _GetEngineResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponse_1Test {
		
	@Test
	public void testGetTypeDesc() {
		assertEquals(mygrid.web.Engine.class, org.apache.axis2.wsdl.WSDLConstants.getElementType("getEngineResult", "Engine"));
	}

}