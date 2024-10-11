// _SetEngineInfoResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfoResponse}.
* It contains one unit test case for the {@link _SetEngineInfoResponse#getTypeDesc()} method.
*/
class _SetEngineInfoResponseTest {
		
	@Test
	public void test() {
		_SetEngineInfoResponse t = new _SetEngineInfoResponse();
		assertNotNull(t.getTypeDesc());
	}
	
}