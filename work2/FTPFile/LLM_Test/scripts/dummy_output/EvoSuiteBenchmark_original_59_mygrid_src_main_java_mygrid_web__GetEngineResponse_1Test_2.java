// _GetEngineResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains one unit test case for the {@link _GetEngineResponse#getTypeDesc()} method.
*/
class _GetEngineResponse_1Test {
		
	
	private _GetEngineResponse getEngineResult = null; 
	
	
	@Test
	public void testTypeDesc(){
		this.getEngineResult = new _GetEngineResponse();
		boolean _equals = this.getEngineResult.getTypeDesc().equals(this.getEngineResult.getTypeDesc());
		
		assertTrue((_equals));
	}
	


}