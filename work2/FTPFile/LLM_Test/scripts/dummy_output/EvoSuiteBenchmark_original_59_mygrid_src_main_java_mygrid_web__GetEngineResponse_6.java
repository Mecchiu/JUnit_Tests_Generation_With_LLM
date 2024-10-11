// _GetEngineResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponseTest {
		
	@Test
	  public void getTypeDesc1() {
	    try {
				_GetEngineResponse a1 = new _GetEngineResponse();
				assertNotNull(a1.getTypeDesc());
				Object object = a1.getGetEngineResult();
				assertEquals(a1.getGetEngineResult().ordinal(), a1.getTypeDesc().ordinal());
	    }
	    catch (_org.apache.axis.AxisFault e) {
	        assertTrue(e instanceof _InvalidArgumentServiceException);
			assertEquals(_InvalidArgumentServiceException.class, e.getClass());
	    }
	  }
}